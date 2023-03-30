/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("Nossa Primeira Janela");
        setSize(700,450);
        setVisible(true);
        Container tela = getContentPane();
        tela.setBackground(new Color(0,0,0));
      //tela.setBackground(Color.pink); MUDA COR DE FUNDO DA JANELA
      //setLocationRelativeTo(null); MUDA O LOCAL DE APARECIMENTO DA JANELA, NULL REALOCA A JANELA NO CENTRO
      //setResizable(false); NÃO PERMITE REDIMENSIONAR A JANELA
      //setExtendedState(MAXIMIZED_BOTH); JANELA ABRE MAXIMIZADA
      //setExtendedState(ICONIFIED); JANELA ABRE MINIMIZADA
      
    
    }
    
    
    public static void main(String[] args) {
        PrimeiraJanela app = new PrimeiraJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

