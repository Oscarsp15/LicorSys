package clases;

import java.util.Date;

public class EntradaProducto {
    private Integer id;
    private Proveedor proveedor;
    private Date fechaEntrada;
    private String observacion;

    public EntradaProducto(Integer id, Proveedor proveedor, Date fechaEntrada, String observacion) {
        this.id = id;
        this.proveedor = proveedor;
        this.fechaEntrada = fechaEntrada;
        this.observacion = observacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}