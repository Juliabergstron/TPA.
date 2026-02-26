
package com.mycompany.exemplopessoa;

public class ExemploPessoa {

    public static void main(String[] args) 
    {
       Pessoa pessoa = new Pessoa();
       
       pessoa.nome = "Julia";
       pessoa.pais = "Brasil";
       pessoa.sexo = "Feminino";
       
       pessoa.Andar();
       pessoa.Falar();
       pessoa.Correr();
       pessoa.Estudar();
       pessoa.Brincar();
       
       System.out.println(" Nome: " + pessoa.nome );
       System.out.println(" Pais: " + pessoa.pais);
       System.out.println(" Sexo: " + pessoa.sexo);
       pessoa = null;
       
    }
}
