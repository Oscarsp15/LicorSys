<%
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
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Almacen</h4>
                        <p class="card-category">Lista de Productos en Almacen</p>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-gold card-header-icon">
                                        <div class="card-icon">
                                            <i class="fa fa-exclamation-triangle"></i>
                                        </div>
                                        <p class="card-category">Productos con stock bajo</p>
                                        <h3 class="card-title">0</h3>
                                    </div>
                                    <div class="card-footer">
                                        <div class="stats">
                                            Actualizado hace un momento
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-success-amosis card-header-icon">
                                        <div class="card-icon">
                                            <i class="fas fa-dollar-sign"></i>
                                        </div>
                                        <p class="card-category">Valor de Inventario</p>
                                        <h3 class="card-title">S./ 20000</h3>
                                    </div>
                                    <div class="card-footer">
                                        <div class="stats">
                                            Actualizado hasta el momento
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-6">
                                <div class="card card-stats">
                                    <div class="card-header card-header-categoria-amosis card-header-icon">
                                        <div class="card-icon">
                                            <i class="fas fa-print"></i>
                                        </div>
                                        <p class="card-category">Imprimir Reporte de inventario</p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="stats">
                                            <a href="<?=SERVERURL;?>productos/imprimir/" target="_blank" class="btn btn-sm btn-primary text-white">
                                                PDF
                                            </a>
                                            <a href="<?=SERVERURL;?>almacen/excelproducto/" target="_blank" class="btn btn-sm btn-primary text-white">
                                                EXCEL
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>  
                        </div>
                        <table id="example" class="table table-hover table-sm table-striped">
                            <thead class="text-primary-amosis">
                                <tr>
                                    <th>N° &nbsp; </th>
                                    <th>Producto</th>
                                    <th>Stock</th>
                                    <th>Precio costo x UM</th>
                                    <th>Precio venta x UM</th>
                                    <th>Marca</th>
                                    <th>Categoria</th>
                                </tr>
                            </thead>
                            <tbody>

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
    $('#example').DataTable({        
        language: {
                "lengthMenu": "Mostrar _MENU_ registros",
                "zeroRecords": "No se encontraron resultados",
                "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
                "infoFiltered": "(filtrado de un total de _MAX_ registros)",
                "sSearch": "Buscar:",
                "oPaginate": {
                    "sFirst": "Primero",
                    "sLast":"Ãšltimo",
                    "sNext":"Siguiente",
                    "sPrevious": "Anterior"
			     },
			     "sProcessing":"Procesando...",
            },
        //para usar los botones   
        responsive: "true"	        
    });     

</script>