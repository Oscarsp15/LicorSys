
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarEmpleado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEmpleado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarEmpleado", propOrder = {
    "idEmpleado"
})
public class BuscarEmpleado {

    protected int idEmpleado;

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

}
