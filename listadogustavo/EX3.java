/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;


import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
    
        System.out.print("Digite o numero: ");
        double n1 = s.nextDouble();
        
        
        System.out.print("Digite o segundo numero: ");
        double n2 = s.nextDouble();
        
        
        double so = n1 + n2;
        
        double su = n1 - n2;
        
        double mu = n1 * n2;
        
        
        double div;
        if (n2 != 0) {
            div = n1 / n2;
        } else {
            div = Double.NaN;  
        }
        
        
        System.out.println("Resultados:");
        
        System.out.println("Soma: " + so);
        
        System.out.println("Subtracao: " + su);
        
        System.out.println("Multiplicacao: " + mu);
        if (n2 != 0) {
            System.out.println("Divisao: " + div);
        } else {
            System.out.println("Divisao: Nao é possível dividir.");
        }
        
        
    }
}