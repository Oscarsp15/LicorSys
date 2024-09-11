<%@page import="java.util.*"%>
<%@page import="clases.*"%>

<%
    Empleado emp = null;
    clases.NewWebService_Service server = new clases.NewWebService_Service();
    NewWebService port = server.getNewWebServicePort();
    try {
        int id = Integer.parseInt(request.getParameter("cod_empleado"));
        emp = port.buscarEmpleado(id);
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        emp = new Empleado();
    }
    List<Sede> sedes = port.listarSedes();

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

<jsp:include page="../templeate/head.jsp" />

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4">
        </div>
        <div class="col-md-4">
            <div class="card card-profile">
                <div class="card-avatar" style="width: 150px;height: 150px;">
                    <div>
                        <img class="img" src="##">
                    </div>
                </div>
                <div class="card-content p-3">
                    <form autocomplete="off" method="post" action="../../Personal.do">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="bmd-label-floating">ID de la Persona</label>
                                    <input type="text" disabled value="<%=emp.getId()%>" class="form-control">
                                    <input type="hidden" name="id_agregar" value="<%=emp.getId()%>" class="form-control">
                                    <input type="hidden" name="action" value="Personal_editar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="">Nombre</label>
                                    <input type="text" value="<%=emp.getNombres()%>" name="nombre_agregar" id="nombre_agregar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="">Apellido</label>
                                    <input type="text" value="<%=emp.getApellidos()%>" name="apellido_agregar" id="apellido_agregar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="">DNI</label>
                                    <input type="text" value="<%=emp.getDni()%>" name="dni_agregar" id="dni_agregar" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="">Direccion</label>
                                    <input type="text" value="<%=emp.getDireccion()%>" name="direccion_agregar" class="form-control">
                                </div>
                            </div>
                            
                            <!--div class="col-sm-12 text-left">
                                <div class="custom-file-container" data-upload-id="myFirstImage">
                                    <label>Subir Foto de perfil  <a href="javascript:void(0)" class="custom-file-container__image-clear" title="Clear Image">x</a></label>
                                    <label class="custom-file-container__custom-file" >
                                        <input type="file" id="file" type="file" name="file" class="custom-file-container__custom-file__custom-file-input" accept="*">
                                        <input type="hidden" name="MAX_FILE_SIZE" value="10485760" />
                                        <span class="custom-file-container__custom-file__custom-file-control"></span>
                                    </label>
                                    <div class="custom-file-container__image-preview"></div>
                                </div>
                            </div--->
                            
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Sede</label>
                                    <select name="sede_agregar" class="custom-select">

                                        <%
                                            
                                            for (Sede s : sedes) {
                                        %>

                                        <option value="<%=s.getId()%>"><%=s.getDireccion()%></option>

                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <button type="submit" class="btn btn-primary btn-round">GUARDAR</button>
                                <a href="index.jsp" class="btn btn-rose btn-round">REGRESAR</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />
<script>
    $(document).ready(function(){
        var firstUpload = new FileUploadWithPreview('myFirstImage');
    });
    $('#formulario').submit(function(e){
        e.preventDefault();
        let nombre = $("#nombre_agregar").val();
        let apellido = $("#apellido_agregar").val();
        let dni = $("#dni_agregar").val();

        if(nombre.length == 0 || apellido.length == 0 || dni.length == 0){
            showNotification('bottom','center','Todos los campos son necesarios ','danger');
        }else{
            var Form = new FormData(document.forms.namedItem("formulario"));
            $.ajax({
                url: "persona/actualizar_personal/",
                type: "post",
                data : Form,
                processData: false,
                contentType: false,
                success: function(data)
                {
                    if(data == 1){
                        showNotification('bottom','center','Datos actualizados correctamente','success');
                        setTimeout(function(){
                            location.reload();
                        },1000);
                    }else{
                        showNotification('bottom','center','Error al actualizar el personal','danger');
                        setTimeout(function(){
                            location.reload();
                        },1000);
                    }
                }
            }); 
        }

    });
</script>

