/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sust.paperlessexm.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sm19
 */
@Entity
@Table(name = "questions_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuestionsType.findAll", query = "SELECT q FROM QuestionsType q"),
    @NamedQuery(name = "QuestionsType.findByQuestionsTypeId", query = "SELECT q FROM QuestionsType q WHERE q.questionsTypeId = :questionsTypeId"),
    @NamedQuery(name = "QuestionsType.findByNoOfOptions", query = "SELECT q FROM QuestionsType q WHERE q.noOfOptions = :noOfOptions"),
    @NamedQuery(name = "QuestionsType.findByTypeName", query = "SELECT q FROM QuestionsType q WHERE q.typeName = :typeName")})
public class QuestionsType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "questions_type_id")
    private Integer questionsTypeId;
    @Basic(optional = false)
    @Column(name = "no_of_options")
    private int noOfOptions;
    @Basic(optional = false)
    @Column(name = "type_name")
    private String typeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionsTypeId")
    private List<Questions> questionsList;

    public QuestionsType() {
    }

    public QuestionsType(Integer questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

    public QuestionsType(Integer questionsTypeId, int noOfOptions, String typeName) {
        this.questionsTypeId = questionsTypeId;
        this.noOfOptions = noOfOptions;
        this.typeName = typeName;
    }

    public Integer getQuestionsTypeId() {
        return questionsTypeId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getQuestionsTypeId();
    }
    public void setQuestionsTypeId(Integer questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

    public int getNoOfOptions() {
        return noOfOptions;
    }

    public void setNoOfOptions(int noOfOptions) {
        this.noOfOptions = noOfOptions;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @XmlTransient
    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionsTypeId != null ? questionsTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuestionsType)) {
            return false;
        }
        QuestionsType other = (QuestionsType) object;
        if ((this.questionsTypeId == null && other.questionsTypeId != null) || (this.questionsTypeId != null && !this.questionsTypeId.equals(other.questionsTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.QuestionsType[ questionsTypeId=" + questionsTypeId + " ]";
    }
    
}
