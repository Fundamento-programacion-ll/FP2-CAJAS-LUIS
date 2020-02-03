/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresamain;

/**
 *
 * @author Luis Cajas
 */
public class Empleadasalariado extends Empleado{
    protected double SalarioSemanal;

    public Empleadasalariado(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }

    public Empleadasalariado(double SalarioSemanal, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.SalarioSemanal = SalarioSemanal;
    }

    public double getSalarioSemanal() {
        return SalarioSemanal;
    }

    public void setSalarioSemanal(double SalarioSemanal) {
        this.SalarioSemanal = ((SalarioSemanal < 0.0) ? 0.0 : SalarioSemanal);
    }
    
  @Override
    public Double CalcularIngresos() {
        return this.SalarioSemanal;
    }

    @Override
    public String toString() {
        return  "Empleado Asalariado: \n"+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Salario Semanal: "+getSalarioSemanal();
    }
    
    
}
