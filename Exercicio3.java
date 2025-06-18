/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));
        double novoSaldo = saldo + (saldo * 0.01);

        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1%: R$ " + novoSaldo);
    }
}

