package servlet;

import clases.NewWebService;
import clases.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Proveedor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "No se procesó la solicitud";

        try {
            // Obtener el parámetro que indica la acción
            String action = request.getParameter("action");

            if ("Proveedor_registrar".equals(action)) {
                // Lógica específica para registrar un proveedor
                String ruc = request.getParameter("ruc_agregar");
                String razon_social = request.getParameter("rs_agregar");
                String email = request.getParameter("email_agregar");
                String telefono = request.getParameter("telefono_agregar");
                String direccion = request.getParameter("direccion_agregar");
                String dni = request.getParameter("dni_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.provRegistrar(ruc, razon_social, email, telefono, direccion, dni)) {
                    res = "Proveedor Registrado";
                    response.sendRedirect("view/proveedor/index.jsp");
                }
            } else if ("Proveedor_eliminar".equals(action)) {
                // Lógica específica para eliminar un proveedor
                int cod_proveedor = Integer.parseInt(request.getParameter("cod_proveedor"));
                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.provEstado(cod_proveedor)) {
                    response.sendRedirect("view/proveedor/index.jsp");
                }
            } else if ("Proveedor_editar".equals(action)) {
                // Lógica específica para editar un proveedor
                int id = Integer.parseInt(request.getParameter("id_agregar"));
                String ruc = request.getParameter("ruc_agregar");
                String rs = request.getParameter("rs_agregar");
                String email = request.getParameter("email_agregar");
                String telefono = request.getParameter("telefono_agregar");
                String direccion = request.getParameter("direccion_agregar");
                String dni = request.getParameter("dni_agregar");

                NewWebService_Service server = new NewWebService_Service();
                NewWebService port = server.getNewWebServicePort();
                if (port.provActualizar(id, ruc, rs, email, telefono, direccion, dni)) {
                    res = "se actualizó correctamente";
                    response.sendRedirect("view/proveedor/index.jsp");
                
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
