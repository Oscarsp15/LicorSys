package clases;

public class Empleado {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private Sede sede;

    public Empleado(Integer id, String nombres, String apellidos, String dni, String direccion, Sede sede) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.sede = sede;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

 
}
