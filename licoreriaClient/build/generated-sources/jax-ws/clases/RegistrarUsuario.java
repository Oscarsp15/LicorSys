
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_empleado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_rol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dashboard" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movimientos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ventas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarUsuario", propOrder = {
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
public class RegistrarUsuario {

    protected String usuario;
    protected String password;
    @XmlElement(name = "id_empleado")
    protected int idEmpleado;
    @XmlElement(name = "id_rol")
    protected int idRol;
    protected int dashboard;
    protected int movimientos;
    protected int ventas;
    protected int compras;
    protected int admin;

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
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Define el valor de la propiedad idEmpleado.
     * 
     */
    public void setIdEmpleado(int value) {
        this.idEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(int value) {
        this.idRol = value;
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

}
