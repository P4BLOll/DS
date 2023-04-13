/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Importe de Pacotes e Bibliotecas
package com.mycompany.exemplointerface;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dti
 */

//Classe Principal Herdando de JFrame
public class Principal extends JFrame{
    
    //Criação de Objetos Label
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    
    //Método Principal
    public Principal(){
        
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
            
            //Posicionamento da Label
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,100,20);
            rotulo4.setBounds(50,140,80,20);
            
            //Estilização da Label
            
            //Cor da Label
            rotulo1.setForeground(Color.red);
            rotulo2.setForeground(Color.blue);
            rotulo3.setForeground(new Color(190,152,142));
            rotulo4.setForeground(new Color(201,200,100));
            
            //Fonte da Label
            rotulo1.setFont(new Font("Arial",Font.BOLD,14));
            rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
            rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
            rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
            
            //Adicionamento da Label na Janela
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            
            
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
        Principal app = new Principal();
        
        //Inicia o JFrame através do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
