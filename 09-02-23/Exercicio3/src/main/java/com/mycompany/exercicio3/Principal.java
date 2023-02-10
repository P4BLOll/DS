/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {
public static int numero = 0;
public static int cont = 0;
    public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);
        for (int num = 0; num <= 15; num++) {
          System.out.println("Digite um número: ");
            numero = teclado.nextInt();  
            if (numero>30) {
               cont++; 
            }
        }
           System.out.println("");
           System.out.println("A quantidade de números maiores que 30 são: "+cont);
        
    }
}
