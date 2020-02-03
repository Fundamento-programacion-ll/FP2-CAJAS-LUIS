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
public class Empleadoporcomision extends Empleado{
    protected double VentasBrutas;
    protected double TarifaComision;

    public Empleadoporcomision(double VentasBrutas, double TarifaComision) {
        this.VentasBrutas = VentasBrutas;
        this.TarifaComision = TarifaComision;
    }

    public Empleadoporcomision(double VentasBrutas, double TarifaComision, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.VentasBrutas = VentasBrutas;
        this.TarifaComision = TarifaComision;
    }

    public double getVentasBrutas() {
        return VentasBrutas;
    }

    public void setVentasBrutas(double VentasBrutas) {
        this.VentasBrutas = VentasBrutas;
    }

    public double getTarifaComision() {
        return TarifaComision;
    }

    public void setTarifaComision(double TarifaComision) {
        this.TarifaComision = TarifaComision >=0 && TarifaComision <=1 ? TarifaComision : 0.0;
    }
    
//    public void condiciontarifa(){
//      if(TarifaComision >=0 && TarifaComision <= 1){
//          System.out.println("Tarifa");
//      }else{
//            TarifaComision = 00;
//      }
//    }

    @Override
    public Double CalcularIngresos() {
         double resultadoComision=(VentasBrutas*TarifaComision);
        return resultadoComision;
    }

    @Override
    public String toString() {
        return "Empleado por Comision: \n"+" Nombre: "+getNombre()+" Apellido: "+getApellido()+" Salario por Comision: "+CalcularIngresos();
    }
    
    

    
    
}
