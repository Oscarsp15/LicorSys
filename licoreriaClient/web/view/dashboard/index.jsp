<%@page import="java.util.*"%>
<%@page import="clases.*"%>


<jsp:include page="../templeate/head.jsp" />

<%
clases.NewWebService_Service server = new clases.NewWebService_Service();
NewWebService port = server.getNewWebServicePort();
List<Producto> productos = port.listarProductos();
int cantidad = productos.size();
List<Empleado> empleados = port.listarEmpleados();
int cantidademp = empleados.size();
List<Cliente> clientes = port.listarClientes();
int cantidadcli = clientes.size();
List<Proveedor> proveedores = port.proveedorListar();
int cantidadprov = proveedores.size();
 

  HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesión "usuario" no está presente
     System.out.println(sessionObj);
    if (sessionObj.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/view/login/");
    }else{
    Integer dashboardValue = (Integer) session.getAttribute("dashboard");
    if(dashboardValue == 0){
     response.sendRedirect(request.getContextPath() + "/view/acerca/");
    }
    
    }
  
%>
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6">
              <div class="card card-chart">
                <div class="card-header card-header-success">
                  <div class="ct-chart" id="ventasemanal"></div>
                </div>
                <div class="card-body">
                    <h4 class="card-title">Venta Semanal</h4>
                    <p class="card-category" id="pocentaje_diario">
                        
                    </p>
                </div>
                <div class="card-footer">
                  <div class="stats">
                    Actualizado Ahora
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="card card-chart">
                <div class="card-header card-header-info">
                  <div class="ct-chart" id="ventasyear"></div>
                </div>
                <div class="card-body">
                  <h4 class="card-title">Ventas Mensuales</h4>
                  <p class="card-category"  id="porcentaje_mensual">
                   </p>
                </div>
                <div class="card-footer">
                  <div class="stats">
                    Actualizado Ahora
                  </div>
                </div>
              </div>
            </div>
        </div>
        
        
        <div class="row">
            <div class="col-md-3 col-sm-4">
                <div class="card card-stats">
                    <div class="card-header card-header-product-amosis card-header-icon">
                        <div class="card-icon" data-header-animation="true">
                            <i class="fa fa-box-open"></i>
                        </div>
                        <p class="card-category">Productos</p>
                        <h3 class="card-title"><%=cantidad%></h3>
                    </div>
                    <div class="card-footer">
                        <a href="../productos/nuevo.jsp" class="btn btn-sm btn-primary text-white">
                            <i class="fa fa-1x fa-plus"></i> Nuevo Producto
                        </a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-4">
                        <div class="card card-stats">
                            <div class="card-header card-header-amosis card-header-icon">
                                <div class="card-icon" data-header-animation="true">
                                    <i class="fa fa-user"></i>
                                </div>
                                <p class="card-category">Personal</p>
                                <h3 class="card-title"><%=cantidademp%></h3>
                            </div>
                            <div class="card-footer">
                                <a href="../persona/nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                    <i class="fa fa-1x fa-plus"></i> Nuevo Personal
                                </a>
                            </div>
                        </div>
            </div>
              <div class="col-md-3 col-sm-4">
                                <div class="card card-stats">
                                    <div class="card-header card-header-info card-header-icon">
                                        <div class="card-icon" data-header-animation="true">
                                            <i class="fa fa-user-check"></i>
                                        </div>
                                        <p class="card-category">Clientes</p>
                                        <h3 class="card-title"><%=cantidadcli%></h3>
                                    </div>
                                    <div class="card-footer">
                                        <a href="../clientes/nuevo.jsp" class="btn btn-sm btn-primary">
                                            <i class="fa fa-plus"></i> Nuevo Cliente
                                        </a>
                                    </div>
                                </div>
             </div>
             <div class="col-md-3 col-sm-4">
                    <div class="card card-stats">
                        <div class="card-header card-header-gold card-header-icon">
                            <div class="card-icon" data-header-animation="true">
>
                                <i class="fa fa-truck"></i>
                            </div>
                            <p class="card-category">Proveedores</p>
                            <h3 class="card-title"><%=cantidadprov%></h3>
                        </div>
                        <div class="card-footer">
                            <a href="../proveedor/nuevo.jsp" class="btn btn-sm btn-primary text-white">
                                <i class="fa fa-1x fa-plus"></i> Nuevo Proveedor
                            </a>
                        </div>
                    </div>
                </div>            
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />

<script>
    $(document).ready(function(){
        let lunes = 0;
        let martes = 0;
        let miercoles = 0;
        let jueves = 0;
        let viernes = 0;
        let sabado = 0;
        let domingo = 0;
        $.post('dashboard/dia',{},function(res){
            var resd = res.split('|');
            lunes = parseInt(resd[0]);
            martes =  parseInt(resd[1]);
            miercoles =  parseInt(resd[2]);
            jueves =  parseInt(resd[3]);
            viernes =  parseInt(resd[4]);
            sabado =  parseInt(resd[5]);
            domingo = parseInt(resd[6]);
            new Chartist.Line("#ventasemanal",{
                labels: ['L','M','M','J','V','S','D'],
                series: [
                    [lunes,martes,miercoles,jueves,viernes,sabado,domingo]
                ]
            },{
                fullWidth: true
            }
            );
            $.post('dashboard/porcentaje_diario',{},function(res){
                $("#pocentaje_diario").html(res);
            });
        });
        $.post('dashboard/mes',{},function(res){
            var resd = res.split('|');
            let m1 = parseInt(resd[0]);
            let m2 =  parseInt(resd[1]);
            let m3 =  parseInt(resd[2]);
            let m4 =  parseInt(resd[3]);
            let m5 =  parseInt(resd[4]);
            let m6 =  parseInt(resd[5]);
            let m7 = parseInt(resd[6]);
            let m8 = parseInt(resd[7]);
            let m9 = parseInt(resd[8]);
            let m10 = parseInt(resd[9]);
            let m11 = parseInt(resd[10]);
            let m12 = parseInt(resd[11]);
            new Chartist.Line("#ventasyear",{
                labels: ['E','F','M','A','M','J','J','A','S','O','N','D'],
                series: [
                    [m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12]
                ]
                },{
                    fullWidth: true
                }
            );
            $.post('dashboard/porcentaje_mensual',{},function(res){
                $("#porcentaje_mensual").html(res);
            });
        });
    });
</script>
<!-- ,{
            fullWidth: true,
            chartPadding:{
                right:40
            }
        } -->