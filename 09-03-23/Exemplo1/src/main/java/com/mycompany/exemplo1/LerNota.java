/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */

//Publicação da Classe LerNota
public class LerNota {
    
    //Pacote de Extensão de Núcleo do Java
    public static void main(String[] args) {
        
        //Chamada do método
        lerNota();
    }
    
    //Método que recebe os dados do aluno
    static void lerNota(){
        double n1,n2;
        String nome;
        
        nome =JOptionPane.showInputDialog(null, "Digite um Nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira Nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda Nota: "));
        JOptionPane.showMessageDialog(null, nome);
        
        //Chamada do método
        calculaMedia(n1,n2);
    }
    
    //Método que recebe os dados do método lerNota e calcula a média do aluno
    private static void calculaMedia(double a1, double a2) {
        double md;
        md = (a1 + a2)/2;
        
        //Bloco de decisão
        if (md>=7) {
            JOptionPane.showMessageDialog(null, "Aprovado!\nMédia:  "+md);
        }
        else{
            if (md<7 && md >3) {
                JOptionPane.showMessageDialog(null,"Recuperação!\nMédia: "+md); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Reprovado!\nMédia: "+md);
            }
        }
    }
}
