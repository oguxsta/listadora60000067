/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;


public class EX5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Digite um numero.");
        int numero = s.nextInt();
        
       
        if (numero % 2 == 0) {
            System.out.println("O " + numero + " igual a par.");
        } else {
            System.out.println("O " + numero + " igual a impar.");
        }
        
        
        
    }
}
