/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);

   
        System.out.print("Digite um numero. ");
        int numero = s.nextInt();


        System.out.println("Numero: " + numero);
        
        System.out.println("A 2: " + Math.pow(numero, 2));
        
        System.out.println("A 4: " + Math.pow(numero, 4));
        
        System.out.println("A 6: " + Math.pow(numero, 6));
        
        System.out.println("A 8: " + Math.pow(numero, 8));
        
        System.out.println("A 10: " + Math.pow(numero, 10));

 
    }
}