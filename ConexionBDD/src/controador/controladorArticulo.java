/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author Luis Cajas
 */
public class controladorArticulo {
    conector conexion = new conector();
    PreparedStatement ps = null;
    ResultSet rs = null;
    public void ingresarArticulos(articulo nuevoArticulo){
        String sqlInsert = "insert into articulos(nombre,descripcion,precio) values(?,?,?)";
        try {
            //Error porque necesita un try-cath
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1,nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: "+ex);
            JOptionPane.showMessageDialog(null,"Los datos no fueron ingresados correctamente");
            Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
public void BuscarDatosPorIdNombre
        (String tipoBusqueda, String valorABuscar) throws SQLException{ //
        if (tipoBusqueda.equalsIgnoreCase("ID")) {
           int IdArticulo = Integer.parseInt(valorABuscar);
           String sqlSelectID = 
           "select * from articulos where idArticulo = ?";            
                ps = conexion
                        .getConxion()
                        .prepareStatement(sqlSelectID);
                ps.setInt(1, IdArticulo);
                rs  = ps.executeQuery();
                while (rs.next()) {                    
                    System.out.println("nombre: "+rs.getString(2));
                    System.out.println("descripcion: "+rs.getString(3));
                    System.out.println("precio: "+rs.getFloat(4));
                }                      
        }
        
        if (tipoBusqueda.equalsIgnoreCase("nombre")) {
            // SELECT * FROM Customers
            //WHERE CustomerName LIKE '%mar';
            String sqlSelectID = 
           "select * from articulos where nombre LIKE "+"'%"+valorABuscar+"%'"+"";
            System.out.println(sqlSelectID);
                ps = conexion
                        .getConxion()
                        .prepareStatement(sqlSelectID);
                //ps.setString(1, valorABuscar);
                rs  = ps.executeQuery();
                while (rs.next()) {                    
                    System.out.println("nombre: "+rs.getString(2));
                    System.out.println("descripcion: "+rs.getString(3));
                    System.out.println("precio: "+rs.getFloat(4));
                }
        }
        
        if (tipoBusqueda.equalsIgnoreCase("ninguno")) {
            String sqlSelectID = 
           "select * from articulos";            
                ps = conexion
                        .getConxion()
                        .prepareStatement(sqlSelectID);                
                rs  = ps.executeQuery();
                while (rs.next()) {                    
                    System.out.println("nombre: "+rs.getString(2));
                    System.out.println("descripcion: "+rs.getString(3));
                    System.out.println("precio: "+rs.getFloat(4));
                }
        }
    }
         public void ActualizarArticulos(articulo valorActualizar){
        String sqlUpdate= "UPDATE articulos SET nombre=?, descripcion=?, precio=?"
                + "WHERE id=?";
        try {
            ps=conexion.getConxion().prepareStatement(sqlUpdate);
             ps.setString(2,valorActualizar.getNombre());
            ps.setString(3, valorActualizar.getDescripcion());
            ps.setFloat(4, valorActualizar.getPrecio());
            ps.setInt(1, valorActualizar.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


