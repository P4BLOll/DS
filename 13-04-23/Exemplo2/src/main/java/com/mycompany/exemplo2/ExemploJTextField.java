/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dti
 */
public class ExemploJTextField extends JFrame{
        
    //Criação de Objetos Label
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    
    //Criação de Objetos TextField
    JTextField texto1, texto2, texto3, texto4;
    
    //Método Principal
    public ExemploJTextField(){
        
        //Texto da Janela
        super("Exemplo com Label");
        
        //Instanciamento do objeto tela
        Container tela = getContentPane();
        
        //Setar o Layout para utilizar o método setBounds
        setLayout(null);
        
            //Texto da Label
            rotulo1 = new JLabel("Nome");
            rotulo2 = new JLabel("Idade");
            rotulo3 = new JLabel("Telefone");
            rotulo4 = new JLabel("Celular");
            
            //Quantidade de caracteres do Campo de Texto
            texto1 = new JTextField(50);
            texto2 = new JTextField(3);
            texto3 = new JTextField(10);
            texto4 = new JTextField(10);
            
            //Posicionamento da Label
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,100,20);
            rotulo4.setBounds(50,140,80,20);
            
            //Posicionamento do Campo de Texto
            texto1.setBounds(110,20,200,20);
            texto2.setBounds(110,60,20,20);
            texto3.setBounds(110,100,80,20);
            texto4.setBounds(110,140,80,20);
            
            //Adicionamento da Label na Janela
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            
            //Adicionamento do Campo de Texto
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            tela.add(texto4);
            
            
            //Tamanho da Janela
            setSize(400,250);
            
            //Visibilidade da Janela
            setVisible(true);
            
            //Local de Inicio da Janela
            setLocationRelativeTo(null);
            
            
            

    }
    
    //Pacote de Expansão de Núcleo do JAVA
    public static void main(String[] args) {
        
        //Instanciamento do objeto app através da Classe Principal
        ExemploJTextField app = new ExemploJTextField();
        
        //Inicia o JFrame através do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
