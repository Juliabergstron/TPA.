
package com.mycompany.calculoderaiz;

import javax.swing.JOptionPane;

public class CalculoDeRaiz {

    public static void main(String[] args) {
     
    double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
    double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C:"));
    
    double delta = Math.pow(b, 2) - (4 * a * c);

    if(delta < 0) {
    JOptionPane.showMessageDialog(null, "O valor do delta é negativo, não existe raiz. " );
    } else if (delta == 0) {
    double x = (-b)/(2*a);
    JOptionPane.showMessageDialog(null, "O valor da raiz é " + x  );
    }else if (delta >0){
    double x1 = (-b + Math.sqrt(delta))/ (2*a); 
    double x2 = (-b - Math.sqrt(delta))/(2*a); 
    JOptionPane.showMessageDialog(null, "O valor do x1 é " + x1 +  " e o valor do x2 é " + x2  );
    }
    }
}
