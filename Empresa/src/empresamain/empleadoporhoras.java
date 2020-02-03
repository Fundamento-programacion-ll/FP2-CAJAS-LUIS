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
public class empleadoporhoras extends Empleado{
    protected double sueldo;
    protected double horas;

    public empleadoporhoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public empleadoporhoras(double sueldo, double horas, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = ((horas >=0 && horas <=168) ? horas : 0.0);
    }
//    
//    public void condicionhoras(){
//      if(horas >=0 && horas<= 168){
//          System.out.println("Horas");
//      }else{
//          horas = 00;
//      }
//    }

    @Override
    public Double CalcularIngresos() {
       double resultadoHoras=sueldo*horas;
        return resultadoHoras;
    }

    @Override
    public String toString() {
        return "Empleado por Horas: \n"+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Salario por Comision: "+CalcularIngresos();
    }
    
    
}
