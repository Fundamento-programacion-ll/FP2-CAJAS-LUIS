/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Luis Cajas
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lad;
        float lad2;
        float lad3;
        float bas;
        float alt;
        float diam;
        int op;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("------------------------------------------------------------");
        System.out.println("FIGURAS");
        System.out.println("Podra obtener el perimetro,el area, el volumen de cada figura");
        System.out.println("------------------------------------------------------------");
        System.out.println("Eliga la figuras:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opción: ");
        op = sc.nextInt();
        switch(op){
            case 1: System.out.println("CUADRADO");
                    System.out.println("Ingrese el valor de los lados");
                    lad = sc.nextFloat();
                    cuadrado cu =new cuadrado(lad, 0, 0);
                    cu.calculoCuadrado();
                break;
            case 2:System.out.println("TRIANGULO");
                   System.out.println("Ingrese el valor de los lados del triangulo");
                   System.out.print("Lado 1: ");
                   lad = sc.nextFloat();
                   System.out.print("Lado 2: ");
                   lad2 = sc.nextFloat();
                   System.out.print("Lado 3: ");
                   lad3 = sc.nextFloat();
                   System.out.print("Ingrese el valor de la base: ");
                   bas = sc.nextFloat();
                   System.out.print("Ingrese el valor de la altura: ");
                   alt = sc.nextFloat();
                   triangulo tri = new triangulo(lad3, lad2, lad, bas, alt);
                   tri.calculotriangulo();
                break;
            case 3:System.out.println("CIRCULO");
                   System.out.println("Ingrese el valor del diámetro");
                   diam = sc.nextFloat();
                   circulo ci = new circulo(diam);
                   ci.calcularcirculo();
                break;
            case 4:System.out.println("------------------------------------------------------------");
                   System.out.println("-------------------------GRACIAS----------------------------");
                   System.out.println("------------------------------------------------------------");
                break;
            default:    
        }
        }while(op!=4);
        
    }
    
}
