/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradetarifasdetransporte;

/**
 *
 * @author user
 */
//Primeiro eu importo o Scanner para ler as variáveis
import java.util.Scanner;

public class CalculadoraDeTarifasDeTransporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Aqui eu abri o try para não dar erro 
        try{
//Aqui eu mostro os meios de transporte, com seus respectivos valores, e peço para o usuário escolher e digitar.   
          System.out.println("Escolha o seu meio de transporte:");
          System.out.println("Digite 1 para Ônibus Urbano (R$ 4,40)");
          System.out.println("Digite 2 para Metrô (R$ 5,00)");
          System.out.println("Digite 3 para Trem Intermunicipal (R$ 6,50)");
          System.out.println("Digite 4 para Ônibus Rodoviário (R$ 12,00)");
          System.out.print("Digite a sua escolha: ");
//Aqui eu declro a variável que terá o valor digitado pelo usuário.        
        int escolha = scanner.nextInt();
        
          System.out.println("Digite a quantidade:");

        int quantidade = scanner.nextInt();
//Aqui eu declaro as variáveis pafa calcular o total da compra.        
        double preco;
        double total;
 // abri o switch puxando a variável escolha       
           switch (escolha) {
                case 1://caso 1 com o onibus urbano 
                    preco= 4.40;// aqui o preco da  passagem
                    total = preco * quantidade;// aqui a conta para calcular o preço da passagem co a quantidade escolhida.
                    System.out.println("Você escolheu Ônibus Urbano.");//mostro para o usuário a passagem escolhida
                    System.out.println("Total a pagar: R$ " + total);// e por fim mosto o total a ser pago.
                    break;
                case 2:
                    preco = 5.00;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Metrô.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                case 3:
                    preco = 6.50;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Trem Intermunicipal.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                case 4:
                    preco = 12.00;
                    total = preco * quantidade;
                    System.out.println("Você escolheu Ônibus Rodoviário.");
                    System.out.println("Total a pagar: R$ " + total);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 4."); 
        }}
          //acrecentei o catch para não quebra o código caso seja colocado outro caractere.
           catch (Exception e) {
            System.out.println("Valor inválido!");

    }
        //fechando o programa mostrando uma menssagem 
           finally {
            System.out.println("Programa encerrado.");
            scanner.close();}//fechando o scanner.
    }
}
