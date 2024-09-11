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
            <div class="col-md-1">
            </div>
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header card-header-amosis">
                        <h4 class="card-title">Nuevo Proveedor</h4>
                        <p class="card-category">Complete los datos del Proveedor</p>
                    </div>
                    <div class="card-body">
                        <form autocomplete="off"  action = "../../Proveedor.do" method="POST" data-form="save">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">ID Proveedor</label>
                                        <input type="text" value="" disabled class="form-control">
                                        <input name="action" type="hidden" value="Proveedor_registrar" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Ruc</label>
                                        <input name="ruc_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Razón Social</label>
                                        <input name="rs_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">E-mail</label>
                                        <input name="email_agregar" type="email" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Telefono</label>
                                        <input name="telefono_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Dirección</label>
                                        <input name="direccion_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">DNI del Reprentante</label>
                                        <input name="dni_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Nombre del Representante</label>
                                        <input name="nombrer_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Dirección del Representante</label>
                                        <input name="direccionr_agregar" type="text" class="form-control">
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Telefono del Reprentante</label>
                                        <input name="telefonor_agregar" type="text" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-sm btn-primary pull-right">Guardar Proveedor</button>
                            <a class="btn btn-rose btn-sm pull-right" href="index.jsp">Regresar</a>
                            <div class="RespuestaAjax">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../templeate/footer.jsp" />


