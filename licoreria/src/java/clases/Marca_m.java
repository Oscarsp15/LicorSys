package clases;

import java.sql.*;
import java.util.*;

public class Marca_m extends Conexion {

    Connection c = cadena_cnx();
    
     public List<Marca> listarMarcas() {
        List<Marca> marcas = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Marca where estado = 1");
            Marca marca;
            while (rs.next()) {
                marca = new Marca(
                       rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                        
                );
                marcas.add(marca);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return marcas;
    }
    
    
  
    
    
    

    public boolean registrarMarca(String nombre, String descripcion) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            String valores = "'" + nombre + "',";
            valores = valores + "'" + descripcion + "'";
            int rs = st.executeUpdate("INSERT INTO Marca(nombre, descripcion) VALUES(" + valores + ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    public Marca buscarMarcaPorId(int id) {
        Marca marca = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Marca WHERE id=" + id);
            while (rs.next()) {
                marca = new Marca(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer la marca: " + e.getMessage());
        }
        return marca;
    }

    public boolean actualizarMarca(int id, String nombre, String descripcion) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Marca SET nombre='" + nombre + "', descripcion='" + descripcion + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    public boolean cambiarEstadoMarca(int idMarca) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Marca SET estado = 0 WHERE id=" + idMarca);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }
}
