/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

/**
 *
 * @author Luis Cajas
 */
public class provincia {

    private String nombreProvincia;
    private int numeroHabitantes;

    public provincia() {
    }

    public provincia(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "Nombre de la provincia" + this.getNombreProvincia()+ " \n Numero de habitantes: "+this.getNumeroHabitantes();
    }
    
    

}
