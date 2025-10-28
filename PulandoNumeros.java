/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pulandonumeros;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PulandoNumeros {

    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Digite um número:");
    int numero = leitor.nextInt();
    
    for (int valor = 1; valor <= 100; valor += numero) {
    
    System.out.println("A sequência ficou : " +  valor);
        
    }
    
    }
}
