
package com.mycompany.exemplo_dois;

import javax.swing.JOptionPane;

public class Exemplo_dois {

    public static void main(String[] args)
    {
        int t;
        String p;
        p =  JOptionPane.showInputDialog(null,"Digite uma palavra:");
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p + " possue " + t + " caracteres" );  
    }
    
    static int tamanho (String x)
    {
        return x.length();
    }
}
