/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import java.util.ArrayList;

/**
 *
 * @author Luis Cajas
 */
public class pais {

    private ArrayList<provincia> listarProvincias;

    public pais() {
       
    }

    public pais(ArrayList<provincia> listarProvincias) {
        this.listarProvincias = listarProvincias;
    }

    public ArrayList<provincia> getListarProvincias() {
        return listarProvincias;
    }

    public void setListarProvincias(ArrayList<provincia> listarProvincias) {
        this.listarProvincias = listarProvincias;
    }
    
    public void agregarProvincia(provincia provincia){
       this.listarProvincias.add(provincia);
    }

}
