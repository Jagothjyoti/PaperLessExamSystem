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
@Table(name = "test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t"),
    @NamedQuery(name = "Test.findByTestId", query = "SELECT t FROM Test t WHERE t.testId = :testId"),
    @NamedQuery(name = "Test.findByMarks", query = "SELECT t FROM Test t WHERE t.marks = :marks"),
    @NamedQuery(name = "Test.findByTestTitle", query = "SELECT t FROM Test t WHERE t.testTitle = :testTitle"),
    @NamedQuery(name = "Test.findByCreateDate", query = "SELECT t FROM Test t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "Test.findByUpdateDate", query = "SELECT t FROM Test t WHERE t.updateDate = :updateDate"),
    @NamedQuery(name = "Test.findByTestTime", query = "SELECT t FROM Test t WHERE t.testTime = :testTime"),
    @NamedQuery(name = "Test.findByTestDuration", query = "SELECT t FROM Test t WHERE t.testDuration = :testDuration"),
    @NamedQuery(name = "Test.findByDescription", query = "SELECT t FROM Test t WHERE t.description = :description"),
    @NamedQuery(name = "Test.findByTestNo", query = "SELECT t FROM Test t WHERE t.testNo = :testNo")})
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "test_id")
    private Integer testId;
    @Basic(optional = false)
    @Column(name = "marks")
    private int marks;
    @Column(name = "test_title")
    private Integer testTitle;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "update_date")
    @Temporal(TemporalType.DATE)
    private Date updateDate;
    @Column(name = "test_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testTime;
    @Basic(optional = false)
    @Column(name = "test_duration")
    private int testDuration;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "test_no")
    private int testNo;
    @JoinColumn(name = "teaches_id", referencedColumnName = "teaches_id")
    @ManyToOne(optional = false)
    private Teaches teachesId;
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course courseId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private List<Questions> questionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private List<TestRegistration> testRegistrationList;

    public Test() {
    }

    public Test(Integer testId) {
        this.testId = testId;
    }

    public Test(Integer testId, int marks, Date createDate, Date updateDate, int testDuration, int testNo) {
        this.testId = testId;
        this.marks = marks;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.testDuration = testDuration;
        this.testNo = testNo;
    }

    public Integer getTestId() {
        return testId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getTestId();
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Integer getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(Integer testTitle) {
        this.testTitle = testTitle;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public int getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(int testDuration) {
        this.testDuration = testDuration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTestNo() {
        return testNo;
    }

    public void setTestNo(int testNo) {
        this.testNo = testNo;
    }

    public Teaches getTeachesId() {
        return teachesId;
    }

    public void setTeachesId(Teaches teachesId) {
        this.teachesId = teachesId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @XmlTransient
    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    @XmlTransient
    public List<TestRegistration> getTestRegistrationList() {
        return testRegistrationList;
    }

    public void setTestRegistrationList(List<TestRegistration> testRegistrationList) {
        this.testRegistrationList = testRegistrationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testId != null ? testId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.testId == null && other.testId != null) || (this.testId != null && !this.testId.equals(other.testId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Test[ testId=" + testId + " ]";
    }
    
}
