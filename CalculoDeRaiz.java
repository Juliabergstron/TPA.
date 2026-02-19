
package com.mycompany.calculoderaiz;

import javax.swing.JOptionPane;

public class CalculoDeRaiz {

    public static void main(String[] args) {
     
    double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
    double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C:"));
    
    double delta = Math.pow(b, 2) - 4 * a * c;


    Math.sqrt(delta); 
    
    JOptionPane.showMessageDialog(null, "O valor da raiz é " + delta  );
    }
}
