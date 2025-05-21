/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
 
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1, num2, resultado;
        char operacao;

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextFloat();

        System.out.print("Escolha a operação (+, -, *, /): ");
        operacao = input.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        input.close();
    }
}
    
    

