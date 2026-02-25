
package com.mycompany.exemplocarro;


public class ExemploCarro {

    public static void main(String[] args)
    {
    Carro meuCarro = new Carro();
     
    meuCarro.cor = "preto";
    meuCarro.modelo = "Gol";
    meuCarro.motor = "1.0";
    
    meuCarro.ligar();
    meuCarro.desligar();
    meuCarro.acelerar();
    meuCarro.mudarMarcha();
    meuCarro.brecar();
 
    System.out.println(" A cor é " + meuCarro.cor);
    System.out.println(" O modelo é " + meuCarro.modelo);
    System.out.println(" O motor é " + meuCarro.motor);
    meuCarro = null;
    }
}
