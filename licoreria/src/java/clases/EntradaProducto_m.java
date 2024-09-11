package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntradaProducto_m extends Conexion {

    Connection c = cadena_cnx();

    public List<EntradaProducto> listarEntradasProductos() {
        List<EntradaProducto> entradasProductos = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM entrada_producto");
            EntradaProducto entradaProducto;
            while (rs.next()) {
                int idProveedor = rs.getInt("id_proveedor");
                Proveedor proveedor = obtenerProveedorPorId(idProveedor);
                
                entradaProducto = new EntradaProducto(
                        rs.getInt("id"),
                        proveedor,
                        rs.getDate("f_entrada"),
                        rs.getString("observacion")
                );
                entradasProductos.add(entradaProducto);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return entradasProductos;
    }

    private Proveedor obtenerProveedorPorId(int idProveedor) {
        Proveedor proveedor = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM proveedor WHERE id=" + idProveedor);
            while (rs.next()) {
                proveedor = new Proveedor(
                        rs.getInt("id"),
                        rs.getString("RUC"),
                        rs.getString("razon_social"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        rs.getString("dni")
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener proveedor: " + e.getMessage());
        }
        return proveedor;
    }

    // Aquí podrías añadir otros métodos para registrar, buscar, actualizar, etc.
}
