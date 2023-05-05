# Battle Compiler

Trabalho final de Construção de Compiladores, matéria ministrada por professor Daniel Lucredio.

Autor: 
- Anderson H. Giacomini RA: 769720
[//]: # (- Sophia S. Schuster RA: 760936)

## Conteúdo
- [Descrição](#descricao)
- [Como utilizar](#comoutilizar)
- [Como executar](#como)
- [Implementação](#implementacao)
- [Observações](#obs)

*******

<div id='descricao'>

## Descrição

Vídeo descrevendo projeto: https://drive.google.com/file/d/1D-0cd-_3l-RpSODabeVkSLTeQyFwvMCT/view?usp=sharing
  
Este trabalho consiste na implementação de um compilador completo para uma linguagem.
  
A linguagem criada foi uma simulação de batalha. Nela é declarado um aliado e um inimigo e vence quem causar mais dano. Cada personagem pode causar ou dano físico ou dano mágico com o seu ataque básico. O dano físico recebido pode ser reduzido pela armadura e o dano mágico pela resistencia a dano magico (MR). Cada personagem possui um nível tanto da sua armadura quanto da sua MR, este nível podendo ser "low", "medium" ou "high". Um personagem pode também possuir uma habilidade. Há duas habilidades implementadas: "pierce" e "compose".
  
|O dano do ataque básico|
| :------------------- |
|100| 
  
|Redução de dano da armadura e MR|
| :------------------- |
|  low: 25% <br> medium: 50% <br> high: 75%| 
  
  
|Habilidades|
  | :------------------- |
  | Pierce: Quando ativada, substitui o ataque básico para causar 60 de dano que ignora qualquer tipo de resistencia do oponente. <br>  Compose: Quando ativada, substitui o ataque básico para causar 240 de dano que é reduzido tanto pela armadura quando pela MR.|
  
<div id='comoutilizar'>

## Como utilizar
  
Estão definidos na linguagem 3 personagens: archer, mage e warrior.
  
A declaração de personagem pode ser feita de 2 formas: ou se declarando uma das opções cidadas à cima ou definindo um personagem customizado. 
  
Na declaração customizada, 4 informações são obrigatórias: o nome (que deve ser informado entre aspas), o tipo de dano do prsonagem, o nível de armadura e o nível de MR. A quinta informação é a habilidade, que pode ser informada ou não.
  
Observe os exemplos:
  
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
 
```
ally 
  mage
enemy 
  name:"barion"
  damage type: physical
  armor: medium
  magic resist: medium
  skill: compose
```
  
Para usar uma habilidade utiliza-se o comando "use" após a declaração dos personagens, passando como parametro o personagem que possui a habilidade (ally ou enemy) e a habilidade que se deseja ativar.
  
```
use(enemy, compose)
```
  
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
  
A saída produzida será uma tela de simulação de batalha em HTML. Cada variação de personagem (tipo de dano de ataque, armadura e MS) possui uma skin diferente. Divirta-se descobrindo todas :-)
  
![](/img/battle.png)
  
<div id='implementacao'>

## Implementação

Para a implementação do trabalho foi utilizado a ferramenta ANTLR (antlr.org) no ambiente Netbeans juntamente com o Maven. As informações de como trabalhar com ANTLR no maven encontram-se em https://www.antlr.org/api/maven-plugin/latest/usage.html

Para a análise semântica foi utilizado tabela de símbolos, e para gerar o HTML foi criado um visitor.

Na análise semântica é feito 3 verificações: 
  
  - Ao tentar utilizar uma habilidade de um personagem, verifica se ele realmente possui essa habilidade.
  - Se o nome nos personagens são iguais
  - Se um personagem é OP (Over Power). Isso acontece quando um personagem recebe armadura e MR "high"
  
  

<div id='obs'>

## Observações
  
java version "17.0.2"
  
Imagens: Ironhide Game Studio. https://www.legendsofkingdomrush.com

Encontram-se também nesse projeto:
  
  Exemplos de uso
