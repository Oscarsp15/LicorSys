package clases;

public class Producto {
    private Integer id;
    private int stockMinimo;
    private String codigoBarra;
    private String nombre;
    private Marca marca;
    private Categoria categoria;
    private double precioCosto;
    private double precioVenta;
    private UnidadMedida unidadMedida;

    public Producto(Integer id, int stockMinimo, String codigoBarra, String nombre, Marca marca, Categoria categoria, double precioCosto, double precioVenta, UnidadMedida unidadMedida) {
        this.id = id;
        this.stockMinimo = stockMinimo;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
