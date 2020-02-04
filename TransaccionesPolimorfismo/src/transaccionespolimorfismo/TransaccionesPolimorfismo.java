/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccionespolimorfismo;

/**
 *
 * @author Luis Cajas
 */
public class TransaccionesPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolicitudSaldo ss = new SolicitudSaldo(386, 155, "Luis", "Cajas");
        System.out.println(ss);
        Deposito de = new Deposito(178);
        System.out.println(de);
        Retiro re = new Retiro(50);
        System.out.println(re);
    }
    
}
