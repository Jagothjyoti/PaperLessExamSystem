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
@Table(name = "course_registration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CourseRegistration.findAll", query = "SELECT c FROM CourseRegistration c"),
    @NamedQuery(name = "CourseRegistration.findByCourseRegistrationId", query = "SELECT c FROM CourseRegistration c WHERE c.courseRegistrationId = :courseRegistrationId"),
    @NamedQuery(name = "CourseRegistration.findByIsApproved", query = "SELECT c FROM CourseRegistration c WHERE c.isApproved = :isApproved")})
public class CourseRegistration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "course_registration_id")
    private Integer courseRegistrationId;
    @Basic(optional = false)
    @Column(name = "is_approved")
    private boolean isApproved;
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    @ManyToOne(optional = false)
    private Student studentId;
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course courseId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseRegistrationId")
    private List<TestRegistration> testRegistrationList;

    public CourseRegistration() {
    }

    public CourseRegistration(Integer courseRegistrationId) {
        this.courseRegistrationId = courseRegistrationId;
    }

    public CourseRegistration(Integer courseRegistrationId, boolean isApproved) {
        this.courseRegistrationId = courseRegistrationId;
        this.isApproved = isApproved;
    }

    public Integer getCourseRegistrationId() {
        return courseRegistrationId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getCourseRegistrationId();
    }

    public void setCourseRegistrationId(Integer courseRegistrationId) {
        this.courseRegistrationId = courseRegistrationId;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
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
        hash += (courseRegistrationId != null ? courseRegistrationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseRegistration)) {
            return false;
        }
        CourseRegistration other = (CourseRegistration) object;
        if ((this.courseRegistrationId == null && other.courseRegistrationId != null) || (this.courseRegistrationId != null && !this.courseRegistrationId.equals(other.courseRegistrationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.CourseRegistration[ courseRegistrationId=" + courseRegistrationId + " ]";
    }

}
