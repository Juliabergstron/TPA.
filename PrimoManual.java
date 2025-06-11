/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primomanual;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class PrimoManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();

        // Vamos verificar manualmente os divisores
        int div1 = numero % 1;
        int div2 = numero % 2;
        int div3 = numero % 3;
        int div4 = numero % 4;
        int div5 = numero % 5;
        int div6 = numero % 6;
        int div7 = numero % 7;
        int div8 = numero % 8;
        int div9 = numero % 9;
        int div10 = numero % 10;

        int cont = 0;
        cont += (div1 == 0) ? 1 : 0;
        cont += (div2 == 0) ? 1 : 0;
        cont += (div3 == 0) ? 1 : 0;
        cont += (div4 == 0) ? 1 : 0;
        cont += (div5 == 0) ? 1 : 0;
        cont += (div6 == 0) ? 1 : 0;
        cont += (div7 == 0) ? 1 : 0;
        cont += (div8 == 0) ? 1 : 0;
        cont += (div9 == 0) ? 1 : 0;
        cont += (div10 == 0) ? 1 : 0;

        String resultado = (cont == 2) ? "É primo" : "Não é primo";
        System.out.println(resultado);
    }
}
