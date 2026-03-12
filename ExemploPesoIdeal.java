
package com.mycompany.exemplopesoideal;
import javax.swing.JOptionPane;
public class ExemploPesoIdeal {


    public static void main(String[] args) {

        String sexo;
        double altura, pesoIdeal;

        sexo = JOptionPane.showInputDialog("Digite o sexo (M para masculino / F para feminino):");

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));

        pesoIdeal = calcularPesoIdeal(sexo, altura);

        JOptionPane.showMessageDialog(null, "Peso ideal: " + pesoIdeal);
    }

    static double calcularPesoIdeal(String sexo, double altura) {

        if (sexo.equalsIgnoreCase("M")) {
            return (72.7 * altura) - 58;
        } else {
            return (62.1 * altura) - 44.7;
        }
    }
}