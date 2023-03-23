/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc3;



//Inportando Pacote de Extensão JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

//Classe Principal
public class Lampada {
    
    
    //Pacote de Extensão de núcleo do Java
    public static void main(String[] args) {
        
        //Criação e atribuição das variáveis
        int estadol;
        estadol = Integer.parseInt(JOptionPane.showInputDialog("Digite o Estado da Lâmpada: \nDigite 1 para acesa\nDigite 0 para apagada"));
        
        //Chamada do método ExibirEstado
        ExibirEstado(estadol);
    }
    
    
    //Inicialização do método ExibirEstado
    static void ExibirEstado(int estado){
        
        //Bloco de Decisão e exibição dos resultados
        if (estado == 1) {
            JOptionPane.showMessageDialog(null, "A Lâmpada está Acesa");
        }else{
            if(estado == 0){
                JOptionPane.showMessageDialog(null, "A Lâmpada está Apagada");
            
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido\nValores aceitos: 1 e 0");
            
            }
        
        }
        
    }
}
