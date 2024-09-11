package clases;

import java.sql.*;
import java.util.*;


public class Rol_m extends Conexion {

    Connection c = cadena_cnx();

    public List<Rol> listarRoles() {
        List<Rol> roles = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Rol");
            Rol rol;
            while (rs.next()) {
                rol = new Rol(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                roles.add(rol);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return roles;
    }

    public boolean registrarRol(String nombre, String descripcion) {
        boolean estado = false;
        int rol_estado = 1;
        try {
            Statement st = c.createStatement();
            String valores = "'" + nombre + "',";
            valores = valores + "'" + descripcion + "'";
            int rs = st.executeUpdate("INSERT INTO Rol(nombre, descripcion,estado) VALUES(" + valores +"," +rol_estado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    public Rol buscarRolPorId(int id) {
        Rol rol = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Rol WHERE id=" + id);
            while (rs.next()) {
                rol = new Rol(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el rol: " + e.getMessage());
        }
        return rol;
    }

    public boolean actualizarRol(int id, String nombre, String descripcion) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Rol SET nombre='" + nombre + "', descripcion='" + descripcion + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    public boolean cambiarEstadoRol(int idRol) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Rol SET estado = 0 WHERE id=" + idRol);
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
