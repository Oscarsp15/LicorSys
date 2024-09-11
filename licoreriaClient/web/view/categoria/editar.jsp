<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    Categoria cate = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_cate"));
        cate = port.buscarCategoriaPorId(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        cate = new Categoria();
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
                        <h4 class="card-title">Categoria <%=cate.getId()%></h4>
                        <p class="card-category">Datos de la Categoria</p>
                    </div>
                    <div class="card-body">
                        
                        <!------FORMULARIO EDITAR--------->
                        <form autocomplete="off" action="../../Categoria.do" method="POST" data-form="save">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">ID Categoria</label>
                                        <input type="text" value="<%=cate.getId()%>" disabled class="form-control">
                                        <input name="id_agregar" type="hidden" value="<%=cate.getId()%>" class="form-control">
                                         <input name="action" type="hidden" value="Categoria_editar" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Nombre</label>
                                        <input name="nombre_agregar" type="text" value="<%=cate.getNombre()%>" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Detalle</label>
                                        <input name="detalle_agregar" type="text" class="form-control" value="<%=cate.getDescripcion()%>">
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

