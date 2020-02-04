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
public class Retiro extends Transaccion {
    protected double montoreti;

    public Retiro(double montoreti) {
        this.montoreti = montoreti;
    }

    public Retiro(double montoreti, int cuenta, String nombre, String apellido) {
        super(cuenta, nombre, apellido);
        this.montoreti = montoreti;
    }

    public double getMontoreti() {
        return montoreti;
    }

    public void setMontoreti(double montoreti) {
        this.montoreti = montoreti;
    }

    @Override
    public String ejecutar() {
        return "Su Monto de restiro es: "+getMontoreti()+"$";
    }

    @Override
    public String toString() {
        return ejecutar();
    }
    
    
    
}
