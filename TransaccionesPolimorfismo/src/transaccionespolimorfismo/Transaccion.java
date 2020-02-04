/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccionespolimorfismo;

/**
 *
 * @author Luis Cajas
 */
public abstract class Transaccion {
    protected int cuenta;
    protected String nombre;
    protected String apellido;

    public Transaccion() {
    }

    public Transaccion(int cuenta, String nombre, String apellido) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public String ObtenCuenta(){
    return ejecutar();
    }
    public abstract String ejecutar();
    
    
}
