/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladordeatendimentobancario;

/**
 *
 * @author user
 */
//Primeiro eu importo o Scanner para ler as variáveis
import java.util.Scanner;
public class SimuladorDeAtendimentoBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
//Aqui eu abri o try para não dar erro 
        try {
            
        double saldo = 1500.00; // declarei o saldo inicial do usuário
        //dei as instruções para o usuário digitar o que ele precisa 
            System.out.println("Menu de Atendimento Bancário");
            System.out.println("Digite 1 para consultar saldo");
            System.out.println("Digite 2 para sacar dinheiro");
            System.out.println("Digite 3 para depositar dinheiro");
            System.out.println("Digite 4 para encerrar atendimento");
            System.out.print("Escolha uma opção: ");
        //declarei a variável escolha de acordo com o que o usuário escolher
            int escolha = scanner.nextInt();
        // abri o switch puxando a variável escolha  
            switch (escolha) {
                case 1: //caso 1 mostrando o saldo exemplo que ja foi declarado
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;
//colocando o break para no ir para o próximo caso e dar erro
                case 2://caso 2 para sacar dinheiro
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
//se o saque for menor que o saldo vai aparecer seu saldo não é suficiente
                    if (saque > saldo) {
                        System.out.println("Seu saldo não é suficiente.");
                    } else 
//se o saque for menor ou igual a zero aparece  esse valor é invalido                       
                    if (saque <= 0) {
                        System.out.println("Esse valor é inválido.");
                    } else {
//caso contrário o saque será realizado
                        saldo = saldo - saque;
                        System.out.println("Seu saque foi realizado!");
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;
//caso 3 para depositar
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
//se o valor do deposito for menormou igual a zero aparece Esse valor é inválido
                
                    if (deposito <= 0) {
                        System.out.println("Esse valor é inválido.");
                    } else {
                        saldo = saldo + deposito;
                        System.out.println("Seu depósito foi realizado.");
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;
//caso 4 para mostrar que o atendimento foi encerrado
                case 4:
                    System.out.println("Atendimento encerrado. Obrigado!");
                    break;

                default:
                    System.out.println("Operação inválida! Escolha entre 1 e 4.");
            }

        } 
 //acrecentei o catch para não quebra o código caso seja colocado outro caractere.        
        catch (Exception e) {
            System.out.println("Erro: entrada inválida! Digite apenas números.");
        } 
//fechando o programa mostrando uma menssagem        
        finally {
          
            System.out.println("Programa finalizado.");
             scanner.close();
        }
    }
}
