/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;

/**
 *
 * @author dti
 */

//Publicamento e criação da classe herdando do Objects
public class Produto extends Object {
    
    //Criação de variáveis
    public int codigo;
    public String nome;
    public int quantidade;
    public double preco;
    
    //Método com parâmetro
    public Produto(int c, String n, int q, double p){
        codigo = c;
        nome = n;
        quantidade = q;
        preco = p;
    }
}

//Criação da classe TestaProd
class TestaProd{
    
    //Pacote de extensão de núcleo do Java
    public static void main(String[] args) {
        String s = "    ";
        
        //Criação de atributo referenciando a classe
        Produto produto;
        
        //Instância do objeto produto
        produto = new Produto(10, "Sabonete", 12, 1.20);
        
        //Exibição dos dados
        System.out.println(produto.codigo + s + produto.nome);
        System.out.println(produto.quantidade + s + produto.preco);
        produto.quantidade = 100;
        System.out.println(produto.quantidade + s + produto.preco);
        produto.preco *= 1.10;
        System.out.println(produto.quantidade + s + produto.preco);
    }
}