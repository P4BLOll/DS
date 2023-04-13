/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dti
 */
public class ExemploBotao extends JFrame {
    JButton botao1, botao2, botao3;
    ImageIcon icone;
    
    public ExemploBotao(){
        super("Exemplo com Botão");
        Container tela = getContentPane();
        setLayout(null);
        
        icone = new ImageIcon("Mail_open.png");
        botao1 = new JButton ("Abrir");
        botao2 = new JButton ("Abrir", icone);
        botao3 = new JButton (icone);
        
        botao1.setBounds(50,20,200,20);
        botao2.setBounds(50,60,200,20);
        botao3.setBounds(50,100,200,20);
        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        
        setSize(400,250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ExemploBotao app = new ExemploBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
