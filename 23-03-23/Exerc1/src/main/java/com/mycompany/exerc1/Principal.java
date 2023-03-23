/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1;


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
        
        //Chamada do método LerNota
        LerNota();
    }
    
    //Inicialização do método LerNota
    static void LerNota(){
        
        //Criação das variáveis
        Double nota1, nota2;
        String nome;
        
        
        //Atribuição
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        
        
        //Chamada do método CalcularMedia
        CalcularMedia(nota1 , nota2 , nome);
    }
    
    
    
    //Inicialização do método Calcuar
    static void CalcularMedia(Double n1 ,Double n2, String nom){
        Double media = (n1+n2)/2;
        
        
        //Bloco de Decisão e exibição dos resultados
        if (media>=7) {
            JOptionPane.showMessageDialog(null, "Nome: "+nom+"\nMédia: "+media+"\nSituação: Aprovado!");
        }else{
            JOptionPane.showMessageDialog(null, "Nome: "+nom+"\nMédia: "+media+"\nSituação: Reprovado!");
        
        }
    }
}
