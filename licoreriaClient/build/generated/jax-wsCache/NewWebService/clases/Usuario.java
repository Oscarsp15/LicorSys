
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dashboard" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="empleado" type="{http://clases/}empleado" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movimientos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://clases/}rol" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ventas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "admin",
    "compras",
    "dashboard",
    "empleado",
    "id",
    "movimientos",
    "password",
    "rol",
    "usuario",
    "ventas"
})
public class Usuario {

    protected int admin;
    protected int compras;
    protected int dashboard;
    protected Empleado empleado;
    protected int id;
    protected int movimientos;
    protected String password;
    protected Rol rol;
    protected String usuario;
    protected int ventas;

    /**
     * Obtiene el valor de la propiedad admin.
     * 
     */
    public int getAdmin() {
        return admin;
    }

    /**
     * Define el valor de la propiedad admin.
     * 
     */
    public void setAdmin(int value) {
        this.admin = value;
    }

    /**
     * Obtiene el valor de la propiedad compras.
     * 
     */
    public int getCompras() {
        return compras;
    }

    /**
     * Define el valor de la propiedad compras.
     * 
     */
    public void setCompras(int value) {
        this.compras = value;
    }

    /**
     * Obtiene el valor de la propiedad dashboard.
     * 
     */
    public int getDashboard() {
        return dashboard;
    }

    /**
     * Define el valor de la propiedad dashboard.
     * 
     */
    public void setDashboard(int value) {
        this.dashboard = value;
    }

    /**
     * Obtiene el valor de la propiedad empleado.
     * 
     * @return
     *     possible object is
     *     {@link Empleado }
     *     
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Define el valor de la propiedad empleado.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado }
     *     
     */
    public void setEmpleado(Empleado value) {
        this.empleado = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad movimientos.
     * 
     */
    public int getMovimientos() {
        return movimientos;
    }

    /**
     * Define el valor de la propiedad movimientos.
     * 
     */
    public void setMovimientos(int value) {
        this.movimientos = value;
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
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link Rol }
     *     
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link Rol }
     *     
     */
    public void setRol(Rol value) {
        this.rol = value;
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
     * Obtiene el valor de la propiedad ventas.
     * 
     */
    public int getVentas() {
        return ventas;
    }

    /**
     * Define el valor de la propiedad ventas.
     * 
     */
    public void setVentas(int value) {
        this.ventas = value;
    }

}
