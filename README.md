# Construção de Compiladores

Trabalho final de Construção de Compiladores, matéria ministrada por professor Daniel Lucredio.

Autores: 
- Anderson H. Giacomini RA: 769720
- Sophia S. Schuster RA: 760936

## Conteúdo
- [Descrição](#descricao)
- [Como utilizar](#comoutilizar)
- [Implementação](#implementacao)
- [Como executar](#como)
- [Observações](#obs)

*******

<div id='descricao'>

## Descrição

Este trabalho consiste na implementação de um compilador completo para uma linguagem.
  
A linguagem criada foi uma simulação de batalha. Nela é declarado um aliado e um inimigo e vence quem causar mais dano. Cada personagem pode causar ou dano físico ou dano mágico com o seu ataque básico. O dano físico recebido pode ser reduzido através da armadura e o dano mágico através da resistencia a dano magico (MR). Cada personagem possui um nível tanto da sua armadura quanto da sua MR, este nível podendo ser "low", "medium" e "high". Um personagem pode também possuir uma habilidade, ou "pierce" ou "compose".
  
O dano do ataque básico é 100. Os níveis de armadura e MR reduzem o dano recebido por 25%, 50% e 75% (respectivamente para "low", "medium" e "high").
 
Habilidades: 
  Pierce - Quando ativada, substitui o ataque básico para causar 60 de dano que ignora qualquer tipo de resistencia do oponente.
  
  Compose - Quando ativada, substitui o ataque básico para causar 240 de dano que é reduzido tanto pela armadura quando pela MR.
  
![](/img/battle.png)
  
<div id='comoutilizar'>

## Como utilizar
  
Estão definidos na linguagem 3 personagens: archer, mage e warrior.
  
A declaração de personagem pode ser feita de 2 formas: se declarando uma das opções cidada à cima ou definindo um personagem customizado. Observe os exemplos: 
  
```
ally mage
enemy archer
```
  
```
ally 
  name: "barion"
  damage type: magic
  armor: high
  magic resist: high

enemy 
  archer
```
  
<div id='implementacao'>

## Implementação

Para a implementação do trabalho foi utilizado a ferramenta ANTLR (antlr.org) no ambiente Netbeans juntamente com o Maven. As informações de como trabalhar com ANTLR no maven encontram-se em https://www.antlr.org/api/maven-plugin/latest/usage.html

Para a análise semântica foi utilizado tabela de símbolos, e para gerar o HTML foi criado um visitor.

<div id='como'>

## Como rodar

<strike>Após importar e compilar o projeto, será gerado uma pasta target com o arquivo .jar já com todas dependencias.</strike>
  
O analisador pode ser executado em linha de comando (windows, mac ou linux), com DOIS ARGUMENTOS OBRIGATORIAMENTE:
  
Argumento 1: arquivo de entrada (caminho completo)<br>
Argumento 2: arquivo de saída (caminho completo)

Exemplo de como rodar o analisador:

```
java -jar C:\T6\target\T6-1.0-SNAPSHOT-jar-with-dependencies.jar C:\T6\casos-de-teste\entrada3.txt C:\T6\saida.html
```

Como resultado, seu compilador deve ler a entrada C:\T6\casos-de-teste\entrada3.txt e salvar a saída no arquivo C:\T6\saida.html

<div id='obs'>

## Observações
  
creditos ironhide

Encontram-se também nesse projeto:
  
  Exemplos de uso


