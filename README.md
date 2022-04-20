# Construção de Compiladores

Trabalho final de Construção de Compiladores, matéria ministrada por professor Daniel Lucredio.

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
java -jar C:\compilatorest3\target\expr-parser2-1.0-SNAPSHOT-jar-with-dependencies.jar C:\compilatorest3\casos-de-teste\3.casos_teste_t3\entrada\8.algoritmo_6-2_apostila_LA.txt C:\compiladorest3\saida.html
```

Como resultado, seu compilador deve ler a entrada C:\compilatorest3\casos-de-teste\3.casos_teste_t3\entrada\8.algoritmo_6-2_apostila_LA.txt e salvar a saída no diretório C:\compiladorest3\saida.html

<div id='obs'>

## Observações
  
creditos ironhide

Encontram-se também nesse projeto:
  
  Exemplos de uso


