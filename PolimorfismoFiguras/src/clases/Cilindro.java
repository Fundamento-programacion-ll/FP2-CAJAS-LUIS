/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Luis Cajas
 */
public class Cilindro  extends Circulo{
    private int altura;

    public Cilindro() {
    }

    public Cilindro(int altura) {
        this.altura = altura;
    }

    public Cilindro(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void dibujo(Graphics g){
         g.setColor(Color.GREEN);
         g.drawOval(WIDTH, WIDTH, WIDTH, HEIGHT);
    }
}
