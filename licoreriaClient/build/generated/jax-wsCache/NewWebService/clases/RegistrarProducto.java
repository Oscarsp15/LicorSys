
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stockMinimo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMarca" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idCategoria" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precioCosto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="precioVenta" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="idUnidadMedida" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarProducto", propOrder = {
    "stockMinimo",
    "codigoBarra",
    "nombre",
    "idMarca",
    "idCategoria",
    "precioCosto",
    "precioVenta",
    "idUnidadMedida"
})
public class RegistrarProducto {

    protected int stockMinimo;
    protected String codigoBarra;
    protected String nombre;
    protected int idMarca;
    protected int idCategoria;
    protected double precioCosto;
    protected double precioVenta;
    protected int idUnidadMedida;

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
     * Obtiene el valor de la propiedad idMarca.
     * 
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * Define el valor de la propiedad idMarca.
     * 
     */
    public void setIdMarca(int value) {
        this.idMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     */
    public void setIdCategoria(int value) {
        this.idCategoria = value;
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
     * Obtiene el valor de la propiedad idUnidadMedida.
     * 
     */
    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    /**
     * Define el valor de la propiedad idUnidadMedida.
     * 
     */
    public void setIdUnidadMedida(int value) {
        this.idUnidadMedida = value;
    }

}
