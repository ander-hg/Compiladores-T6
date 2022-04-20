package br.ufscar.dc.compiladores;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Objects;

public class GeradorHTML {

    public static StringBuffer sb = new StringBuffer(); // guarda o html
    public static StringBuffer erros = new StringBuffer(); // guarda os erros semanticos
    public static String pf; // guarda o caminho do arquivo
    public static Dictionary<Integer, String> dicImgsPers = new Hashtable<Integer, String>();

    public static void setPf(String pf) {
        GeradorHTML.pf = pf;
    }

    public static String getSb() {
        return sb.toString();
    }

    // variaveis auxiliares
    static String resultado;
    static double vidaAlly, vidaEnemy;
    static String allyClass, allyDmgType, allyArmor, allyMr, enemyClass, enemyDmgType, enemyArmor, enemyMr;

    private static void processaImgs() {
        // dicionario de imagens - personagens
        dicImgsPers.put(1, "https://www.legendsofkingdomrush.com/images/heroes_companions/18_wild-elf.png");
        dicImgsPers.put(2, "https://www.legendsofkingdomrush.com/images/heroes_companions/12_sorcerer.png");
        dicImgsPers.put(3, "https://www.legendsofkingdomrush.com/images/heroes_companions/3_heroe_Asra.png");
        dicImgsPers.put(4, "https://www.legendsofkingdomrush.com/images/heroes_companions/11_arcane.png");
        dicImgsPers.put(5, "https://www.legendsofkingdomrush.com/images/heroes_companions/15_knight.png");
        dicImgsPers.put(6, "https://www.legendsofkingdomrush.com/images/heroes_companions/6_heroe_bruxa.png");
        dicImgsPers.put(7, "https://www.legendsofkingdomrush.com/images/heroes_companions/9_bombardier.png");
        dicImgsPers.put(8, "https://www.legendsofkingdomrush.com/images/heroes_companions/13_tesla.png");
        dicImgsPers.put(9, "https://www.legendsofkingdomrush.com/images/heroes_companions/1_ranger.png");
        dicImgsPers.put(10, "https://www.legendsofkingdomrush.com/images/heroes_companions/10_witch.png");
        dicImgsPers.put(11, "https://www.legendsofkingdomrush.com/images/heroes_companions/17_bravebark.png");
        dicImgsPers.put(12, "https://www.legendsofkingdomrush.com/images/heroes_companions/5_heroe_regson.png");
        dicImgsPers.put(13, "https://www.legendsofkingdomrush.com/images/heroes_companions/8_sasquatch.png");
        dicImgsPers.put(14, "https://www.legendsofkingdomrush.com/images/heroes_companions/2_heroe_oloch.png");
        dicImgsPers.put(15, "https://www.legendsofkingdomrush.com/images/heroes_companions/16_barbarian.png");
        dicImgsPers.put(16, "https://www.legendsofkingdomrush.com/images/heroes_companions/4_heroe_gerald.png");
        dicImgsPers.put(17, "https://www.legendsofkingdomrush.com/images/heroes_companions/7_orc.png");
        dicImgsPers.put(18, "https://www.legendsofkingdomrush.com/images/heroes_companions/14_dark-knight.png");
    }
    TabelaDeSimbolos tabela;

