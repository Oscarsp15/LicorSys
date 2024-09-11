
<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    Producto producto = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_producto"));
        producto = port.buscarProducto(id);
            
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        producto = new Producto();
    }
    
        List<Marca> marcas = port.listarMarcas();
        List<Categoria> categorias = port.listarCategorias();
        List<UnidadMedida> unidades = port.listarUnidadesMedida();
        
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
                    <h4 class="card-title">Producto </h4>
                    <p class="card-category">Datos del Producto</p>
                </div>
                <div class="card-body">
                    <form autocomplete="off" action = "../../Producto.do" method="POST" data-form="save" >
                        <div class="row">
                            <div class="col-md-2">
                                <div class="form-group">
                                    <label class="bmd-label-floating">ID del Producto</label>
                                    <input type="text" disabled value="" class="form-control">
                                    <input type="hidden" name="id_agregar" value="<%=producto.getId()%>" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Nombre del Producto</label>
                                    <input type="text" name="nombre_agregar" class="form-control" value="<%=producto.getNombre() %>">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Cod. Barras</label>
                                    <input type="number" name="barra" class="form-control" value="<%=producto.getCodigoBarra()%>">
                                    <input type="hidden" name="action" class="form-control" value="Producto_editar">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Stock Minimo</label>
                                    <input type="number" name="stock_agregar" class="form-control" value="<%=producto.getStockMinimo() %>">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Precio costo x unidad</label>
                                    <input type="number" name="pc_agregar" class="form-control" value="<%=producto.getPrecioCosto() %>">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Precio venta x unidad</label>
                                    <input type="text" name="pv_agregar" class="form-control" value="<%=producto.getPrecioVenta() %>">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Presentacion</label>
                                    <select name="unidad_agregar" class="custom-select">

                                        <%
                                            List<UnidadMedida> unidad = port.listarUnidadesMedida();
                                            for (UnidadMedida u : unidad) {
                                        %>

                                        <option value="<%=u.getId()%>"><%=u.getNombre()%></option>

                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Marca</label>
                                    <select name="marca_agregar" class="custom-select">

                                        <%
                                            for (Marca m : marcas) {
                                        %>

                                        <option value="<%=m.getId()%>"><%=m.getNombre()%></option>

                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Categoria</label>
                                    <select name="categoria_agregar" class="custom-select">

                                        <%
                                            for (Categoria c : categorias) {
                                        %>

                                        <option value="<%=c.getId()%>"><%=c.getNombre()%></option>

                                        <%}%>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Producto</button>                
                        <a href="index.jsp" class="btn btn-sm btn-rose pull-right">Regresar</a>                
                        <div class="RespuestaAjax"></div>
                    </form>
                </div>
            </div>
        </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />


