/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.user;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class usuario {
    public void menu(){
        
        int opcion = 0;
        opcion =  Integer.parseInt(JOptionPane
                .showInputDialog(null, "MENU \n"+
                        "1. Agregar Persona \n" +
                        "2. Listar Persona \n"
                        , this)); 
        
        switch(opcion){
            case 1:
                user metodos = new user();
                metodos.agregarPersona("Luis");
                break;
                case 2:
                    break;
                    default:
                        break;
        }
        
        
    }
}
