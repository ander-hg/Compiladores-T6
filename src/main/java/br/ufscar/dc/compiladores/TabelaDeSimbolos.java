package br.ufscar.dc.compiladores;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    
    public enum Classe {
        MAGO,
        ARQUEIRO,
        GUERREIRO,
        OUTRO
    }
    
    public enum Nivel {
        LOW,
        MEDIUM,
        HIGH,
        INVALIDO
    }
    
    public enum Damage {
        MAGIC,
        PHYSICAL,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String time;
        String nome;
        String dmgType;
        String armor, mr;
        String skill;

        private EntradaTabelaDeSimbolos(String time, String nome, String dmgType,  String armor, String mr, String skill) {
            this.time = time; 
            this.nome = nome;
            this.dmgType = dmgType;
            this.armor = armor;
            this.mr = mr;
            this.skill = skill;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String time, String nome, String dmgType,  String armor, String mr, String skill) {
        tabela.put(time, new EntradaTabelaDeSimbolos(time, nome, dmgType, armor, mr, skill));
    }
    
    public void adicionar(String time, String nome, String dmgType,  String armor, String mr) {
        tabela.put(time, new EntradaTabelaDeSimbolos(time, nome, dmgType, armor, mr, null));
    }
    
    public String verificarNome(String time) {
        return tabela.get(time).nome;
    }
    
    public String verificarDmg(String time) {
        return tabela.get(time).dmgType;
    }
      
    public String verificarArmor(String time) {
        return tabela.get(time).armor;
    }
     
    public String verificarMr(String time) {
        return tabela.get(time).mr;
    }
    
    public String verificarSkill(String time) {
        return tabela.get(time).skill;
    }
}
