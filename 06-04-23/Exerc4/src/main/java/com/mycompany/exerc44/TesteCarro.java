/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc44;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        String marca = c.getMarca();
        String cor = c.getCor();
        String placa = c.getPlaca();
        String modelo = c.getModelo();
        
        JOptionPane.showMessageDialog(null, "Carro\n\nMarca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nPlaca: "+placa);       
        c.acelerar();
        c.frear();
        c.ligar();
        c.desligar();
    }
}
