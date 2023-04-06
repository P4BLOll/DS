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
public class Carro {

    private String marca = JOptionPane.showInputDialog("Digite a marca");
    private String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
    private String cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
    private String placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
    
    static void ligar(){JOptionPane.showMessageDialog(null,"Ligando");}
    static void desligar(){JOptionPane.showMessageDialog(null,"Desligando");}
    static void acelerar(){JOptionPane.showMessageDialog(null,"Acelerando");}
    static void frear(){JOptionPane.showMessageDialog(null,"Freando");}

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}

