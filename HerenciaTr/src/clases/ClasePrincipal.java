/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        //instalar node.js lts
        ListaDeEmpleadosSueldos();
        
    }

    public static void ListaDeEmpleadosSueldos() {

        String salida = "";
        Persona per = new Persona();
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor seleccionar una opción: \n1. Personal Limpieza\n2. Personal Administrativo"
                        + "\n3. Personal Docente\n4. Listar"));

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor");
                    System.out.println("------------------------------------------------");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                per.setListaPersonalLimpieza();
                per.ordenarSueldosMenorMayor();
            } else if (seleccion == 2) {
                per.setListaPersonalAdministrativo();
                per.ordenarSueldosMenorMayorAD();
            } else if (seleccion == 3) {
                per.setListaPersonalDocente();
                per.ordenarSueldosMenorMayorDo();
            } else if (seleccion == 4) {
                System.out.println("-----------------------------------------------------------------------");
                salida += "\n" + per.toString() + "\n";
                System.out.println(salida);
                System.out.println("-----------------------------------------------------------------------");

                System.out.println("-----------------------");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("-----------------------");
                bandera = 2;
            }

        } while (bandera != 2);

    }
}
