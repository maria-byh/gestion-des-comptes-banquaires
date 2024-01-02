/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ibelm
 */
@Entity
@Table(name = "t_operations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TOperations.findAll", query = "SELECT t FROM TOperations t"),
    @NamedQuery(name = "TOperations.findByNumOp", query = "SELECT t FROM TOperations t WHERE t.numOp = :numOp"),
    @NamedQuery(name = "TOperations.findByDateOp", query = "SELECT t FROM TOperations t WHERE t.dateOp = :dateOp"),
    @NamedQuery(name = "TOperations.findByMontant", query = "SELECT t FROM TOperations t WHERE t.montant = :montant")})
public class TOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUM_OP")
    private Integer numOp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "TYPE_OP")
    private String typeOp;
    @Column(name = "DATE_OP")
    @Temporal(TemporalType.DATE)
    private Date dateOp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private Double montant;
    @JoinColumn(name = "NUM_CPTE", referencedColumnName = "NUM_CPTE")
    @ManyToOne(fetch = FetchType.LAZY)
    private TComptes numCpte;
    @JoinColumn(name = "NUM_EMP", referencedColumnName = "NUM_EMP")
    @ManyToOne(fetch = FetchType.LAZY)
    private TEmployes numEmp;

    public TOperations() {
    }

    public TOperations(Integer numOp) {
        this.numOp = numOp;
    }

    public TOperations(Integer numOp, String typeOp) {
        this.numOp = numOp;
        this.typeOp = typeOp;
    }

    public Integer getNumOp() {
        return numOp;
    }

    public void setNumOp(Integer numOp) {
        this.numOp = numOp;
    }

    public String getTypeOp() {
        return typeOp;
    }

    public void setTypeOp(String typeOp) {
        this.typeOp = typeOp;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public TComptes getNumCpte() {
        return numCpte;
    }

    public void setNumCpte(TComptes numCpte) {
        this.numCpte = numCpte;
    }

    public TEmployes getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(TEmployes numEmp) {
        this.numEmp = numEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numOp != null ? numOp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TOperations)) {
            return false;
        }
        TOperations other = (TOperations) object;
        if ((this.numOp == null && other.numOp != null) || (this.numOp != null && !this.numOp.equals(other.numOp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TOperations[ numOp=" + numOp + " ]";
    }
    
}
