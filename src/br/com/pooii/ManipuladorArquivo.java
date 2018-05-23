/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pooii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

public class ManipuladorArquivo {

	public static void escritor(String palavra, int tipo) throws IOException {            
            
                if (tipo == 1){
                File arquivo = new File("funcionario.txt");
                
                
                if (arquivo.exists() == false) arquivo.createNewFile();
                
                try (FileWriter fw = new FileWriter(arquivo, true);
                        
                        
                    BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(palavra);
                    bw.close();
                    fw.close();
                    }
                }
                if (tipo == 2){
                File arquivo = new File("cliente.txt");
                
                
                if (arquivo.exists() == false) arquivo.createNewFile();
                
                try (FileWriter fw = new FileWriter(arquivo, true);
                        
                        
                    BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(palavra);
                    bw.close();
                    fw.close();
                    }
                }
                if (tipo == 3){
                File arquivo = new File("servico.txt");
                
                
                if (arquivo.exists() == false) arquivo.createNewFile();
                
                try (FileWriter fw = new FileWriter(arquivo, true);
                        
                        
                    BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(palavra);
                    bw.close();
                    fw.close();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	}
        
}