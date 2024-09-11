<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    Cliente cliente = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_cliente"));
        cliente = port.buscarClientePorId(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        cliente = new Cliente();
    }
%>

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

<jsp:include page="../templeate/head.jsp" />
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
        </div>
        <div class="col-md-6">
            <div class="card">
                <div class="card-header card-header-amosis">
                    <h4 class="card-title">Cliente</h4>
                    <p class="card-category">Datos del Cliente</p>
                </div>
                <div class="card-body">
                    
                    <!------FORMULARIO EDITAR----->
                    <form autocomplete="off"  data-form="save">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="control-label">N° Documento del cliente</label>
                                    <input type="text" value="<%=cliente.getId()%>" disabled class="form-control">
                                    <input type="hidden" value="<%=cliente.getId()%>" name="id_agregar" class="form-control">
                                    <input name="action" type="hidden" value="Cliente_editar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="control-label">Nombre del completo Cliente</label>
                                    <input type="text" id="nombre" value="<%=cliente.getNombre()%>"  name="nombre_agregar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="control-label">Direccion</label>
                                    <input type="text" id="direccion" value="<%=cliente.getDireccion()%>"  name="direccion_agregar" class="form-control">
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
                    showNotification('bottom', 'center', 'Cliente actualizado correctamente', 'success');

                
            })
            .fail(function() {
                // Muestra un mensaje de error si la solicitud falla
                showNotification('bottom', 'center', 'Hubo un problema al actualizar el cliente', 'danger');
            });
        });
    });
</script>
