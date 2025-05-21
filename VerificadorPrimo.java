/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadorprimo;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class VerificadorPrimo {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }

            System.out.print("Deseja testar outro número? (s/n): ");
            resposta = scanner.next().toLowerCase();

        } while (resposta.equals("s"));

        scanner.close();
    }
}
