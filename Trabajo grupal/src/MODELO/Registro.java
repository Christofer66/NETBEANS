
package MODELO;

import Conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Registro {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    public void registrarbd(Producto p){
        try {
            PreparedStatement ps=cn.prepareStatement
        ("INSERT INTO producto(nombre,cantidad,precio,total)VALUES(?,?,?,?)");
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getCantidad());
            ps.setDouble(3, p.getPrecio());
            ps.setDouble(4, p.Total());
            ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR DATOS" +e);
        }
    }
}
