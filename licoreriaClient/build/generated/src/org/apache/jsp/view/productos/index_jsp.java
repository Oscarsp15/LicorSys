package org.apache.jsp.view.productos;

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
List<Producto> productos = port.listarProductos();
int cantidad = productos.size();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header card-header-amosis\">\r\n");
      out.write("                        <h4 class=\"card-title\">Productos</h4>\r\n");
      out.write("                        <p class=\"card-category\">Lista de tus Productos</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card card-stats\">\r\n");
      out.write("                                    <div class=\"card-header card-header-info-amosis card-header-icon\">\r\n");
      out.write("                                        <div class=\"card-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-box-open\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"card-category\">Productos</p>\r\n");
      out.write("                                        <h3 class=\"card-title\">");
      out.print(cantidad);
      out.write("</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <a href=\"nuevo.jsp\" class=\"btn btn-sm btn-primary text-white\">\r\n");
      out.write("                                            <i class=\"fa fa-1x fa-plus\"></i> Nuevo Producto\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card card-stats\">\r\n");
      out.write("                                    <div class=\"card-header card-header-success card-header-icon\">\r\n");
      out.write("                                        <div class=\"card-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-file-excel\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"card-category\">Importar Productos desde</p>\r\n");
      out.write("                                        <h3 class=\"card-title\">Excel</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <button type = \"button\" class=\"btn btn-sm btn-primary text-white\" data-toggle=\"#\" data-target=\"#\">\r\n");
      out.write("                                            <i class=\"fa fa-1x fa-plus\"></i> Importar\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                         <div id=\"modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                                            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                                <form autocomplete=\"off\" id=\"importar\" name=\"formulario_excel\">\r\n");
      out.write("                                                    <div class=\"modal-content\">\r\n");
      out.write("                                                        <div class=\"modal-header\">\r\n");
      out.write("                                                            <h5>Importar Productos desde un excel</h5>\r\n");
      out.write("                                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                                <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                                            </button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-body\">\r\n");
      out.write("                                                            <div class=\"alert alert-warning\">\r\n");
      out.write("                                                                <b>IMPORTANTE</b> para importar registros desde excel es importante que usted utilice la plantilla que genera el sistema. TambiÃ©n asegurese de tener unidades de medida, marcas y categorias, con el fin de que su registros de la base de datos en la plantilla facilite su uso, y no de cualquier tipo de error.\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"custom-file-container\" data-upload-id=\"myFirstImage\">\r\n");
      out.write("                                                                <label>Subir archivo excel con la extencion .xlsx  <a href=\"javascript:void(0)\" class=\"custom-file-container__image-clear\" title=\"Clear Image\">x</a></label>\r\n");
      out.write("                                                                <label class=\"custom-file-container__custom-file\" >\r\n");
      out.write("                                                                    <input type=\"file\" id=\"file\" type=\"file\" name=\"file[]\" class=\"custom-file-container__custom-file__custom-file-input\" accept=\".xlsx\">\r\n");
      out.write("                                                                    <input type=\"hidden\" name=\"MAX_FILE_SIZE\" value=\"10485760\" />\r\n");
      out.write("                                                                    <span class=\"custom-file-container__custom-file__custom-file-control\"></span>\r\n");
      out.write("                                                                </label>\r\n");
      out.write("                                                                <div class=\"custom-file-container__image-preview\"></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <a href=\"<?=SERVERURL;?>productos/templeate/\" target=\"_blank\" class=\"btn btn-primary btn-block\">Imprimir Plantilla de Excel</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"modal-footer\">\r\n");
      out.write("                                                            <button type=\"submit\" id=\"btn-modal-agregar\" class=\"btn btn-sm btn-primary\">Guardar</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"RespuestaAjax\">\r\n");
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table id=\"tb-prov\" class=\"table table-hover table-sm table-striped\">\r\n");
      out.write("                                <thead class=\"text-primary-amosis\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Código</th>\r\n");
      out.write("                                        <th>Producto</th>\r\n");
      out.write("                                        <th>Cod. Barras</th>\r\n");
      out.write("                                        <th>Marca</th>\r\n");
      out.write("                                        <th>Categoría</th>\r\n");
      out.write("                                        <th>Stock Min.</th>\r\n");
      out.write("                                        <th class=\"text-center\">U.M</th>\r\n");
      out.write("                                        <th class=\"text-center\">Opción</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                  ");

                                    List<Producto> producto = port.listarProductos();
                                    for (Producto p : producto) {
                                
      out.write("\r\n");
      out.write("                                <tr>                                   \r\n");
      out.write("                                    <td>");
      out.print(p.getId() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( p.getNombre() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getCodigoBarra() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getMarca().getNombre() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getCategoria().getNombre() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getStockMinimo() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print(p.getUnidadMedida().getNombre() );
      out.write("</td>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <td><a href=\"editar.jsp?cod_producto=");
      out.print(p.getId());
      out.write("\"  ><button type=\"button\"  class=\"btn btn-primary btn-sm\">Editar</button></a>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <a type=\"button\" href=\"../../Producto.do?action=Producto_eliminar&cod_producto=");
      out.print(p.getId());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a></td>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                </tr>   \r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../templeate/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        var firstUpload = new FileUploadWithPreview('myFirstImage');\r\n");
      out.write("    });\r\n");
      out.write("    $('#importar').submit(function(e){\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        if(document.getElementById('file').files.length == 0){\r\n");
      out.write("            showNotification('bottom','center','No has seleccionado nada','danger');\r\n");
      out.write("        }else{\r\n");
      out.write("            showNotification('bottom','center','Enviando...','success');\r\n");
      out.write("            var Form = new FormData(document.forms.namedItem(\"formulario_excel\"));\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"<?=SERVERURL;?>productos/exceltomysql/\",\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                data : Form,\r\n");
      out.write("                processData: false,\r\n");
      out.write("                contentType: false,\r\n");
      out.write("                success: function(data)\r\n");
      out.write("                {\r\n");
      out.write("                    setTimeout(function(){\r\n");
      out.write("                        location.reload();\r\n");
      out.write("                    },1000);\r\n");
      out.write("                }\r\n");
      out.write("            }); \r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
