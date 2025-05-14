/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

     import java.util.Scanner;
public class NewMain {

    
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
       System.out.print("Digite seu nome");
       String nome = scanner.nextLine();
        
       System.out.print("Digite sua idade");
       int idade = scanner.nextInt();
       
       System.out.println("Olá"+"nome"+"!você tem"+"idade"+"anos");
       
       scanner.close();
        
               
        
    }
  } 

