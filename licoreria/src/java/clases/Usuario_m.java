package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Usuario_m extends Conexion {

    Connection c = cadena_cnx();

    //--------------------OBTENER EMPLEADO POR ID---------------------------    
      private Empleado obtenerEmpleadoPorId(int idEmpleado) {
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
             st.close(); 
        } catch (Exception e) {
            System.out.println("Error al leer el empleado: " + e.getMessage());
        }
        return empleado;
    }
    
    //-----------------------------ObtenerSEde---------------------------
   private Sede obtenerSedePorId(int idSede){
   
     Sede sede = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Sede WHERE id=" + idSede);
            if (rs.next()) {
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
            //c.close();
             st.close(); 
        } catch (Exception e) {
            System.out.println("Error al obtener Sede: " + e.getMessage());
        }
        return sede;
    }    

    //--------------------OBTENER ROL POR ID---------------------------    
    private Rol RolID(int idRol) {
        Rol rol = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM rol WHERE id=" + idRol);
            if (rs.next()) {
                rol = new Rol(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
             st.close(); 
        } catch (Exception e) {
            System.out.println("Error al obtener rol: " + e.getMessage());
        }
        return rol;
    }

    
    //--------------------LISTADO DE USUARIOS---------------------------    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario where estado = 1");
            Usuario usuario;
            while (rs.next()) {
                int idEmpleado = rs.getInt("id_empleado");
                Empleado empleado = obtenerEmpleadoPorId(idEmpleado);

                int idRol = rs.getInt("id_rol");
                Rol rol = RolID(idRol);

              

                usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        empleado,
                        rol,
                        rs.getInt("dashboard"),
                        rs.getInt("movimientos"),
                        rs.getInt("ventas"),
                        rs.getInt("compras"),
                        rs.getInt("admin")
                      
                );
                usuarios.add(usuario);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuarios;
    }

    //--------------------------------REGISTRAR USUARIO-----------------------------  
    public boolean registrarUsuario(
            String usuario,
            String password,
            int idEmpleado,
            int idRol,
            int dashboard,
            int movimientos,
            int ventas,
            int compras,
            int admin
    ) {
        boolean estado = false;
        //int user_estado=1;
        try {
            Statement st = c.createStatement();
           
            String valores = "'" + usuario + "',";
            valores += "'" + password + "',";
            valores += idEmpleado + ",";
            valores += idRol + ",";
            valores += dashboard + ",";
            valores += movimientos + ",";
            valores += ventas + ",";
            valores += compras + ",";
            valores += admin;
                  

            int rs = st.executeUpdate("INSERT INTO usuario(usuario, password, id_empleado, id_rol, dashboard,movimientos, ventas,compras, admin,estado) VALUES(" + valores + ",1)");
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }

    //---------------------------------BUSQUEDA POR ID DE USUARIO-----------------------------    
    public Usuario buscarUsuario(int idUsuario) {
        Usuario usuario = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE id=" + idUsuario);
            if (rs.next()) {
                int idEmpleado = rs.getInt("id_empleado");
                Empleado empleado = obtenerEmpleadoPorId(idEmpleado);

                int idRol = rs.getInt("id_rol");
                Rol rol = RolID(idRol);


                usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        empleado,
                        rol,
                        rs.getInt("dashboard"),
                        rs.getInt("movimientos"),
                        rs.getInt("ventas"),
                        rs.getInt("compras"),
                        rs.getInt("admin")
                        
                );
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al leer el usuario: " + e.getMessage());
        }
        return usuario;
    }

    //---------------------------------ACTUALIZAR USUARIO----------------------------- 

    public boolean actualizarUsuario(
        int idUsuario,
        String usuario,
        String password,
        int idEmpleado,
        int idRol,
        int dashboard,
        int movimientos,
        int ventas,
        int compras,
        int admin
) {
    boolean estado = false;
    try {
        Statement st = c.createStatement();
        int rs = st.executeUpdate("UPDATE usuario SET " +
                "usuario='" + usuario + "', " +
                "password='" + password + "', " +
                "id_empleado=" + idEmpleado + ", " +
                "id_rol=" + idRol + ", " +
                "dashboard=" + dashboard + ", " +
                "movimientos=" + movimientos + ", " +
                "ventas=" + ventas + ", " +
                "compras=" + compras + ", " +
                "admin=" + admin + " " +
                "WHERE id=" + idUsuario);
        if (rs >= 1) {
            estado = true;
        }
        c.close();
    } catch (Exception e) {
        System.out.println("Error al actualizar: " + e.getMessage());
    }
    return estado;
}


    //-------------------------Cambiar estado de USUARIO----------------------------------------
    public boolean cambiarEstadoUsuario(int idUsuario) {
        boolean estado = false;
        try {
            Statement st = c.createStatement();
            int rs = st.executeUpdate("UPDATE usuario SET estado = 0 WHERE id=" + idUsuario);
            if (rs >= 1) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return estado;
    }
    
/*public boolean ValidarUsuario(String usuario, String password) {
    boolean estado = false;
    try {
        // Crear una declaración preparada con parámetros
        String query = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";
        try (PreparedStatement preparedStatement = c.prepareStatement(query)) {
            // Establecer los parámetros
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);

            // Ejecutar la consulta
            try (ResultSet rs = preparedStatement.executeQuery()) {
                // Comprobar si hay algún resultado
                if (rs.next()) {
                    estado = true;  // Si hay resultados, el usuario es válido
                }
            }
        }
        c.close();
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
    return estado;
}*/

   public Usuario ValidarUsuario(String usuario, String password) {
    Usuario usuarioValido = null;
    try {
        // Crear una declaración preparada con parámetros
        String query = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";
        try (PreparedStatement preparedStatement = c.prepareStatement(query)) {
            // Establecer los parámetros
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);

            // Ejecutar la consulta
            try (ResultSet rs = preparedStatement.executeQuery()) {
                // Comprobar si hay algún resultado
                if (rs.next()) {
                    // Crear un objeto Usuario con los datos obtenidos de la base de datos
                    usuarioValido = new Usuario(
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
            }
        }
        c.close();
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
    return usuarioValido;
}

    
     }
    
    
 
    

