package clases;

import java.sql.*;
import java.util.*;

public class Empleado_m extends Conexion {

    Connection c = cadena_cnx();

    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado where estado=1");
            while (rs.next()) {
                
            int idSedeEmpleado = rs.getInt("id_sede");
                Sede sedeEmpleado = obtenerSedePorId(idSedeEmpleado);
               
                
                
                Empleado empleado = new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                       sedeEmpleado
                );

                // Obtener información de la sede
           

                empleados.add(empleado);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return empleados;
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        Empleado empleado = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado WHERE id=" + idEmpleado);
            while (rs.next()) {
                
                int idSedeEmpleado = rs.getInt("id_sede");
                Sede sedeEmpleado = obtenerSedePorId(idSedeEmpleado);
               
                
                empleado = new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        sedeEmpleado
                );

                // Obtener información de la sede
               
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el empleado: " + e.getMessage());
        }
        return empleado;
    }

    private Sede obtenerSedePorId(int idSede) {
       Sede sedeEmpleado = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM sede WHERE id=" + idSede);
            while (rs.next()) {
                sedeEmpleado = new Sede(
                        rs.getInt("id"),
                        rs.getString("direccion"),
                        rs.getString("observacion"),
                        rs.getString("razon_social"),
                        rs.getString("logo"),
                        rs.getString("propietario"),
                        rs.getString("telefono")
                        
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener proveedor: " + e.getMessage());
        }
        return sedeEmpleado;
    
    }
    
    public boolean registrarEmpleado(String nombres, String apellidos,String dni, String direccion, int sede) { 
        //Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
        boolean estado = false;
        int cod_estado= 1 ;
        try {
            Statement st = c.createStatement();
            String valores = "'" + nombres + "',";
            valores += "'" + apellidos + "',";
            valores += "'" + dni + "',";
            valores += "'" + direccion + "',";
            valores +=  sede;
            int rs = st.executeUpdate("INSERT INTO empleado(nombres,apellidos,dni,direccion,id_sede,estado) VALUES(" + valores +"," +cod_estado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }
    
    public boolean actualizarEmpleado(int id, String nombres, String apellidos, String dni, String direccion, int sede) {
       // Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Empleado SET nombres='" + nombres + "', apellidos='" + apellidos + "', "
                    + "dni='" + dni + "', direccion='" + direccion + "', id_sede='" + sede + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }
    
    public boolean cambiarEstadoEmpleado(int idEmpleado) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Empleado SET estado = 0 WHERE id=" + idEmpleado);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    // Otros métodos como registrarEmpleado, actualizarEmpleado, cambiarEstadoEmpleado, según necesidades
}
