/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Luis Cajas
 */
public class ClaseHija_Retiro extends ClasePadre_Abstracta{
    
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas retirar: " );
        //Se manda a llamar al metodo de la clase padre para que almacene el dato ingresado por el usuario
        Retiro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("--------------------------------");
            System.out.println("Retiraste: "+ retiro);
            System.out.println("N°Cuenta: "+getNcuenta()+"\nTu saldo actual es: "+ getSaldo());
            System.out.println("--------------------------------");
        }else{
            System.out.println("-------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("-------------------");
        }
    }
    
}
