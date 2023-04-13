/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */
public class LabelImagem extends JFrame{
    JLabel imagem;
    
    public LabelImagem(){
        
        super("Uso da Classe JLabel com Imagem");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("logo_java.gif");
        imagem = new JLabel(icone);
        
        tela.add(imagem);
        setSize(500,400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        LabelImagem app = new LabelImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
