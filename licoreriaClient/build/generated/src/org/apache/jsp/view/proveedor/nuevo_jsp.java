package org.apache.jsp.view.proveedor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/head.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-1\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                        <h4 class=\"card-title\">Nuevo Proveedor</h4>\r\n");
      out.write("                        <p class=\"card-category\">Complete los datos del Proveedor</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <form autocomplete=\"off\"  action = \"../../Proveedor_registrar.do\" method=\"POST\" data-form=\"save\" enctype=\"multipart/form-data\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-2\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">ID Proveedor</label>\r\n");
      out.write("                                        <input type=\"text\" value=\"\" disabled class=\"form-control\">\r\n");
      out.write("                                        <input name=\"id_agregar\" type=\"hidden\" value=\"<?=$this->codigo_proveedor;?>\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Ruc</label>\r\n");
      out.write("                                        <input name=\"ruc_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Razón Social</label>\r\n");
      out.write("                                        <input name=\"rs_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">E-mail</label>\r\n");
      out.write("                                        <input name=\"email_agregar\" type=\"email\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Telefono</label>\r\n");
      out.write("                                        <input name=\"telefono_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Dirección</label>\r\n");
      out.write("                                        <input name=\"direccion_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">DNI del Reprentante</label>\r\n");
      out.write("                                        <input name=\"dni_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Nombre del Representante</label>\r\n");
      out.write("                                        <input name=\"nombrer_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Dirección del Representante</label>\r\n");
      out.write("                                        <input name=\"direccionr_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Telefono del Reprentante</label>\r\n");
      out.write("                                        <input name=\"telefonor_agregar\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-sm btn-primary pull-right\">Guardar Proveedor</button>\r\n");
      out.write("                            <a class=\"btn btn-rose btn-sm pull-right\" href=\"index.jsp\">Regresar</a>\r\n");
      out.write("                            <div class=\"RespuestaAjax\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
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
