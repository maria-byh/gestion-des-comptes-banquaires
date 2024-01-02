
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour tOperations complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tOperations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numCpte" type="{http://ws/}tComptes" minOccurs="0"/&gt;
 *         &lt;element name="numEmp" type="{http://ws/}tEmployes" minOccurs="0"/&gt;
 *         &lt;element name="numOp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="typeOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperations", propOrder = {
    "dateOp",
    "montant",
    "numCpte",
    "numEmp",
    "numOp",
    "typeOp"
})
public class TOperations {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOp;
    protected Double montant;
    protected TComptes numCpte;
    protected TEmployes numEmp;
    protected Integer numOp;
    protected String typeOp;

    /**
     * Obtient la valeur de la propriété dateOp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOp() {
        return dateOp;
    }

    /**
     * Définit la valeur de la propriété dateOp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOp(XMLGregorianCalendar value) {
        this.dateOp = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontant(Double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété numCpte.
     * 
     * @return
     *     possible object is
     *     {@link TComptes }
     *     
     */
    public TComptes getNumCpte() {
        return numCpte;
    }

    /**
     * Définit la valeur de la propriété numCpte.
     * 
     * @param value
     *     allowed object is
     *     {@link TComptes }
     *     
     */
    public void setNumCpte(TComptes value) {
        this.numCpte = value;
    }

    /**
     * Obtient la valeur de la propriété numEmp.
     * 
     * @return
     *     possible object is
     *     {@link TEmployes }
     *     
     */
    public TEmployes getNumEmp() {
        return numEmp;
    }

    /**
     * Définit la valeur de la propriété numEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link TEmployes }
     *     
     */
    public void setNumEmp(TEmployes value) {
        this.numEmp = value;
    }

    /**
     * Obtient la valeur de la propriété numOp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOp() {
        return numOp;
    }

    /**
     * Définit la valeur de la propriété numOp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOp(Integer value) {
        this.numOp = value;
    }

    /**
     * Obtient la valeur de la propriété typeOp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOp() {
        return typeOp;
    }

    /**
     * Définit la valeur de la propriété typeOp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOp(String value) {
        this.typeOp = value;
    }

}
