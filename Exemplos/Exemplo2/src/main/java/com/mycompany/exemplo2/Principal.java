/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

//Importando as bibliotecas necessárias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.*;


/**
 *
 * @author dti
 */

//Ciração da Classe Soma Herdando de JFrame
public class Principal extends JFrame{
    
    //Criação dos Objetos que serão exibidos
    JLabel rotulocep, rotulotel, rotulocpf, rotulodata;
    JFormattedTextField cep, tel, cpf, data;
    JButton cadastrar;
    
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    
    
    //Método Construtor Soma
    public Principal(){
        
        //Título da Janela
        super("Exibir Resultado");
        
        //instansiação do objeto tela
        Container tela = getContentPane();
        
        //Permite o posicionamentos dos objetos dentro da janela
        setLayout(null);

        //Instancia o objeto rotulo introduz um texto
        rotulocep = new JLabel("CEP:");
        rotulotel = new JLabel("Telefone:");
        rotulocpf = new JLabel("CPF:");
        rotulodata = new JLabel("Data:");
        
        //Instancia o objeto botão e cria um botão
        cadastrar = new JButton("Cadastrar");
        
        
        //Posiciona os objetos na janela
        rotulocep.setBounds(50,20,100,20); rotulotel.setBounds(50,60,100,20);
        rotulocpf.setBounds(50,100,100,20); rotulodata.setBounds(50,140,100,20);
        cadastrar.setBounds(50,200,100,20);

      //Atribui uma formatação personalizada a caixa de texto
      try{
          //Espaçamento que será escrito 
          mascaracep = new MaskFormatter("#####-###");
          mascaratel = new MaskFormatter("(##)####-####");
          mascaracpf = new MaskFormatter("#########-##");
          mascaradata = new MaskFormatter("##/##/####");
          
          //Caractere que aparecerá no input/ placeholder
          mascaracep.setPlaceholderCharacter('_');
          mascaratel.setPlaceholderCharacter('_');
          mascaracpf.setPlaceholderCharacter('_');
          mascaradata.setPlaceholderCharacter('_');
    
      }
      catch(ParseException excp){}
      
      cep = new JFormattedTextField(mascaracep);
      tel = new JFormattedTextField(mascaratel);
      cpf = new JFormattedTextField(mascaracpf);
      data = new JFormattedTextField(mascaradata);
      
      cep.setBounds(150,20,100,20);
      tel.setBounds(150,60,100,20);
      cpf.setBounds(150,100,100,20);
      data.setBounds(150,140,100,20);
      
    cadastrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String cep2, tel2, cpf2, data2;
                    
                    cep2 = cep.getText();
                    tel2 = tel.getText();
                    cpf2 = cpf.getText();
                    data2 = data.getText();
                    
                    JOptionPane.showMessageDialog(null,"CEP: "+cep2+"\nTelefone: "+tel2+"\nCPF: "+cpf2+"\nData: "+data2);
                
                }
            }
    );
    
    
    //adiciona os objetos a tela
    tela.add(rotulocep); tela.add(rotulotel);
    tela.add(rotulocpf); tela.add(rotulodata);
    tela.add(cep); tela.add(tel);
    tela.add(cpf); tela.add(data);
    tela.add(cadastrar);
    
    //Inicia a janela no meio da tela
    setLocationRelativeTo(null);
    
    //Redimensiona a janela
    setSize(400,300);
    
    //Torna tudo dentro da janela visivel
    setVisible(true);
    }
    
    public static void main(String[] args) {
        Principal app = new Principal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
