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
public static int numero;
public static int resul;
    public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);
        for (int num = 0; num <= 5; num++) {
          System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            resul = numero - 30;
            if(resul>0){
            System.out.println(numero);
            }
        }
    }
}
