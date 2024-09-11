
<%@page import="java.util.*"%>
<%@page import="clases.*"%>
<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Proveedor> prov = port.proveedorListar();
int cantidadProveedores = prov.size();

    HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesi�n "usuario" no est� presente
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
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <div class="card">
            <div class="card-header card-header-amosis">
                <h4 class="card-title">Proveedores</h4>
                <p class="card-category">Lista de tus Proveedores</p>
            </div>
            <div class="card-body table-responsive">
                <div class="col-md-4 col-sm-6">
                    <div class="card card-stats">
                        <div class="card-header card-header-gold card-header-icon">
                            <div class="card-icon">
                                <i class="fa fa-truck"></i>
                            </div>
                            <p class="card-category">Proveedores</p>
                            <h3 class="card-title"><%=cantidadProveedores%></h3>
                        </div>
                        <div class="card-footer">
                            <a href="nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                <i class="fa fa-1x fa-plus"></i> Nuevo Proveedor
                            </a>
                        </div>
                    </div>
                </div>
                <div class="table-responsive">
                    <table id="tb-prov" class="table table-sm table-hover table-striped">
                        <thead class="text-primary-amosis">
                            <th>C�digo</th>
                            <th>RUC</th>
                            <th>R.S</th>
                            <th>Telefono</th>
                            <th>Opci�n</th>
                            </thead>
                            <tbody>
                                <%
                                    List<Proveedor> prove = port.proveedorListar();
                                    for (Proveedor p : prove) {
                                %>
                                <tr>                                   
                                    <td><%=p.getIdProveedor()%></td>
                                    <td><%= p.getRuc()%></td>
                                    <td><%=p.getRazonSocial()%></td>
                                    <td><%=p.getTelefono()%></td>
                                  
                                        
                                        <td><a href="editar.jsp?cod_proveedor=<%=p.getIdProveedor()%>"><button type="button"  class="btn btn-primary btn-sm">Editar</button></a>  
                                        
                                           <a href="../../Proveedor.do?action=Proveedor_eliminar&cod_proveedor=<%=p.getIdProveedor()%>"><button type="button"  class="btn btn-danger btn-sm" onclick="eliminarProveedor()" >Eliminar</button></a></td>
                                        
                                       
                                   

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
    // Funci�n para mostrar la alerta cuando se elimina un proveedor
    function eliminarProveedor() {
        // Puedes personalizar el mensaje de la alerta seg�n tus necesidades
        alert('Proveedor eliminado exitosamente.');
    }
</script>