/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;


//Pacote de Expansão JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

//Criação da classe principal
public class Principal {
    
    
    //Pacote de expansão de núcleo do JAVA
    public static void main(String[] args) {
        
        //Criação e atribuição das variáveis
        int idade1, idade2;
        String nome1, nome2;
        
        nome1=JOptionPane.showInputDialog("Digite o nome da 1ª pessoa: ");
        idade1=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1ª pessoa: "));
        
        nome2=JOptionPane.showInputDialog("Digite o nome da 2ª pessoa: ");
        idade2=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2ª pessoa: "));
        
        //Atribuindo o resultado do método PessoaMaisVelha à variável texto
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
        
        
        //Exibição da mensagem
        JOptionPane.showMessageDialog(null,texto);   
    }
    
    
    //Execução do método PessoaMaisVelha
    static String PessoaMaisVelha(String n1, int id1, String n2, int id2){
        
        
        //Bloco de decisão if, else
        
        if (id1 > id2) {
            return n1 + " é a pessoa mais velha";
        }else{
            if (id2 > id1) {
                return n2 + " é a pessoa mais velha";
            }else{
                return n1 + " e " + n2 + " tem a mesma idade";
            }
        
        }
    
    }
}
