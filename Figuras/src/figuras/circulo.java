/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Luis Cajas
 */
public class circulo extends dimension{
    protected float diametro;

    public circulo(float diametro) {
        this.diametro = diametro;
    }

    public circulo(float diametro, float lado, float base, float altura) {
        super(lado, base, altura);
        this.diametro = diametro;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
    public void calcularcirculo(){
    System.out.println("--------------------------------------------");
    System.out.println("El perimetro del circulo es: "+circuloperimetro(getDiametro()));
    System.out.println("El Area del circulo es: "+circuloarea(getDiametro()));
    System.out.println("El Volumen del circulo es: "+circulovolumen(getDiametro()));
    System.out.println("La circunferencia del circulo es: "+circulo_circunfferencia(getDiametro()));
    System.out.println("--------------------------------------------");
    }
    
}
