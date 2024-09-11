package clases;


public class Usuario {
   
    private int id;
    private String usuario;
    private String password;
    private Empleado empleado;
    private Rol rol;
    private int dashboard;
    private int movimientos;
    private int ventas;
    private int compras;
    private int admin;

    public Usuario(int id, String usuario, String password, int dashboard, int movimientos, int ventas, int compras, int admin) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.dashboard = dashboard;
        this.movimientos = movimientos;
        this.ventas = ventas;
        this.compras = compras;
        this.admin = admin;
    }

  
    public Usuario(int id, String usuario, String password, Empleado empleado, Rol rol, int dashboard, int movimientos, int ventas, int compras, int admin) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.empleado = empleado;
        this.rol = rol;
        this.dashboard = dashboard;
        this.movimientos = movimientos;
        this.ventas = ventas;
        this.compras = compras;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getDashboard() {
        return dashboard;
    }

    public void setDashboard(int dashboard) {
        this.dashboard = dashboard;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    
    
}