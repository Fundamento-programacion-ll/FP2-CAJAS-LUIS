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
public class Deposito extends Transaccion {
    protected double montodepo;

    public Deposito(double montodepo) {
        this.montodepo = montodepo;
    }

    public Deposito(double montodepo, int cuenta, String nombre, String apellido) {
        super(cuenta, nombre, apellido);
        this.montodepo = montodepo;
    }

    public double getMontodepo() {
        return montodepo;
    }

    public void setMontodepo(double montodepo) {
        this.montodepo = montodepo;
    }

    @Override
    public String ejecutar() {
        return "Su monto de deposito es: "+getMontodepo()+"$";
    }

    @Override
    public String toString() {
        return ejecutar();
    }
    
    
    
}
