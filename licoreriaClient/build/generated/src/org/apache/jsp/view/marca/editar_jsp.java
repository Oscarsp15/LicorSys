package org.apache.jsp.view.marca;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import clases.*;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    Marca marca = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_marca"));
        marca = port.buscarMarcaPorId(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        marca = new Marca();
    }

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/head.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\n");
      out.write("                        <h4 class=\"card-title\">Marca ");
      out.print(marca.getId());
      out.write("</h4>\n");
      out.write("                        <p class=\"card-category\">Datos de la Marca</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        \n");
      out.write("                        <!------FORMULARIO EDITAR--------->\n");
      out.write("                        <form autocomplete=\"off\" action=\"../../GenericServlet.do/MarcaEditarServlet\" method=\"POST\" data-form=\"save\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"bmd-label-floating\">ID Marca</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.print(marca.getId());
      out.write("\" disabled class=\"form-control\">\n");
      out.write("                                        <input name=\"id_agregar\" type=\"hidden\" value=\"");
      out.print(marca.getId());
      out.write("\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"bmd-label-floating\">Nombre</label>\n");
      out.write("                                        <input name=\"nombre_marca_agregar\" type=\"text\" value=\"");
      out.print(marca.getNombre());
      out.write("\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"bmd-label-floating\">Detalle</label>\n");
      out.write("                                        <input name=\"detalle_agregar\" type=\"text\" class=\"form-control\" value=\"");
      out.print(marca.getDescripcion());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                 \n");
      out.write("                            </div>\n");
      out.write("                             \n");
      out.write("                            <button type=\"submit\" class=\"btn btn-sm btn-primary pull-right\">Guardar Marca</button>\n");
      out.write("                            <a class=\"btn btn-rose btn-sm pull-right\" href=\"index.jsp\">Regresar</a>\n");
      out.write("                            <div class=\"RespuestaAjax\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
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
