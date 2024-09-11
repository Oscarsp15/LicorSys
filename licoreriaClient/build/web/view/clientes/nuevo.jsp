<jsp:include page="../templeate/head.jsp" />


<%
    HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesión "usuario" no está presente
     System.out.println(sessionObj);
    if (sessionObj.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/view/login/");
    }else{
    Integer Value = (Integer) session.getAttribute("ventas");
    if(Value == 0){
     response.sendRedirect(request.getContextPath() + "/view/acerca/");
    }
    }
    
 %> 
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
        </div>
        <div class="col-md-6">
            <div class="card">
                <div class="card-header card-header-amosis">
                    <h4 class="card-title">Nuevo Cliente</h4>
                    <p class="card-category">Complete los datos del Cliente</p>
                </div>
                <div class="card-body">
                    <form autocomplete="off" action = "../../Cliente.do" method="POST" data-form="save">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="bmd-label-floating">N° Documento del cliente</label>
                                    <input type="number" id="numero" name="id_agregar" disabled="" class="form-control">
                                    <input name="action" type="hidden" value="Cliente_registrar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="control-label">Nombre del completo Cliente</label>
                                    <input type="text" id="nombre" name="nombre_agregar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="control-label">Direccion</label>
                                    <input type="text" id="direccion" name="direccion_agregar" class="form-control">
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Cliente</button>                
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
<script>
    $(document).ready(function() {
        $("form[data-form='save']").submit(function(event) {
            event.preventDefault(); // Evita que se realice el envío normal del formulario

            $.post('../../Cliente.do', $(this).serialize(), function() {
                // Verifica la respuesta del servidor
              
                    // Muestra un mensaje de éxito
                    showNotification('bottom', 'center', 'Cliente agregado correctamente', 'success');

                
            })
            .fail(function() {
                // Muestra un mensaje de error si la solicitud falla
                showNotification('bottom', 'center', 'Hubo un problema al actualizar el cliente', 'danger');
            });
        });
    });
</script>

