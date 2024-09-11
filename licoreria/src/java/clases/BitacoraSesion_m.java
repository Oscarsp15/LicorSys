
package clases;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class BitacoraSesion_m extends Conexion {
   
    Connection c = cadena_cnx();
    
    
    // LISTAR BITACORA
    public List<BitacoraSesion> listarBitacoraSesion() {
    List<BitacoraSesion> bitacorasesions = new ArrayList<>();
    
    try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM bitacora_sesion");
            BitacoraSesion bitacorasesion;
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                Usuario usuario = obtenerUsuarioPorId(idUsuario);

             

                bitacorasesion = new BitacoraSesion(
                        rs.getInt("id"),
                        usuario,
                        rs.getDate("f_inicio"),
                        rs.getDate("f_fin")
                       
                );
                bitacorasesions.add(bitacorasesion);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return bitacorasesions;
    
    }
    
      private Usuario obtenerUsuarioPorId(int idUsuario) {
        Usuario usuario = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE id=" + idUsuario);
            while (rs.next()) {
                usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getInt("dashboard"),
                        rs.getInt("movimientos"),
                        rs.getInt("ventas"),
                        rs.getInt("compras"),
                        rs.getInt("admin")
                        
                        
                );
            }
        } catch (Exception e) {
            System.out.println("Error al obtener marca: " + e.getMessage());
        }
        return usuario;
    }
    
     // REGISTRAR  FECHA DE INCIO BITACORA
  
       
      
      
      
      // REGISTRAR  FECHA DE SALIDA BITACORA
      
      
      
      
      
      
}

