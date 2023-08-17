/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Situacao {
    private String situacao;
    
   public Situacao(String situacao){
       this.situacao = situacao;
   }
   
   public Situacao(){
       this("");
   
   }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
   
public void verificarSituacao(IMC p){
    if(p.getImc()<16.9){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se muito abaixo do peso");
    }else{
        if(p.getImc()>=17.0 && p.getImc()<=18.4){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se abaixo do peso.");
        }else{
        if(p.getImc()>=18.5 && p.getImc()<=24.99){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se no peso ideal.");
        }else{
        if(p.getImc()>=25 && p.getImc()<=29.99){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se acima do peso.");
        }else{
        if(p.getImc()>=30 && p.getImc()<=34.99){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se em estado de Obesidade I.");
        }else{
        if(p.getImc()>=35 && p.getImc()<=39.99){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se em estado de Obesidade II(severa).");
        }else{
        if(p.getImc()>=40){
        setSituacao("Situação do Usuário\n\nUsuário encontra-se em estado de Obesidade III(mórbida).");
        
        }else{
         setSituacao("Dados inválidos");
        }
        }
        
        }
        }
        
        }
        
        }
    }
}
}
