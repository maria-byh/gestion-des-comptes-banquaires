
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tEmployes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tEmployes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numEmpSup" type="{http://ws/}tEmployes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEmployes", propOrder = {
    "nomEmp",
    "numEmp",
    "numEmpSup"
})
public class TEmployes {

    protected String nomEmp;
    protected Integer numEmp;
    protected TEmployes numEmpSup;

    /**
     * Obtient la valeur de la propriété nomEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEmp() {
        return nomEmp;
    }

    /**
     * Définit la valeur de la propriété nomEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEmp(String value) {
        this.nomEmp = value;
    }

    /**
     * Obtient la valeur de la propriété numEmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEmp() {
        return numEmp;
    }

    /**
     * Définit la valeur de la propriété numEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEmp(Integer value) {
        this.numEmp = value;
    }

    /**
     * Obtient la valeur de la propriété numEmpSup.
     * 
     * @return
     *     possible object is
     *     {@link TEmployes }
     *     
     */
    public TEmployes getNumEmpSup() {
        return numEmpSup;
    }

    /**
     * Définit la valeur de la propriété numEmpSup.
     * 
     * @param value
     *     allowed object is
     *     {@link TEmployes }
     *     
     */
    public void setNumEmpSup(TEmployes value) {
        this.numEmpSup = value;
    }

}
