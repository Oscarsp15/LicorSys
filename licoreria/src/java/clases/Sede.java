package clases;

public class Sede {
    private Integer id;
    private String direccion;
    private String observacion;
    private String razonSocial;
    private String logo;
    private String propietario;
    private String telefono;

    public Sede(Integer id, String direccion, String observacion, String razonSocial, String logo, String propietario, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.observacion = observacion;
        this.razonSocial = razonSocial;
        this.logo = logo;
        this.propietario = propietario;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
