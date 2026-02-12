
package com.mycompany.calculoderaiz;

import javax.swing.JOptionPane;

public class CalculoDeRaiz {

    public static void main(String[] args) {
     
    double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
    double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C:"));
    
    double potencia = Math.sqrt( Math.pow(b,2));
    double mult = (4*a*c);
    double delta =(potencia - mult);
    
    
    JOptionPane.showMessageDialog(null, "O valor da raiz é " + potencia  );
    }
}
