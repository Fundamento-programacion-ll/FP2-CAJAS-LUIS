/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Luis Cajas
 */
public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    protected int ncuenta = 000234;
    private static int saldo;
    Scanner sce = new Scanner(System.in);

    public void Operaciones() {
        //Las variables locales se inician
        //Cambia su valor dependiendo del flujo del programa
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Porfavor seleccionar una opción");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo");
                System.out.println("    3. Deposito de efectivo");
                System.out.println("    4. Salir");
                seleccion = sce.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor");
                    System.out.println("------------------------------------------------");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("-----------------------");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("-----------------------");
                bandera = 2;
            }

        } while (bandera != 2);
    }

    //Metodo para solicitar cantidad de retiro
    public void Retiro() {
        retiro = sce.nextInt();
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = sce.nextInt();
    }
    
    //Metodo para solicitar numero de cuenta
    public int getNcuenta(){
        return ncuenta;
    }
    
    public void setncuenta(int ncuenta){
        this.ncuenta = ncuenta;
    }
    
    //Metodo abstracto
    public abstract void Transacciones();
    
    //Metodos setter y getter, llamar a variables privadas desde otras clases
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

}
