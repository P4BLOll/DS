/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main(String[] args) {
    int anoa , anon , idadea , idadeb;
    
    anoa = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
    anon = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento: "));
    idadea = anoa - anon;
    idadeb = 2050 - anon;
    
    JOptionPane.showMessageDialog(null, "Sua idade atual é:  " + idadea + " anos" + "\n Sua idade em 2050 será de: " +idadeb +  " anos");
    }
}
