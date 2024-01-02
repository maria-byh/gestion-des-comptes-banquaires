
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour create_operation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="create_operation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tOperations" type="{http://ws/}tOperations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create_operation", propOrder = {
    "tOperations"
})
public class CreateOperation {

    protected TOperations tOperations;

    /**
     * Obtient la valeur de la propriété tOperations.
     * 
     * @return
     *     possible object is
     *     {@link TOperations }
     *     
     */
    public TOperations getTOperations() {
        return tOperations;
    }

    /**
     * Définit la valeur de la propriété tOperations.
     * 
     * @param value
     *     allowed object is
     *     {@link TOperations }
     *     
     */
    public void setTOperations(TOperations value) {
        this.tOperations = value;
    }

}
