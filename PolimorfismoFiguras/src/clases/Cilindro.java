/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Cilindro  extends Circulo{
   
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public Cilindro() {
        super();
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del cilindro"));
    }

//    public double getArea() {
//
//        return 2 * super.getArea() + this.getCircunferencia() * this.altura;
//
//    }
//
//    public double getVolumen() {
//        return super.getArea() * this.altura;
//
//    }

    public void paint(Graphics g) {
        //Llamar al metodo paint de la clase padre circulo
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(getX(), (int) (getY() + this.altura), (int) super.getRadio(), (int) super.getRadio());
        g.setColor(Color.BLUE);
        g.drawLine((int) (super.getX() + super.getRadio()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX() + super.getRadio()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
        g.drawLine((int) (getX()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
//          super.paint(g);
//          
//          g.drawOval((int)(getX()+this.altura), getY(), (int)getRadio(), (int)getRadio());
//          g.drawLine(150, 100, 10, 0);
    }

    @Override
    public String toString() {
        return "\nCilindro" + " \nAltura= " + this.altura + super.toString();
    }
}
