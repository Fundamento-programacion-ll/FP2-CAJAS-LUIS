/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author Luis Cajas
 */
public class user {
    ////Lista dinámica, no importa el tamaño y te reserve el espacio necesario//
    
    ///Protec se usa cuando se usa heredacion
    
    ArrayList listaPersonas = 
            new ArrayList<String>();
    
    public String agregarPersona(
    String nombre
    ){
        listaPersonas.add(nombre);
        
        return "Persona agregada correctamente," 
                + nombre;
    }
    
    public String listaPersonas(){
//        listaPersonas.add("hola");
//        listaPersonas.add("que");
//        listaPersonas.add("hace");
        String lista = "";
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i));
                    lista += listaPersonas.get(i).toString()+"";
        }
//        for (Object persona : listaPersonas) {
//            System.err.println(persona);
//        }
//        listaPersonas.get(1);
        return lista;
    }
}
