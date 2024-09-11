<jsp:include page="../templeate/head.jsp" />
<%
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
            <div class="col-md-1">
        </div>
        <div class="col-md-10">
            <div class="card">
                <div class="card-header card-header-amosis">
                    <h4 class="card-title">Nuevo Usuario</h4>
                    <p class="card-category">Complete los datos del Usuario</p>
                </div>
                <div class="card-body">
                    <form autocomplete="off" id="formulario" name="formulario">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">ID del Usuario</label>
                                    <input type="text" disabled value="" class="form-control">
                                    <input type="hidden" name="id_agregar" value="<?=$this->codigo_usuario;?>" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Usuario</label>
                                    <input type="text" name="usuario_agregar" id="usuario"  class="form-control">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Password</label>
                                    <input type="text" name="pass_agregar"  id="pass" class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Persona</label>
                                    <select name="persona_agregar" class="custom-select">
                                    <?=$this->listarPersona;?>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Cargo</label>
                                    <select name="privilegio_agregar" class="custom-select">
                                        <option value="0">Asistente de Almacen</option> 
                                        <option value="1">Administrador</option>
                                        <option value="2">Vendedor</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Estado</label>
                                    <select name="estado_agregar" class="custom-select">
                                        <option value="1">Activo</option>
                                        <option value="0">Inactivo</option>
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
                                                    <span class="toggle"></span>
                                                        Dashboard
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                    <input type="checkbox" id="ticket" name="almacen" checked="">
                                                    <span class="toggle"></span>
                                                        Almacen
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="togglebutton">
                                                    <label>
                                                    <input type="checkbox" id="ticket"  name="admin" checked="">
                                                    <span class="toggle"></span>
                                                        Admin
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Usuario</button>                
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
    $("#formulario").submit(function(e){
        e.preventDefault();
        let usuario = $("#usuario").val();
        let pass = $("#pass").val();
        if(usuario.length == 0 || pass.length == 0 ){
            showNotification('bottom','center','El usuario y el pass son necesarios ','danger');
        }else{
            var Form = new FormData(document.forms.namedItem("formulario"));
            $.ajax({
                url: "usuario/agregar_usuario/",
                type: "post",
                data : Form,
                processData: false,
                contentType: false,
                success: function(data)
                {
                    if(data == 1){
                        showNotification('bottom','center','Esta persona ya tiene un usuario','danger');
                    }else if(data == 2){
                        showNotification('bottom','center','El usuario ya existe','danger');
                    }else if(data == 3){
                        showNotification('bottom','center','Usuario Agregado correctamente','success');
                        setTimeout(function(){
                            location.reload();
                        },1000);
                    }
                }
            }); 
        }
    });
    $(document).ready(function(){
        let tocken = "evaluar";
        $.post('persona/existenciapersona/',{tocken},function(response){
            if(response == 1){
                showNotification('bottom','center','No tienes personas','danger');
                setTimeout(function(){
                    location.href = "persona/nuevopersonal/";
                },1000);
            }
        });
    });
</script>