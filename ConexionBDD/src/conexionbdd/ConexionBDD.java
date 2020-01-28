/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        //Ingresar y actualizar datos
       PreparedStatement ps = null;
       //Mostrar Resustados
       ResultSet rs = null;
       
      conector stringConexion = new conector();
//      stringConexion.getConxion();
      //Quenar datos desde otra clase llamada articulo utilizando setter y getter e instanciando clases//
//      articulo nuevoArticulo = new articulo();
//      nuevoArticulo.setNombre("Nintendo");
//      nuevoArticulo.setDescripcion("Luis");
//      nuevoArticulo.setPrecio(250);
      
            
      //insert data in the table
      
      String insert = "insert into articulos(nombre,descripcion,precio) values(?,?,?) ";
      
      //select
      
//      String select = "select * from articulos";
//      String select = "select nombre from articulos";
      String select = "select * from articulos where idArticulo = ?";
      
        try {
//            ps = stringConexion.getConxion().prepareStatement(insert);
              ps = stringConexion.getConxion().prepareStatement(select);
              ps.setInt(1, 2);
            //Con el uso del get puedes traer los datos de la otra clase que fueron enviamos por la clases conexionbdd
//            ps.setString(1, nuevoArticulo.getNombre());
//            ps.setString(2, nuevoArticulo.getDescripcion());
//            ps.setFloat(3, nuevoArticulo.getPrecio());
            //Quemsr datos automaticamente desde el metodo main
//            ps.setString(1, "X BOX");
//            ps.setString(2, "Consola");
//            ps.setDouble(3, 500.3);


//            ps.executeUpdate();
              rs = ps.executeQuery();//Obtener resultados
              while(rs.next()){
                  //1 es el id
                  System.out.println(rs.getString(2));
                  System.out.println(rs.getString(3));
                  System.out.println(rs.getFloat(4));
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
