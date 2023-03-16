/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

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
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        //Chamada do método Dobro
        dobro(a);
    }
    
    
    //Execução do método Dobro
    static void dobro(int n){
        
        //Atribuição da variável D
        int d = n*2;
        
        //Exibição de mensagem com resultado da conta
        JOptionPane.showMessageDialog(null, "Dobro de "+n+" é "+d);
    }
}
