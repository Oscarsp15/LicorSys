package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Personal extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "No se procesó la solicitud";

        try {
            // Obtener el parámetro que indica la acción
            String action = request.getParameter("action");

            if ("Personal_registrar".equals(action)) {
                // Lógica específica para registrar
                String nombres = request.getParameter("nombre_agregar");
                String apellidos = request.getParameter("apellido_agregar");
                String dni = request.getParameter("dni_agregar");
                String direccion = request.getParameter("direccion_agregar");
                int sede = Integer.parseInt(request.getParameter("sede_agregar"));

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.registrarEmpleado(nombres, apellidos, dni, direccion, sede)) {

                    res = "Personal Registrado";
                    response.sendRedirect("view/persona/index.jsp");

                }
            } else if ("Personal_eliminar".equals(action)) {
                // Lógica específica para eliminar
                int cod_empleado = Integer.parseInt(request.getParameter("cod_empleado"));
                clases.NewWebService_Service server = new clases.NewWebService_Service();
                clases.NewWebService port = server.getNewWebServicePort();
                if (port.cambiarEstadoEmpleado(cod_empleado)) {
//                res = "Se eliminó por completo";
                    response.sendRedirect("view/persona/index.jsp");
                }
            } else if ("Personal_editar".equals(action)) {
                // Lógica específica para editar 
                int id = Integer.parseInt(request.getParameter("id_agregar"));
                String nombres = request.getParameter("nombre_agregar");
                String apellidos = request.getParameter("apellido_agregar");
                String dni = request.getParameter("dni_agregar");
                String direccion = request.getParameter("direccion_agregar");
                int sede = Integer.parseInt(request.getParameter("sede_agregar"));

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.actualizarEmpleado(id, nombres, apellidos, dni, direccion, sede)) {
                    res = "se actualizó correctamente";
                    response.sendRedirect("view/persona/index.jsp");

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
