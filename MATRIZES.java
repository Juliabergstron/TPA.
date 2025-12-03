package com.mycompany.matrizes;

import java.util.Scanner;

public class MATRIZES {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        // matriz com: nome, nota1, nota2, média
        String[][] itens = new String[3][4];

            System.out.print("Avaliação de desempenho de jogos");
        for (int i = 1; i < 3; i++) {

            System.out.println("\nJogo " + i);

            System.out.print("Nome do jogo: ");
            itens[i][0] = entrada.nextLine();

            System.out.print("Nota para o design: ");
            itens[i][1] = entrada.nextLine();

            System.out.print("Nota para o funcionamento: ");
            itens[i][2] = entrada.nextLine();

        //média
            double media = (Double.parseDouble(itens[i][1]) + Double.parseDouble(itens[i][2])) / 2;
            itens[i][3] = String.valueOf(media);
        }

        // Exibindo tabela final
        System.out.println("\n Avaliação de desempenho de jogos \n");
        System.out.printf("| %-12s | %-5s | %-5s | %-16s |\n",
                "Jogo", "Nota 1", "Nota 2", "Desempenho total");

        for (int i = 1; i < 3; i++) {
            System.out.printf("| %-12s | %-6s | %-6s | %-16s |\n",
                    itens[i][0], itens[i][1], itens[i][2], itens[i][3]);
        }
    }
}