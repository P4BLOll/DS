/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Automotivo {
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private String chasi;
    
    public Automotivo(){
        this("","","","","");
    }
    
    public Automotivo(String modelo, String marca, String cor, String ano, String chasi){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.chasi = chasi;
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
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the chasi
     */
    public String getChasi() {
        return chasi;
    }

    /**
     * @param chasi the chasi to set
     */
    public void setChasi(String chasi) {
        this.chasi = chasi;
    }
    
    public void provaExistencia(){
        
        JOptionPane.showMessageDialog(null,"Informações do Carro\n\n" + "Modelo: "+getModelo()+
                                                                     "\nMarca: "+getMarca()+
                                                                     "\nCor: "+getCor()+
                                                                     "\nAno: "+getAno()+
                                                                     "\nChasi: "+getChasi());
    }
    
    public void entradaDados(){
        setModelo(JOptionPane.showInputDialog("Insira o Modelo do Veículo: "));
        setMarca(JOptionPane.showInputDialog("Insira a Marca do Veículo: "));
        setCor(JOptionPane.showInputDialog("Insira a Cor do Veículo: "));
        setAno(JOptionPane.showInputDialog("Insira o Ano do Veículo: "));
        setChasi(JOptionPane.showInputDialog("Insira o Chasi do Veículo: "));
        
        provaExistencia();
        
    }
}
