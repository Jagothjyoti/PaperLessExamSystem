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
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentId", query = "SELECT s FROM Student s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Student.findByRegistrationNo", query = "SELECT s FROM Student s WHERE s.registrationNo = :registrationNo"),
    @NamedQuery(name = "Student.findByStudentName", query = "SELECT s FROM Student s WHERE s.studentName = :studentName"),
    @NamedQuery(name = "Student.findByPassword", query = "SELECT s FROM Student s WHERE s.password = :password"),
    @NamedQuery(name = "Student.findBySession", query = "SELECT s FROM Student s WHERE s.session = :session"),
    @NamedQuery(name = "Student.findByEmailAddress", query = "SELECT s FROM Student s WHERE s.emailAddress = :emailAddress"),
    @NamedQuery(name = "Student.findByContactNo", query = "SELECT s FROM Student s WHERE s.contactNo = :contactNo"),
    @NamedQuery(name = "Student.findByPhoto", query = "SELECT s FROM Student s WHERE s.photo = :photo")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_id")
    private Integer studentId;
    @Basic(optional = false)
    @Column(name = "registration_no")
    private String registrationNo;
    @Basic(optional = false)
    @Column(name = "student_name")
    private String studentName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "session")
    private int session;
    @Basic(optional = false)
    @Column(name = "email_address")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "photo")
    private String photo;
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @ManyToOne(optional = false)
    private Department departmentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<CourseRegistration> courseRegistrationList;

    public Student() {
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(Integer studentId, String registrationNo, String studentName, String password, int session, String emailAddress, String contactNo) {
        this.studentId = studentId;
        this.registrationNo = registrationNo;
        this.studentName = studentName;
        this.password = password;
        this.session = session;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
    }

    public Integer getStudentId() {
        return studentId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getStudentId();
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    @XmlTransient
    public List<CourseRegistration> getCourseRegistrationList() {
        return courseRegistrationList;
    }

    public void setCourseRegistrationList(List<CourseRegistration> courseRegistrationList) {
        this.courseRegistrationList = courseRegistrationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Student[ studentId=" + studentId + " ]";
    }
    
}
