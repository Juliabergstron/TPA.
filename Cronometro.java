/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cronometro;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Cronometro {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o número final do cronômetro de segundos. ");
    int numeroescolhido = leitor.nextInt();
    
    for( int segundos = 0; segundos <= numeroescolhido; segundos++){
    
    System.out.println("contagem progressiva : " + segundos);
    
    }
    }
}
