/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import java.util.Comparator;

/**
 *
 * @author Luis Cajas
 */
public class Comparador implements Comparator {

    int compararNombre;
    provincias provincia1, provincia2;

    @Override
    public int compare(Object pro1, Object pro2) {
        provincia1 = (provincias) pro1;
        provincia2 = (provincias) pro2;
//        compararNombre = (provincia1.getNombreProvincia()
//                .compareToIgnoreCase(provincia2.getNombreProvincia()));
//        return compararNombre;
        if (provincia1.getNumeroHabitantes() > provincia2.getNumeroHabitantes()) {
            compararNombre = 1;
        } else {
            compararNombre = -1;
        }
        return compararNombre;
    }

}
