/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

/**
 *
 * @author dti
 */

//Criação de uma Classe
public class ExemploLampada {
    
    //Biblicoteca de núcleo do Java
    public static void main(String[] args) {
        
        //Istanciamento da classe ao objeto através do método construtor
        Lampada lampada = new Lampada();
        
        
        //Chamada das métodos através do objeto
        lampada.acende();
        lampada.apaga();
        lampada.mostraEstado();
    }
}
