
package com.mycompany.pessoa;

public class Pessoa {

    public static void main(String[] args) {

        MetodoPessoa user1 = new MetodoPessoa("Maria", 25);
        System.out.println("Usuário: " + user1.getNome() + ", Idade: " + user1.getIdade());

        // --- MODIFICANDO DADOS (Usando Setters) ---
        user1.setNome("Maria Silva"); // Alterando o nome
        user1.setIdade(26);          // Alterando a idade
        
        System.out.println("Atualizado: " + user1.getNome() + ", Idade: " + user1.getIdade());

        // --- TENTANDO MODIFICAR COM DADOS INVÁLIDOS ---
        user1.setIdade(-5); // O setter validará e impedirá a idade negativa
        System.out.println("Idade final: " + user1.getIdade());
    }
}
   


