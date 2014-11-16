/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sust.paperlessexm.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sm19
 */
@Entity
@Table(name = "options_stores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OptionsStores.findAll", query = "SELECT o FROM OptionsStores o"),
    @NamedQuery(name = "OptionsStores.findByOptionsStoresId", query = "SELECT o FROM OptionsStores o WHERE o.optionsStoresId = :optionsStoresId"),
    @NamedQuery(name = "OptionsStores.findByOptionsText", query = "SELECT o FROM OptionsStores o WHERE o.optionsText = :optionsText")})
public class OptionsStores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "options_stores_id")
    private Integer optionsStoresId;
    @Basic(optional = false)
    @Column(name = "options_text")
    private String optionsText;
    @JoinColumn(name = "questions_id", referencedColumnName = "questions_id")
    @ManyToOne(optional = false)
    private Questions questionsId;

    public OptionsStores() {
    }

    public OptionsStores(Integer optionsStoresId) {
        this.optionsStoresId = optionsStoresId;
    }

    public OptionsStores(Integer optionsStoresId, String optionsText) {
        this.optionsStoresId = optionsStoresId;
        this.optionsText = optionsText;
    }

    public Integer getOptionsStoresId() {
        return optionsStoresId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getOptionsStoresId();
    }

    public void setOptionsStoresId(Integer optionsStoresId) {
        this.optionsStoresId = optionsStoresId;
    }

    public String getOptionsText() {
        return optionsText;
    }

    public void setOptionsText(String optionsText) {
        this.optionsText = optionsText;
    }

    public Questions getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(Questions questionsId) {
        this.questionsId = questionsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (optionsStoresId != null ? optionsStoresId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionsStores)) {
            return false;
        }
        OptionsStores other = (OptionsStores) object;
        if ((this.optionsStoresId == null && other.optionsStoresId != null) || (this.optionsStoresId != null && !this.optionsStoresId.equals(other.optionsStoresId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.OptionsStores[ optionsStoresId=" + optionsStoresId + " ]";
    }
    
}
