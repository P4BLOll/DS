/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;


//Importação da Biblioteca JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */

//Criação da Classe
public class Automotivo {
    
    //Criação das variáveis encapsuladas da classe
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    
    //Método construtor sem parâmetro
    public Automotivo(){
        
        //Inicialização da variáveis
        this("", "", 0, "");
    }
    
    //Método construtor com parâmetro que referencia as variáveis à um atributo
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    
    //Bloco de método de encapsulamento
    
    //Puxa um valor de um atributo privado
    public String getModelo() {
        return modelo;
    }


    
    //Seta um valor em um atributo privado
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Puxa um valor de um atributo privado
    public String getMarca() {
        return marca;
    }


    //Seta um valor em um atributo privado
    public void setMarca(String marca) {
        this.marca = marca;
    }


    //Puxa um valor de um atributo privado
    public Integer getAno() {
        return ano;
    }


    //Seta um valor em um atributo privado
    public void setAno(Integer ano) {
        this.ano = ano;
    }


    //Puxa um valor de um atributo privado
    public String getCor() {
        return cor;
    }


    //Seta um valor em um atributo privado
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    //Método para exibição dos dados inseridos
    public void provarExistencia(){
    
        //Criação de uma janela de mensagem
        JOptionPane.showMessageDialog(null, "Modelo:  " + this.getModelo() + "\n Marca:  " + this.getMarca() + "\n Ano:  " + this.getAno() + "\n Cor:  " + this.getCor());
    }
    
    //Método para a entrada dos dados
    public void entraDados(){
    
        //Atribuindo valores aos atributos de acordo com o que é inserido na janela de input
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno(ano);
        String cor = JOptionPane.showInputDialog("Cor: ");
        setCor(cor);
    }
    
    //Extensão de núcleo do Java
    public static void main(String[] args) {
        
        //Instanciamento da clase ao objeto através do método construtor e chamada dos métodos através do objeto
        Automotivo auto1;
        auto1 = new Automotivo();
        auto1.entraDados();
        auto1.provarExistencia();

    }
    
}