    static void processar() {
        processaImgs();
        double danoCausado = T6Semantico.danoCausado;
        double danoRecebido = T6Semantico.danoRecebido;
        TabelaDeSimbolos tabela = T6Semantico.tabela;
        // informações para exibir
        // aliado
        allyClass = tabela.verificarNome("ally");
        if (allyClass.startsWith("\""))allyClass = allyClass.substring(1, allyClass.length() - 1);
        allyClass = T6SemanticoUtils.upperCaseFirst(allyClass);
        allyDmgType = tabela.verificarDmg("ally") + " damage";
        allyArmor = tabela.verificarArmor("ally") + " armor";
        allyMr = tabela.verificarMr("ally") + " magic resist";
        // inimigo
        enemyClass = tabela.verificarNome("enemy");
        if (enemyClass.startsWith("\""))enemyClass = enemyClass.substring(1, enemyClass.length() - 1);
        enemyClass = T6SemanticoUtils.upperCaseFirst(enemyClass);
        enemyDmgType = tabela.verificarDmg("enemy") + " damage";
        enemyArmor = tabela.verificarArmor("enemy") + " armor";
        enemyMr = tabela.verificarMr("enemy") + " magic resist";

        if (Objects.equals(danoRecebido, danoCausado)) {
            // Empate
            vidaAlly = vidaEnemy = 0;
            resultado = "DRAW";
        } else if (danoRecebido > danoCausado) {
            // lose
            vidaAlly = 0;
            vidaEnemy = (danoRecebido - danoCausado) / danoRecebido;
            resultado = "DEDEATED";
        } else {
            // win
            vidaAlly = (danoCausado - danoRecebido) / danoCausado;
            vidaEnemy = 0;
            resultado = "KNOCKOUT";
        }

        // cria HTML
        sb.append(" <html>\n"
                + "     <head>\n"
                + "         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                + "         <link rel=\"shortcut icon\" href=\"https://cdn-icons-png.flaticon.com/512/1732/1732452.png\" type=\"image/x-icon\">"
                + "         <title>Battle</title>\n"
                + "         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n"
                + "         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\n"
                + "         <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">"
                + "         <style type=\"text/css\">\n"
                + "             body {\n"
                + "                 background-image: url(\"https://images6.alphacoders.com/625/thumb-1920-625266.jpg\");"
                + "                     background-position: center;\n"
                + "                     background-repeat: no-repeat;\n"
                + "                     background-size: cover; "
                + "                     font-family: fantasy;"
                + "                 }\n"
                + "                 .imgAlly {\n"
                + "                     text-align: left;"
                + "                     margin: 90px 0px 10px 120px;"
                + "                 }\n"
                + "                 .imgEnemy {\n"
                + "                     text-align: right;"
                + "                     margin: 90px 120px 10px 0px;"
                + "                 }\n"
                + "                 .imgs {\n"
                + "                     position: absolute;"
                + "                     top: 19%;\n"
                + "                     display: flex;"
                + "                     width: 100%;"
                + "                     justify-content: space-between;"
                + "                 }\n"
                + "                 .result {\n"
                + "                     position: absolute;"
                + "                     top: 50%;\n"
                + "                     left: 50%;\n"
                + "                     transform: translate(-50%, -50%);"
                + "                     font-weight: bold;"
                + "                     font-size:100px;"
                + "                 }\n"
                + "                 .mensagem {\n"
                + "                     position: absolute;"
                + "                     top: 0%;\n"
                + "                     float:left;"
                + "                 }\n"
                + "                 .aviso {\n"
                + "                     position: absolute;"
                + "                     float:left;"
                + "                     left: 50%;\n"
                + "                     transform: translate(-50%, 0%);"
                + "                     color: #1f1f1f;"
                + "                 }\n"
                + "                 .nome_igual {\n"
                + "                     position: absolute;"
                + "                     float:left;"
                + "                     top: 5%;\n"
                + "                     left: 50%;\n"
                + "                     transform: translate(-50%, 0%);"
                + "                     color: #e5e500;"
                + "                 }\n"
                + "                 .errosintatico {\n"
                + "                     left: 89%;\n"
                + "                     color: red;"
                + "                 }\n"
                + "                 .errosemantico {\n"
                + "                     left: 0.5%;\n"
                + "                     color: red;"
                + "                 }\n"
                + "                 .barrinhas {\n"
                + "                     position: absolute;"
                + "                     top: 3%;\n"
                + "                     display:flex;"
                + "                     justify-content: space-between;"
                + "                     width:85%;"
                + "                     margin:3%  7.5%;"
                + "                 }\n"
                + "                 .barrinha {\n"
                + "                     width: 49%;"
                + "                     height:40px;"
                + "                     border-radius:20px;"
                + "                     border: medium solid #111111;"
                + "                     background: linear-gradient()"
                + "                 }\n"
                + "                 .barrinha_ally {\n"
                + "                     background: linear-gradient(to right, #9c0000 0%, #9c0000 " + String.valueOf(vidaAlly * 100) + "%, #1f1f1f " + String.valueOf(vidaAlly * 100) + "%);"
                + "                 }\n"
                + "                 .barrinha_enemy {\n"
                + "                     background: linear-gradient(to left, #9c0000 0%, #9c0000 " + String.valueOf(vidaEnemy * 100) + "%, #1f1f1f " + String.valueOf(vidaEnemy * 100) + "%);"
                + "                 }\n"
                + "                 .nomes {\n"
                + "                     position: absolute;"
                + "                     top: 3%;\n"
                + "                     display:flex;"
                + "                     justify-content: space-between;"
                + "                     width:82%;"
                + "                     margin: 3.5%  9%;"
                + "                 }\n"
                + "                 .nome {\n"
                + "                     color:#BEBEBE;"
                + "                 }\n"
                + "             </style>\n"
                + "         </head>\n"
                + "     <body>\n"
        );

        sb.append(erros);
        String barrinha = 
                  "         <section class=\"barrinhas\">"
                + "             <div class=\"barrinha barrinha_ally\">"
                + "             </div>"
                + "             <div class=\"barrinha barrinha_enemy\">"
                + "             </div>"
                + "         </section>"
                + "         <section class=\"nomes\">"
                + "             <div class=\"nome nome_ally\">" + allyClass 
                + "             </div>" 
                + "             <div class=\"nome nome_enemy\">" + enemyClass 
                + "             </div>"
                + "         </section>";
        // adiciona personagens
        String tabelaAlly = 
                  "             <div class=\"imgAlly\">"
                + "                 <img src=\"" + dicImgsPers.get(T6SemanticoUtils.personagemToInt(tabela, "ally")) + "\"  height=\"450\">"
                + "             </div>";
        String tabelaMeio = 
                  "             <div class=\"result\">" + resultado 
                + "             </div>";
        String tabelaEnemy = 
                  "             <div class=\"imgEnemy\">"
                + "                 <img src=\"" + dicImgsPers.get(T6SemanticoUtils.personagemToInt(tabela, "enemy")) + "\"  height=\"450\">\n"
                + "             </div>";
        String aux = barrinha + 
                  "             <div class=\"imgs\">" + tabelaAlly + tabelaEnemy 
                + "             </div>" + tabelaMeio;
        AdicionaString(aux);
    }

    static void AdicionaString(String string) {
        sb.append(string);
    }

    static void AdicionaErro(String string) {
        erros.append(string);
    }

    public static void escreveArquivo() throws FileNotFoundException {
        processar();
        try ( PrintWriter pw = new PrintWriter(pf)) {
            pw.print(getSb());
        }
        System.exit(0);
    }
}
