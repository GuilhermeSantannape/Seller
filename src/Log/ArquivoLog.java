/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme Santanna
 */
public class ArquivoLog {
    
    
    File Arquivo;
    FileReader FileReader;
    BufferedReader BufferedReader;
    FileWriter FileWriter;
    BufferedWriter BufferedWriter;
    public ArquivoLog(String erros) 
    {escreverlog(erros);
        
    }
    private void escreverlog(String erros) {
        Arquivo =new File("Historico.log");
        try {
             Arquivo =new File("Historico.log");
            FileReader = new FileReader(Arquivo);
           BufferedReader =new BufferedReader(FileReader);
           Vector texto = new Vector();
           while(BufferedReader.ready()){
              texto.add(BufferedReader.readLine());
               
           }
           FileWriter = new FileWriter(Arquivo);
           BufferedWriter = new BufferedWriter(FileWriter);
           for(int i=0;i<texto.size();i++){
               BufferedWriter.write(texto.get(i).toString());
               BufferedWriter.newLine();
           }
           BufferedWriter.write(erros);
           BufferedReader.close();
           BufferedWriter.close();
           
               
        } catch (FileNotFoundException ex) {
            try {
                Arquivo.createNewFile();
                escreverlog(erros);
            } catch (IOException ex1) {
               System.exit(0);
            }
        }
       catch (IOException er){
            System.exit(0);
       }
        
    }
    
    
}
