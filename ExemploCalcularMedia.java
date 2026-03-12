
package com.mycompany.exemplocalcularmedia;
import javax.swing.JOptionPane;
public class ExemploCalcularMedia {

    public static void main(String[] args) {
       media media = new media();
       
       double resul = media.calcularMedia();
       
       JOptionPane.showMessageDialog(null, " A média é:  "+ resul );
    }
}
