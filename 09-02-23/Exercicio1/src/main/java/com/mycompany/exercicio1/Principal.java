/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author dti
 */
public class Principal {
    public static int numero;
    public static void main(String args[]){
        for (int num = 75; num <= 197; num++) {
            numero = (num%2);
            if(numero >0){
                System.out.println(num);
            }
        }
    }
}
