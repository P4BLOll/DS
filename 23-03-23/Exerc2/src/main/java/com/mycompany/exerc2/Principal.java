/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc2;


//Inportando Pacote de Extensão JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

//Classe Principal
public class Principal {
    
    //Pacote de Extensão de núcleo do Java
    public static void main(String[] args) {
        
        
        //Criação e atribuição das variáveis
        Double num1;
        Double num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Número: "));
        
        
        //Chamada do método LerNota
        ExibirDiferenca(num1, num2);
    }
    
    
    //Inicialização do método ExibirDiferenca
    static void ExibirDiferenca(Double n1, Double n2){
        Double dif;
        
        
        //Bloco de Decisão e exibição dos resultados
        
        if (n1>n2) {
            dif = n1 - n2;
            JOptionPane.showMessageDialog(null, "Maior Número: "+n1+"\nMenor Número: "+n2+"\nDiferença: "+dif);
        }else{
            if (n2>n1) {
                dif = n2 - n1;
                JOptionPane.showMessageDialog(null, "Maior Número: "+n2+"\nMenor Número: "+n1+"\nDiferença: "+dif);
            }else{
                JOptionPane.showMessageDialog(null, "Números Iguais\nPrimeiro Número: "+n1+"\nSegundo Número: "+n2+"\nDiferença: 0");
            }
        
        }
    }
}
