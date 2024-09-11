
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_empleado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id_rol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dashboard" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="movimientos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ventas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="compras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarUsuario", propOrder = {
    "id",
    "usuario",
    "password",
    "idEmpleado",
    "idRol",
    "dashboard",
    "movimientos",
    "ventas",
    "compras",
    "admin"
})
public class ActualizarUsuario {

    protected Integer id;
    protected String usuario;
    protected String password;
    @XmlElement(name = "id_empleado")
    protected Integer idEmpleado;
    @XmlElement(name = "id_rol")
    protected Integer idRol;
    protected Integer dashboard;
    protected Integer movimientos;
    protected Integer ventas;
    protected Integer compras;
    protected Integer admin;

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
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Define el valor de la propiedad idEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEmpleado(Integer value) {
        this.idEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRol(Integer value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad dashboard.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDashboard() {
        return dashboard;
    }

    /**
     * Define el valor de la propiedad dashboard.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDashboard(Integer value) {
        this.dashboard = value;
    }

    /**
     * Obtiene el valor de la propiedad movimientos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMovimientos() {
        return movimientos;
    }

    /**
     * Define el valor de la propiedad movimientos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMovimientos(Integer value) {
        this.movimientos = value;
    }

    /**
     * Obtiene el valor de la propiedad ventas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVentas() {
        return ventas;
    }

    /**
     * Define el valor de la propiedad ventas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVentas(Integer value) {
        this.ventas = value;
    }

    /**
     * Obtiene el valor de la propiedad compras.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompras() {
        return compras;
    }

    /**
     * Define el valor de la propiedad compras.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompras(Integer value) {
        this.compras = value;
    }

    /**
     * Obtiene el valor de la propiedad admin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdmin() {
        return admin;
    }

    /**
     * Define el valor de la propiedad admin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdmin(Integer value) {
        this.admin = value;
    }

}
