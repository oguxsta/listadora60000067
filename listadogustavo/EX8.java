/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadogustavo;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor");
        int vdia = s.nextInt();

        System.out.print("Digite o valor do relogio de agua (L): ");
        int v30 = s.nextInt();

        int ct = v30 - vdia;

        double md = (double) ct / 30;
        System.out.println("Uso total de agua: " + ct + "(L)");
        System.out.println("Media em 30 dias: " + md + " (L)");

      
    }
}  