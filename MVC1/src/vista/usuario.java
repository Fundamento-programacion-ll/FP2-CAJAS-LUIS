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
        user metodos = new user();
        int opcion = 0;
        opcion =  Integer.parseInt(JOptionPane
                .showInputDialog(null, "MENU \n"+
                        "1. Agregar Persona \n" +
                        "2. Listar Persona \n"+
                        "3. Salir"
                        , this)); 
        do{
        switch(opcion){
            case 1:
                String nombre = JOptionPane.showInputDialog(null,"INGRESE UN NOMBRE");
                metodos.agregarPersona(nombre);
                System.out.println(metodos.listaPersonas());
                break;
                case 2:
//                    metodos.listaPersonas();
//                     System.out.println("hola");
                    System.out.println(metodos.listaPersonas());
                    break;
                case 3:
                    opcion=3;
                    break;
                    default:
                        break;
        }
    }while (opcion!=3);
        
        
    }
}
