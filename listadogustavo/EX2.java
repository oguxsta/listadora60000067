/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Digite seu nome: ");
        String nome = s.next();
        
     
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        s.nextLine();  
        
        
        System.out.print("Digite seu genero: ");
        String genero = s.next();
        
       
        System.out.print("Digite sua cor favorita: ");
        String cor = s.next();
        
        
        System.out.print("Vc pratica esportes? S/N: ");
        String pe = s.next();
        
   
        System.out.println("Dados:");
        
        System.out.println("Nome: " + nome);
        
        System.out.println("Idade: " + idade);
        
        System.out.println("Genero: " + genero);
        
        System.out.println("Cor Favorita: " + cor);
        
        System.out.println("Habito em esportes = : " + pe);
        
       
    }
}
