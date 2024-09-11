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
            <div class="col-md-3 col-sm-4">
                <div class="card card-stats">
                    <div class="card-header card-header-success-amosis card-header-icon">
                        <div class="card-icon" data-header-animation="true">
                            <i class="fa fa-calendar"></i>
                        </div>
                        <p class="card-category">Fecha Inicio</p>
                        <h3 class="card-title">
                      --/--/----</h3>
                    </div>
                    <div class="card-footer">
                        <div class="stats">
                   Fecha de inicio
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-4">
                <div class="card card-stats">
                    <div class="card-header card-header-product-amosis card-header-icon">
                        <div class="card-icon" data-header-animation="true">
                            <i class="fa fa-calendar"></i>
                        </div>
                        <p class="card-category">Fecha Fin</p>
                        <h3 class="card-title">
                        --/--/----</h3>
                    </div>
                    <div class="card-footer">
                        <div class="stats">
                     Fecha fin
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-4">
                <div class="card card-stats">
                    <div class="card-header card-header-info-amosis card-header-icon">
                        <div class="card-icon" data-header-animation="true">
                            <i class="fa fa-store-alt"></i>
                        </div>
                        <p class="card-category">Ventas</p>
                        <h3 class="card-title">
                            0.00
                        </h3>
                    </div>
                    <div class="card-footer">
                        <div class="stats">
                            Ventas durante el turno
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-4">
                <div class="card card-stats">
                    <div class="card-header card-header-marcas-amosis card-header-icon">
                        <div class="card-icon" data-header-animation="true">
                            <i class="fa fa-user"></i>
                        </div>
                        <p class="card-category">Turno</p>
                        <h3 class="card-title"></h3>
                    </div>
                    <div class="card-footer">
                        
                            <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#abrir">Abrir Turno</button>
                       
                            <!--button type="button" id="cerrar_turno" class="btn btn-primary btn-sm">Cerrar Turno</button-->
                      
                    </div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="row">
                    <div class="col-lg-7 col-md-12">
                        <div class="card">
                            <div class="card-header card-header-primary">
                                <h4 class="card-title">Detalle del turno</h4>
                                <p class="card-category">Dinero Recibido</p>
                            </div>
                            <div class="card-body">
                            <table class="table table-hover">
                                <tbody>
                                    <tr class="w-100">
                                        <td class="w-50">Saldo inicial</td>
                                        <td class="w-50">
                                       0.00
                                        </td>
                                    </tr>
                                    <tr class="w-100">
                                        <td class="w-50">Efectivo</td>
                                        <td class="w-50">
                                      0.00
                                        </td>
                                    </tr>
                                    <tr class="w-100">
                                        <td class="w-50" style="font-weight: bold;">Total Final</td>
                                        <td class="w-50" style="font-weight: bold;">
                                     0.00
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5 col-md-12">
                        <div class="card">
                            <div class="card-header card-header-warning">
                            <h4 class="card-title">Turnos de Hoy</h4>
                            <p class="card-category">Lista de turnos</p>
                            </div>
                            <div class="card-body table-responsive">
                                <table class="table table-hover">
                                    <thead class="text-warning">
                                    <tr>
                                        <th>N°</th>
                                        <th>Persona</th>
                                        <th>Estado</th>
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
    </div>
</div>
<!-- Modals -->
<div class="modal fade" id="abrir" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">ABRIR TURNO</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">X</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="">Saldo inicial</label>
                            <input type="number" id="saldo_inicial" placeholder="Ejm. 10.00" class="form-control" required>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" id="abrir_turno" class="btn btn-success">Abrir</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />
<script>
    $("#abrir_turno").click(function(){
        let saldo_inicial = $("#saldo_inicial").val();
        if(saldo_inicial.length == 0 || saldo_inicial <= 0){
            showNotification('bottom','center','Los valores deben ser correctamente llenados','danger');
        }else{
            let data = {
               "usuario" : "<?=$_SESSION['usuario']?>",
                "turno" : "<?=$_SESSION['idturno']?>",
                "saldo" : saldo_inicial
            }
            $.post('<?=SERVERURL;?>turnos/abrir',data,function(response){
                if(response == 1){
                    $.post('<?=SERVERURL;?>turnos/abrirturno',{},function(estado){
                        if(estado == 1){
                            showNotification('bottom','center','El turno se inicio con Ã©xito','success');
                            setTimeout(function(){
                                location.reload();
                            },1000);
                        }else{
                            showNotification('bottom','center','Hubo un error precione F5','danger');
                        }
                    });
                }else if(response == 0){
                    showNotification('bottom','center','El turno ya existe','danger');
                }else if(response == 2){
                    showNotification('bottom','center','No se pudo iniciar con el turno','danger');
                }
            });
        }
    });
    $("#cerrar_turno").click(function(){
        let data = {
            "turno" : "<?=$_SESSION['idturno']?>"
        }
        $.post('<?=SERVERURL;?>turnos/cerrarturno',data,function(estado){
            if(estado == 1){
                showNotification('bottom','center','El turno se cerro con Ã©xito','success');
                setTimeout(function(){
                    location.reload();
                },1000);
            }else{
                showNotification('bottom','center','Hubo un error precione F5','danger');
            }
        });
    });
</script>