
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarEstadoTipoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarEstadoTipoComprobante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoTipoComprobante", propOrder = {
    "idTipoComprobante"
})
public class CambiarEstadoTipoComprobante {

    protected int idTipoComprobante;

    /**
     * Obtiene el valor de la propiedad idTipoComprobante.
     * 
     */
    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    /**
     * Define el valor de la propiedad idTipoComprobante.
     * 
     */
    public void setIdTipoComprobante(int value) {
        this.idTipoComprobante = value;
    }

}
