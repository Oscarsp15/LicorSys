package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente_m extends Conexion {

    Connection c = cadena_cnx();

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Cliente where estado=1");
            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion")
                );
                clientes.add(cliente);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return clientes;
    }

    public boolean registrarCliente(String nombre, String direccion) {
        boolean estado = false;
        int cod_estado= 1 ;
        try {
            Statement st = c.createStatement();
            String valores = "'" + nombre + "',";
            valores = valores + "'" + direccion + "'";
            int rs = st.executeUpdate("INSERT INTO Cliente(nombre, direccion,estado) VALUES(" + valores +"," +cod_estado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    public Cliente buscarClientePorId(int id) {
        Cliente cliente = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Cliente WHERE id=" + id);
            while (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion")
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el cliente: " + e.getMessage());
        }
        return cliente;
    }

    public boolean actualizarCliente(int id, String nombre, String direccion) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Cliente SET nombre='" + nombre + "', direccion='" + direccion + "' WHERE id=" + id);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    public boolean cambiarEstadoCliente(int idCliente) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Cliente SET estado = 0 WHERE id=" + idCliente);
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
