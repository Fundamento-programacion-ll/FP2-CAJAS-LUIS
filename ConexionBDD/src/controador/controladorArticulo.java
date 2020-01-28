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
    public void buscarArticulos(articulo buscarArticulo){
    String sqlselect = "select * from articulos where idArticulo = ?";
        ResultSet rs = null;
        ps.setInt(1, 2);
        
    
    
        try {
            ps = conexion.getConxion().prepareStatement(sqlselect);
            ps.setInt(1, 2);
              rs = ps.executeQuery();
              while(rs.next()){
                  //1 es el id
                  System.out.println(rs.setString(2));
                  System.out.println(rs.getString(3));
                  System.out.println(rs.getFloat(4));
            
        } catch (SQLException ex) {
            Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
 }
}

