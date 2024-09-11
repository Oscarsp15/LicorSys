package org.apache.jsp.view.marca;

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
List<Marca> marca = port.listarMarcas();
int cantidadMarcas = marca.size();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-1\"></div>\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                        <h4 class=\"card-title\">Marcas</h4>\r\n");
      out.write("                        <p class=\"card-category\">Lista de tus Marcas</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body table-responsive\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card card-stats\">\r\n");
      out.write("                                    <div class=\"card-header card-header-info card-header-icon\">\r\n");
      out.write("                                        <div class=\"card-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-street-view\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"card-category\">Marcas</p>\r\n");
      out.write("                                        <h3 class=\"card-title\">");
      out.print( cantidadMarcas );
      out.write("</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-primary\" data-toggle=\"modal\" data-target=\"#modal\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i> Nueva Marca\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                     <a href=\"../productos/nuevo.jsp\" class=\"btn btn-rose btn-sm pull-right\">Regresar</a> \r\n");
      out.write("                                        <div id=\"modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                                            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <!--GUARDAR-->\r\n");
      out.write("                                                <form autocomplete=\"off\" action = \"../../Marca_registrar.do\" >\r\n");
      out.write("                                                    <div class=\"modal-content\">\r\n");
      out.write("                                                        <div class=\"modal-header\">\r\n");
      out.write("                                                            <h5>Nueva Marca</h5>\r\n");
      out.write("                                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                                <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                                            </button>\r\n");
      out.write("                                                            \r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-body\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                                    <div class=\"form-group\">\r\n");
      out.write("                                                                        <label class=\"bmd-label-floating\">Nombre de la Marca</label>\r\n");
      out.write("                                                                        <input type=\"text\" name=\"nombre-agregar\" class=\"form-control\" required>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                                    <div class=\"form-group\">\r\n");
      out.write("                                                                        <div class=\"form-group bmd-form-group\">\r\n");
      out.write("                                                                            <label class=\"bmd-label-floating\"> Detalle de la Marca</label>\r\n");
      out.write("                                                                            <textarea name=\"detalle-agregar\" class=\"form-control\" rows=\"5\"></textarea>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div> \r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-footer\">\r\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-sm btn-primary\">Guardar</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <!--div class=\"RespuestaAjax\">\r\n");
      out.write("\r\n");
      out.write("                                                    </div--->\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <table id=\"tb-prov\" class=\"table table-sm table-hover table-striped\">\r\n");
      out.write("                            <thead class=\"text-primary-amosis\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Id</th>\r\n");
      out.write("                                    <th>Nombre</th>\r\n");
      out.write("                                    <th>Detalle</th>\r\n");
      out.write("                                    <th>Opcion</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"table\">\r\n");
      out.write("                                ");

                                    List<Marca> marcas = port.listarMarcas();
                                    for (Marca m : marcas) {
                                
      out.write("\r\n");
      out.write("                                <tr>                                   \r\n");
      out.write("                                    <td>");
      out.print(m.getId());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( m.getNombre());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(m.getDescripcion());
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <a href=\"editar.jsp?cod_marca=");
      out.print(m.getId());
      out.write("\"  ><button type=\"button\"  class=\"btn btn-primary btn-sm\">Editar</button></a>\r\n");
      out.write("\r\n");
      out.write("                                       <a href=\"../../Marca_eliminar.do?cod_marca=");
      out.print(m.getId());
      out.write("\"> <button type=\"button\"  class=\"btn btn-danger btn-sm\">Eliminar</button> </a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                ");
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
      out.write("<div class=\"modal fade\" id=\"editmarca\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\">EDITAR PRODUCTO</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">X</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\" id=\"modal-body\">\r\n");
      out.write("                            \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" id=\"btn-modal-actualizar\" class=\"btn btn-success\">Guardar</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
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
