/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os após seu ultimo aniversário meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite após seu ultimo aniversário em dias:"));

        int calculofinaldosdias = (anos * 365) + (meses * 30) + dias;

        JOptionPane.showMessageDialog(null, "A idade em dias é: " + calculofinaldosdias);
    }
}
