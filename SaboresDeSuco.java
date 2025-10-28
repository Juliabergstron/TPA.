/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saboresdesuco;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class SaboresDeSuco {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o nome do seus sabores de suco favoritos!");
    String[] Sabores = new String[3];
    
    for( int i = 0; i < Sabores.length; i++)
    {String Sabor = Sabores [i];
     System.out.printf("Digite o nome do sabor %d:\n", (i+1));
     Sabores[i] = leitor.nextLine();}  
    
    System.out.printf("\nLista: \n");
    for( int lista=0; lista< Sabores.length; lista++)
    {String Sabor = Sabores [lista];
     System.out.printf("%d. %s\n", lista + 1, Sabores[lista]);}
    leitor.close();
    }
   
}
