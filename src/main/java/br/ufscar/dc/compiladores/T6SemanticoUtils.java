package br.ufscar.dc.compiladores;

import java.util.ArrayList;
import java.util.List;

public class T6SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adiciona(TabelaDeSimbolos tabela, T6Parser.PersonagemContext ctx, String codigo) {
        String classe;
        // adiciona classe {archer, mage, warrior}
        if (ctx.Class() != null) {
            classe = ctx.Class().getText();
            switch (classe) {
                case "mage" -> tabela.adicionar(codigo, classe, 
                            "magic",  
                            "low", 
                            "high");
                case "archer" -> tabela.adicionar(codigo, classe, 
                            "physical",
                            "medium", 
                            "medium");
                case "warrior" -> tabela.adicionar(codigo, classe, 
                            "physical",
                            "high", 
                            "low");
            }
        } else { 
            classe = ctx.CADEIA().getText();
            
            // analise semantica: verifica se possui nomes iguais 
            if (codigo.equals("enemy")) {
                if (classe.equals(tabela.verificarNome("ally"))) {
                    // verificação semantica - nomes iguais
                    GeradorHTML.AdicionaErro("<div class=\"mensgem nome_igual\"> <br>The fighters have the same name</div><br>");
                }
            }
            
            // analise semantica: verifica se possui muita armadura e ms
            int pont = nivelToInt(ctx.armor.getText())+nivelToInt( ctx.mr.getText());
            if (pont > 5) {
                GeradorHTML.AdicionaErro("<div class=\"mensagem aviso\"> You've created an OP " + codigo + " but still can be defeated by pierce damage</div><br>");
            }
            
            // adiciona personagem customizado
            if (ctx.Skill() != null) {
                        tabela.adicionar(codigo, classe, 
                        ctx.Tipo().getText(),
                        ctx.armor.getText(), 
                        ctx.mr.getText(),
                        ctx.Skill().getText());
            }
            else {
                        tabela.adicionar(codigo, classe, 
                        ctx.Tipo().getText(),
                        ctx.armor.getText(), 
                        ctx.mr.getText());
            }
        }
    }
    
    public static double nivelToFloat(String id){
        return switch (id) {
            case "low" -> 0.75;
            case "medium" -> 0.5;
            case "high" -> 0.25;
            default -> 0;
        }; //multiplicador, recebe mais dano se tiver menos armadura/mr
    }
    
    public static int nivelToInt(String id){
        return switch (id) {
            case "low" -> 1;
            case "medium" -> 2;
            case "high" -> 3;
            default -> 0;
        };
    }
    
    public static int tipoToInt(String id){
        return switch (id) {
            case "physical" -> 1;
            case "magic" -> 2;
            default -> 0;
        };
    }
    
    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }
    
    public static int personagemToInt(TabelaDeSimbolos tabela, String time){
        // usa o tipo de ataque, armor e mr para retornar um ID que representa uma img de personagem
        int aux = nivelToInt(tabela.verificarArmor(time)) + (nivelToInt(tabela.verificarMr(time))-1)*3;
        int dmgtype = tipoToInt(tabela.verificarDmg(time));
        if (dmgtype == 1) aux = aux*2-1;
        if (dmgtype == 2) aux = aux*2;
        return aux;
    } 

    public static double retornaDanoSkill(TabelaDeSimbolos tabela, String skill, String time){
        if (skill.equals("pierce")) {
            return 0.6;
        } else if (skill.equals("compose")) {
            return 2.40 * nivelToFloat(tabela.verificarArmor(time)) * nivelToFloat(tabela.verificarMr(time));
        }
        return 0;
    } 
}
