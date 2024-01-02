
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tClients complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tClients"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeCli" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nomCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tClients", propOrder = {
    "codeCli",
    "nomCli"
})
public class TClients {

    protected Integer codeCli;
    protected String nomCli;

    /**
     * Obtient la valeur de la propriété codeCli.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeCli() {
        return codeCli;
    }

    /**
     * Définit la valeur de la propriété codeCli.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeCli(Integer value) {
        this.codeCli = value;
    }

    /**
     * Obtient la valeur de la propriété nomCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCli() {
        return nomCli;
    }

    /**
     * Définit la valeur de la propriété nomCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCli(String value) {
        this.nomCli = value;
    }

}
