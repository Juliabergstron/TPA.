
package com.mycompany.exemplotempo;
import javax.swing.JOptionPane; 
public class tempo {
         
    double minutos;
    double horas;
    
    double converterParaHoras(){
    minutos = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor de tempo em minutos: "));
    horas = minutos/60;
    return horas;
  }
}
