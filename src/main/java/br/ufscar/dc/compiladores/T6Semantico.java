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
        adiciona(tabela, allyctx, codigo);
        codigo = "enemy";
        adiciona(tabela, enemyctx, codigo);
               
        // batalha
        if (danoCausado == 0){
            if (tabela.verificarDmg("ally").equals("physical")) {
                danoCausado = nivelToFloat(tabela.verificarArmor("enemy"));
            } else {
                danoCausado = nivelToFloat(tabela.verificarMr("enemy"));
            }
        }
        if (danoRecebido == 0){
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
                danoCausado = retornaDanoSkill(tabela, skill);
            }
            else {
                // erro semantico
                GeradorHTML.AdicionaErro("<div class=\"erro\"> skill " + skill + " not found on ally</div>");
            }
        } else if (ctx.getText().charAt(4) == 'e') { // inimigo
            // verifica se possui essa skill
            if (tabela.verificarSkill("enemy") != null && tabela.verificarSkill("enemy").equals(skill)){
                danoRecebido = retornaDanoSkill(tabela, skill);
            }
            else {
                // erro semantico
                GeradorHTML.AdicionaErro("<div class=\"erro\"> skill " + skill + " not found on enemy</div>");
            }
        }
        return super.visitCmdSkill(ctx);
    }
    
}
