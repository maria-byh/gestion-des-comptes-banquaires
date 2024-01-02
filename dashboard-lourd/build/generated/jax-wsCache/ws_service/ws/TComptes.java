
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour tComptes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tComptes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeCli" type="{http://ws/}tClients" minOccurs="0"/&gt;
 *         &lt;element name="dateCr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numCpte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numEmp" type="{http://ws/}tEmployes" minOccurs="0"/&gt;
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="typePte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComptes", propOrder = {
    "codeCli",
    "dateCr",
    "numCpte",
    "numEmp",
    "solde",
    "typePte"
})
public class TComptes {

    protected TClients codeCli;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCr;
    protected Integer numCpte;
    protected TEmployes numEmp;
    protected Double solde;
    protected String typePte;

    /**
     * Obtient la valeur de la propriété codeCli.
     * 
     * @return
     *     possible object is
     *     {@link TClients }
     *     
     */
    public TClients getCodeCli() {
        return codeCli;
    }

    /**
     * Définit la valeur de la propriété codeCli.
     * 
     * @param value
     *     allowed object is
     *     {@link TClients }
     *     
     */
    public void setCodeCli(TClients value) {
        this.codeCli = value;
    }

    /**
     * Obtient la valeur de la propriété dateCr.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCr() {
        return dateCr;
    }

    /**
     * Définit la valeur de la propriété dateCr.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCr(XMLGregorianCalendar value) {
        this.dateCr = value;
    }

    /**
     * Obtient la valeur de la propriété numCpte.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCpte() {
        return numCpte;
    }

    /**
     * Définit la valeur de la propriété numCpte.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCpte(Integer value) {
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
     * Obtient la valeur de la propriété solde.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSolde(Double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propriété typePte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePte() {
        return typePte;
    }

    /**
     * Définit la valeur de la propriété typePte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePte(String value) {
        this.typePte = value;
    }

}
