/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimension = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la dimension"));
     vector vec=new vector(dimension);
     vec.contararreglo();
    System.out.print(vec);
        System.out.println(""+vec.contararreglo());
    }
    
}
