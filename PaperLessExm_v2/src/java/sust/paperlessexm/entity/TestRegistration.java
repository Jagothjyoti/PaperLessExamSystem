/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sust.paperlessexm.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sm19
 */
@Entity
@Table(name = "test_registration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TestRegistration.findAll", query = "SELECT t FROM TestRegistration t"),
    @NamedQuery(name = "TestRegistration.findByTestRegistrationId", query = "SELECT t FROM TestRegistration t WHERE t.testRegistrationId = :testRegistrationId"),
    @NamedQuery(name = "TestRegistration.findByTestMarks", query = "SELECT t FROM TestRegistration t WHERE t.testMarks = :testMarks"),
    @NamedQuery(name = "TestRegistration.findByStartTime", query = "SELECT t FROM TestRegistration t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "TestRegistration.findBySubmitTime", query = "SELECT t FROM TestRegistration t WHERE t.submitTime = :submitTime")})
public class TestRegistration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "test_registration_id")
    private Integer testRegistrationId;
    @Column(name = "test_marks")
    private Integer testMarks;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "submit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submitTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testRegistrationId")
    private List<QuestionsAns> questionsAnsList;
    @JoinColumn(name = "test_id", referencedColumnName = "test_id")
    @ManyToOne(optional = false)
    private Test testId;
    @JoinColumn(name = "course_registration_id", referencedColumnName = "course_registration_id")
    @ManyToOne(optional = false)
    private CourseRegistration courseRegistrationId;

    public TestRegistration() {
    }

    public TestRegistration(Integer testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }

    public Integer getTestRegistrationId() {
        return testRegistrationId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getTestRegistrationId();
    }

    public void setTestRegistrationId(Integer testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }

    public Integer getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(Integer testMarks) {
        this.testMarks = testMarks;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @XmlTransient
    public List<QuestionsAns> getQuestionsAnsList() {
        return questionsAnsList;
    }

    public void setQuestionsAnsList(List<QuestionsAns> questionsAnsList) {
        this.questionsAnsList = questionsAnsList;
    }

    public Test getTestId() {
        return testId;
    }

    public void setTestId(Test testId) {
        this.testId = testId;
    }

    public CourseRegistration getCourseRegistrationId() {
        return courseRegistrationId;
    }

    public void setCourseRegistrationId(CourseRegistration courseRegistrationId) {
        this.courseRegistrationId = courseRegistrationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testRegistrationId != null ? testRegistrationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestRegistration)) {
            return false;
        }
        TestRegistration other = (TestRegistration) object;
        if ((this.testRegistrationId == null && other.testRegistrationId != null) || (this.testRegistrationId != null && !this.testRegistrationId.equals(other.testRegistrationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.TestRegistration[ testRegistrationId=" + testRegistrationId + " ]";
    }
    
}
