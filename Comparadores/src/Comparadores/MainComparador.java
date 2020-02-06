/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class MainComparador {
    public static void main(String[] args){
        
       
        String nom_provincia;
        int num_habitantes;
        provincia pro = new provincia();
        pais pa = new pais();
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores del punto separados por coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");     
        nom_provincia = tokens.nextToken();
        pro.setNombreProvincia(nom_provincia);
        num_habitantes = Integer.parseInt(tokens.nextToken());
        pro.setNumeroHabitantes(num_habitantes);
        pa.agregarProvincia(pro);
        
        System.out.println(pa);
        
    }
}
