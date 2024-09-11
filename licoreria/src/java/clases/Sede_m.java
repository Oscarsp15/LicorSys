package clases;

import java.sql.*;
import java.util.*;

public class Sede_m extends Conexion {

    Connection c = cadena_cnx();

    public List<Sede> listarSedes() {
        List<Sede> sedes = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Sede");
            Sede sede;
            while (rs.next()) {
                sede = new Sede(
                        rs.getInt("id"),
                        rs.getString("direccion"),
                        rs.getString("observacion"),
                        rs.getString("razon_social"),
                        rs.getString("logo"),
                        rs.getString("propietario"),
                        rs.getString("telefono")
                );
                sedes.add(sede);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return sedes;
    }

    public boolean registrarSede(String direccion, String observacion, String razonSocial, String logo, String propietario, String telefono) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            String valores = "'" + direccion + "',";
            valores = valores + "'" + observacion + "',";
            valores = valores + "'" + razonSocial + "',";
            valores = valores + "'" + logo + "',";
            valores = valores + "'" + propietario + "',";
            valores = valores + "'" + telefono + "'";
            int rs = st.executeUpdate("INSERT INTO Sede(direccion, observacion, razon_social, logo, propietario, telefono) VALUES(" + valores + ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    public Sede buscarSedePorId(int id) {
        Sede sede = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Sede WHERE id=" + id);
            while (rs.next()) {
                sede = new Sede(
                        rs.getInt("id"),
                        rs.getString("direccion"),
                        rs.getString("observacion"),
                        rs.getString("razon_social"),
                        rs.getString("logo"),
                        rs.getString("propietario"),
                        rs.getString("telefono")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer la sede: " + e.getMessage());
        }
        return sede;
    }

    public boolean actualizarSede(int id, String direccion, String observacion, String razonSocial, String logo, String propietario, String telefono) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Sede SET direccion='" + direccion + "', observacion='" + observacion + "', razon_social='" + razonSocial + "', logo='" + logo + "', propietario='" + propietario + "', telefono='" + telefono + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    public boolean cambiarEstadoSede(int idSede) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Sede SET estado = 0 WHERE id=" + idSede);
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
