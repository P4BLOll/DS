/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc4;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        Calculo();
    }
    
    static void Calculo(){
        Double altura, base;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base: "));
        Double basealt = Math.pow(altura, 2) + Math.pow(base , 2);
        Double hipo = Math.sqrt(basealt);
        
        JOptionPane.showMessageDialog(null, "O Valor da Hipotenusa é de: "+hipo);
        
    }
}
