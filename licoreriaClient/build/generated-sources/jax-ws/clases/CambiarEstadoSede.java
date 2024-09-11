
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarEstadoSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarEstadoSede"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSede" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoSede", propOrder = {
    "idSede"
})
public class CambiarEstadoSede {

    protected int idSede;

    /**
     * Obtiene el valor de la propiedad idSede.
     * 
     */
    public int getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     */
    public void setIdSede(int value) {
        this.idSede = value;
    }

}
