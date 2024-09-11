package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Categoria_m extends Conexion {

    Connection c = cadena_cnx();

    public List<Categoria> listarCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categoria where estado = 1");
            Categoria categoria;
            while (rs.next()) {
                categoria = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                categorias.add(categoria);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return categorias;
    }

    public boolean registrarCategoria(String nombre, String descripcion) {
        boolean success = false;
        int cat_estado = 1;
        try {
            Statement st = c.createStatement();
            String values = "'" + nombre + "',";
            values += "'" + descripcion + "'";
            int rs = st.executeUpdate("INSERT INTO categoria(nombre, descripcion,estado) VALUES(" + values +"," +cat_estado+ ")");
            if (rs >= 1) {
                success = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return success;
    }

    public Categoria buscarCategoriaPorId(int id) {
        Categoria categoria = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categoria WHERE id=" + id);
            while (rs.next()) {
                categoria = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer la categoría: " + e.getMessage());
        }
        return categoria;
    }

    public boolean actualizarCategoria(int id, String nombre, String descripcion) {
        boolean success = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE categoria SET nombre='" + nombre + "', descripcion='" + descripcion + "' WHERE id=" + id);
            if (rs >= 1) {
                success = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return success;
    }

    public boolean cambiarEstadoCategoria(int idCategoria) {
        boolean success = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE categoria SET estado = 0 WHERE id=" + idCategoria);
            if (rs >= 1) {
                success = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return success;
    }
}
