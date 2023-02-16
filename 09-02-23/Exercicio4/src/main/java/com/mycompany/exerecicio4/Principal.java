/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerecicio4;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main(String args[]){
        int num;
        int quan = 0;
        int cont = 1;
        Scanner teclado = new Scanner(System.in);
        while(cont <= 10){
            System.out.println("Insira o valor: ");
            num = teclado.nextInt();
            cont++;
        if (num >=100 && num<=200) {
            quan++;
        }else{
            if (num == 0) {
                System.out.println("");
                System.out.println("Encerrando Programa...");
                System.out.println("Programa encerrado!");
                exit(0);
            } 
        }
    }
        System.out.println("");
        System.out.println("A quantidade de números entre 100 e 200 são: "+quan);
}
}
