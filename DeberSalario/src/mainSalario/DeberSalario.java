/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSalario;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class DeberSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        empleados emp = new empleados();
                
        int n_emp = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la cantidad de empleados: "));
        emp.ingresarempleados(n_emp);

        
    }
    
}
