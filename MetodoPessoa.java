
package com.mycompany.pessoa;

public class MetodoPessoa {
   // Atributos privados (encapsulados)
    private String nome;
    private int idade;

    // Construtor
    public MetodoPessoa(String nome, int idade) {
        this.nome = nome;
        this.setIdade(idade); // Usa o setter para validação inicial
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade com VALIDAÇÃO
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa.");
        }
    }
}
