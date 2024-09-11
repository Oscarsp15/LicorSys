
package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Marca extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "No se proceso la solicitud";

        try {
            // Obtener el parámetro que indica la acción
            String action = request.getParameter("action");

            if ("Marca_editar".equals(action)) {
                // Lógica específica para editar una marca
                int id = Integer.parseInt(request.getParameter("id_agregar"));
                String nombre = request.getParameter("nombre_marca_agregar");
                String descripcion = request.getParameter("detalle_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.actualizarMarca(id, nombre, descripcion)) {
                    res = "se actualizó correctamente";
                    response.sendRedirect("view/marca/index.jsp");
                }
            }

            // -----------------------Registrar
            if ("Marca_registrar".equals(action)) {
            String nombre = request.getParameter("nombre-agregar");
            String descripcion = request.getParameter("detalle-agregar");

            NewWebService_Service server = new NewWebService_Service();
            NewWebService port = server.getNewWebServicePort();
            if (port.registrarMarca(nombre, descripcion)) {

                res = "Marca Registrada";
                response.sendRedirect("view/marca/index.jsp");

            }
            }
            //-----------Eliminar------------------------
            
             if ("Marca_eliminar".equals(action)) {
                // Lógica específica para eliminar una marca
                 int cod_marca = Integer.parseInt(request.getParameter("cod_marca"));
            clases.NewWebService_Service server = new clases.NewWebService_Service();
            clases.NewWebService port = server.getNewWebServicePort();
            if (port.cambiarEstadoMarca(cod_marca)) {
//                res = "Se eliminó por completo";
                response.sendRedirect("view/marca/index.jsp");
            }
            }
                      
            
            out.print(res);
        } catch (NumberFormatException e) {
            res = "Error: ID no válido";
            out.print(res);
        } catch (Exception e) {
            res = "Error:" + e.getMessage();
            out.print(res);
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
