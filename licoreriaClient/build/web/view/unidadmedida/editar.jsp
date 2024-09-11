<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    UnidadMedida unidad = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_unidad"));
        unidad = port.buscarUnidadMedidaPorId(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        unidad = new UnidadMedida();
    }
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

<jsp:include page="../templeate/head.jsp" />

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-1">
            </div>
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Unidad <%=unidad.getId()%></h4>
                        <p class="card-category">Datos de la Unidad de Medida</p>
                    </div>
                    <div class="card-body">
                        
                        <!------FORMULARIO EDITAR--------->
                        <form autocomplete="off" action="../../Unidad.do" method="POST" data-form="save">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">ID Categoria</label>
                                        <input type="text" value="<%=unidad.getId()%>" disabled class="form-control">
                                        <input name="id_agregar" type="hidden" value="<%=unidad.getId()%>" class="form-control">
                                        <input name="action" type="hidden" value="Unidad_editar" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Nombre</label>
                                        <input name="nombre_agregar" type="text" value="<%=unidad.getNombre()%>" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Detalle</label>
                                        <input name="detalle_agregar" type="text" class="form-control" value="<%=unidad.getDescripcion()%>">
                                    </div>
                                </div>                 
                            </div>
                             
                            <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Marca</button>
                            <a class="btn btn-rose btn-sm pull-right" href="index.jsp">Regresar</a>
                            <div class="RespuestaAjax">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />
