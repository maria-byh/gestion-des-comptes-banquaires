
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour create complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="create"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tComptes" type="{http://ws/}tComptes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", propOrder = {
    "tComptes"
})
public class Create {

    protected TComptes tComptes;

    /**
     * Obtient la valeur de la propriété tComptes.
     * 
     * @return
     *     possible object is
     *     {@link TComptes }
     *     
     */
    public TComptes getTComptes() {
        return tComptes;
    }

    /**
     * Définit la valeur de la propriété tComptes.
     * 
     * @param value
     *     allowed object is
     *     {@link TComptes }
     *     
     */
    public void setTComptes(TComptes value) {
        this.tComptes = value;
    }

}