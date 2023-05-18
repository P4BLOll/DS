/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc2;

//Importando as bibliotecas necessárias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.Math.*;


/**
 *
 * @author dti
 */

//Ciração da Classe Soma Herdando de JFrame
public class Baskara extends JFrame{
    
    //Criação dos Objetos que serão exibidos
    JLabel titulo, rotulo1, rotulo2, rotulo3, res1, res2;
    JTextField texto1, texto2, texto3, x1, x2;
    JButton calcular;
    
    
    //Método Construtor Soma
    public Baskara(){

        //Título da Janela
        super("Exibir Resultado");
       
        //instansiação do objeto tela
        Container tela = getContentPane();
        
        //Permite o posicionamentos dos objetos dentro da janela
        setLayout(null);

        //Instancia o objeto rotulo introduz um texto
        titulo = new JLabel("Fórmula de Baskara");
       
        
        titulo.setBounds(10,0, 300, 70);
        titulo.setFont(new Font("Arial",Font.BOLD, 20));
        rotulo1 = new JLabel("Valor de a: ");
        rotulo2 = new JLabel("Valor de b: ");
        rotulo3 = new JLabel("Valor de c: ");
        
        //Instancia o objeto texto e cria uma caixa de texto
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        //Instancia os botões e cria os botões
        calcular = new JButton("Calcular");
        
        
        //Posiciona os objetos na janela
            rotulo1.setBounds(10,80,80,20);
            rotulo2.setBounds(10,120,80,20);
            rotulo3.setBounds(10,160,100,20);
            
            texto1.setBounds(100,80,200,20);
            texto2.setBounds(100,120,80,20);
            texto3.setBounds(100,160,200,20);
 
            calcular.setBounds(120, 240, 150, 20);
        
        
    //Adiciona ação a lista que estára dentro do botão
    calcular.addActionListener(
            
            //Chama nova ação a ser listada dentro do botão
            new ActionListener(){
                
                //performance da ação que estará dentro
                public void actionPerformed(ActionEvent e){
                    double x1, x2, a, b, c, raizd, delta;
                    a = Double.parseDouble(texto1.getText());
                    b = Double.parseDouble(texto2.getText());
                    c = Double.parseDouble(texto3.getText());
                    delta = (b*b)-(4*a*c);
                    raizd = Math.sqrt(delta);
                    x1 = (-b - raizd)/(2*a);
                    x2 = (-b + raizd)/(2*a);
                   
                   if(delta<0){
                       JOptionPane.showMessageDialog(null,"Delta Negativo, Não possui raízes reais");
                   }else{
                    JOptionPane.showMessageDialog(null, "Resultado de x1: "+x1+"\nResultado de x2: "+x2);
                   }
                }
            }
    );
    
    
    //adiciona os objetos a tela
    tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3);
    tela.add(texto1); tela.add(texto2); tela.add(texto3);
    tela.add(titulo);
    tela.add(calcular);
    
    //Inicia a janela no meio da tela
    setLocationRelativeTo(null);
    
    //Redimensiona a janela
    setSize(400,400);
    
    //Torna tudo dentro da janela visivel
    setVisible(true);
    }
    
    public static void main(String[] args) {
        Baskara app = new Baskara();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}