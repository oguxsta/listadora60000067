/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        double n1, n2, media;
                String resultado="";
        Scanner s = new Scanner(System.in);
        
        System.out.print("Inserir nota 1: ");
        n1 = s.nextDouble();
        
        System.out.print("Inserir nota 2 ");
        n2 = s.nextDouble();
        
        media = (n1 + n2) / 2;
        
        if (media >= 6)  {
            resultado = "Aprovado ";
            
        }else if (media >= 4) {
            resultado = "precisa fazer a prova substitutiva";
        }else {
            resultado = "Reprovado ";
        }

        System.out.printf("Media: %.2f", media);
        System.out.println(" - resultado: " + resultado);
     
      
    }
}