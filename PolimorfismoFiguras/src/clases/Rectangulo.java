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
public class Rectangulo extends Punto{
    private double base;
    private double altura;
   

    public Rectangulo() {
         super();
        this.base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, int x, int y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

   
    
    
    public void paint(Graphics g){
        g.drawRect(super.getX(), super.getY(), (int)this.base, (int) this.altura);
    }
    
    @Override
    public String toString() {
        return "\n Cuadrado: " + super.toString() + " \n El ancho es = " + this.base +"\n La altura es: "+ this.altura;
    }
    
}
