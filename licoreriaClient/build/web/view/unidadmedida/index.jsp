<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<UnidadMedida> unidad = port.listarUnidadesMedida();
int cantidadUnidades = unidad.size();

 HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesión "usuario" no está presente
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
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <div class="card">
            <div class="card-header card-header-amosis">
                <h4 class="card-title">Unidades de Medida</h4>
                <p class="card-category">Lista de tus Unidades de Medida</p>
            </div>
            <div class="card-body table-responsive">
            <div class="row">
                <div class="col-md-4 col-sm-6">
                    <div class="card card-stats">
                    <div class="card-header card-header-info-amosis card-header-icon" >
                        <div class="card-icon" >
                        <i class="fa fa-balance-scale-right"></i>
                        </div>
                        <p class="card-category">Unidades de Medida</p>
                        <h3 class="card-title"><%=cantidadUnidades%></h3>
                    </div>
                    <div class="card-footer">
                        <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#modal">
                        <i class="fa fa-plus"></i> Nueva Unidad de Medida
                        </button>
                        <a href="../productos/nuevo.jsp" class="btn btn-rose btn-sm pull-right">Regresar</a> 
                        <div id="modal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5>Nueva Unidad de Medida</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    
                                    <!--Formulario NUEVO-->
                                    <form autocomplete="off" action="../../Unidad.do" method="Post"> 
                                        <div class="modal-body">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Prefijo</label>
                                                        <input type="text" name="prefijo_agregar" required class="form-control">
                                                        <input name="action" type="hidden" value="Unidad_registrar" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <div class="form-group">
                                                            <label class="bmd-label-floating">Detalle de la Unidad de Medida</label>
                                                            <input type="text" name="detalle_agregar" class="form-control">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                           
                                            <button type="submit" class="btn btn-sm btn-primary">Guardar</button>
                                        </div>
                                        
                                    </form>
                                </div>
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
                        <th>Prefijo</th>
                        <th>Detalle</th>
                        <th class="text-center">Opcion</th>
                    </tr>
                </thead>
                <tbody id="table">
                    <%
                       // List<UnidadMedida> unidades = port.listarUnidadesMedida();
                        for (UnidadMedida u : unidad) {
                    %>
                    <tr>                                   
                        <td><%=u.getId()%></td>
                        <td><%= u.getNombre()%></td>
                        <td><%=u.getDescripcion()%></td>
                        <td>
                            <a href="editar.jsp?cod_unidad=<%=u.getId()%>"><button type="button" class="btn btn-primary btn-sm">Editar</button></a>

                            <a href="../../Unidad.do?action=Unidad_eliminar&cod_unidad=<%=u.getId()%>"> <button type="button"  class="btn btn-danger btn-sm" onclick="eliminarUnidad()" >Eliminar</button></a>
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
<div class="modal fade" id="modal-editar" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">EDITAR UNIDAD DE MEDIDA</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">Ã—</span>
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




























