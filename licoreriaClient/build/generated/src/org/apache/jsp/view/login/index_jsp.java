package org.apache.jsp.view.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>AMODEUS | LOGIN</title>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\"/>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"archives/assets/AMOSIS-LOGO.png\" sizes=\"64x64\"/>\r\n");
      out.write("    <meta name=\"description\" content=\"Amosis, es un sistema web desarrollado con el objetivo que el usuario pueda tener un control automatizado y eficiente de sus bienes en almacÃ©n\">\r\n");
      out.write("    <meta name=\"HandheldFriendly\" content=\"true\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("    <link href=\"../assets/fontawesome-free-5.12.1-web/css/all.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"../assets/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"../assets/datatables/datatables.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"../assets/datatables/responsive.bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"../assets/datatables/fixedHeader.bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"../assets/css/amosis-demo.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"archives/assets/AMOSIS-LOGO.png\" sizes=\"64x64\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"archives/icons/apple-icon-60x60.png\">\r\n");
      out.write("    <link rel=\"apple-touch-startup-image\" href=\"archives/icons/apple-icon-120x120.png\">\r\n");
      out.write("    <link rel=\"manifest\" href=\"manifest.json\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div id=\"loader\" style=\"background: url('archives/assets/licoreria.jpg') no-repeat center 0; background-size: 200px;top: 30%;\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container mt-5\">\r\n");
      out.write("        <div class=\"row mt-5\">\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 ml-auto mr-auto mt-5\">\r\n");
      out.write("                <div class=\"card card-login\">\r\n");
      out.write("                    <form autocomplete=\"off\" class=\"FormularioAjax\" action = \"<?php echo SERVERURL;?>login/iniciar_sesion\" method=\"POST\" data-form=\"save\" ectype=\"multipart/form-data\">\r\n");
      out.write("                        <div class=\"card-header card-header-amosis text-center\">\r\n");
      out.write("                            <h4 class=\"card-title logo-text-amosis\">LICORERIA</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <img width=\"100%\"src=\"archives/assets/licoreria.jpg\" alt=\"Logo del Sistema\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"form-group bmd-form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">Usuario</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"usuario\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"form-group bmd-form-group\">\r\n");
      out.write("                                        <label class=\"bmd-label-floating\">ContraseÃ±a</label>\r\n");
      out.write("                                        <input type=\"password\" name=\"pass\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary w-100\">Iniciar SesiÃ³n</button>\r\n");
      out.write("                            <?=$this->registrar;?>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"RespuestaAjax\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("  <script src=\"../assets/js/core/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/core/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/core/bootstrap-material-design.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/material-kit.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/moment.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/sweetalert2.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/jquery.validate.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/jquery.bootstrap-wizard.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-selectpicker.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-tagsinput.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/jasny-bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/fullcalendar.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/jquery-jvectormap.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/nouislider.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/arrive.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/chartist.min.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\r\n");
      out.write("  <script src=\"../assets/js/material-dashboard.js?v=2.1.1\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script src=\"../assets/js/main.js\"></script>\r\n");
      out.write("  <script src=\"../assets/demo/demo.js\"></script>\r\n");
      out.write("  <script src=\"../assets/datatables/datatables.js\"></script>\r\n");
      out.write("  <script src=\"../assets/datatables/datatables.bootstrap4.js\"></script>\r\n");
      out.write("  <script src=\"../assets/datatables/datatables.responsive.js\"></script>\r\n");
      out.write("  <script src=\"../assets/datatables/resposive.bootstrap.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write(" \r\n");
      out.write("  </script>\r\n");
      out.write("</html>");
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
