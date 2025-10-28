
package com.mycompany.arraylista;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayLista {

    public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();
    
    // 1 Este método adiciona um novo item ao final da lista
    nomes.add("Julia");
    nomes.add("Bergstron"); 
    System.out.println(nomes);
    
    // 2 Retorna um item na posição indicada
    System.out.printf("O primeiro item é %s\n", nomes.get(0));
    
    // 3  Esse método substitui o valor da variavel
    nomes.set(1,"Costa");
    System.out.printf("Meu nome na verdade é %s %s \n", nomes.get(0), nomes.get(1));
    
    // 4  Esse método remove o tiem da lista
    nomes.remove(0);
    System.out.printf("Lista atualizada %s \n", nomes);
    
     // 5  Esse método retorna quantos elementos tem na lista
    System.out.printf("O tamanho da lista %s \n", nomes.size());
     
    // 6 Esse método limpa a lista 
    nomes.clear();
    System.out.printf("Lista atualizada %s \n", nomes);
    
    // 7  Esse método verifica se contém o item na lista
    nomes.add("Costa");
    System.out.printf("Existe na minha lista 'Costa'? %s\n", nomes.contains("Costa"));
    
    // 8  Esse método verifica se a lista esta vazia ou não
    System.out.printf("A lista esta vazia? %s\n", nomes.isEmpty());
    
    // 9  Esse método organiza em ordem Crescente(importe a classe)
    //import java.util.Collections;
    
    nomes.add("Mari");
    nomes.add("Lara");
    Collections.sort(nomes);
    System.out.printf("Lista em ordem crescente %s\n", nomes);
    
    // 10  Esse método usa o ForEach para mostrar a lista
    nomes.forEach(nome -> System.out.printf("ola %s\n", nome));
    
    // 11 
    int contador=1;
    for(String item : nomes){
        System.out.printf("%d. %s\n", contador, item);
        contador ++;
    }
    
    }
}
