/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ibelm
 */
@Entity
@Table(name = "t_employes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEmployes.findAll", query = "SELECT t FROM TEmployes t"),
    @NamedQuery(name = "TEmployes.findByNumEmp", query = "SELECT t FROM TEmployes t WHERE t.numEmp = :numEmp")})
public class TEmployes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUM_EMP")
    private Integer numEmp;
    @Lob
    @Size(max = 65535)
    @Column(name = "NOM_EMP")
    private String nomEmp;
    @OneToMany(mappedBy = "numEmp", fetch = FetchType.LAZY)
    private Collection<TComptes> tComptesCollection;
    @OneToMany(mappedBy = "numEmpSup", fetch = FetchType.LAZY)
    private Collection<TEmployes> tEmployesCollection;
    @JoinColumn(name = "NUM_EMP_SUP", referencedColumnName = "NUM_EMP")
    @ManyToOne(fetch = FetchType.LAZY)
    private TEmployes numEmpSup;
    @OneToMany(mappedBy = "numEmp", fetch = FetchType.LAZY)
    private Collection<TOperations> tOperationsCollection;

    public TEmployes() {
    }

    public TEmployes(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public Integer getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    @XmlTransient
    public Collection<TComptes> getTComptesCollection() {
        return tComptesCollection;
    }

    public void setTComptesCollection(Collection<TComptes> tComptesCollection) {
        this.tComptesCollection = tComptesCollection;
    }

    @XmlTransient
    public Collection<TEmployes> getTEmployesCollection() {
        return tEmployesCollection;
    }

    public void setTEmployesCollection(Collection<TEmployes> tEmployesCollection) {
        this.tEmployesCollection = tEmployesCollection;
    }

    public TEmployes getNumEmpSup() {
        return numEmpSup;
    }

    public void setNumEmpSup(TEmployes numEmpSup) {
        this.numEmpSup = numEmpSup;
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
        hash += (numEmp != null ? numEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEmployes)) {
            return false;
        }
        TEmployes other = (TEmployes) object;
        if ((this.numEmp == null && other.numEmp != null) || (this.numEmp != null && !this.numEmp.equals(other.numEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TEmployes[ numEmp=" + numEmp + " ]";
    }
    
}
