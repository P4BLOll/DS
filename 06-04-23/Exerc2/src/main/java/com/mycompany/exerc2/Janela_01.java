/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class Janela_01 extends JFrame{
    public Janela_01(){
        setSize(400,200);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        ImageIcon icone = new ImageIcon("escudo.png");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        tela.setBackground(new Color(125,125,125));
    }
    public static void main(String[] args) {
        Janela_01 app = new Janela_01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
