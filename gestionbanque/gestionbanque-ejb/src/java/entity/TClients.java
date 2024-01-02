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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ibelm
 */
@Entity
@Table(name = "t_clients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TClients.findAll", query = "SELECT t FROM TClients t"),
    @NamedQuery(name = "TClients.findByCodeCli", query = "SELECT t FROM TClients t WHERE t.codeCli = :codeCli")})
public class TClients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code_cli")
    private Integer codeCli;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "NOM_CLI")
    private String nomCli;
    @OneToMany(mappedBy = "codeCli", fetch = FetchType.LAZY)
    private Collection<TComptes> tComptesCollection;

    public TClients() {
    }

    public TClients(Integer codeCli) {
        this.codeCli = codeCli;
    }

    public TClients(Integer codeCli, String nomCli) {
        this.codeCli = codeCli;
        this.nomCli = nomCli;
    }

    public Integer getCodeCli() {
        return codeCli;
    }

    public void setCodeCli(Integer codeCli) {
        this.codeCli = codeCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    @XmlTransient
    public Collection<TComptes> getTComptesCollection() {
        return tComptesCollection;
    }

    public void setTComptesCollection(Collection<TComptes> tComptesCollection) {
        this.tComptesCollection = tComptesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCli != null ? codeCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TClients)) {
            return false;
        }
        TClients other = (TClients) object;
        if ((this.codeCli == null && other.codeCli != null) || (this.codeCli != null && !this.codeCli.equals(other.codeCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TClients[ codeCli=" + codeCli + " ]";
    }
    
}
