/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 4:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 5:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 6:"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 8:"));
        int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 9:"));
        int f = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 7:"));

        double media1 = (a + b + c) / 3.0;
        double media2 = (d + e + f) / 3.0;
        double mediaFinal = (media1 + media2) / 2;

        JOptionPane.showMessageDialog(null, "Média final das duas médias: " + mediaFinal);
    }
}
