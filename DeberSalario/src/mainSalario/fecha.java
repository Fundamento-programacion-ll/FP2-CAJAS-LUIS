/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSalario;

/**
 *
 * @author Luis Cajas
 */
public class fecha {
   empleados nume=new empleados();
    private int dia;
    private int mes;
    private int anio;
    
    public fecha(int dia, int mes, int anio) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public fecha() {
        super();
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

//     public String comprobacion() {
//        int nummenor=0;
//        String n[] = null;
//        for (int i = 1; i <= 5; i++) {
//           dia=nume.getFecha_ingreso().length;
//           mes=nume.getFecha_ingreso().length;
//           anio=nume.getFecha_ingreso().length;
//           int completo=anio+mes+dia;
//           if(nummenor>completo){
//               nummenor=completo;
//               
//           }
//            System.out.println(n[i]);
//           
//        }
//        return "";
//    }
    
  public void setcalculofecha(int numem,  String []nom, String [] ape, double acum2,int []feching){

         for (int i = 0; i < numem;i++) {
             if(feching[i]< acum2){
                System.out.println("El empleado más antiguo es: "+nom[i]+" "+ape[i]+" ,ingresado en el año "+feching[i]);
            }
         }
    } 
    
}
