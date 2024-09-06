/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = s.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int n2 = s.nextInt();

        System.out.println("Checando " + n1 + " e " + n2 + ".");
        
        System.out.println(n1 + " maior que " + n2 + " = " + (n1 > n2));
        
        System.out.println(n1 + " menor que " + n2 + " = " + (n1 < n2));
        
        System.out.println(n1 + " igual a " + n2 + " = " + (n1 == n2));
        
        System.out.println(n1 + " diferente de " + n2 + " = " + (n1 != n2));


    }
}