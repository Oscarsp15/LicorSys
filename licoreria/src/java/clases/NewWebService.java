package clases;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewWebService")
public class NewWebService {
//--------------------- metodos Proveedor----------------------------------
    @WebMethod(operationName = "proveedor_listar")
    public List<Proveedor> prov_listar() {
        Proveedor_m proveedor = new Proveedor_m();
        return proveedor.prov_listar();
    }

    @WebMethod(operationName = "prov_registrar")
    public boolean prov_registrar(
            @WebParam(name = "ruc") String ruc,
            @WebParam(name = "razon_social") String razon_social,
             @WebParam(name = "email") String email,
            @WebParam(name = "telefono") String telefono,
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "dni") String dni
            
    ) {
        Proveedor_m  proveedor = new  Proveedor_m();
        return proveedor.prov_registrar(ruc, razon_social, email, telefono, direccion,dni);
    }
    
    
    @WebMethod(operationName = "list_cod")
public Proveedor list_cod(@WebParam(name = "id_proveedor") int id_proveedor) {
	Proveedor_m prov = new Proveedor_m();
	return prov.list_cod(id_proveedor);
}
    
  @WebMethod (operationName ="prov_actualizar")
public boolean prov_actualizar (
        @WebParam(name ="id") int id,
        @WebParam(name ="ruc") String ruc,
        @WebParam(name = "razon_social") String razon_social,
        @WebParam(name = "email") String email,
        @WebParam(name = "telefono") String telefono,
        @WebParam(name = "direccion") String direccion,
        @WebParam(name = "dni") String dni
){
     
    Proveedor_m prov = new Proveedor_m();
    return prov.prov_actualizar(id, ruc, razon_social, email, telefono,direccion,dni);
    

   }  

@WebMethod(operationName = "prov_estado")
    public boolean prov_estado(@WebParam(name = "cod_dispositivo") int cod_dispositivo) {
        Proveedor_m prov = new Proveedor_m ();
        return prov.prov_estado(cod_dispositivo);
}



//--------------------- metodos Marca----------------------------------



    @WebMethod(operationName = "listarMarcas") 
    public List<Marca> listarMarcas() {
        Marca_m marcaManager = new Marca_m();
        return marcaManager.listarMarcas();
    }

    @WebMethod(operationName = "registrarMarca")
    public boolean registrarMarca(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Marca_m marcaManager = new Marca_m();
        return marcaManager.registrarMarca(nombre, descripcion);
    }

    @WebMethod(operationName = "buscarMarcaPorId")
    public Marca buscarMarcaPorId(@WebParam(name = "id") int id) {
        Marca_m marcaManager = new Marca_m();
        return marcaManager.buscarMarcaPorId(id);
    }

    @WebMethod(operationName = "actualizarMarca")
    public boolean actualizarMarca(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Marca_m marcaManager = new Marca_m();
        return marcaManager.actualizarMarca(id, nombre, descripcion);
    }

    @WebMethod(operationName = "cambiarEstadoMarca")
    public boolean cambiarEstadoMarca(@WebParam(name = "idMarca") int idMarca) {
        Marca_m marcaManager = new Marca_m();
        return marcaManager.cambiarEstadoMarca(idMarca);
    }


