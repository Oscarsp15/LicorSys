package org.apache.jsp.view.clientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import clases.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Cliente> clientes = port.listarClientes();
int cantidadClientes = clientes.size();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-1\"></div>\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                        <h4 class=\"card-title\">Clientes</h4>\r\n");
      out.write("                        <p class=\"card-category\">Lista de tus Clientes</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body table-responsive\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card card-stats\">\r\n");
      out.write("                                    <div class=\"card-header card-header-info card-header-icon\">\r\n");
      out.write("                                        <div class=\"card-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-user-check\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"card-category\">Clientes</p>\r\n");
      out.write("                                        <h3 class=\"card-title\">");
      out.print(cantidadClientes);
      out.write("</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <a href=\"nuevo.jsp\" class=\"btn btn-sm btn-primary\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i> Nuevo Cliente\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <table id=\"tb-prov\" class=\" table table-sm table-hover table-striped\">\r\n");
      out.write("                            <thead class=\"text-primary-amosis\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>N°</th>\r\n");
      out.write("                                    <th>Nombre</th>\r\n");
      out.write("                                    <th>Direccion</th>\r\n");
      out.write("                                    <th>Opcion</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"table\">\r\n");
      out.write("                                ");

                                    // List<UnidadMedida> unidades = port.listarUnidadesMedida();
                                    for (Cliente c : clientes) {
                                
      out.write("\r\n");
      out.write("                                <tr>                                   \r\n");
      out.write("                                    <td>");
      out.print(c.getId());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( c.getNombre());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(c.getDireccion());
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <a href=\"editar.jsp?cod_cliente=");
      out.print(c.getId());
      out.write("\"><button type=\"button\" class=\"btn btn-primary btn-sm\">Editar</button></a>\r\n");
      out.write("\r\n");
      out.write("                                        <button type=\"button\"  class=\"btn btn-danger btn-sm eliminar\" id=\"eliminar\" data-cod-cliente= \"");
      out.print(c.getId());
      out.write(" \">Eliminar</button>\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  \r\n");
      out.write(" $(document).on('click', '.eliminar', function() {\r\n");
      out.write("          let cod_cliente = $(this).data(\"cod-cliente\");\r\n");
      out.write("         $.post('../../Cliente.do?action=Cliente_eliminar&cod_cliente='+cod_cliente,function(){\r\n");
      out.write("         showNotification('bottom','center','Tu cliente fue eliminado correctamente','success');\r\n");
      out.write("           setTimeout(function(){\r\n");
      out.write("                                location.reload();\r\n");
      out.write("                            },1000);\r\n");
      out.write("        \r\n");
      out.write("         })\r\n");
      out.write("      .fail(function() {\r\n");
      out.write("    // La solicitud falló\r\n");
      out.write("    showNotification('bottom', 'center', 'Hubo un problema al eliminar el cliente', 'danger');\r\n");
      out.write("});  \r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
