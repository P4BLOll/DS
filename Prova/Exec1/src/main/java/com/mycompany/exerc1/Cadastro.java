/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dti
 */
public class Cadastro extends JFrame{
        
    //Criação de Objetos Label
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, titulo;
    
    //Criação de Objetos TextField
    JTextField texto1, texto2, texto3, texto4;
    
    //Criação de Objeto Botão
    JButton cadastro;
    
    //Método Principal
    public Cadastro(){
        
        //Texto da Janela
        super("Exemplo com Label");
        
        //Instanciamento do objeto tela
        Container tela = getContentPane();
        
        //Setar o Layout para utilizar o método setBounds
        setLayout(null);
        
            //Texto da Label
            
            titulo = new JLabel("Cadastro de Professor");
            rotulo1 = new JLabel("Nome");
            rotulo2 = new JLabel("Matrícula");
            rotulo3 = new JLabel("Disciplina");
            rotulo4 = new JLabel("Qtd de Aulas");
            
            //Quantidade de caracteres do Campo de Texto
            texto1 = new JTextField(50);
            texto2 = new JTextField(3);
            texto3 = new JTextField(10);
            texto4 = new JTextField(10);
            
            cadastro = new JButton("Confirmar Cadastro");
            
            //Posicionamento da Label
            titulo.setBounds(10,0, 300, 70);
            titulo.setFont(new Font("Arial",Font.BOLD, 20));
            rotulo1.setBounds(10,80,80,20);
            rotulo2.setBounds(10,120,80,20);
            rotulo3.setBounds(10,160,100,20);
            rotulo4.setBounds(10,200,80,20);
            
            //Posicionamento do Campo de Texto
            texto1.setBounds(100,80,200,20);
            texto2.setBounds(100,120,80,20);
            texto3.setBounds(100,160,200,20);
            texto4.setBounds(100,200,80,20);
            
            cadastro.setBounds(120, 240, 150, 20);
            
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
            
            tela.add(cadastro);
            
            tela.add(titulo);
            
            
            //Tamanho da Janela
            setSize(400,350);
            
            //Visibilidade da Janela
            setVisible(true);
            
            //Local de Inicio da Janela
            setLocationRelativeTo(null);
            
            
            

    }
    
    //Pacote de Expansão de Núcleo do JAVA
    public static void main(String[] args) {
        
        //Instanciamento do objeto app através da Classe Principal
        Cadastro app = new Cadastro();
        
        //Inicia o JFrame através do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}