//-------------------------- metodos para unidad de medida ----------------------
    
    @WebMethod(operationName = "listarUnidadesMedida")
    public List<UnidadMedida> listarUnidadesMedida() {
        UnidadMedida_m unidadMedidaManager = new UnidadMedida_m();
        return unidadMedidaManager.listarUnidadesMedida();
    }

    @WebMethod(operationName = "registrarUnidadMedida")
    public boolean registrarUnidadMedida(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        UnidadMedida_m unidadMedidaManager = new UnidadMedida_m();
        return unidadMedidaManager.registrarUnidadMedida(nombre, descripcion);
    }

    @WebMethod(operationName = "buscarUnidadMedidaPorId")
    public UnidadMedida buscarUnidadMedidaPorId(@WebParam(name = "id") int id) {
        UnidadMedida_m unidadMedidaManager = new UnidadMedida_m();
        return unidadMedidaManager.buscarUnidadMedidaPorId(id);
    }

    @WebMethod(operationName = "actualizarUnidadMedida")
    public boolean actualizarUnidadMedida(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        UnidadMedida_m unidadMedidaManager = new UnidadMedida_m();
        return unidadMedidaManager.actualizarUnidadMedida(id, nombre, descripcion);
    }

    @WebMethod(operationName = "cambiarEstadoUnidadMedida")
    public boolean cambiarEstadoUnidadMedida(@WebParam(name = "idUnidad") int idUnidad) {
        UnidadMedida_m unidadMedidaManager = new UnidadMedida_m();
        return unidadMedidaManager.cambiarEstadoUnidadMedida(idUnidad);
    }

//------------------------------- metodos cliente---------------------
    
    @WebMethod(operationName = "listarClientes")
    public List<Cliente> listarClientes() {
        Cliente_m clienteManager = new Cliente_m();
        return clienteManager.listarClientes();
    }

    @WebMethod(operationName = "registrarCliente")
    public boolean registrarCliente(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "direccion") String direccion
    ) {
        Cliente_m clienteManager = new Cliente_m();
        return clienteManager.registrarCliente(nombre, direccion);
    }

    @WebMethod(operationName = "buscarClientePorId")
    public Cliente buscarClientePorId(@WebParam(name = "id") int id) {
        Cliente_m clienteManager = new Cliente_m();
        return clienteManager.buscarClientePorId(id);
    }

    @WebMethod(operationName = "actualizarCliente")
    public boolean actualizarCliente(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "direccion") String direccion
    ) {
        Cliente_m clienteManager = new Cliente_m();
        return clienteManager.actualizarCliente(id, nombre, direccion);
    }

    @WebMethod(operationName = "cambiarEstadoCliente")
    public boolean cambiarEstadoCliente(@WebParam(name = "idCliente") int idCliente) {
        Cliente_m clienteManager = new Cliente_m();
        return clienteManager.cambiarEstadoCliente(idCliente);
    }
