
package com.mycompany.produtosdelimpeza;

import java.util.Scanner;
public class ProdutosDeLimpeza {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.printf("\nLista produtos de limpeza: \n");
    System.out.printf("1. Sabão em pó: 25.50\n");
    System.out.printf("2. Candida: 13.50\n");
    System.out.printf("3. Veja para janelas: 3.50\n");
    System.out.printf("4. Detergente: 17.50\n");
    double [] precos = {25.50, 13.50, 3.50, 17.50};
    
    System.out.printf("\nQuantos produtos você quer escolher? ");
    int quantidade = leitor.nextInt();
    int[] produtos = new int[quantidade];
    double total = 0;
   
    for (int i = 0; i < quantidade; i++) {
    System.out.printf("Digite o numero do produto %d:\n", (i + 1));
    produtos[i] = leitor.nextInt();  
    total += precos[produtos[i] - 1]; 
    }
    
     System.out.printf("\nPreço total: R$%.2f\n", total);
     leitor.close();

    }
}
