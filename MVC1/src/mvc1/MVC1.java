/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

import java.util.Scanner;
import modelo.persona;
import vista.usuario;

/**
 *
 * @author Luis Cajas
 */
public class MVC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        usuario inicio = new usuario();
        persona luis =new persona("Luis", "Cajas", "0", 19, "0", "San Isidro", 'm', false);
        persona juan =new persona("Juan", "Salazar", "", 31, "", "San Juan", 'm', true);
        persona pedro =new persona("Pedro", "Padilla", "", 25, "", "El valle", 'm', false);
        System.out.println(luis);
        
        inicio.menu();
    }
    
}
