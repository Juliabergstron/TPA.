
package com.mycompany.exemplotempo;
import javax.swing.JOptionPane;
public class ExemploTempo {

    public static void main(String[] args) {
      tempo tempo = new tempo();
      
      double resultado = tempo.converterParaHoras();
      
      JOptionPane.showMessageDialog(null,tempo.minutos + " minutos em horas fica: " + resultado + " horas.");
    }
}
