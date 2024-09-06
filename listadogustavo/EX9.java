/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;
import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);

       
        System.out.print("Digite um numero: ");
        int numero = s.nextInt();


        if (numero > 10 && numero < 100) {
         
            double pa = Math.pow(numero, 2);
           
            System.out.printf("elevado a 2: %.5f", pa);
        } else {
          
            double rq = Math.sqrt(numero);
 
            System.out.printf("Raiz: %.5f", rq);
        }

      
    }
}