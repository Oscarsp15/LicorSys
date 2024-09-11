package org.apache.jsp.view.categoria;

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
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Categoria> cate = port.listarCategorias();
int cantidadCategorias = cate.size();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-1\"></div>\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                        <h4 class=\"card-title\">Categorias</h4>\r\n");
      out.write("                        <p class=\"card-category\">Lista de tus Categorias</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body table-responsive\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card card-stats\">\r\n");
      out.write("                                    <div class=\"card-header card-header-info-amosis card-header-icon\">\r\n");
      out.write("                                        <div class=\"card-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-book-open\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"card-category\">Categorias</p>\r\n");
      out.write("                                        <h3 class=\"card-title\">");
      out.print(cantidadCategorias );
      out.write("</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-primary\" data-toggle=\"modal\" data-target=\"#modal\">\r\n");
      out.write("                                        <i class=\"fa fa-plus\"></i> Nueva Categoria\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <a href=\"../productos/nuevo.jsp\" class=\"btn btn-rose btn-sm pull-right\">Regresar</a> \r\n");
      out.write("                                        <div id=\"modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                                            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                                <div class=\"modal-content\">\r\n");
      out.write("                                                    <div class=\"modal-header\">\r\n");
      out.write("                                                        <h5>Nueva Categoria</h5>\r\n");
      out.write("                                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <!--FORMULARIO NUEVO--->\r\n");
      out.write("                                                    <form autocomplete=\"off\" action = \"../../Categoria.do\">\r\n");
      out.write("                                                        <div class=\"modal-body\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                                    <div class=\"form-group\">\r\n");
      out.write("                                                                        <label class=\"bmd-label-floating\">Nombre de la Categoria</label>\r\n");
      out.write("                                                                        <input type=\"text\" name=\"nombre_agregar\" required class=\"form-control\">\r\n");
      out.write("                                                                        <input name=\"action\" type=\"hidden\" value=\"Categoria_registrar\" class=\"form-control\">\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                                    <div class=\"form-group\">\r\n");
      out.write("                                                                        <div class=\"form-group bmd-form-group\">\r\n");
      out.write("                                                                            <label class=\"bmd-label-floating\"> Detalle de la Categoria</label>\r\n");
      out.write("                                                                            <textarea name=\"detalle_agregar\" class=\"form-control\" rows=\"5\"></textarea>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-footer\">\r\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-sm btn-primary\">Guardar</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                    </form>\r\n");
      out.write("                                                </div>\r\n");
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

                                    List<Categoria> categorias = port.listarCategorias();
                                    for (Categoria c : categorias) {
                                
      out.write("\r\n");
      out.write("                                <tr>                                   \r\n");
      out.write("                                    <td>");
      out.print(c.getId());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( c.getNombre());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(c.getDescripcion());
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <a href=\"editar.jsp?cod_cate=");
      out.print(c.getId());
      out.write("\"  ><button type=\"button\"  class=\"btn btn-primary btn-sm\">Editar</button></a>\r\n");
      out.write("\r\n");
      out.write("                                       <a href=\"../../Categoria.do?action=Categoria_eliminar&cod_cate=");
      out.print(c.getId());
      out.write("\"> <button type=\"button\"  class=\"btn btn-danger btn-sm\" onclick=\"eliminarCategoria()\" >Eliminar</button> </a>\r\n");
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
      out.write("<div class=\"modal fade\" id=\"modal-editar\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\">EDITAR CATEGORIA</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">Ã</span>\r\n");
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
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // Función para mostrar la alerta cuando se elimina un proveedor\r\n");
      out.write("    function eliminarCategoria() {\r\n");
      out.write("        // Puedes personalizar el mensaje de la alerta según tus necesidades\r\n");
      out.write("        alert('Categoria eliminada exitosamente.');\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
