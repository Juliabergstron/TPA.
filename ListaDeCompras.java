

package com.mycompany.listadecompras;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeCompras {

    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      ArrayList<String> lista = new ArrayList<>();
      
      boolean continuar = true;
      
      do {
      System.out.println("\n Lista De Compras:");
      
      System.out.println("1- Adicionar um item");
      System.out.println("2- Retirar um item");
      System.out.println("3- Mudar um item");
      System.out.println("4- Deletar lista");
      System.out.println("5- Vizualizar lista");
      System.out.println("6- Sair da lista");
      
      System.out.println("\n Digite a opção que deseja executar:");
    
      int opcao = leitor.nextInt();
      leitor.nextLine();
      
      switch(opcao) {
      
          case 1:
          System.out.println("Digite um novo item:");
          String item = leitor.nextLine();
          lista.add(item);
          System.out.printf("\n Item adicionado com sucesso! \n");
          break;
          
          case 2:
          System.out.println("Retire um item:");
          String tirarItem = leitor.nextLine();
          lista.remove(tirarItem);
          System.out.printf("\n Item retirado com sucesso! \n");
          break;
          
          case 3:
          System.out.println("Qual item você deseja mudar?");
          String mudarItem = leitor.nextLine();
          if(lista.contains(mudarItem)){
          int indice = lista.indexOf(mudarItem);
          
          System.out.println("Digite o novo item:");
          String novoItem = leitor.nextLine();
          lista.set(indice,novoItem);
          System.out.println("Item alterado com sucesso!");
          }else{
           System.out.println("Item não encontrado na lista!");
          }
          break;
          
          case 4:
          lista.clear();
          System.out.printf("\n Lista deletada. \n");
          break;
          
          case 5:
          System.out.println("Sua lista é:");
          lista.forEach(itens -> System.out.println("- " + itens));
          break;
          
          case 6:
          System.out.println("Obrigado porusar o programa!");
          continuar = false;
          break;
      }
      
      }while(continuar);
    }
}
