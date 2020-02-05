/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        
        Opciones();
//        int valorx, valory, radiocir;
//        FIGURA mensajero = new Punto();
//        mensajero.Opciones();
//
//        Punto pto = new Punto();
//        System.out.println(pto);
//        JFrame ventana = new JFrame();
//        ventana.add(pto);
//        ventana.setSize(700,400);
//        ventana.setVisible(true);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
    }

    public static void Opciones() {
        String seleccion = JOptionPane.showInputDialog(null, "Ingrese o que desea dibujar:" + "\n1.Punto" + "\n2.Circulo");
        
        if ("punto".equalsIgnoreCase(seleccion)) {
            Punto pto = new Punto();
            System.out.println(pto);
            JFrame ventana = new JFrame();
            ventana.add(pto);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if ("Circulo".equalsIgnoreCase(seleccion)) {
           Circulo cir = new Circulo();
           System.out.println(cir);
        }else{
           System.out.println("No existe esa opcion");
        }
    }
}
