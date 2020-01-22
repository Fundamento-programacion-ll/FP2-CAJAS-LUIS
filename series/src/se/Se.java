/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.Scanner;

/**
 *
 * @author Luis Cajas
 */
public class Se {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el número de la serie");
        n=sc.nextInt();
        
        serie se=new serie();
        se.setN(n);
        se.Calcuarserie();
        System.out.println("El resultado es: "+se.Calcuarserie());
    }
    
}
