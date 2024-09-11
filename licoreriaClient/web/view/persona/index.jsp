<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Empleado> empleados = port.listarEmpleados();
int cantidadEmpleados = empleados.size();

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
                    <h4 class="card-title">Personal</h4>
                    <p class="card-category">Lista de tu personal</p>
                </div>
                <div class="card-body table-responsive">
                    <div class="col-md-4 col-sm-6">
                        <div class="card card-stats">
                            <div class="card-header card-header-amosis card-header-icon">
                                <div class="card-icon">
                                    <i class="fa fa-user"></i>
                                </div>
                                <p class="card-category">Personal</p>
                                <h3 class="card-title"><%=cantidadEmpleados%></h3>
                            </div>
                            <div class="card-footer">
                                <a href="nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                    <i class="fa fa-1x fa-plus"></i> Nuevo Personal
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="table-responsive">
                        <table id="tb-prov" class="table table-sm table-hover table-striped">
                            <thead class="text-primary-amosis">
                                <th class="text-center">ID</th>
                                <th>NOMBRES</th>
                                <th>APELLIDOS</th>
                                <th>DNI</th>
                                <th>DIRECCION</th>
                                <th>SEDE</th>
                                <th>OPCION</th>
                            </thead>
                            <tbody>
                             <%
                                    for (Empleado e : empleados) {
                                %>
                                <tr>                                   
                                    <td><%=e.getId()%></td>
                                    <td><%=e.getNombres()%></td>
                                    <td><%= e.getApellidos()%></td>
                                    <td><%=e.getDni()%></td>
                                    <td><%=e.getDireccion()%></td>
                                    <td><%=e.getSede().getDireccion()%></td>
                                    <td>
                                        <a href="editar.jsp?cod_empleado=<%=e.getId()%>"  ><button type="button"  class="btn btn-primary btn-sm">Editar</button></a>

                                       <a href="../../Personal.do?action=Personal_eliminar&cod_empleado=<%=e.getId()%>"> <button type="button"  class="btn btn-danger btn-sm" onclick="eliminarPersonal()" >Eliminar</button> </a>
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

