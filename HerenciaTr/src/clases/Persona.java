/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Persona {

    private int edad;
    private String nombre;
    private int cedula;
    private String apellidos;
    private String genero;
    private ArrayList<Limpieza> ListaPersonalLimpieza;
    private ArrayList<Administrativo> ListaPersonalAdministrativo;
    private ArrayList<Docente> ListaPersonalDocente;

    public Persona() {
        this.ListaPersonalLimpieza = new ArrayList<>();
        this.ListaPersonalAdministrativo = new ArrayList<>();
        this.ListaPersonalDocente = new ArrayList<>();
    }
///LIMPIEZA-------------------------------------------------------///////////////////

    public ArrayList<Limpieza> getListaPersonalLimpieza() {
        return ListaPersonalLimpieza;
    }

    public void setListaPersonalLimpieza() {
        int opcion;
        Limpieza personal;
        do {
            personal = new Limpieza();
            agregarPersonalLimpieza(personal);
            opcion = JOptionPane.showConfirmDialog(null, "Desea Ver Al Personal De Limpieza: \nSI-Regresar Al Menu\nNO-Agregar mas empleados", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public void agregarPersonalLimpieza(Limpieza personal) {
        this.ListaPersonalLimpieza.add(personal);
    }

    public void ordenarSueldosMenorMayor() {
        
        Collections.sort(ListaPersonalLimpieza, new ComparadorSueldos());

    }
//----------------------------------------------------------------------------------//////     
///Administrativo-------------------------------------------------------///////////////////

    public ArrayList<Administrativo> getListaPersonalAdministrativo() {
        return ListaPersonalAdministrativo;
    }

    public void setListaPersonalAdministrativo() {
        int opcion;
        Administrativo personal;
        do {
            personal = new Administrativo();
            agregarPersonalAdministrativo(personal);
            opcion = JOptionPane.showConfirmDialog(null, "Desea Ver Al Personal Administrativo\nSI-Regresar Al Menu\nNO-Agregar mas empleados", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_NO_CANCEL_OPTION);
    }
    public void agregarPersonalAdministrativo(Administrativo personal) {
        this.ListaPersonalAdministrativo.add(personal);
    }

    public void ordenarSueldosMenorMayorAD() {
        
        Collections.sort(ListaPersonalAdministrativo, new ComparadorADM());

    }

//----------------------------------------------------------------------------------////// 
///Docente-------------------------------------------------------///////////////////
    public ArrayList<Docente> getListaPersonalDocente() {
        return ListaPersonalDocente;
    }

    public void setListaPersonalDocente() {
         int opcion;
        Docente personal;
        do {
            personal = new Docente();
            agregarPersonalDocente(personal);
            opcion = JOptionPane.showConfirmDialog(null, "Desea Ver Al Personal Docente\nSI-Regresar Al Menu\nNO-Agregar mas empleados", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_NO_CANCEL_OPTION);
    }
     public void agregarPersonalDocente(Docente personal) {
        this.ListaPersonalDocente.add(personal);
    }

    public void ordenarSueldosMenorMayorDo() {
        
        Collections.sort(ListaPersonalDocente, new ComparadorDoc());

    }

//----------------------------------------------------------------------------------//////
    public Persona(int edad, String nombre, int cedula, String apellidos, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Orden De Sueldos De Menor A Mayor:\n "+"Personal Limpieza.-\n"+ListaPersonalLimpieza + "Personal Administrativo.-\n"+ListaPersonalAdministrativo+ "Personal Docente.-\n"+ListaPersonalDocente;
    }

}
