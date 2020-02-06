/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Punto extends FIGURA {
//    private int x;
//    private int y;
//
//    public Punto() {
//    }
//
//    public Punto(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//    
//    
//    @Override
//    public void dibujo(Graphics g) {
//       
//        g.setColor(Color.BLACK);
//        System.out.println(this.x + ""+this.y);
//        g.fillOval(this.x, this.y, 30, 30);
//        
//        System.out.println("El punto tienes valores de x es: "+getX()+" y de y es: "+getY());
//        
//        
//    }
//
//    @Override
//    public String toString() {
//        return "El punto tienes valores de x es: "+getX()+" y de y es: "+getY();
//    }

    private int x;
    private int y;

    public Punto() {
        super();
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores del punto separados por coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        this.x = Integer.parseInt(tokens.nextToken());
        this.y = Integer.parseInt(tokens.nextToken());
    }

    public Punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, 20, 20);
    }

    @Override
    public String toString() {
        return "puntos: [ x = " + this.x + ", y = " + this.y + " ]";
    }

   
}
