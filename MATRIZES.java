package com.mycompany.matrizes;

import java.util.Scanner;

public class MATRIZES {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        // matriz com: nome, nota1, nota2, média
        String[][] itens = new String[3][4];

            System.out.print("Padaria\n");
            System.out.print("Pão Frances: $0,50\n");
            System.out.print("Pão de Leite: $0,75\n");
            System.out.print("Doces: $1,50\n");
            System.out.print("Frios: $15,0\n");
            
        for (int i = 1; i < 3; i++) {

            System.out.println("\nConta da Padaria " + i);

            System.out.print("Item: ");
            itens[i][0] = entrada.nextLine();

            System.out.print("Preço: ");
            itens[i][1] = entrada.nextLine();

            System.out.print("Quantidade: ");
            itens[i][2] = entrada.nextLine();

        //média
            double media = (Double.parseDouble(itens[i][1])* Double.parseDouble(itens[i][2])) ;
            itens[i][3] = String.valueOf(media);
        }

        // Exibindo tabela final
        System.out.println("\n Conta da Padaria\n");
        System.out.printf("| %-12s | %-5s | %-5s | %-10s |\n",
                "Item", "Quantidade", "Preço", "Total");

        for (int i = 1; i < 3; i++) {
            System.out.printf("| %-12s | %-10s | %-5s | %-10s |\n",
                    itens[i][0], itens[i][1], itens[i][2], itens[i][3]);
        }
    }
}