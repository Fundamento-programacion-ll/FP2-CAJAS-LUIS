/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Cuadrado extends Punto{
     private double lado;
   

    public Cuadrado() {
         super();
        this.lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    public void paint(Graphics g){
        g.drawRect(super.getX(), super.getY(), (int)this.lado, (int) this.lado);
    }
    
    @Override
    public String toString() {
        return "\n Cuadrado: " + super.toString() + " \n El lado es = " + this.lado;
    }
}
