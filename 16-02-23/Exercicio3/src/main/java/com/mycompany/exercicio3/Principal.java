/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;


import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main(String[] args) {
    int valorn , valorx , valorf;
 
    
    valorn = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
    valorx = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
    
    valorf =  (int) Math.pow((valorn*valorx), 2);
    
    JOptionPane.showMessageDialog(null, "Operação executada: " + "("+valorn+"*"+valorx+")"+"^2"+"\n Valor final: " +valorf);
    }
}
