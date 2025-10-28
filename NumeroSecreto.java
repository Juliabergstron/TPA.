
package com.mycompany.numerosecreto;

import java.util.Random;
import java.util.Scanner;
public class NumeroSecreto {

    public static void main(String[] args) {
//Primeiro já publiquei a class scanner e random para fazer o jogo.
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
//agora vou adicionar as variaveis necessárias para o jogo FORA do meu laço
      int NumeroSecreto = random.nextInt(1, 11); // número de 1 a 10
      int Palpite= 0;//essa var representa o numero que o usuario vai chutar
      int tentativas = 0;//atribui o valor zero para o numero de tentativas que vai ser exposto depois
//agora com as variaveis já decididas vou criar o meu Do
      do {
           try{
            System.out.print("Digite um número entre 1 e 10: ");
            //aqui o usuario tera que digitar um numero
            Palpite = scanner.nextInt();//o scanner vai ler o numero colocado pelo usuario 
            tentativas++;// aqui falei para se somar um ao valor da tentativa que tinha valor zero.
         
      if(Palpite < NumeroSecreto){
      //se o palpite for menor que o numero tente mais alto    
            System.out.println("Mais alto!");
            
      } else if(Palpite > NumeroSecreto){
      // caso contrario, se o palpite for maior tente mais baixo   
            System.out.println("Mais baixo!");
            
      }else{
      // se não for nenhuma das outras opções significa que você acertou    
            System.out.println("Parábens você acertou!");
            
      if (tentativas == 1) {
      //aqui define o plural da sentança de tentativas   
             System.out.println("Você tentou " + tentativas + " vez.");
      //se o valor de tentativas for igual a 1 aparece vez.       
      }else {
    
       System.out.println("Você tentou " + tentativas + " vezes.");
     //se for maior aparece vezes
      }}}
          catch (Exception e) { 
          System.out.println("Digite apenas números.");
          scanner.next();}}
      while (Palpite!= NumeroSecreto);
      scanner.close();  
   }
}
