/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        
        usuario1.provarExistencia();
        
        usuario1.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        usuario1.login = JOptionPane.showInputDialog("Digite seu login: ");
        usuario1.email = JOptionPane.showInputDialog("Digite seu email: ");
        usuario1.senha = JOptionPane.showInputDialog("Digite sua senha: ");
        
        JOptionPane.showMessageDialog(null,"Informações \n\nNome: "+usuario1.nome+"\nLogin: "+usuario1.login+"\nEmail: "+usuario1.email+"\nSenha: "+usuario1.senha);
    }
    
}
