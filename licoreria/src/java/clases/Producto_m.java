package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Producto_m extends Conexion {

    Connection c = cadena_cnx();

    //--------------------LISTADO DE PRODUCTOS---------------------------    
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto where estado=1");
            Producto producto;
            while (rs.next()) {
                int idMarca = rs.getInt("id_marca");
                Marca marca = obtenerMarcaPorId(idMarca);

                int idCategoria = rs.getInt("id_categoria");
                Categoria categoria = obtenerCategoriaPorId(idCategoria);

                int idUnidadMedida = rs.getInt("id_unidadm");
                UnidadMedida unidadMedida = obtenerUnidadMedidaPorId(idUnidadMedida);

                producto = new Producto(
                        rs.getInt("id"),
                        rs.getInt("stock_minimo"),
                        rs.getString("codigo_barra"),
                        rs.getString("nombre"),
                        marca,
                        categoria,
                        rs.getDouble("precio_costo"),
                        rs.getDouble("precio_venta"),
                        unidadMedida
                );
                productos.add(producto);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return productos;
    }

    //--------------------------------REGISTRAR PRODUCTO-----------------------------  
    public boolean registrarProducto(
            int stockMinimo,
            String codigoBarra,
            String nombre,
            int idMarca,
            int idCategoria,
            double precioCosto,
            double precioVenta,
            int idUnidadMedida
    ) {
        boolean estado = false;
       int productoEstado = 1;
        try {
            Statement st = c.createStatement();
            String valores =  stockMinimo + ",";
            valores += "'" + codigoBarra + "',";
            valores += "'" + nombre + "',";
            valores += idMarca + ",";
            valores += idCategoria + ",";
            valores += precioCosto + ",";
            valores += precioVenta + ",";
            valores += idUnidadMedida ;
            
            int rs = st.executeUpdate("INSERT INTO producto(stock_minimo, codigo_barra, nombre, id_marca, id_categoria, precio_costo, precio_venta, id_unidadm,estado) VALUES(" + valores +"," +productoEstado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    //---------------------------------BUSQUEDA POR CODIGO DE PRODUCTO-----------------------------    
    public Producto buscarProducto(int idProducto) {
        Producto producto = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE id=" + idProducto);
            while (rs.next()) {
                int idMarca = rs.getInt("id_marca");
                Marca marca = obtenerMarcaPorId(idMarca);

                int idCategoria = rs.getInt("id_categoria");
                Categoria categoria = obtenerCategoriaPorId(idCategoria);

                int idUnidadMedida = rs.getInt("id_unidadm");
                UnidadMedida unidadMedida = obtenerUnidadMedidaPorId(idUnidadMedida);

                producto = new Producto(
                        rs.getInt("id"),
                        rs.getInt("stock_minimo"),
                        rs.getString("codigo_barra"),
                        rs.getString("nombre"),
                        marca,
                        categoria,
                        rs.getDouble("precio_costo"),
                        rs.getDouble("precio_venta"),
                        unidadMedida
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el producto: " + e.getMessage());
        }
        return producto;
    }

    //---------------------------------ACTUALIZAR PRODUCTO----------------------------- 

    public boolean actualizarProducto(
            Integer idProducto,
            int stockMinimo,
            String codigoBarra,
            String nombre,
            int idMarca,
            int idCategoria,
            double precioCosto,
            double precioVenta,
            int idUnidadMedida
    ) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE producto SET stock_minimo='" + stockMinimo + "', codigo_barra='" + codigoBarra + "', nombre='" + nombre + "', id_marca='" + idMarca + "', id_categoria='" + idCategoria + "', precio_costo='" + precioCosto + "', precio_venta='" + precioVenta + "', id_unidadm='" + idUnidadMedida + "' WHERE id=" + idProducto);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }

    //-------------------------Cambiar estado de PRODUCTO----------------------------------------
    public boolean cambiarEstadoProducto(int idProducto) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE producto SET estado = 0 WHERE id=" + idProducto);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    private Marca obtenerMarcaPorId(int idMarca) {
        Marca marca = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM marca WHERE id=" + idMarca);
            while (rs.next()) {
                marca = new Marca(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener marca: " + e.getMessage());
        }
        return marca;
    }

    private Categoria obtenerCategoriaPorId(int idCategoria) {
        Categoria categoria = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categoria WHERE id=" + idCategoria);
            while (rs.next()) {
                categoria = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener categoría: " + e.getMessage());
        }
        return categoria;
    }

    private UnidadMedida obtenerUnidadMedidaPorId(int idUnidadMedida) {
        UnidadMedida unidadMedida = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM unidad_medida WHERE id=" + idUnidadMedida);
            while (rs.next()) {
                unidadMedida = new UnidadMedida(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener unidad de medida: " + e.getMessage());
        }
        return unidadMedida;
    }
}
