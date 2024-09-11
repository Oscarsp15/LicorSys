package clases;

import java.sql.*;
import java.util.*;

public class TipoComprobante_m extends Conexion {

    Connection c = cadena_cnx();

    public List<TipoComprobante> listarTiposComprobante() {
        List<TipoComprobante> tiposComprobante = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipo_comprobante");
            TipoComprobante tipoComprobante;
            while (rs.next()) {
                tipoComprobante = new TipoComprobante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                tiposComprobante.add(tipoComprobante);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return tiposComprobante;
    }

    public boolean registrarTipoComprobante(String nombre, String descripcion) {
        boolean success = false;
        try {
            Statement st = c.createStatement();
            String values = "'" + nombre + "',";
            values += "'" + descripcion + "'";
            int rs = st.executeUpdate("INSERT INTO tipo_comprobante(nombre, descripcion) VALUES(" + values + ")");
            if (rs >= 1) {
                success = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return success;
    }

    public TipoComprobante buscarTipoComprobantePorId(int id) {
        TipoComprobante tipoComprobante = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipo_comprobante WHERE id=" + id);
            while (rs.next()) {
                tipoComprobante = new TipoComprobante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el tipo de comprobante: " + e.getMessage());
        }
        return tipoComprobante;
    }

    public boolean actualizarTipoComprobante(int id, String nombre, String descripcion) {
        boolean success = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE tipo_comprobante SET nombre='" + nombre + "', descripcion='" + descripcion + "' WHERE id=" + id);
            if (rs >= 1) {
                success = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return success;
    }

    public boolean cambiarEstadoTipoComprobante(int idTipoComprobante) {
        boolean success = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE tipo_comprobante SET estado = 0 WHERE id=" + idTipoComprobante);
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
