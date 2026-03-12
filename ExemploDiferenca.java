
package com.mycompany.exemplodiferenca;
import javax.swing.JOptionPane;
public class ExemploDiferenca {

    public static void main(String[] args) {

        double a, b, resultado;

        a = Double.parseDouble( JOptionPane.showInputDialog("Digite o primeiro valor:"));

        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

        resultado = diferenca(a, b);

        JOptionPane.showMessageDialog(null,"A diferença do maior para o menor é: " + resultado);
    }

    static double diferenca(double x, double y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }
}