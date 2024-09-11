/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import clases.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ValidarLogin extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String res = "No se procesó la solicitud";
    
    try {  
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        NewWebService_Service server = new NewWebService_Service();
        NewWebService port = server.getNewWebServicePort();
        
      Usuario usuarioValido = port.validarUsuario(usuario, password);
        HttpSession session = request.getSession();
        
        // Verifica si el inicio de sesión es exitoso
        /*if (loginExitoso) {
            // Agrega el nombre de usuario a la sesión
            
            //port.buscarUsuario();
            session.setAttribute("usuario", usuario);
            
            // Redirige a la página principal o a donde sea necesario
            response.sendRedirect("view/dashboard/index.jsp");
        } else {
            // Si la validación falla, redirige nuevamente al formulario de inicio de sesión con un mensaje de error
            res = "Error";
        }*/
        if (usuarioValido != null) {
            // Agrega el nombre de usuario y el valor de admin a la sesión
            session.setAttribute("usuario", usuario);
            session.setAttribute("dashboard", usuarioValido.getDashboard());
            session.setAttribute("movimientos", usuarioValido.getMovimientos());
            session.setAttribute("ventas", usuarioValido.getVentas());
            session.setAttribute("compras", usuarioValido.getCompras());
            session.setAttribute("admin", usuarioValido.getAdmin());

            // Redirige a la página principal o a donde sea necesario
            response.sendRedirect("view/dashboard/index.jsp");
        } else {
            // Si la validación falla, redirige nuevamente al formulario de inicio de sesión con un mensaje de error
            res = "Error";
        }
        
        out.print(res);
    } catch (NumberFormatException e) {
        res = "Error: ID no válido";
        out.print(res);
    } catch (Exception e) {
        res = "Error:" + e.getMessage();
        out.print(res);
    } finally {
        out.close();
    }
           
    }            


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
