/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Limpieza  extends Persona{
    private String turno;
    private double suel;

    public Limpieza() {
        String datos;
        datos = JOptionPane.showInputDialog(null, "Personal De Limpeza: \nIngresar los siguientes datos en orden, separados por un punto y coma: \n-Nombre\n-Apellido"
                + "\n-Edad\n-Cedula\n-Genero\n-Turno\n-Sueldo");
        StringTokenizer  tokens = new StringTokenizer(datos,";");
        super.setNombre(tokens.nextToken());
        super.setApellidos(tokens.nextToken());
        super.setEdad(Integer.parseInt(tokens.nextToken()));
        super.setCedula(Integer.parseInt(tokens.nextToken()));
        super.setGenero(tokens.nextToken());
        this.turno = tokens.nextToken();
        this.suel = Double.parseDouble(tokens.nextToken());        
    }
       
    

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSuel() {
        return suel;
    }

    public void setSuel(double suel) {
        this.suel = suel;
    }

    

    @Override
    public String toString() {
        return "Nombre Completo: "+getNombre()+" "+getApellidos()+" Edad: "+getEdad()+" Cedula: "+getCedula()+" Genero: "+getGenero()+" Turno: "+getTurno()+" Sueldo: "+getSuel()+"\n";
    }

    
    
    
    
        
  
    
        

    
    
    
    
    
}
