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
public class Empleadobasemascomision extends Empleadoporcomision{
    protected double SalarioBase;

    public Empleadobasemascomision(double SalarioBase, double VentasBrutas, double TarifaComision) {
        super(VentasBrutas, TarifaComision);
        this.SalarioBase = SalarioBase;
    }

    public Empleadobasemascomision(double SalarioBase, double VentasBrutas, double TarifaComision, String nombre, String apellido, int cedula) {
        super(VentasBrutas, TarifaComision, nombre, apellido, cedula);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

  public double ingresos(){
      //hereda metodos de la clase padre
    return SalarioBase * super.CalcularIngresos();
  }

    @Override
    public String toString() {
        return "Empleado por base decomision\n"+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Salario por Comision: "+CalcularIngresos();
    }
  
    
}
