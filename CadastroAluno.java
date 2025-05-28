/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroaluno;

/**
 *
 * @author FATEC ZONA LESTE
 */
  import java.util.Scanner;
public class CadastroAluno {
  
    public static void main(String[] args) {
      
        
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis com os tipos corretos
        String curso;
        String nome;
        String dataNascimento;
        String serie;
        double altura;
        double peso;

        // Entrada de dados
      
        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();
        
        System.out.print("Digite o curso: ");
        curso = scanner.nextLine();


        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        dataNascimento = scanner.nextLine();

        System.out.print("Digite a série (ex: Primeiro ano): ");
        serie = scanner.nextLine();

        System.out.print("Digite a altura (em metros): ");
        altura = scanner.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        peso = scanner.nextDouble();

        // Saída de dados
        System.out.println("---DADOS CADASTRADOS---");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}
