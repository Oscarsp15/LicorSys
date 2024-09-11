package clases;

import java.sql.*;
import java.util.*;

public class UnidadMedida_m extends Conexion {

    Connection c = cadena_cnx();

    public List<UnidadMedida> listarUnidadesMedida() {
        List<UnidadMedida> unidadesMedida = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Unidad_Medida where estado = 1");
            UnidadMedida unidad;
            while (rs.next()) {
                unidad = new UnidadMedida(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                unidadesMedida.add(unidad);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return unidadesMedida;
    }

    public boolean registrarUnidadMedida(String nombre, String descripcion) {
        boolean estado = false;
         int um_estado = 1;
        try {
            Statement st = c.createStatement();
            String valores = "'" + nombre + "',";
            valores = valores + "'" + descripcion+"'";
            int rs = st.executeUpdate("INSERT INTO Unidad_Medida(nombre, descripcion,estado) VALUES(" + valores +"," +um_estado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    public UnidadMedida buscarUnidadMedidaPorId(int id) {
        UnidadMedida unidad = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Unidad_Medida WHERE id=" + id);
            while (rs.next()) {
                unidad = new UnidadMedida(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer la unidad de medida: " + e.getMessage());
        }
        return unidad;
    }

    public boolean actualizarUnidadMedida(int id, String nombre, String descripcion) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Unidad_Medida SET nombre='" + nombre + "', descripcion='" + descripcion + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    public boolean cambiarEstadoUnidadMedida(int idUnidad) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Unidad_Medida SET estado = 0 WHERE id=" + idUnidad);
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
