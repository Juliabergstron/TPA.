/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do usuário:"));

        double quantidade = salarioUsuario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "O usuário ganha " + quantidade + " salários mínimos.");
    }
}
