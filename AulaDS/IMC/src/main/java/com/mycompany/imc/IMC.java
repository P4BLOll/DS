/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class IMC {
    private Double peso;
    private Double altura;
    private Double imc;
    
    public IMC(){
        this(0.0 , 0.0 , 0.0);
    }
    
    public IMC(Double peso, Double altura, Double imc){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public Double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(Double imc) {
        this.imc = imc;
    }
    
    public double calcularImc(){
        return(0);
    }
    
    public void cadastrarDados(Double peso, Double altura){
    setPeso(JOptionPane.showInputDialog(""));
    
    }
}
