/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Cajas
 */
public class persona {
    String nombre;
    String apellidos;
    int cedula;
    int edad;
    int telefono;
    String direccion;
    char genero; 
    boolean EstadoCivil;
    ////EL CONSTRUCTOR INICIALIZA LAS VARIABLES///

    public persona(String nombre, String apellidos, int cedula, int edad, int telefono, String direccion, char genero, boolean EstadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.EstadoCivil = EstadoCivil;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(boolean EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    @Override
    public String toString() {
        return "persona{" + "cedula=" + cedula + '}';
    }

    public void setCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
    
}
