/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc3;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame {
    JLabel rotulo1,nome,ender,cidad,esta,cep,tel;
    public Janela(){
        setSize(450,450);
        Container tela = getContentPane();
        tela.setBackground(Color.cyan);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icone = new ImageIcon("escudo.png");
        setIconImage(icone.getImage());
        
        setLayout(null);
        rotulo1 = new JLabel("Cadastro de Clientes");
        rotulo1.setBounds(145,20,1000,50);
        rotulo1.setForeground(Color.BLUE);
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
       
        nome = new JLabel("Nome :");
        nome.setBounds(50,60,1000,50);
        nome.setFont(new Font("Arial",Font.BOLD,13));
        
        ender = new JLabel("Endereço :");
        ender.setBounds(50,100,1000,50);
        ender.setFont(new Font("Arial",Font.BOLD,13));
        
        cidad = new JLabel("Cidade :");
        cidad.setBounds(50,140,1000,50);
        cidad.setFont(new Font("Arial",Font.BOLD,13));
        
        esta = new JLabel("Estado :");
        esta.setBounds(50,180,1000,50);
        esta.setFont(new Font("Arial",Font.BOLD,13));
        
        cep = new JLabel("CEP :");
        cep.setBounds(50,220,1000,50);
        cep.setFont(new Font("Arial",Font.BOLD,13));
        
        tel = new JLabel("Telefone :");
        tel.setBounds(50,260,1000,50);
        tel.setFont(new Font("Arial",Font.BOLD,13));
        

      
        
        tela.add(rotulo1);
        tela.add(nome);
        tela.add(ender);
        tela.add(cidad);
        tela.add(esta);
        tela.add(cep);
        tela.add(tel);
        
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
