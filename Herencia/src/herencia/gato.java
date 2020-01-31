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
public class gato extends animal{
    private String colorOjos;

    public gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public gato(String colorOjos, String especie, String genero, String nombre) {
        super(especie, genero, nombre);
        this.colorOjos = colorOjos;
    }
    
    
    

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public void info(){
        System.out.println("Nombre: "+getNombre() +"Ojos:"+ getColorOjos() +"Genero: "+ getGenero() + "Edad: " +getEdad());
    }
    
    
    
}
