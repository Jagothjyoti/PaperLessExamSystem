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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByQuestionsId", query = "SELECT q FROM Questions q WHERE q.questionsId = :questionsId"),
    @NamedQuery(name = "Questions.findByTotalMarks", query = "SELECT q FROM Questions q WHERE q.totalMarks = :totalMarks"),
    @NamedQuery(name = "Questions.findByCorrectAns", query = "SELECT q FROM Questions q WHERE q.correctAns = :correctAns"),
    @NamedQuery(name = "Questions.findByIsDirectMarking", query = "SELECT q FROM Questions q WHERE q.isDirectMarking = :isDirectMarking"),
    @NamedQuery(name = "Questions.findByQuestionNo", query = "SELECT q FROM Questions q WHERE q.questionNo = :questionNo")})
public class Questions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "questions_id")
    private Integer questionsId;
    @Basic(optional = false)
    @Column(name = "total_marks")
    private int totalMarks;
    @Basic(optional = false)
    @Column(name = "correct_ans")
    private String correctAns;
    @Basic(optional = false)
    @Column(name = "is_direct_marking")
    private boolean isDirectMarking;
    @Basic(optional = false)
    @Column(name = "question_no")
    private int questionNo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionsId")
    private List<QuestionsAns> questionsAnsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionsId")
    private List<OptionsStores> optionsStoresList;
    @JoinColumn(name = "test_id", referencedColumnName = "test_id")
    @ManyToOne(optional = false)
    private Test testId;
    @JoinColumn(name = "questions_type_id", referencedColumnName = "questions_type_id")
    @ManyToOne(optional = false)
    private QuestionsType questionsTypeId;

    public Questions() {
    }

    public Questions(Integer questionsId) {
        this.questionsId = questionsId;
    }

    public Questions(Integer questionsId, int totalMarks, String correctAns, boolean isDirectMarking, int questionNo) {
        this.questionsId = questionsId;
        this.totalMarks = totalMarks;
        this.correctAns = correctAns;
        this.isDirectMarking = isDirectMarking;
        this.questionNo = questionNo;
    }

    public Integer getQuestionsId() {
        return questionsId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getQuestionsId();
    }
    
    public void setQuestionsId(Integer questionsId) {
        this.questionsId = questionsId;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public boolean getIsDirectMarking() {
        return isDirectMarking;
    }

    public void setIsDirectMarking(boolean isDirectMarking) {
        this.isDirectMarking = isDirectMarking;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    @XmlTransient
    public List<QuestionsAns> getQuestionsAnsList() {
        return questionsAnsList;
    }

    public void setQuestionsAnsList(List<QuestionsAns> questionsAnsList) {
        this.questionsAnsList = questionsAnsList;
    }

    @XmlTransient
    public List<OptionsStores> getOptionsStoresList() {
        return optionsStoresList;
    }

    public void setOptionsStoresList(List<OptionsStores> optionsStoresList) {
        this.optionsStoresList = optionsStoresList;
    }

    public Test getTestId() {
        return testId;
    }

    public void setTestId(Test testId) {
        this.testId = testId;
    }

    public QuestionsType getQuestionsTypeId() {
        return questionsTypeId;
    }

    public void setQuestionsTypeId(QuestionsType questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionsId != null ? questionsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.questionsId == null && other.questionsId != null) || (this.questionsId != null && !this.questionsId.equals(other.questionsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Questions[ questionsId=" + questionsId + " ]";
    }
    
}
