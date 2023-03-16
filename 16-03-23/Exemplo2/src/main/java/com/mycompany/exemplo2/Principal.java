/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;


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
        
        //Chamada do método Digite
        digite();
    }
    
    
    //Execução do método Digite
    static void digite(){
        
        //Criação de atribuição das variáveis
        int t;
        String p;
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t = tamanho(p);

        //Exibição de mensagem com resultado da conta
        JOptionPane.showMessageDialog(null,p+" possui "+t+" caracteres");
        
    }
    
    //Execução do método tamanho
    static int tamanho(String x){
        
        
        //Retorno da tamanho da palavra
        return x.length();
    
    }
}
