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
public class dimension {
    protected float lado, base, altura;

    public dimension() {
    }

    public dimension(float lado, float base, float altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     
    public float cuadradoperimetro(float lado){        
       return (4*lado);
    }
    public float cuadradoarea(float lado){        
       return (float) Math.pow(lado,2);
    }
    public float cuadradovolumen(float lado){        
       return (float) Math.pow(lado,3);
    }
    
     public float trianguloperimetro(float lado1,float lado2,float lado3){        
       return lado1+lado2+lado3;
    }
     public float trianguloarea(float ba,float al){        
       return ((ba*al)/2);
    }
     public float triangulovolumen(float ba,float al){        
       return ((ba*al)/3);
    }
     
      public float circuloperimetro(float dm){        
       return (float) (2*Math.PI*(dm/2));
    }
     public float circuloarea(float dm){        
       return (float) (Math.PI*Math.pow((dm/2), 2));
    }
     public float circulovolumen(float dm){   
       
       return (float) ((4*Math.PI*Math.pow((dm/2), 3)))/3;
    }
     public float circulo_circunfferencia(float dm){        
       return (float) (Math.PI*dm);
    }
}
