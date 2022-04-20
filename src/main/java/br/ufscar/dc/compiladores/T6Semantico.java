package br.ufscar.dc.compiladores;

import static br.ufscar.dc.compiladores.T6SemanticoUtils.*;

public class T6Semantico extends T6BaseVisitor<Void>{
    public static TabelaDeSimbolos tabela;
    String codigo = "ally";
    public static double danoCausado = 0, danoRecebido = 0;
    
    @Override
    public Void visitPrograma(T6Parser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }
    
    @Override
    public Void visitCorpo(T6Parser.CorpoContext ctx) {
        T6Parser.PersonagemContext allyctx = ctx.aliado().personagem();
        T6Parser.PersonagemContext enemyctx = ctx.inimigo().personagem();
        // insere aliado na tabela
        adiciona(tabela, allyctx, codigo);
        codigo = "enemy";
        // insere inimigo na tabela
        adiciona(tabela, enemyctx, codigo);
               
        // batalha
        if (danoCausado == 0){
            // aplica armadura/ms
            if (tabela.verificarDmg("ally").equals("physical")) {
                danoCausado = nivelToFloat(tabela.verificarArmor("enemy"));
            } else {
                danoCausado = nivelToFloat(tabela.verificarMr("enemy"));
            }
        }
        if (danoRecebido == 0){
            // aplica armadura/ms
            if (tabela.verificarDmg("enemy").equals("physical")) {
                danoRecebido = nivelToFloat(tabela.verificarArmor("ally"));
            } else {
                danoRecebido = nivelToFloat(tabela.verificarMr("ally"));
            }
        }
        return super.visitCorpo(ctx); 
    }

    @Override
    public Void visitCmdSkill(T6Parser.CmdSkillContext ctx) {
        String skill = ctx.Skill().getText();
        if (ctx.getText().charAt(4) == 'a') { // aliado
            // verifica se possui essa skill
            if (tabela.verificarSkill("ally") != null && tabela.verificarSkill("ally").equals(skill)){
                // ally que usou a skill-> calcula dano com base na armadura/ms do enemy
                danoCausado = retornaDanoSkill(tabela, skill, "enemy"); 
            }
            else {
                // erro semantico
                GeradorHTML.AdicionaErro("<div class=\"mensagem errosemantico\"> skill " + skill + " not found on ally</div><br>");
            }
        } else if (ctx.getText().charAt(4) == 'e') { // inimigo
            // verifica se possui essa skill
            if (tabela.verificarSkill("enemy") != null && tabela.verificarSkill("enemy").equals(skill)){
                // enemy que usou a skill-> calcula dano com base na armadura/ms do ally
                danoRecebido = retornaDanoSkill(tabela, skill, "ally");
            }
            else {
                // erro semantico
                GeradorHTML.AdicionaErro("<div class=\"mensagem errosemantico\"> skill " + skill + " not found on enemy</div><br>");
            }
        }
        return super.visitCmdSkill(ctx);
    }
    
}
