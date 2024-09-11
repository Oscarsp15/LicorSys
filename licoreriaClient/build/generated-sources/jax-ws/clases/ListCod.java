
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para list_cod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="list_cod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list_cod", propOrder = {
    "idProveedor"
})
public class ListCod {

    @XmlElement(name = "id_proveedor")
    protected int idProveedor;

    /**
     * Obtiene el valor de la propiedad idProveedor.
     * 
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * Define el valor de la propiedad idProveedor.
     * 
     */
    public void setIdProveedor(int value) {
        this.idProveedor = value;
    }

}
