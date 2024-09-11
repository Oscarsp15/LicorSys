<jsp:include page="../templeate/head.jsp" />
<%
    HttpSession sessionObj = request.getSession();
    // Verifica si la variable de sesiÛn "usuario" no est· presente
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
            <div class="col-md-1">
        </div>
        <div class="col-md-10">
            <div class="card">
                <div class="card-header card-header-amosis">
                    <h4 class="card-title">Usuario <?=$this->codigo_usuario;?></h4>
                    <p class="card-category">Datos del Usuario</p>
                </div>
                <div class="card-body">
                    <form  id="formulario" name="formulario">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">ID del Usuario</label>
                                    <input type="text" disabled value="<?=$this->codigo_usuario;?>" class="form-control">
                                    <input type="hidden" name="id_agregar" value="<?=$this->codigo_usuario;?>" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Usuario</label>
                                    <input type="text" value='<?=$dato["Usuario"]?>' name="usuario_agregar" class="form-control" required>
                                    <input type="hidden" value='<?=$dato["Usuario"]?>' name="usuario_original" class="form-control" required>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Password</label>
                                    <input type="text" value='<?=$dato["Pass"]?>' name="pass_agregar" class="form-control" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Persona</label>
                                    <select name="persona_agregar" disabled class="custom-select">
                                    <?=$this->option_persona;?>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Cargo</label>
                                    <select name="privilegio_agregar" class="custom-select">
                                   
                                        <option value="0" selected>Asistente de Almacen</option> 
                                        <option value="1">Administrador</option>
                                        <option value="2">Vendedor</option>
                                     <option value="0">Asistente de Almacen</option> 
                                        <option value="1" selected>Administrador</option>
                                        <option value="2" >Vendedor</option>
                                    
                                        <option value="0">Asistente de Almacen</option> 
                                        <option value="1" >Administrador</option>
                                        <option value="2" selected>Vendedor</option>
                                       
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Estado</label>
                                    <select name="estado_agregar" class="custom-select">
                                    
                                        <option value="1">Activo</option>
                                        <option value="0" selected>Inactivo</option>
                                        <option value="1" selected>Activo</option> 
                                            <option value="0" >Inactivo</option>
                                   
                                    </select>
                                </div>
                            </div>
                            <div class="col-sm-12 mt-2 mb-2">
                                <h4 class="title">Permisos</h4>
                                <div class="row">
                                    <div class="col-sm-4">
                                    <div class="row">
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                   
                                                        <input type="checkbox" id="ticket"  name="dashboard" checked="">
                                                
                                                        <input type="checkbox" id="ticket"  name="dashboard">
                                                
                                                    <span class="toggle"></span>
                                                        Dashboard
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                    
                                                        <input type="checkbox" id="ticket"  name="almacen" checked="">
                                                  
                                                        <input type="checkbox" id="ticket"  name="almacen">
                                                   
                                                    <span class="toggle"></span>
                                                        Almac√©n
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                 
                                                        <input type="checkbox" id="ticket"  name="compras" checked="">
                                                    
                                                        <input type="checkbox" id="ticket"  name="compras">
                                                    
                                                    <span class="toggle"></span>
                                                        Compras
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                  
                                                        <input type="checkbox" id="ticket"  name="ventas" checked="">
                                                  
                                                        <input type="checkbox" id="ticket"  name="ventas">
                                                    
                                                    <span class="toggle"></span>
                                                        Ventas
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                              
                                                        <input type="checkbox" id="ticket"  name="turnos" checked="">
                                                 
                                                        <input type="checkbox" id="ticket"  name="turnos">
                                                    
                                                    <span class="toggle"></span>
                                                    Turnos
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                  
                                                        <input type="checkbox" id="ticket"  name="cotizacion" checked="">
                                                    
                                                        <input type="checkbox" id="ticket"  name="cotizacion">
                                                   
                                                    <span class="toggle"></span>
                                                        Cotizaci√≥n
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                
                                                        <input type="checkbox" id="ticket"  name="inventario" checked="">
                                                 
                                                        <input type="checkbox" id="ticket"  name="inventario">
                                                   
                                                    <span class="toggle"></span>
                                                        Inventario
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                
                                                        <input type="checkbox" id="ticket"  name="admin" checked="">
                                                  
                                                        <input type="checkbox" id="ticket"  name="admin">
                                                  
                                                    <span class="toggle"></span>
                                                        Admin
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                    
                                                        <input type="checkbox" id="ticket"  name="parametros" checked="">
                                                    
                                                        <input type="checkbox" id="ticket"  name="parametros">
                                                    
                                                    <span class="toggle"></span>
                                                        Parametros
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                   
                                                        <input type="checkbox" id="ticket"  name="backup" checked="">
                                                   
                                                        <input type="checkbox" id="ticket"  name="backup">
                                                    
                                                    <span class="toggle"></span>
                                                        Backup
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar</button>                
                        <a href="usuario/" class="btn btn-sm btn-rose pull-right">Regresar</a>                
                    </form>
                </div>
            </div>
        </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />

<script>
    $("#formulario").submit(function(e){
        e.preventDefault();
        var Form = new FormData(document.forms.namedItem("formulario"));
        $.ajax({
            url: "usuario/actualizar_usuario/",
            type: "post",
            data : Form,
            processData: false,
            contentType: false,
            success: function(data)
            {
                if(data == 1){
                    showNotification('bottom','center','El usuario ya existe','danger');
                }else if(data == 2){
                    showNotification('bottom','center','Usuario actualizado correctamente','success');
                    setTimeout(function(){
                        location.reload();
                    },1000);
                }else{
                    showNotification('bottom','center','No se pudo actualizar','danger');
                }
            }
        }); 
    });
</script>