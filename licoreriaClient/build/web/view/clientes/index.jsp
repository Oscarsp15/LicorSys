<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Cliente> clientes = port.listarClientes();
int cantidadClientes = clientes.size();

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
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Clientes</h4>
                        <p class="card-category">Lista de tus Clientes</p>
                    </div>
                    <div class="card-body table-responsive">
                        <div class="row">
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-info card-header-icon">
                                        <div class="card-icon">
                                            <i class="fa fa-user-check"></i>
                                        </div>
                                        <p class="card-category">Clientes</p>
                                        <h3 class="card-title"><%=cantidadClientes%></h3>
                                    </div>
                                    <div class="card-footer">
                                        <a href="nuevo.jsp" class="btn btn-sm btn-primary">
                                            <i class="fa fa-plus"></i> Nuevo Cliente
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <table id="tb-prov" class=" table table-sm table-hover table-striped">
                            <thead class="text-primary-amosis">
                                <tr>
                                    <th>N°</th>
                                    <th>Nombre</th>
                                    <th>Direccion</th>
                                    <th>Opcion</th>
                                </tr>
                            </thead>
                            <tbody id="table">
                                <%
                                    // List<UnidadMedida> unidades = port.listarUnidadesMedida();
                                    for (Cliente c : clientes) {
                                %>
                                <tr>                                   
                                    <td><%=c.getId()%></td>
                                    <td><%= c.getNombre()%></td>
                                    <td><%=c.getDireccion()%></td>
                                    <td>
                                        <a href="editar.jsp?cod_cliente=<%=c.getId()%>"><button type="button" class="btn btn-primary btn-sm">Editar</button></a>

                                        <button type="button"  class="btn btn-danger btn-sm eliminar" id="eliminar" data-cod-cliente= "<%=c.getId()%> ">Eliminar</button>
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
<jsp:include page="../templeate/footer.jsp" />
<script>
  
 $(document).on('click', '.eliminar', function() {
          let cod_cliente = $(this).data("cod-cliente");
         $.post('../../Cliente.do?action=Cliente_eliminar&cod_cliente='+cod_cliente,function(){
         showNotification('bottom','center','Tu cliente fue eliminado correctamente','success');
           setTimeout(function(){
                                location.reload();
                            },1000);
        
         })
      .fail(function() {
    // La solicitud falló
    showNotification('bottom', 'center', 'Hubo un problema al eliminar el cliente', 'danger');
});  
    });
</script>

   





