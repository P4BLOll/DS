/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("Nossa Primeira Janela");
        ImageIcon icone = new ImageIcon("naruto3.png");
        setIconImage(icone.getImage());
        setSize(700,450);
        setVisible(true);
        Container tela = getContentPane();
        tela.setBackground(new Color(0,0,0));

      
    
    }
    
    
    public static void main(String[] args) {
        PrimeiraJanela app = new PrimeiraJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }