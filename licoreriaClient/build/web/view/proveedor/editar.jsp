<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    Proveedor prov = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_proveedor"));
        prov = port.listCod(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        prov = new Proveedor();
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
                        <h4 class="card-title">Proveedor <%=prov.getIdProveedor()%></h4>
                        <p class="card-category">Datos del Proveedor</p>
                    </div>
                    <div class="card-body">
                        <form autocomplete="off" action="../../Proveedor.do" method="POST" data-form="save">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">ID Proveedor</label>
                                        <input type="text" value="<%=prov.getIdProveedor()%>" disabled class="form-control">
                                        <input name="id_agregar" type="hidden" value="<%=prov.getIdProveedor()%>" class="form-control">
                                        <input name="action" type="hidden" value="Proveedor_editar" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Ruc</label>
                                        <input name="ruc_agregar" type="text" value="<%=prov.getRuc()%>" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Razón Social</label>
                                        <input name="rs_agregar" type="text" class="form-control" value="<%=prov.getRazonSocial() %>">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">E-mail</label>
                                        <input name="email_agregar" type="email" class="form-control" value="<%=prov.getEmail()%>" >
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Teléfono</label>
                                        <input name="telefono_agregar" type="text" class="form-control" value="<%=prov.getTelefono()%>">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Dirección</label>
                                        <input name="direccion_agregar" type="text" class="form-control" value="<%=prov.getDireccion()%>">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">DNI del Reprentante</label>
                                        <input name="dni_agregar" type="text" class="form-control" value="<%=prov.getDni()%>">
                                    </div>
                                </div>
                            </div>
                            
                            <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Proveedor</button>
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

