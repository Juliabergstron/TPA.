/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.switchcaseexercicios;

/**
 *
 * @author user
 */
import java.util.Scanner ;
public class SwitchCaseExercicio2 {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
       System.out.println("Digite um número de 1 a 5 e mostrarei o nome de um jogo.");
       int numeropfruta = scanner.nextInt();
       
       switch (numeropfruta) {
          
          case 1 -> System.out.println("Minecraft");
          case 2 -> System.out.println("FIFA");
          case 3 -> System.out.println("Fortnite");
          case 4 -> System.out.println("Call of Duty");
          case 5 -> System.out.println("The Sims");
          default -> System.out.println("Jogo não encontrado,");
         
      }
       
       
       
      }         
  }
}
