package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Unidad extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "No se procesó la solicitud";

        try {
            // Obtener el parámetro que indica la acción
            String action = request.getParameter("action");

            if ("Unidad_registrar".equals(action)) {
                // Lógica específica para registrar
                String nombre = request.getParameter("prefijo_agregar");
                String descripcion = request.getParameter("detalle_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.registrarUnidadMedida(nombre, descripcion)) {

                    res = "Unidad de Medida Registrada";
                    response.sendRedirect("view/unidadmedida/index.jsp");
                    //response.sendRedirect("view/unidadmedida/index.jsp");

                }
            } else if ("Unidad_eliminar".equals(action)) {
                // Lógica específica para eliminar
                int cod_unidad = Integer.parseInt(request.getParameter("cod_unidad"));
                clases.NewWebService_Service server = new clases.NewWebService_Service();
                clases.NewWebService port = server.getNewWebServicePort();
                if (port.cambiarEstadoUnidadMedida(cod_unidad)) {
//                res = "Se eliminó por completo";
                    response.sendRedirect("view/unidadmedida/index.jsp");
                }
            } else if ("Unidad_editar".equals(action)) {
                // Lógica específica para editar 
                int id = Integer.parseInt(request.getParameter("id_agregar"));
                String nombre = request.getParameter("nombre_agregar");
                String descripcion = request.getParameter("detalle_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.actualizarUnidadMedida(id, nombre, descripcion)) {
                    res = "se actualizó correctamente";
                    response.sendRedirect("view/unidadmedida/index.jsp");

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