// ------------------- metodos Rol --------------------------------
    
   @WebMethod(operationName = "listarRoles")
    public List<Rol> listarRoles() {
        Rol_m rolManager = new Rol_m();
        return rolManager.listarRoles();
    }

    @WebMethod(operationName = "registrarRol")
    public boolean registrarRol(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Rol_m rolManager = new Rol_m();
        return rolManager.registrarRol(nombre, descripcion);
    }

    @WebMethod(operationName = "buscarRolPorId")
    public Rol buscarRolPorId(@WebParam(name = "id") int id) {
        Rol_m rolManager = new Rol_m();
        return rolManager.buscarRolPorId(id);
    }

    @WebMethod(operationName = "actualizarRol")
    public boolean actualizarRol(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Rol_m rolManager = new Rol_m();
        return rolManager.actualizarRol(id, nombre, descripcion);
    }

    @WebMethod(operationName = "cambiarEstadoRol")
    public boolean cambiarEstadoRol(@WebParam(name = "idRol") int idRol) {
        Rol_m rolManager = new Rol_m();
        return rolManager.cambiarEstadoRol(idRol);
    }
    
    //-------------------------------- metodos sede----------------------------
     @WebMethod(operationName = "listarSedes")
    public List<Sede> listarSedes() {
        Sede_m sedeManager = new Sede_m();
        return sedeManager.listarSedes();
    }

    @WebMethod(operationName = "registrarSede")
    public boolean registrarSede(
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "observacion") String observacion,
            @WebParam(name = "razonSocial") String razonSocial,
            @WebParam(name = "logo") String logo,
            @WebParam(name = "propietario") String propietario,
            @WebParam(name = "telefono") String telefono
    ) {
        Sede_m sedeManager = new Sede_m();
        return sedeManager.registrarSede(direccion, observacion, razonSocial, logo, propietario, telefono);
    }

    @WebMethod(operationName = "buscarSedePorId")
    public Sede buscarSedePorId(@WebParam(name = "id") int id) {
        Sede_m sedeManager = new Sede_m();
        return sedeManager.buscarSedePorId(id);
    }

    @WebMethod(operationName = "actualizarSede")
    public boolean actualizarSede(
            @WebParam(name = "id") int id,
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "observacion") String observacion,
            @WebParam(name = "razonSocial") String razonSocial,
            @WebParam(name = "logo") String logo,
            @WebParam(name = "propietario") String propietario,
            @WebParam(name = "telefono") String telefono
    ) {
        Sede_m sedeManager = new Sede_m();
        return sedeManager.actualizarSede(id, direccion, observacion, razonSocial, logo, propietario, telefono);
    }

    @WebMethod(operationName = "cambiarEstadoSede")
    public boolean cambiarEstadoSede(@WebParam(name = "idSede") int idSede) {
        Sede_m sedeManager = new Sede_m();
        return sedeManager.cambiarEstadoSede(idSede);
    }
    
    
      // metodos tipo de comprobante
    @WebMethod(operationName = "listarTiposComprobante")
    public List<TipoComprobante> listarTiposComprobante() {
        TipoComprobante_m tipoComprobanteManager = new TipoComprobante_m();
        return tipoComprobanteManager.listarTiposComprobante();
    }

    @WebMethod(operationName = "registrarTipoComprobante")
    public boolean registrarTipoComprobante(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        TipoComprobante_m tipoComprobanteManager = new TipoComprobante_m();
        return tipoComprobanteManager.registrarTipoComprobante(nombre, descripcion);
    }

    @WebMethod(operationName = "buscarTipoComprobantePorId")
    public TipoComprobante buscarTipoComprobantePorId(@WebParam(name = "id") int id) {
        TipoComprobante_m tipoComprobanteManager = new TipoComprobante_m();
        return tipoComprobanteManager.buscarTipoComprobantePorId(id);
    }

    @WebMethod(operationName = "actualizarTipoComprobante")
    public boolean actualizarTipoComprobante(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        TipoComprobante_m tipoComprobanteManager = new TipoComprobante_m();
        return tipoComprobanteManager.actualizarTipoComprobante(id, nombre, descripcion);
    }

    @WebMethod(operationName = "cambiarEstadoTipoComprobante")
    public boolean cambiarEstadoTipoComprobante(@WebParam(name = "idTipoComprobante") int idTipoComprobante) {
        TipoComprobante_m tipoComprobanteManager = new TipoComprobante_m();
        return tipoComprobanteManager.cambiarEstadoTipoComprobante(idTipoComprobante);
    }
    //metodo categoria 
    
    
   @WebMethod(operationName = "listarCategorias")
    public List<Categoria> listarCategorias() {
        Categoria_m categoriaManager = new Categoria_m();
        return categoriaManager.listarCategorias();
    }

    @WebMethod(operationName = "registrarCategoria")
    public boolean registrarCategoria(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Categoria_m categoriaManager = new Categoria_m();
        return categoriaManager.registrarCategoria(nombre, descripcion);
    }

    @WebMethod(operationName = "buscarCategoriaPorId")
    public Categoria buscarCategoriaPorId(@WebParam(name = "id") int id) {
        Categoria_m categoriaManager = new Categoria_m();
        return categoriaManager.buscarCategoriaPorId(id);
    }

    @WebMethod(operationName = "actualizarCategoria")
    public boolean actualizarCategoria(
            @WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "descripcion") String descripcion
    ) {
        Categoria_m categoriaManager = new Categoria_m();
        return categoriaManager.actualizarCategoria(id, nombre, descripcion);
    }

    @WebMethod(operationName = "cambiarEstadoCategoria")
    public boolean cambiarEstadoCategoria(@WebParam(name = "idCategoria") int idCategoria) {
        Categoria_m categoriaManager = new Categoria_m();
        return categoriaManager.cambiarEstadoCategoria(idCategoria);
    }
    
    //Entrada producto metodos:
    @WebMethod(operationName = "listarEntradasProductos")
    public List<EntradaProducto> listarEntradasProductos() {
        EntradaProducto_m entradaProductoManager = new EntradaProducto_m();
        return entradaProductoManager.listarEntradasProductos();
    }
