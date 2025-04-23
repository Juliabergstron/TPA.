/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
       
        
// Primeiro começa se declarando as variavéis nescessárias para as contas.
        double var1 = 60;
        double var2 = 6;
        //declarando as variavéis das áreas.
        double lad = 12;
        double lar = 15;
        //declarando as variavéis do losangulo.
        double diagonalmaior = 5.5;
        double diagonalmenor = 2.5;
        //declarando as variavéis do calculo da circunferência.
        double pi = 3.14;
        double raio = 5;
        //declarando as variavéis da média
        double not1 = 8;
        double not2 = 9;
        double not3 = 10;
        double nvar = 3;   
        //Declarando as operações basicas de matemática no código
        double adicao = var1 + var2;
        double subtracao = var1 - var2;
        double multiplicacao = var1 * var2;
        double divisao = var2 !=0 ? var1/var2 : Double.NaN;
        double sobras = var1 % var2;
        double areadoquadrado = lad * lad;
        double areadoretangulo = lad * lar;
        double areadolosangulo = diagonalmaior * diagonalmenor /2;
        double media = not1 + not2 + not3 / nvar;
        double circunferencia = raio * raio * pi;
        //Exibindo os resultados
        System.out.println("Resultados das operações:");
        System.out.println("Adicão: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (var2 !=0 ? divisao : 
                "Indefinida (divisão por zero)"));
        System.out.println("Sobras da divisão: " + sobras);
        System.out.println("Calculo da Área do quadrado: " + areadoquadrado );
        System.out.println("Calculo da Área do retângulo: " + areadoretangulo );
        System.out.println("Calculo da Área do losangulo: " + areadolosangulo );
        System.out.println("Calculo da média: " + media );
        System.out.println("Calculo da circunferência: " + circunferencia );
     
    }
}
