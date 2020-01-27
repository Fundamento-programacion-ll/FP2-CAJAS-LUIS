/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.articulo;

/**
 *
 * @author Luis Cajas
 */
public class ConexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PreparedStatement ps = null;
       
      conector stringConexion = new conector();
      stringConexion.getConxion();
      //Quenar datos desde otra clase llamada articulo utilizando setter y getter e instanciando clases//
      articulo nuevoArticulo = new articulo();
      nuevoArticulo.setNombre("Nintendo");
      nuevoArticulo.setDescripcion("Luis");
      nuevoArticulo.setPrecio(123.5);
      
            
      //insert data in the table
      
      String insert = "insert into articulos(nombre,descripcion,precio) values(?,?,?) ";
      
        try {
            ps = stringConexion.getConxion().prepareStatement(insert);
            //Con el uso del get puedes traer los datos de la otra clase que fueron enviamos por la clases conexionbdd
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setDouble(3, nuevoArticulo.getPrecio());
            //Quemsr datos automaticamente desde el metodo main
//            ps.setString(1, "X BOX");
//            ps.setString(2, "Consola");
//            ps.setDouble(3, 500.3);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
