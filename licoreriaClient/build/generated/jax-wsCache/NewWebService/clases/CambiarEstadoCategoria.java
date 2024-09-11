
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarEstadoCategoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarEstadoCategoria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCategoria" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoCategoria", propOrder = {
    "idCategoria"
})
public class CambiarEstadoCategoria {

    protected int idCategoria;

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

}