//------------------- metodo producto-------------------------
    
     @WebMethod(operationName = "listarProductos")
    public List<Producto> listarProductos() {
        Producto_m productoManager = new Producto_m();
        return productoManager.listarProductos();
    }

    @WebMethod(operationName = "registrarProducto")
    public boolean registrarProducto(
            @WebParam(name = "stockMinimo") int stockMinimo,
            @WebParam(name = "codigoBarra") String codigoBarra,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "idMarca") int idMarca,
            @WebParam(name = "idCategoria") int idCategoria,
            @WebParam(name = "precioCosto") double precioCosto,
            @WebParam(name = "precioVenta") double precioVenta,
            @WebParam(name = "idUnidadMedida") int idUnidadMedida
    ) {
        Producto_m productoManager = new Producto_m();
        return productoManager.registrarProducto(stockMinimo, codigoBarra, nombre, idMarca, idCategoria, precioCosto, precioVenta, idUnidadMedida);
    }

    @WebMethod(operationName = "buscarProducto")
    public Producto buscarProducto(@WebParam(name = "idProducto") int idProducto) {
        Producto_m productoManager = new Producto_m();
        return productoManager.buscarProducto(idProducto);
    }

    @WebMethod(operationName = "actualizarProducto")
    public boolean actualizarProducto(
            @WebParam(name = "idProducto") Integer idProducto,
            @WebParam(name = "stockMinimo") int stockMinimo,
            @WebParam(name = "codigoBarra") String codigoBarra,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "idMarca") int idMarca,
            @WebParam(name = "idCategoria") int idCategoria,
            @WebParam(name = "precioCosto") double precioCosto,
            @WebParam(name = "precioVenta") double precioVenta,
            @WebParam(name = "idUnidadMedida") int idUnidadMedida
    ) {
        Producto_m productoManager = new Producto_m();
        return productoManager.actualizarProducto(idProducto, stockMinimo, codigoBarra, nombre, idMarca, idCategoria, precioCosto, precioVenta, idUnidadMedida);
    }

    @WebMethod(operationName = "cambiarEstadoProducto")
    public boolean cambiarEstadoProducto(@WebParam(name = "idProducto") int idProducto) {
        Producto_m productoManager = new Producto_m();
        return productoManager.cambiarEstadoProducto(idProducto);
    }
    
    
    
    
    //------- metodo empleado-----------
    
    
     @WebMethod(operationName = "listarEmpleados")
    public List<Empleado> listarEmpleados() {
        Empleado_m empleadoManager = new Empleado_m();
        return empleadoManager.listarEmpleados();
    }
    
    @WebMethod(operationName = "registrarEmpleado")
    public boolean registrarEmpleado( //Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
            @WebParam(name = "nombres") String nombres,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "dni") String dni,
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "sede") int sede
            
    ) {
        Empleado_m empleadoManager = new Empleado_m();
        return empleadoManager.registrarEmpleado(nombres, apellidos, dni, direccion, sede);
    }
    
    @WebMethod(operationName = "buscarEmpleado")
    public Empleado buscarEmpleado(@WebParam(name = "idEmpleado") int idEmpleado) {
        Empleado_m empleadoManager = new Empleado_m();
        return empleadoManager.buscarEmpleado(idEmpleado);
    }

    @WebMethod(operationName = "actualizarEmpleado")
    public boolean actualizarEmpleado( //Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
            @WebParam(name = "id") Integer id,
            @WebParam(name = "nombres") String nombres,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "dni") String dni,
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "sede") int sede
    ) {
        Empleado_m empleadoManager = new Empleado_m();
        return empleadoManager.actualizarEmpleado(id, nombres, apellidos, dni, direccion, sede);
    }
    
    @WebMethod(operationName = "cambiarEstadoEmpleado")
    public boolean cambiarEstadoEmpleado(@WebParam(name = "idEmpleado") int idEmpleado) {
        Empleado_m empleadoManager = new Empleado_m();
        return empleadoManager.cambiarEstadoEmpleado(idEmpleado);
    }
    
    //////////////- metodo usuario
    
    
    @WebMethod(operationName = "listarUsuarios")
    public List<Usuario> listarUsuarios() {
        Usuario_m usuarioManager = new Usuario_m();
        return usuarioManager.listarUsuarios();
    }
    
    @WebMethod(operationName = "actualizarUsuario")
    public boolean actualizarUsuario( //Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
            @WebParam(name = "id") Integer id,
            @WebParam(name = "usuario") String usuario,
            @WebParam(name = "password") String password,
            @WebParam(name = "id_empleado") Integer id_empleado,
            @WebParam(name = "id_rol") Integer id_rol,
            @WebParam(name = "dashboard") Integer dashboard,
            @WebParam(name = "movimientos") Integer movimientos,
            @WebParam(name = "ventas") Integer ventas,
            @WebParam(name = "compras") Integer compras,
            @WebParam(name = "admin") Integer admin
            
            
    ) {
       Usuario_m UsuarioManager = new Usuario_m();
        return UsuarioManager.actualizarUsuario(id, usuario, password, id_empleado, id_rol, dashboard,movimientos,ventas,compras,admin);
    }

    
     @WebMethod(operationName = "registrarUsuario")
    public boolean registrarUsuario( //Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede
            @WebParam(name = "usuario") String usuario,
            @WebParam(name = "password") String password,
            @WebParam(name = "id_empleado") int id_empleado,
            @WebParam(name = "id_rol") int id_rol,
            @WebParam(name = "dashboard") int dashboard,
            @WebParam(name = "movimientos") int movimientos,
            @WebParam(name = "ventas") int ventas,
            @WebParam(name = "compras") int compras,
            @WebParam(name = "admin") int admin
                                             
    ) {
       Usuario_m UsuarioManager = new Usuario_m();
        return UsuarioManager.registrarUsuario(usuario, password, id_empleado, id_rol,dashboard ,movimientos,ventas,compras,admin);
    }
      
    
     @WebMethod(operationName = "buscarUsuario")
    public Usuario buscarUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        Usuario_m UsuarioManager = new Usuario_m();
        return UsuarioManager.buscarUsuario(idUsuario);
    }
    
      @WebMethod(operationName = "cambiarEstadoUsuario")
    public boolean cambiarEstadoUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        Usuario_m UsuarioManager = new Usuario_m();
        return UsuarioManager.cambiarEstadoUsuario(idUsuario);
    }
    
    
     @WebMethod(operationName = "ValidarUsuario")
    public Usuario ValidarUsuario(
            @WebParam(name = "usuario") String usuario,
            @WebParam(name = "password") String password) {
        Usuario_m UsuarioManager = new Usuario_m();
        return UsuarioManager.ValidarUsuario(usuario,password);
    }
    
   //------------ METODOS BITACORA SESION-------------------------
     @WebMethod(operationName = "listarBitacoraSesion")
    public List<BitacoraSesion> listarBitacoraSesion() {
       BitacoraSesion_m bitacoramanager = new BitacoraSesion_m();
        return bitacoramanager.listarBitacoraSesion();
    }
    
    
    
   
}

    
    
    
    
    
    
    
