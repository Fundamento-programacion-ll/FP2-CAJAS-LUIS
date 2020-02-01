/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Luis Cajas
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perro perrito = new perro(10, "Chuguagua","masculino", "simurdiera");
        perrito.datosPerro();
       
        System.out.println(""+ perrito.sumaPerro(1, 2));
//        perrito.sumaPerro(1, 2);
        
        gato gatito = new gato("azules", "Angora", "femenino", "blue");
        gatito.info();
    }
    
}
