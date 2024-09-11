package org.apache.jsp.view.dashboard;

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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 col-sm-4\">\r\n");
      out.write("                <div class=\"card card-stats\">\r\n");
      out.write("                    <div class=\"card-header card-header-product-amosis card-header-icon\">\r\n");
      out.write("                        <div class=\"card-icon\" data-header-animation=\"true\">\r\n");
      out.write("                            <i class=\"fa fa-box-open\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"card-category\">Productos</p>\r\n");
      out.write("                        <h3 class=\"card-title\">7</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <a href=\"../productos/nuevo.jsp\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                            <i class=\"fa fa-1x fa-plus\"></i> Nuevo Producto\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-4\">\r\n");
      out.write("                <div class=\"card card-stats\">\r\n");
      out.write("                    <div class=\"card-header card-header-marcas-amosis card-header-icon\">\r\n");
      out.write("                        <div class=\"card-icon\" data-header-animation=\"true\">\r\n");
      out.write("                            <i class=\"fa fa-street-view\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"card-category\">Marcas</p>\r\n");
      out.write("                        <h3 class=\"card-title\">8</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <a href=\"../marca/\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                            <i class=\"fa fa-1x fa-plus\"></i> Nueva Marca\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-4\">\r\n");
      out.write("                <div class=\"card card-stats\">\r\n");
      out.write("                    <div class=\"card-header card-header-categoria-amosis card-header-icon\">\r\n");
      out.write("                        <div class=\"card-icon\" data-header-animation=\"true\">\r\n");
      out.write("                            <i class=\"fa fa-book-open\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"card-category\">Categorias</p>\r\n");
      out.write("                        <h3 class=\"card-title\">9</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <a href=\"../categoria/\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                            <i class=\"fa fa-1x fa-plus\"></i> Nueva Categoria\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("            <div class=\"col-md-3 col-sm-4\">\r\n");
      out.write("                <div class=\"card card-stats\">\r\n");
      out.write("                    <div class=\"card-header card-header-um-amosis card-header-icon\">\r\n");
      out.write("                        <div class=\"card-icon\" data-header-animation=\"true\">\r\n");
      out.write("                            <i class=\"fa fa-balance-scale-right\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"card-category\">Unidades de Medida</p>\r\n");
      out.write("                        <h3 class=\"card-title\">10</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <a href=\"../unidadmedida/\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                            <i class=\"fa fa-1x fa-plus\"></i> Nueva UM\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>                \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        let lunes = 0;\r\n");
      out.write("        let martes = 0;\r\n");
      out.write("        let miercoles = 0;\r\n");
      out.write("        let jueves = 0;\r\n");
      out.write("        let viernes = 0;\r\n");
      out.write("        let sabado = 0;\r\n");
      out.write("        let domingo = 0;\r\n");
      out.write("        $.post('dashboard/dia',{},function(res){\r\n");
      out.write("            var resd = res.split('|');\r\n");
      out.write("            lunes = parseInt(resd[0]);\r\n");
      out.write("            martes =  parseInt(resd[1]);\r\n");
      out.write("            miercoles =  parseInt(resd[2]);\r\n");
      out.write("            jueves =  parseInt(resd[3]);\r\n");
      out.write("            viernes =  parseInt(resd[4]);\r\n");
      out.write("            sabado =  parseInt(resd[5]);\r\n");
      out.write("            domingo = parseInt(resd[6]);\r\n");
      out.write("            new Chartist.Line(\"#ventasemanal\",{\r\n");
      out.write("                labels: ['L','M','M','J','V','S','D'],\r\n");
      out.write("                series: [\r\n");
      out.write("                    [lunes,martes,miercoles,jueves,viernes,sabado,domingo]\r\n");
      out.write("                ]\r\n");
      out.write("            },{\r\n");
      out.write("                fullWidth: true\r\n");
      out.write("            }\r\n");
      out.write("            );\r\n");
      out.write("            $.post('dashboard/porcentaje_diario',{},function(res){\r\n");
      out.write("                $(\"#pocentaje_diario\").html(res);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        $.post('dashboard/mes',{},function(res){\r\n");
      out.write("            var resd = res.split('|');\r\n");
      out.write("            let m1 = parseInt(resd[0]);\r\n");
      out.write("            let m2 =  parseInt(resd[1]);\r\n");
      out.write("            let m3 =  parseInt(resd[2]);\r\n");
      out.write("            let m4 =  parseInt(resd[3]);\r\n");
      out.write("            let m5 =  parseInt(resd[4]);\r\n");
      out.write("            let m6 =  parseInt(resd[5]);\r\n");
      out.write("            let m7 = parseInt(resd[6]);\r\n");
      out.write("            let m8 = parseInt(resd[7]);\r\n");
      out.write("            let m9 = parseInt(resd[8]);\r\n");
      out.write("            let m10 = parseInt(resd[9]);\r\n");
      out.write("            let m11 = parseInt(resd[10]);\r\n");
      out.write("            let m12 = parseInt(resd[11]);\r\n");
      out.write("            new Chartist.Line(\"#ventasyear\",{\r\n");
      out.write("                labels: ['E','F','M','A','M','J','J','A','S','O','N','D'],\r\n");
      out.write("                series: [\r\n");
      out.write("                    [m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12]\r\n");
      out.write("                ]\r\n");
      out.write("                },{\r\n");
      out.write("                    fullWidth: true\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("            $.post('dashboard/porcentaje_mensual',{},function(res){\r\n");
      out.write("                $(\"#porcentaje_mensual\").html(res);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- ,{\r\n");
      out.write("            fullWidth: true,\r\n");
      out.write("            chartPadding:{\r\n");
      out.write("                right:40\r\n");
      out.write("            }\r\n");
      out.write("        } -->");
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
