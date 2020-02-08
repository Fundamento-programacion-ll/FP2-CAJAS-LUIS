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
public class Docente extends Persona {
    private String area;
    private String cargo;
    private double suel;

    public Docente() {
         String datos;
        datos = JOptionPane.showInputDialog(null, "Personal Docente: \nIngresar los siguientes datos en orden, separados por un punto y coma: \n-Nombre\n-Apellido"
                + "\n-Edad\n-Cedula\n-Genero\n-Area de trabajo\n-Cargo\n-Sueldo");
        StringTokenizer  tokens = new StringTokenizer(datos,";");
        super.setNombre(tokens.nextToken());
        super.setApellidos(tokens.nextToken());
        super.setEdad(Integer.parseInt(tokens.nextToken()));
        super.setCedula(Integer.parseInt(tokens.nextToken()));
        super.setGenero(tokens.nextToken());
        this.area = tokens.nextToken();
        this.cargo= tokens.nextToken();;
        this.suel = Double.parseDouble(tokens.nextToken());  
    }

    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSuel() {
        return suel;
    }

    public void setSuel(double suel) {
        this.suel = suel;
    }
    
    
     @Override
    public String toString() {
        return "Nombre Completo: "+getNombre()+" "+getApellidos()+" Edad: "+getEdad()+" Cedula: "+getCedula()+" Genero: "+getGenero()+" Area De Trabajo: "+getArea()+" Cargo: "+getCargo()+" Sueldo: "+getSuel()+"\n";
    }
    
}
