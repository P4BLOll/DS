/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

/**
 *
 * @author dti
 */

//Pacote de extensão de formatação decimal
import java.text.DecimalFormat;

//Pacote de extensão de Scanner
import java.util.Scanner;

//Publicamento e criação da classe para cálculo de média
public class TesteInstancia {
    
    //Pacote de extensão de núcleo do Java
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte n = 0;
        double nota, soma = 0;
        double media;
        System.out.println("Nota do aluno, -1 termina: ");
        nota = entrada.nextInt();
        
        //Bloco de repetição onde o sistema encerra após a digitação do -1
        while (nota != -1){
            soma = soma + nota;
            n = (byte) (n + 1);
            System.out.println("Nota do aluno, -1 termina: ");
            nota = entrada.nextInt();
        }
        
        //Instância para formatação em decimal
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Bloco de decisão para informar média 
        if (n != 0){
            media = soma / n;
            System.out.println("Média igual a "+df.format(media));
        }
        else{
            System.out.println("Nenhuma nota foi digitada");
        }
    }
    
}
