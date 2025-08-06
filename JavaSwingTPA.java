/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswingtpa;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class JavaSwingTPA {

    public static void main(String[] args) {
    // Vou cria um algoritimo para identificar se o usuário pode participar de um intercânbio para Inglaterra
    // Começando pedindo para o usuário add a idade. 
    // Se for maior ou igual a 18, pode participar
    int suaidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade para participar do intercâmbio:"));    
   
    if(suaidade>=18){ 
            
     JOptionPane.showMessageDialog(null, "Você pode participar do intercâmbio!");      
    }   
    // se não for maior ou igual a dezoito não poderá participar
    else{
    
     JOptionPane.showMessageDialog(null, "Você não pode participar do intercâmbio.");
    }
    
    // agora vou pedir para o usuário falar quantos anos de curso ele já fez.
    // se for menor doque 4, não poderá participar
    
    double curso = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos de curso você já fez?"));    
 
    if(curso<4){ 
            
     JOptionPane.showMessageDialog(null, "Você não pode participar do intercâmbio!");      
    }              
    else{
    
     JOptionPane.showMessageDialog(null, "Você pode participar do intercâmbio.");
    }
   
     // agora vou pedir para o usuário falar em qual ano o usuário pretende tentar o intercâmbio
    // se for mais doque 2025 pode participar
    //caso o contrário não pode
    int ano = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você pretende participar?"));    
 
    if(ano>2030){ 
            
     JOptionPane.showMessageDialog(null, "Nós temos vaga!");      
    }              
    else{
    
     JOptionPane.showMessageDialog(null, "Não será possível");
    }
    
    // agora aquantidade de viagens internacionais.
    int viagens = Integer.parseInt(JOptionPane.showInputDialog("Quantas viagens internacionais você já fez?"));    
   
    if(viagens<=0){ 
            
     JOptionPane.showMessageDialog(null, "Essa pode ser sua primeira oportunidade!");      
    }   
   
    else{
    
     JOptionPane.showMessageDialog(null, "Você já tem expeiências!");
    }
    
    // agora vou perguntar quantas vezes o usuário já participou do intercâmbio
    // para saber se ele precisa de prioridade.
    int vezes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você já participou do intercâmbio?"));    
   
    if(vezes==0){ 
            
     JOptionPane.showMessageDialog(null, "Você tem prioridade!");      
    }   
   
    else{
    
     JOptionPane.showMessageDialog(null, "Você não terá prioridade");
    }
    
    
    //agora vou pedir para add a nota no exame de inglês
    double nota = Integer.parseInt(JOptionPane.showInputDialog("Qual foi sua nota no exame?"));
    
    if (nota!=10) {
    
     JOptionPane.showMessageDialog(null, "Sua nota não foi a maxíma");  
    }
    
    else{
     
     JOptionPane.showMessageDialog(null, "Sua nota foi a maxíma");  
    }
}}
