package com.mycompany.array;


public class Array {

    public static void main(String[] args) {
    String [] nomes = {"Julia","aluna"};
    System.out.printf("Os dois valores sao %s, %s\n", nomes[0],nomes[1]);
    
    //Esse método de contagem dos caracteres
    System.out.printf("O nome %s tem %s letra\n",nomes[0],nomes[0].length());
    
    //Esse método transforma tudo em maiusculo
    System.out.printf("O nome %s em maiusculo %s \n",nomes[0],nomes[0].toUpperCase());
    
    //Esse método transforma tudo em minusculo
    System.out.printf("O nome %s em minusculo %s \n",nomes[0],nomes[0].toLowerCase());
    
    //Esse método traz a letra em uma posição específica
    System.out.printf("A primeira letra de %s é %s \n",nomes[0],nomes[0].charAt(0));
    
    //Esse método traz uma paret da string
    System.out.printf("As três primeiras letras de %s é %s \n",nomes[0],nomes[0].substring(0,4));
    
    //Esse método tambem traz a string a partir do indice selecionado
    System.out.printf("As três primeiras letras de %s é %s \n",nomes[0],nomes[0].substring(2));
    
    //Esse método faz comparação
    System.out.printf("O nome %s é igual a 'Julia'? %s\n",nomes[0],nomes[0].equals("Julia"));
    
    //Esse método faz comparações sem levar conta Case
    System.out.printf("O nome %s é igual a 'Julia'? %s\n",nomes[0],nomes[0].equalsIgnoreCase("julia"));
    
    //Esse método verifiac se contem alguma parte do texto
    System.out.printf("O nome %s  contém 'Ju'? %s\n",nomes[0],nomes[0].contains("Ju"));
    
    //Esse método verifica se começa com determinada silaba
    System.out.printf("O nome %s começa com 'Ju'? %s\n",nomes[0],nomes[0].startsWith("Ju"));
    
    //Esse método verifica se termina com determinada silaba
    System.out.printf("O nome %s termina com 'a'? %s\n",nomes[0],nomes[0].endsWith("a"));
    
    //Esse método troca uma parte ou o toda a string
    System.out.printf("Troque %s por 'Mariana'. Agora eu sou %s\n",nomes[0],nomes[0].replace("Julia","Mariana"));
    }
    
}