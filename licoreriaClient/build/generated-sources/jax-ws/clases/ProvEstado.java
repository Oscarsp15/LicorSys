
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prov_estado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prov_estado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cod_dispositivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prov_estado", propOrder = {
    "codDispositivo"
})
public class ProvEstado {

    @XmlElement(name = "cod_dispositivo")
    protected int codDispositivo;

    /**
     * Obtiene el valor de la propiedad codDispositivo.
     * 
     */
    public int getCodDispositivo() {
        return codDispositivo;
    }

    /**
     * Define el valor de la propiedad codDispositivo.
     * 
     */
    public void setCodDispositivo(int value) {
        this.codDispositivo = value;
    }

}
