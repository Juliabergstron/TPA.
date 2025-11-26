
package com.mycompany.matriz2;
import java.util.Scanner;
public class Matriz2 {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    
    String [][] matriz2 = new String [3][4];
    
     matriz2[0][0] = "Nome";
     matriz2[0][1] = "Nota 1";
     matriz2[0][2] = "Nota 2";
     matriz2[0][3] = "Media";
     
    
    for(int i = 1; i<3 ; i++){
        
         System.out.printf("\nAluno"+i);
         
         System.out.printf("\nnome:");
         matriz2[i][0] = leitor.nextLine();
         
          System.out.printf("\nnota 1:");
         matriz2[i][1] = leitor.nextLine();
         
          System.out.printf("\nnota 2:");
         matriz2[i][2] = leitor.nextLine();
         
          System.out.printf("\nmedia:");
         matriz2[i][3] = leitor.nextLine();
       }
    
    for(int i = 1; i<3; i++){
    for(int j = 0; j< 4; j++){
    System.out.printf("| %-5s", matriz2[i][j]);
    }
     System.out.printf("\n");
    
   }}
}
    
