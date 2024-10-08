<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Producto> productos = port.listarProductos();
int cantidad = productos.size();
 HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesi�n "usuario" no est� presente
     System.out.println(sessionObj);
    if (sessionObj.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/view/login/");
    }else{
    Integer Value = (Integer) session.getAttribute("compras");
    if(Value == 0){
     response.sendRedirect(request.getContextPath() + "/view/acerca/");
    }
    }

%>

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Productos</h4>
                        <p class="card-category">Lista de tus Productos</p>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-info-amosis card-header-icon">
                                        <div class="card-icon">
                                            <i class="fa fa-box-open"></i>
                                        </div>
                                        <p class="card-category">Productos</p>
                                        <h3 class="card-title"><%=cantidad%></h3>
                                    </div>
                                    <div class="card-footer">
                                        <a href="nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                            <i class="fa fa-1x fa-plus"></i> Nuevo Producto
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-success card-header-icon">
                                        <div class="card-icon">
                                            <i class="fa fa-file-excel"></i>
                                        </div>
                                        <p class="card-category">Importar Productos desde</p>
                                        <h3 class="card-title">Excel</h3>
                                    </div>
                                    <div class="card-footer">
                                        <button type = "button" class="btn btn-sm btn-primary text-white" data-toggle="#" data-target="#">
                                            <i class="fa fa-1x fa-plus"></i> Importar
                                        </button>
                                         <div id="modal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                                            <div class="modal-dialog" role="document">
                                                <form autocomplete="off" id="importar" name="formulario_excel">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5>Importar Productos desde un excel</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="alert alert-warning">
                                                                <b>IMPORTANTE</b> para importar registros desde excel es importante que usted utilice la plantilla que genera el sistema. También asegurese de tener unidades de medida, marcas y categorias, con el fin de que su registros de la base de datos en la plantilla facilite su uso, y no de cualquier tipo de error.
                                                            </div>
                                                            <div class="custom-file-container" data-upload-id="myFirstImage">
                                                                <label>Subir archivo excel con la extencion .xlsx  <a href="javascript:void(0)" class="custom-file-container__image-clear" title="Clear Image">x</a></label>
                                                                <label class="custom-file-container__custom-file" >
                                                                    <input type="file" id="file" type="file" name="file[]" class="custom-file-container__custom-file__custom-file-input" accept=".xlsx">
                                                                    <input type="hidden" name="MAX_FILE_SIZE" value="10485760" />
                                                                    <span class="custom-file-container__custom-file__custom-file-control"></span>
                                                                </label>
                                                                <div class="custom-file-container__image-preview"></div>
                                                            </div>
                                                            <a href="<?=SERVERURL;?>productos/templeate/" target="_blank" class="btn btn-primary btn-block">Imprimir Plantilla de Excel</a>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="submit" id="btn-modal-agregar" class="btn btn-sm btn-primary">Guardar</button>
                                                        </div>
                                                    </div>
                                                    <div class="RespuestaAjax">

                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive">
                            <table id="tb-prov" class="table table-hover table-sm table-striped">
                                <thead class="text-primary-amosis">
                                    <tr>
                                        <th>C�digo</th>
                                        <th>Producto</th>
                                        <th>Cod. Barras</th>
                                        <th>Marca</th>
                                        <th>Categor�a</th>
                                        <th>Stock Min.</th>
                                        <th class="text-center">U.M</th>
                                        <th class="text-center">Opci�n</th>
                                    </tr>
                                </thead>
                                <tbody>
                                  <%
                                    List<Producto> producto = port.listarProductos();
                                    for (Producto p : producto) {
                                %>
                                <tr>                                   
                                    <td><%=p.getId() %></td>
                                    <td><%= p.getNombre() %></td>
                                    <td><%=p.getCodigoBarra() %></td>
                                    <td><%=p.getMarca().getNombre() %></td>
                                    <td><%=p.getCategoria().getNombre() %></td>
                                    <td><%=p.getStockMinimo() %></td>
                                    <td><%=p.getUnidadMedida().getNombre() %></td>
                                    
                                    <td><a href="editar.jsp?cod_producto=<%=p.getId()%>"  ><button type="button"  class="btn btn-primary btn-sm">Editar</button></a>
                                        
                                        <a type="button" href="../../Producto.do?action=Producto_eliminar&cod_producto=<%=p.getId()%>" class="btn btn-danger btn-sm">Eliminar</a></td>
                                        <%}%>
                                </tr>   
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />

<script>
    $(document).ready(function(){
        var firstUpload = new FileUploadWithPreview('myFirstImage');
    });
    $('#importar').submit(function(e){
        e.preventDefault();
        if(document.getElementById('file').files.length == 0){
            showNotification('bottom','center','No has seleccionado nada','danger');
        }else{
            showNotification('bottom','center','Enviando...','success');
            var Form = new FormData(document.forms.namedItem("formulario_excel"));
            $.ajax({
                url: "<?=SERVERURL;?>productos/exceltomysql/",
                type: "post",
                data : Form,
                processData: false,
                contentType: false,
                success: function(data)
                {
                    setTimeout(function(){
                        location.reload();
                    },1000);
                }
            }); 
        }
    });
</script>
