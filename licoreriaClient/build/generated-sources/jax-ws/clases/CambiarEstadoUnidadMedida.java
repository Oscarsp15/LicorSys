
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarEstadoUnidadMedida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarEstadoUnidadMedida"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUnidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoUnidadMedida", propOrder = {
    "idUnidad"
})
public class CambiarEstadoUnidadMedida {

    protected int idUnidad;

    /**
     * Obtiene el valor de la propiedad idUnidad.
     * 
     */
    public int getIdUnidad() {
        return idUnidad;
    }

    /**
     * Define el valor de la propiedad idUnidad.
     * 
     */
    public void setIdUnidad(int value) {
        this.idUnidad = value;
    }

}
