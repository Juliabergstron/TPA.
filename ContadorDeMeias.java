/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadordemeias;

/**
 *
 * @author user
 */
public class ContadorDeMeias {

    public static void main(String[] args) {
    int[] meias = {7,10,3,4,6};
    int total = 0;
    
    for (int i = 0; i < meias.length; i++) {
    System.out.println("Gaveta " + (i + 1) + ": " + meias[i] + " meias");
    total += meias[i];
    }
    System.out.println("Total de meias: " + total);
    }
}
