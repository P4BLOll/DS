/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

//Importando as bibliotecas necessárias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dti
 */

//Ciração da Classe Soma Herdando de JFrame
public class Soma extends JFrame{
    
    //Criação dos Objetos que serão exibidos
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, multiplicar, dividir, subtrair;
    
    
    //Método Construtor Soma
    public Soma(){
        
        //Título da Janela
        super("Exibir Resultado");
        
        //instansiação do objeto tela
        Container tela = getContentPane();
        
        //Permite o posicionamentos dos objetos dentro da janela
        setLayout(null);

        //Instancia o objeto rotulo introduz um texto
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("1° Número: ");
        
        //Instancia o objeto texto e cria uma caixa de texto
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        //Instancia o objeto exibir sem valor
        exibir = new JLabel("");
        
        //Instancia os botões e cria os botões
        somar = new JButton("+");
        multiplicar = new JButton("x");
        subtrair = new JButton("-");
        dividir = new JButton("÷");
        
        //Posiciona os objetos na janela
        rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,200,200,20); somar.setBounds(100,100,80,20);
        multiplicar.setBounds(200,100,80,20); subtrair.setBounds(100,150,80,20);
        dividir.setBounds(200,150,80,20);
        
    //Adiciona ação a lista que estára dentro do botão
    somar.addActionListener(
            
            //Chama nova ação a ser listada dentro do botão
            new ActionListener(){
                
                //performance da ação que estará dentro
                public void actionPerformed(ActionEvent e){
                    int n1, n2, soma;
                    soma = 0;
                    n1 = Integer.parseInt(texto1.getText());
                    n2 = Integer.parseInt(texto2.getText());
                    soma = n1 + n2;
                    
                    //torna o exibir visivél
                    exibir.setVisible(true);
                    //exibir.setText("A soma é: "+soma);//atribui o resultado da conta ao objeto exibir
                    
                    JOptionPane.showMessageDialog(null,"O Resultado da conta é: "+soma);
                
                }
            }
    );
    
    subtrair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int n1, n2, sub;
                    sub = 0;
                    n1 = Integer.parseInt(texto1.getText());
                    n2 = Integer.parseInt(texto2.getText());
                    sub = n1 - n2;
                    exibir.setVisible(true);
                    //exibir.setText("A subtração é: "+sub);
                    
                    JOptionPane.showMessageDialog(null,"O Resultado da conta é: "+sub);
                
                }
            }
    );
    
    dividir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    double n1, n2, div;
                    div = 0;
                    n1 = Double.parseDouble(texto1.getText());
                    n2 = Double.parseDouble(texto2.getText());
                    div = n1 / n2;
                    exibir.setVisible(true);
                    //exibir.setText("A divisão é: "+div);
                    
                    JOptionPane.showMessageDialog(null,"O Resultado da conta é: "+div);
                
                }
            }
    );
    
    multiplicar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int n1, n2, multi;
                    multi = 0;
                    n1 = Integer.parseInt(texto1.getText());
                    n2 = Integer.parseInt(texto2.getText());
                    multi = n1 * n2;
                    exibir.setVisible(true);
                    //exibir.setText("A multiplicação é: "+multi);
                    
                    JOptionPane.showMessageDialog(null,"O Resultado da conta é: "+multi);
                
                }
            }
    );
    
    //torna o objeto exibir não-visível
    exibir.setVisible(false);
    
    //adiciona os objetos a tela
    tela.add(rotulo1); tela.add(rotulo2);
    tela.add(texto1); tela.add(texto2);
    tela.add(exibir); tela.add(somar);
    tela.add(multiplicar); tela.add(subtrair);
    tela.add(dividir);
    
    //Inicia a janela no meio da tela
    setLocationRelativeTo(null);
    
    //Redimensiona a janela
    setSize(400,250);
    
    //Torna tudo dentro da janela visivel
    setVisible(true);
    }
    
    public static void main(String[] args) {
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
