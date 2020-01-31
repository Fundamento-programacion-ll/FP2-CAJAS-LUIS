/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Luis Cajas
 */
public class perro extends animal{
    //Se usa la palabra extends, es una palabra reservada de java la cual hace referencia a la herencia(clase padre)
    //super , quiere decir que va a cargar los datos de la clase padre
     protected float estatura;

    public perro(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre) {
        super(especie, genero, nombre);
        this.estatura = estatura;
    }
    
    

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public int sumaPerro(int n1, int n2){
        return suma(n1, n2);
    }
    
    public void datosPerro(){        
        System.out.println("nombre: " + getNombre() + " edad: " +getEdad() + " estatura: " +getEstatura());
    }
    
    
    
}
