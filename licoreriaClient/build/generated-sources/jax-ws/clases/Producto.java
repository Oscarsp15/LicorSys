
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoria" type="{http://clases/}categoria" minOccurs="0"/&gt;
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://clases/}marca" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioCosto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="precioVenta" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="stockMinimo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unidadMedida" type="{http://clases/}unidadMedida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producto", propOrder = {
    "categoria",
    "codigoBarra",
    "id",
    "marca",
    "nombre",
    "precioCosto",
    "precioVenta",
    "stockMinimo",
    "unidadMedida"
})
public class Producto {

    protected Categoria categoria;
    protected String codigoBarra;
    protected Integer id;
    protected Marca marca;
    protected String nombre;
    protected double precioCosto;
    protected double precioVenta;
    protected int stockMinimo;
    protected UnidadMedida unidadMedida;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarra() {
        return codigoBarra;
    }

    /**
     * Define el valor de la propiedad codigoBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarra(String value) {
        this.codigoBarra = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link Marca }
     *     
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link Marca }
     *     
     */
    public void setMarca(Marca value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad precioCosto.
     * 
     */
    public double getPrecioCosto() {
        return precioCosto;
    }

    /**
     * Define el valor de la propiedad precioCosto.
     * 
     */
    public void setPrecioCosto(double value) {
        this.precioCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVenta.
     * 
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Define el valor de la propiedad precioVenta.
     * 
     */
    public void setPrecioVenta(double value) {
        this.precioVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad stockMinimo.
     * 
     */
    public int getStockMinimo() {
        return stockMinimo;
    }

    /**
     * Define el valor de la propiedad stockMinimo.
     * 
     */
    public void setStockMinimo(int value) {
        this.stockMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link UnidadMedida }
     *     
     */
    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadMedida }
     *     
     */
    public void setUnidadMedida(UnidadMedida value) {
        this.unidadMedida = value;
    }

}
