/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;


import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Coloque o primeiro numero: ");
        int n1 = s.nextInt();
        
       
        System.out.print("Coloque o segundo numero: ");
        int n2 = s.nextInt();
        
      
        if (n1 > n2) {
            System.out.println("O primeiro numero foi maior que o segundo.");
        } else if (n1 < n2) {
            System.out.println("O numero foi menor que o segundo.");
        } else {
            System.out.println("Os dois são iguais.");
        }
        
   
    }
}
