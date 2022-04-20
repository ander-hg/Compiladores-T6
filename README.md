# Construção de Compiladores

Trabalho 6 de Construção de Compiladores, matéria ministrada por professor Daniel Lucredio.

Autores: 
- Anderson H. Giacomini RA: 769720
- Sophia S. Schuster RA: 760936

## Conteúdo
- [Descrição](#descricao)
- [Implementação](#implementacao)
- [Como executar](#como)
- [Observações](#obs)

*******

<div id='descricao'>

## Descrição

O trabalho 5 (T5) da disciplina consiste em implementar um gerador de código para a linguagem LA (Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do DC/UFSCar. O gerador de código deverá produzir código executável em C equivalente ao programa de entrada.

<b>Juntando o analisador semântico com o gerador de código em um único executável</b>

A saída do executável final, que irá combinar analisador léxico+sintático+semântico+gerador, depende da entrada:
- Se a entrada tiver algum erro (léxico ou sintático ou semântico) a saída deve conter a descrição dos erros;
- Se a entrada não tiver nenhum erro, a saída deve conter o código gerado.

<div id='implementacao'>

## Implementação

Para a implementação do trabalho foi utilizado a ferramenta ANTLR (antlr.org) no ambiente Netbeans juntamente com o Maven. As informações de como trabalhar com ANTLR no maven encontram-se em https://www.antlr.org/api/maven-plugin/latest/usage.html

Para a análise semântica foi utilizado tabela de símbolos, e para o gerador de código foi criado um visitor.

<div id='como'>

## Como rodar

<strike>Após importar e compilar o projeto, será gerado uma pasta target com o arquivo .jar já com todas dependencias.</strike>
  
O analisador pode ser executado em linha de comando (windows, mac ou linux), com DOIS ARGUMENTOS OBRIGATORIAMENTE:
  
Argumento 1: arquivo de entrada (caminho completo)<br>
Argumento 2: arquivo de saída (caminho completo)

Exemplo de como rodar o analisador:

```
java -jar C:\compilatorest3\target\expr-parser2-1.0-SNAPSHOT-jar-with-dependencies.jar C:\compilatorest3\casos-de-teste\3.casos_teste_t3\entrada\8.algoritmo_6-2_apostila_LA.txt C:\compiladorest3\saida.txt
```

Como resultado, seu compilador deve ler a entrada C:\compilatorest3\casos-de-teste\3.casos_teste_t3\entrada\8.algoritmo_6-2_apostila_LA.txt e salvar a saída no diretório C:\compiladorest3\saida.txt

<div id='obs'>

## Observações
  
Esse trabalho, T5, é continuação do T3 e do T4. Por isso alguns nomes encontram-se como T3.

Encontram-se também nesse projeto:
  
Os casos de teste <br>
  <a href="https://github.com/dlucredio/compiladores-corretor-automatico/blob/master/Compiladores.CorretorT1T2T3.docx.pdf">O compilador automático </a>

Todo esse conteúdo foi disponibilizado pelo professor. 

