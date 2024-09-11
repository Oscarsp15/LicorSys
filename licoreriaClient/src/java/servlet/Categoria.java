package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Categoria extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "No se procesó la solicitud";

        try {
            // Obtener el parámetro que indica la acción
            String action = request.getParameter("action");

            if ("Categoria_registrar".equals(action)) {
                // Lógica específica para registrar
                String nombre = request.getParameter("nombre_agregar");
                String descripcion = request.getParameter("detalle_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.registrarCategoria(nombre, descripcion)) {

                    res = "Categoria Registrada";
                    response.sendRedirect("view/categoria/index.jsp");

                }
            } else if ("Categoria_eliminar".equals(action)) {
                // Lógica específica para eliminar
                int cod_cate = Integer.parseInt(request.getParameter("cod_cate"));
                clases.NewWebService_Service server = new clases.NewWebService_Service();
                clases.NewWebService port = server.getNewWebServicePort();
                if (port.cambiarEstadoCategoria(cod_cate)) {
//                res = "Se eliminó por completo";
                    response.sendRedirect("view/categoria/index.jsp");
                }
            } else if ("Categoria_editar".equals(action)) {
                // Lógica específica para editar 
                int id = Integer.parseInt(request.getParameter("id_agregar"));
                String nombre = request.getParameter("nombre_agregar");
                String descripcion = request.getParameter("detalle_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.actualizarCategoria(id, nombre, descripcion)) {
                    res = "se actualizó correctamente";
                    response.sendRedirect("view/categoria/index.jsp");
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
