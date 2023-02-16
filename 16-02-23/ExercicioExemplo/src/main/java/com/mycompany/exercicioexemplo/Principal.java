/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioexemplo;//

import javax.swing.JOptionPane;//Importação da Bilioteca de funções. do JOptionPane

/**
 *
 * @author dti
 */
public class Principal {//Inicia a classe do Projeto
    
    public static void main(String[] args) {// Indica o pacote de extensão de núcleo do Java
    
    //Declaração das variáveis: linha 15 e 16
    //Atribuindo o valor das notas às variáveis de acordo com o que é digitado pelo usuário: linha 22 a 25
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, md = 0;
        String des = "";
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        
    //Atribuindo o valor da média final às variáveis 
        md = (n1 + n2 + n3 + n4)/4;
        
    //Decisão encadeada para analisar a situação do aluno de acordo com a média final
        if (md >=6){
            des = "Aprovado";
        }
        else if(md < 3){
            des = "Retido";
        }
        else{
            des = "Exame";
        }// Fechamento da Decisão encadeada
       
        //Exibição da conta programada e efetuada pelo algorítmo
        JOptionPane.showMessageDialog(null, "Média final: "+md+ "\nSituação do aluno: "+des);
        
    }//Fechamento do método main
}//Fechamento da classe
