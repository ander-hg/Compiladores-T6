/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.T6Parser.ProgramaContext;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author ander
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        // args[0] é o arquivo de leitura
        // args[1] é o arquivo de escrita
        CharStream cs = CharStreams.fromFileName(args[0]); 
        // gera o inicio do html
        GeradorHTML.setPf(args[1]);
        // lexico
        T6Lexer lexer = new T6Lexer(cs);
        // parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        T6Parser parser = new T6Parser(tokens);
        // Registrar o error lister personalizado aqui
        MyCustomErrorListener mcel = new MyCustomErrorListener();
        parser.addErrorListener(mcel);
        // semantico
        ProgramaContext arvore = parser.programa();
        T6Semantico as = new T6Semantico();
        as.visitPrograma(arvore);
        
        //parser.programa();

        GeradorHTML.escreveArquivo();
       
    }
}
