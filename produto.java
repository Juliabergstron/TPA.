
package com.mycompany.descontodeproduto;
import javax.swing.JOptionPane;
public class produto {
    
    String nome;
    double preco;
    double resultado;
    
    double calcularDesconto(){
    nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto"));
    resultado = preco -((preco*15)/100);
    return resultado;
    }
}
