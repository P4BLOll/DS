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
public class Lampada {
    
    //Criação e atribuição de uma variável privada
    private String estadoDaLampada = "apagada";
    
    //Criação de método que executará o que é ordenado
    public void acende(){
        
        //Atribuição de um texto ou valor á variavel
        estadoDaLampada = "acesa";
    }
    
    //Criação de método que executará o que é ordenado
    public void apaga(){
    
        //Atribuição de um texto ou valor à variavel
        estadoDaLampada = "apagada";
    }
    
    //Criação de método que executa algo
    public void mostraEstado(){
        
        //Estrutura de decisão para comparar a variável e executar algo conforme o resultado
        if(estadoDaLampada.equals("acesa")){
            
            //Exibição de uma mensagem no terminal
            System.out.println("Está acesa!");
        }else{
            
            //Exibição de uma mensagem no terminal
            System.out.println("Está apagada!");
        }
    }
}
