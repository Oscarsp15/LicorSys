package clases;

import java.sql.*;
import java.util.*;

public class Proveedor_m extends Conexion {

    Connection c = cadena_cnx();

//--------------------LISTADO DE PROVEEDORES---------------------------    
    public List<Proveedor> prov_listar() {
        List<Proveedor> proveedores = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Proveedor where estado=1");
            Proveedor prov;
            while (rs.next()) {
                prov = new Proveedor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                        
                );
                proveedores.add(prov);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return proveedores;
    }
    
//--------------------------------REGISTRAR PROVEEDOR-----------------------------  
    public boolean prov_registrar( String ruc, String razon_social, String email,String telefono,String direccion,String dni ) {
        boolean estado = false;
        int prov_estado = 1;
        try {
            Statement st = c.createStatement();
            String valores = "'" + ruc + "',";
            valores = valores + "'" + razon_social + "',";
            valores = valores + "'" + email + "',";
            valores = valores + "'" + telefono + "',";
            valores = valores + "'" + direccion + "',";
            valores = valores + "'" + dni + "'";
            int rs = st.executeUpdate("INSERT INTO Proveedor( RUC, razon_social, email, telefono, direccion,dni,estado) VALUES(" + valores +"," +prov_estado+ ")");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }  
    
//---------------------------------BUSQUEDA POR CODIGO DE PROVEEDOR-----------------------------    
public Proveedor list_cod(int id_proveedor) {
        Proveedor prov = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Proveedor WHERE id=" + id_proveedor);
            while (rs.next()) {
                prov = new Proveedor (
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el proveedor: " + e.getMessage());
        }
        return prov;
    }
//---------------------------------ACTUALIZAR PROVEEDOR----------------------------- 


    public boolean prov_actualizar(Integer id_proveedor, String ruc,String razon_social, String email,String telefono, String direccion, String dni) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Proveedor SET RUC='" + ruc + "', razon_social='" + razon_social + "', email='" + email + "',telefono='" + telefono+ "',  direccion='" + direccion   + "', dni='" + dni + "' WHERE id=" + id_proveedor);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return estado;
    }




//-------------------------Cambiar estado de PROVEEDOR----------------------------------------
public boolean prov_estado(int cod_proveedor) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE Proveedor SET estado = 0 WHERE id=" + cod_proveedor);
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
