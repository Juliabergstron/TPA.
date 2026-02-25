
package com.mycompany.exemplo_um;

import javax.swing.JOptionPane;

public class Exemplo_um {

    public static void main(String[] args) 
    {
        int a;       
        a =  Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
        dobro (a);
    }
    
    
    static void dobro(int n)
    {
    int d = n * 2;
    JOptionPane.showMessageDialog(null, "O dobro de " + n +  " é igual a " + d  );
    }

}
