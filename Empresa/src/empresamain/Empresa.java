/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresamain;

/**
 *
 * @author Luis Cajas
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleadasalariado ea = new Empleadasalariado(122, "Luis", "Cajas", 175166);
        System.out.println(ea);
        Empleadoporcomision ec=new Empleadoporcomision(145, 36, "lUIS", "Cajas", 175166);
        System.out.println(ec);
        empleadoporhoras eh=new empleadoporhoras(190, 161, "Luis", "Cajas", 175166);
        System.out.println(eh);
        Empleadobasemascomision ebc=new Empleadobasemascomision(348,200, 100, "Luis", "Cajas", 175166);
        System.out.println(ebc);
    }
    
}
