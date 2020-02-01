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
public class triangulo extends dimension{
    protected float lado2;
    protected float lado3;

    public triangulo(float lado2, float lado3) {
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public triangulo(float lado2, float lado3, float lado, float base, float altura) {
        super(lado, base, altura);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
   
    
    public void calculotriangulo(){
      System.out.println("--------------------------------------------");
      System.out.println("El perimetro del triangulo es: "+trianguloperimetro(lado, getLado2(), getLado3()));
      System.out.println("El Area del triangulo es: "+trianguloarea(getBase(), getAltura()));
      System.out.println("El Volumen del triangulo es: "+triangulovolumen(getBase(), getAltura()));
      System.out.println("--------------------------------------------");
    }
}
