/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLES ===");

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Entrada da operação
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // Operações manuais com uso do operador ternário
        double soma = (op == '+') ? num1 + num2 : 0;
        double sub = (op == '-') ? num1 - num2 : 0;
        double mult = (op == '*') ? num1 * num2 : 0;
        double div = (op == '/' && num2 != 0) ? num1 / num2 : 0;
        

        // Impressão do resultado
  
        System.out.println((op == '+') ? "Resultado: " + soma : "");
        System.out.println((op == '-') ? "Resultado: " + sub : "");
        System.out.println((op == '*') ? "Resultado: " + mult : "");
        System.out.println((op == '/' && num2 != 0) ? "Resultado: " + div : "");

        scanner.close();
    }
}

    
    

