<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
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

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-1">
        </div>
        <div class="col-md-10">
            <div class="card">
                <div class="card-header card-header-amosis">
                    <h4 class="card-title">Nuevo Producto</h4>
                    <p class="card-category">Complete los datos del Producto</p>
                     <div class = "d-flex justify-content-end">
                         <a href="../marca/" class="btn btn-sm btn-info">Registrar Marca</a>
                         <a href="../unidadmedida/" class="btn btn-sm btn-info">Registrar Unidad de medida</a>
                         <a href="../categoria/" class="btn btn-sm btn-info">Registrar categoria</a>
                        </div>
                </div>
                
                 
                <div class="card-body">
                    <form autocomplete="off" action="../../Producto.do" method="Post">
                        <div class="row">
                            <div class="col-md-2">
                                <div class="form-group">
                                    <label class="bmd-label-floating">ID del Producto</label>
                                    <input type="text" disabled value="" class="form-control">
                                    <input type="hidden" name="id_agregar" value="" class="form-control">
                                    <input type="hidden" name="action" value="Producto_registrar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Nombre del Producto</label>
                                    <input type="text" name="nombre_agregar" class="form-control" required>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Cod. Barras</label>
                                    <input type="number" name="cod_agregar" class="form-control" required>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="">Stock Minimo</label>
                                    <input type="number" name="stock_agregar" class="form-control" required>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="">Precio Costo x Presentacion</label>
                                    <input type="text" name="pc_agregar" class="form-control" placeholder="1204.00" required>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="">Precio Venta x Presentacion</label>
                                    <input type="text" name="pv_agregar" class="form-control" placeholder="1244.00" required>
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
                      
                    </form>
                </div>
            </div>
        </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />

<script>
    $(document).ready(function(){
        let tocken = "evaluar";
        $.post('<?=SERVERURL;?>productos/marca_categoria/',{tocken},function(response){
            if(response == 1){
                showNotification('bottom','center','No tienes marcas','danger');
                setTimeout(function(){
                    location.href = "<?=SERVERURL;?>marca/";
                },1000);
            }else if(response == 2){
                showNotification('bottom','center','No tienes categorias','danger');
                setTimeout(function(){
                    location.href = "<?=SERVERURL;?>categoria/";
                },1000);
            }else if( response == 3){
                showNotification('bottom','center','No tienes Unidades de medida','danger');
                setTimeout(function(){
                    location.href = "<?=SERVERURL;?>unidadmedida/";
                },1000);
            }
        });
    });
    $("#formulario").submit(function(e){
        e.preventDefault();
        var Form = new FormData(document.forms.namedItem("formulario"));
        $.ajax({
            url: "<?=SERVERURL;?>productos/agregar_producto",
            type: "post",
            data : Form,
            processData: false,
            contentType: false,
            success: function(data)
            {
                if(data == 1){
                    showNotification('bottom','center','Tu producto fue agregado correctamente','success');
                    setTimeout(function(){
                        location.reload();
                    },1000);
                }else if(data == 0){
                    showNotification('bottom','center','Tu codigo de barras ya existe','danger');
                }else{
                    showNotification('bottom','center','No se pudo agregar producto','danger');
                }
            }
        }); 
        
    });
</script>
