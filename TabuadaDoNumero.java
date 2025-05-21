/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadadonumero;

/**
 *
 * @author FATEC ZONA LESTE
 */
 import java.util.Scanner;
public class TabuadaDoNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===Tabuáda do número escolhido===");
        
         System.out.print("Digite um número para aparecer a tabuáda: ");
         double num1  = scanner.nextDouble();
        
         double resultado0 = num1*1 ;
         double resultado1 = num1*2 ;
         double resultado2 = num1*3 ;
         double resultado3 = num1*4 ;
         double resultado4 = num1*5 ;
         double resultado5 = num1*6 ;
         double resultado6 = num1*7 ;
         double resultado7 = num1*8 ;
         double resultado8 = num1*9 ;
         double resultado9 = num1*10 ;
         
        System.out.println("1 x " + num1 + " = " + resultado0);
        System.out.println("2 x " + num1 + " = " + resultado1);
        System.out.println("3 x " + num1 + " = " + resultado2);
        System.out.println("4 x " + num1 + " = " + resultado3);
        System.out.println("5 x " + num1 + " = " + resultado4);
        System.out.println("6 x " + num1 + " = " + resultado5);
        System.out.println("7 x " + num1 + " = " + resultado6);
        System.out.println("8 x " + num1 + " = " + resultado7);
        System.out.println("9 x " + num1 + " = " + resultado8);
        System.out.println("10 x " + num1 + " = " + resultado9); 
         
    scanner.close();
    }
}
