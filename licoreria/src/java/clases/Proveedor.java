
package clases;

public class Proveedor {
    private Integer id_proveedor;
    private String ruc;
    private String telefono;
    private String razon_social;
    private String direccion;
    private String email;
    private String dni;

    public Proveedor(Integer id_proveedor, String ruc, String razon_social, String email ,String telefono,  String direccion,  String dni) {
        this.id_proveedor = id_proveedor;
        this.ruc = ruc;
        this.telefono = telefono;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }





}
