package org.apache.jsp.view.proveedor;

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
List<Proveedor> prov = port.proveedorListar();
int cantidadProveedores = prov.size();

      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-1\"></div>\r\n");
      out.write("        <div class=\"col-md-10\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("            <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                <h4 class=\"card-title\">Proveedores</h4>\r\n");
      out.write("                <p class=\"card-category\">Lista de tus Proveedores</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-body table-responsive\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"card card-stats\">\r\n");
      out.write("                        <div class=\"card-header card-header-gold card-header-icon\">\r\n");
      out.write("                            <div class=\"card-icon\">\r\n");
      out.write("                                <i class=\"fa fa-truck\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"card-category\">Proveedores</p>\r\n");
      out.write("                            <h3 class=\"card-title\">");
      out.print(cantidadProveedores);
      out.write("</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer\">\r\n");
      out.write("                            <a href=\"nuevo.jsp\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                                <i class=\"fa fa-1x fa-plus\"></i> Nuevo Proveedor\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-responsive\">\r\n");
      out.write("                    <table id=\"tb-prov\" class=\"table table-sm table-hover table-striped\">\r\n");
      out.write("                        <thead class=\"text-primary-amosis\">\r\n");
      out.write("                            <th>Código</th>\r\n");
      out.write("                            <th>RUC</th>\r\n");
      out.write("                            <th>R.S</th>\r\n");
      out.write("                            <th>Telefono</th>\r\n");
      out.write("                            <th>Opción</th>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");

                                    List<Proveedor> prove = port.proveedorListar();
                                    for (Proveedor p : prove) {
                                
      out.write("\r\n");
      out.write("                                <tr>                                   \r\n");
      out.write("                                    <td>");
      out.print(p.getIdProveedor());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( p.getRuc());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getRazonSocial());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getTelefono());
      out.write("</td>\r\n");
      out.write("                                  \r\n");
      out.write("                                        \r\n");
      out.write("                                        <td><a href=\"editar.jsp?cod_proveedor=");
      out.print(p.getIdProveedor());
      out.write("\"><button type=\"button\"  class=\"btn btn-primary btn-sm\">Editar</button></a>  \r\n");
      out.write("                                        \r\n");
      out.write("                                           <a href=\"../../Proveedor.do?action=Proveedor_eliminar&cod_proveedor=");
      out.print(p.getIdProveedor());
      out.write("\"><button type=\"button\"  class=\"btn btn-danger btn-sm\">Eliminar</button></a></td>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                   \r\n");
      out.write("\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
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
