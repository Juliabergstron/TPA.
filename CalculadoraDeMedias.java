/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademedias;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        
        System.out.println("===MÉDIA===");
        
        
        System.out.print("Digite o primeiro número: ");
       double not1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
       double not2 = scanner.nextDouble();

         System.out.print("Digite o terceiro número: ");
       double not3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
      double  not4 = scanner.nextDouble();

        
    double resultado = (not1 + not2 + not3 + not4)/4;
     System.out.println("Resultado da média: " + resultado);
     
scanner.close();
    }
}
