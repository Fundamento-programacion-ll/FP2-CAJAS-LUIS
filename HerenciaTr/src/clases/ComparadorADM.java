/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Comparator;

/**
 *
 * @author Luis Cajas
 */
public class ComparadorADM implements Comparator {

    @Override
    public int compare(Object emp1, Object emp2) {
       int compararSuelEmpleado;
          Administrativo empleado1, empleado2;
        empleado1 = (Administrativo) emp1;
        empleado2 = (Administrativo) emp2;

        if (empleado1.getSuel() > empleado2.getSuel()) {
            compararSuelEmpleado = 1;
        } else {
            compararSuelEmpleado = -1;
        }
        return compararSuelEmpleado;
    }
    
}
