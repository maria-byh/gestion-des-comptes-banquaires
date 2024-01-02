/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ibelm
 */
@Entity
@Table(name = "t_comptes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TComptes.findAll", query = "SELECT t FROM TComptes t"),
    @NamedQuery(name = "TComptes.findByNumCpte", query = "SELECT t FROM TComptes t WHERE t.numCpte = :numCpte"),
    @NamedQuery(name = "TComptes.findByDateCr", query = "SELECT t FROM TComptes t WHERE t.dateCr = :dateCr"),
    @NamedQuery(name = "TComptes.findBySolde", query = "SELECT t FROM TComptes t WHERE t.solde = :solde")})
public class TComptes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUM_CPTE")
    private Integer numCpte;
    @Lob
    @Size(max = 65535)
    @Column(name = "TYPE_PTE")
    private String typePte;
    @Column(name = "DATE_CR")
    @Temporal(TemporalType.DATE)
    private Date dateCr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOLDE")
    private Double solde;
    @JoinColumn(name = "CODE_CLI", referencedColumnName = "code_cli")
    @ManyToOne(fetch = FetchType.LAZY)
    private TClients codeCli;
    @JoinColumn(name = "NUM_EMP", referencedColumnName = "NUM_EMP")
    @ManyToOne(fetch = FetchType.LAZY)
    private TEmployes numEmp;
    @OneToMany(mappedBy = "numCpte", fetch = FetchType.LAZY)
    private Collection<TOperations> tOperationsCollection;

    public TComptes() {
    }

    public TComptes(Integer numCpte) {
        this.numCpte = numCpte;
    }

    public Integer getNumCpte() {
        return numCpte;
    }

    public void setNumCpte(Integer numCpte) {
        this.numCpte = numCpte;
    }

    public String getTypePte() {
        return typePte;
    }

    public void setTypePte(String typePte) {
        this.typePte = typePte;
    }

    public Date getDateCr() {
        return dateCr;
    }

    public void setDateCr(Date dateCr) {
        this.dateCr = dateCr;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public TClients getCodeCli() {
        return codeCli;
    }

    public void setCodeCli(TClients codeCli) {
        this.codeCli = codeCli;
    }

    public TEmployes getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(TEmployes numEmp) {
        this.numEmp = numEmp;
    }

    @XmlTransient
    public Collection<TOperations> getTOperationsCollection() {
        return tOperationsCollection;
    }

    public void setTOperationsCollection(Collection<TOperations> tOperationsCollection) {
        this.tOperationsCollection = tOperationsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCpte != null ? numCpte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TComptes)) {
            return false;
        }
        TComptes other = (TComptes) object;
        if ((this.numCpte == null && other.numCpte != null) || (this.numCpte != null && !this.numCpte.equals(other.numCpte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TComptes[ numCpte=" + numCpte + " ]";
    }
    
}
