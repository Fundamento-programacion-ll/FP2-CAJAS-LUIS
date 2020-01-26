/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSalario;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class empleados {
   
    private String nombre[];
    private String apellido[];
    private String fecha_ingreso[];
    private String fecha_nacimiento[];
    private int salario[];

    public empleados() {
    }

    public empleados(String[] nombre, String[] apellido, String[] fecha_ingreso, String[] fecha_nacimiento, int[] salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public String[] getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String[] fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String[] getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String[] fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public void ingresarempleados (int numempleados){
        fecha fe=new fecha();
        String [] nom = new String[numempleados];
        String [] ape = new String[numempleados];
        int [] salario = new int[numempleados];
        int [] feching = new int[numempleados];
        int [] fechnac = new int[numempleados];
             
        double acum=0;
        double acum2=0;
        
        for (int i = 0; i < numempleados; i++) {
            nom [i] = JOptionPane.showInputDialog(null,"Ingresar el Nombre del "+(i+1)+" empleado: ");
            ape [i] = JOptionPane.showInputDialog(null,"Ingresar el Apellido del "+(i+1)+" empleado: ");                       
            feching [i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la Fecha de ingreso del "+(i+1)+" empleado: "));
            fechnac [i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la Fecha de nacimiento del "+(i+1)+" empleado: "));
            salario [i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el Salario del "+(i+1)+" empleado: "));
        }

        acum=salario[1];
        acum2=feching[1];
        for (int i=0;i<numempleados;i++){
            if (feching[i]>acum2){
                acum2=feching[i];
            }
        }
        for (int i=0;i<numempleados;i++){
            if (salario[i]>acum){
                acum=salario[i];
            }
        }
             System.out.println("Consulta De Empleados");
             System.out.println("---------------------------");
         for (int i = 0; i < numempleados; i++) {
            System.out.println("Empleado N° "+(i+1)+"--------------\n"+"Nombre Completo : "+nom[i]+" "+ape[i]+"\n Fecha de Ingreso: "+ feching[i]+"\n Fecha de Nacimiento: "+fechnac[i]+"\n Salario: "+ salario[i]+"\n");
             System.out.println("---------------------------");
        }   
         System.out.println("----------El salario mayor y el empleado más antiguo son:------------");
         for (int i = 0; i < numempleados; i++) {
            
            if (salario[i]==acum){
                System.out.println("El empleado mejor pagado es : "+nom [i]+" "+ape[i]+ " con un salario de "+acum+"$");   
            }
            
        }   
            
        fe.setcalculofecha(numempleados, nom, ape, acum2, feching);
        System.out.println("---------------------------------------------------------------------");
        setNombre(nombre);
        setApellido(apellido);
        setSalario(salario);
        setFecha_nacimiento(fecha_nacimiento);
        setFecha_ingreso(fecha_ingreso);
    }

  
}
