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
@Table(name = "questions_ans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuestionsAns.findAll", query = "SELECT q FROM QuestionsAns q"),
    @NamedQuery(name = "QuestionsAns.findByQuestionsAnsId", query = "SELECT q FROM QuestionsAns q WHERE q.questionsAnsId = :questionsAnsId"),
    @NamedQuery(name = "QuestionsAns.findByGivenAns", query = "SELECT q FROM QuestionsAns q WHERE q.givenAns = :givenAns"),
    @NamedQuery(name = "QuestionsAns.findByGivenMarks", query = "SELECT q FROM QuestionsAns q WHERE q.givenMarks = :givenMarks")})
public class QuestionsAns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "questions_ans_id")
    private Integer questionsAnsId;
    @Column(name = "given_ans")
    private String givenAns;
    @Column(name = "given_marks")
    private Integer givenMarks;
    @JoinColumn(name = "questions_id", referencedColumnName = "questions_id")
    @ManyToOne(optional = false)
    private Questions questionsId;
    @JoinColumn(name = "test_registration_id", referencedColumnName = "test_registration_id")
    @ManyToOne(optional = false)
    private TestRegistration testRegistrationId;

    public QuestionsAns() {
    }

    public QuestionsAns(Integer questionsAnsId) {
        this.questionsAnsId = questionsAnsId;
    }

    public Integer getQuestionsAnsId() {
        return questionsAnsId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getQuestionsAnsId();
    }

    public void setQuestionsAnsId(Integer questionsAnsId) {
        this.questionsAnsId = questionsAnsId;
    }

    public String getGivenAns() {
        return givenAns;
    }

    public void setGivenAns(String givenAns) {
        this.givenAns = givenAns;
    }

    public Integer getGivenMarks() {
        return givenMarks;
    }

    public void setGivenMarks(Integer givenMarks) {
        this.givenMarks = givenMarks;
    }

    public Questions getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(Questions questionsId) {
        this.questionsId = questionsId;
    }

    public TestRegistration getTestRegistrationId() {
        return testRegistrationId;
    }

    public void setTestRegistrationId(TestRegistration testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionsAnsId != null ? questionsAnsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuestionsAns)) {
            return false;
        }
        QuestionsAns other = (QuestionsAns) object;
        if ((this.questionsAnsId == null && other.questionsAnsId != null) || (this.questionsAnsId != null && !this.questionsAnsId.equals(other.questionsAnsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.QuestionsAns[ questionsAnsId=" + questionsAnsId + " ]";
    }
    
}
