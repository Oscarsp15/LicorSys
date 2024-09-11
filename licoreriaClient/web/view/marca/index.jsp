<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Marca> marca = port.listarMarcas();
int cantidadMarcas = marca.size();

 HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesión "usuario" no está presente
     System.out.println(sessionObj);
    if (sessionObj.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/view/login/");
    }else{
    Integer Value = (Integer) session.getAttribute("marca");
    if(Value == 0){
     response.sendRedirect(request.getContextPath() + "/view/acerca/");
    }
    }

%>

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Marcas</h4>
                        <p class="card-category">Lista de tus Marcas</p>
                    </div>
                    <div class="card-body table-responsive">
                        <div class="row">
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-info card-header-icon">
                                        <div class="card-icon">
                                            <i class="fa fa-street-view"></i>
                                        </div>
                                        <p class="card-category">Marcas</p>
                                        <h3 class="card-title"><%= cantidadMarcas %></h3>
                                    </div>
                                    <div class="card-footer">
                                        <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#modal">
                                            <i class="fa fa-plus"></i> Nueva Marca
                                        </button>
                                     <a href="../productos/nuevo.jsp" class="btn btn-rose btn-sm pull-right">Regresar</a> 
                                        <div id="modal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                                            <div class="modal-dialog" role="document">
                                                
                                                <!--GUARDAR-->
                                                <form autocomplete="off" action = "../../Marca.do" >
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5>Nueva Marca</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                            
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="row">
                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <label class="bmd-label-floating">Nombre de la Marca</label>
                                                                        <input type="text" name="nombre-agregar" class="form-control" required>
                                                                        <input type="hidden" name="action" value="Marca_registrar">
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <div class="form-group bmd-form-group">
                                                                            <label class="bmd-label-floating"> Detalle de la Marca</label>
                                                                            <textarea name="detalle-agregar" class="form-control" rows="5"></textarea>
                                                                        </div>
                                                                    </div> 
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="submit" class="btn btn-sm btn-primary">Guardar</button>
                                                        </div>
                                                    </div>
                                                    <!--div class="RespuestaAjax">

                                                    </div--->
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <table id="tb-prov" class="table table-sm table-hover table-striped">
                            <thead class="text-primary-amosis">
                                <tr>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Detalle</th>
                                    <th>Opcion</th>
                                </tr>
                            </thead>
                            <tbody id="table">
                                <%
                                    List<Marca> marcas = port.listarMarcas();
                                    for (Marca m : marcas) {
                                %>
                                <tr>                                   
                                    <td><%=m.getId()%></td>
                                    <td><%= m.getNombre()%></td>
                                    <td><%=m.getDescripcion()%></td>
                                    <td>
                                        <a href="editar.jsp?cod_marca=<%=m.getId()%>"  ><button type="button"  class="btn btn-primary btn-sm">Editar</button></a>

                                       <a href="../../Marca.do?action=Marca_eliminar&cod_marca=<%=m.getId()%>"> <button type="button"  class="btn btn-danger btn-sm">Eliminar</button> </a>
                                    </td>
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
<div class="modal fade" id="editmarca" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">EDITAR PRODUCTO</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">X</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12" id="modal-body">
                            
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" id="btn-modal-actualizar" class="btn btn-success">Guardar</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />
