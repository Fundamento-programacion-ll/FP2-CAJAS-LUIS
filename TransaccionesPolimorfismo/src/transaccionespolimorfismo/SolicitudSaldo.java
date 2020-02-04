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
public class SolicitudSaldo extends Transaccion {
    protected double cantidad;

    public SolicitudSaldo(double cantidad) {
        this.cantidad = cantidad;
    }

    public SolicitudSaldo(double cantidad, int cuenta, String nombre, String apellido) {
        super(cuenta, nombre, apellido);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String ejecutar() {
        return "Usuario: "+getNombre()+" "+getApellido()+"\nN° Cuenta: "+getCuenta()+"\nSu saldo es:"+getCantidad()+"$";
    }

    @Override
    public String toString() {
        return ejecutar();
    }
    
    
}
