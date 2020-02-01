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
public class cuadrado extends dimension{

    public cuadrado() {
    }

    public cuadrado(float lado, float base, float altura) {
        super(lado, base, altura);
    }
    
     public void calculoCuadrado(){
        System.out.println("--------------------------------------------");
        System.out.println("El perimetro del cuadrado es: "+cuadradoperimetro(lado));
        System.out.println("El Area del cuadrado es: "+cuadradoarea(lado));
        System.out.println("El volumen del cuadrado es: "+cuadradovolumen(lado));
        System.out.println("--------------------------------------------");
    }
}
