
package com.mycompany.exemplocalcularmedia;
import javax.swing.JOptionPane;
public class media {
   
    double num1;
    double num2;
    double num3;
    double resultado;
    
    double calcularMedia(){
    num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
    num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
    num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro número:"));
    resultado = (num1 + num2 + num3)/3;
    return resultado;
}}
