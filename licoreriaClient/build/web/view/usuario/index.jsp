<%@page import="java.util.*"%>
<%@page import="clases.*"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>


<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Usuario> usuarios = port.listarUsuarios();
int cantidadUsuarios = usuarios.size();

 HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesión "usuario" no está presente
     System.out.println(sessionObj);
    if (sessionObj.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/view/login/");
    }else{
    Integer Value = (Integer) session.getAttribute("admin");
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
                <h4 class="card-title">Usuario</h4>
                <p class="card-category">Lista de tus usuarios</p>
            </div>
                <div class="card-body table-responsive">
                    <div class="row">
                        <div class="col-md-4 col-sm-6">
                            <div class="card card-stats">
                                <div class="card-header card-header-amosis card-header-icon">
                                    <div class="card-icon">
                                        <i class="fa fa-users"></i>
                                    </div>
                                    <p class="card-category">Usuarios</p>
                                    <h3 class="card-title"><%=cantidadUsuarios%></h3>
                                </div>
                                <div class="card-footer">
                                    <a href="nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                        <i class="fa fa-1x fa-plus"></i> Nuevo Usuario
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                <div class="table-responsive">
                    <table id="tb-prov" class=" table table-sm table-hover table-striped">
                        <thead class="text-primary-amosis">
                            <tr>
                            <th>Codigo</th>
                            <th>Nombre</th>
                            <th>Usuario</th>
                            <th>Password</th>
                            <th>Privilegio</th>
                            <th>Opcion</th>
                            </tr>
                        </thead>
                        <tbody id="table">
                            <%
                                for (Usuario u : usuarios) {
                            %>
                            <tr>                                   
                                <td><%=u.getId()%></td>
                                <td><%= u.getEmpleado().getNombres()%></td>
                                <td><%=u.getUsuario()%></td>
                                <td><%=u.getPassword()%></td>
                                <% if (u.getAdmin() == 1) {%>
                                <td>Administrador</td>
                                <%} else {%>
                                <td>Empleado</td>
                                    <%}%>
                                <td>
                                    <a href="editar.jsp?cod_usuario=<%=u.getId()%>"><button type="button" class="btn btn-primary btn-sm">Editar</button></a>

                                    <button type="button"  class="btn btn-danger btn-sm eliminar" id="eliminar" data-cod-usuario= "<%=u.getId()%> ">Eliminar</button>
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
</div>
<jsp:include page="../templeate/footer.jsp" />

<script>
  
 $(document).on('click', '.eliminar', function() {
          let cod_usuario = $(this).data("cod-usuario");
         $.post('../../Usuario.do?action=Usuario_eliminar&cod_usuario='+cod_usuario,function(){
         showNotification('bottom','center','Tu usuario fue eliminado correctamente','success');
           setTimeout(function(){
                                location.reload();
                            },1000);
        
         })
      .fail(function() {
    // La solicitud falló
    showNotification('bottom', 'center', 'Hubo un problema al eliminar el usuario', 'danger');
});  
    });
</script>

