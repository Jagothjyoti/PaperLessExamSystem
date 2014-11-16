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
@Table(name = "teachers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t"),
    @NamedQuery(name = "Teachers.findByTeachersId", query = "SELECT t FROM Teachers t WHERE t.teachersId = :teachersId"),
    @NamedQuery(name = "Teachers.findByTeachersName", query = "SELECT t FROM Teachers t WHERE t.teachersName = :teachersName"),
    @NamedQuery(name = "Teachers.findByTeachersDept", query = "SELECT t FROM Teachers t WHERE t.teachersDept = :teachersDept"),
    @NamedQuery(name = "Teachers.findByEmailAddress", query = "SELECT t FROM Teachers t WHERE t.emailAddress = :emailAddress"),
    @NamedQuery(name = "Teachers.findByContactNo", query = "SELECT t FROM Teachers t WHERE t.contactNo = :contactNo"),
    @NamedQuery(name = "Teachers.findByPhoto", query = "SELECT t FROM Teachers t WHERE t.photo = :photo"),
    @NamedQuery(name = "Teachers.findByPassword", query = "SELECT t FROM Teachers t WHERE t.password = :password"),
    @NamedQuery(name = "Teachers.findByEmployeeCode", query = "SELECT t FROM Teachers t WHERE t.employeeCode = :employeeCode")})
public class Teachers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "teachers_id")
    private Integer teachersId;
    @Basic(optional = false)
    @Column(name = "teachers_name")
    private String teachersName;
    @Basic(optional = false)
    @Column(name = "teachers_dept")
    private String teachersDept;
    @Basic(optional = false)
    @Column(name = "email_address")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "photo")
    private String photo;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "employee_code")
    private String employeeCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teachersId")
    private List<Teaches> teachesList;

    public Teachers() {
    }

    public Teachers(Integer teachersId) {
        this.teachersId = teachersId;
    }

    public Teachers(Integer teachersId, String teachersName, String teachersDept, String emailAddress, String contactNo, String password, String employeeCode) {
        this.teachersId = teachersId;
        this.teachersName = teachersName;
        this.teachersDept = teachersDept;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
        this.password = password;
        this.employeeCode = employeeCode;
    }

    public Integer getTeachersId() {
        return teachersId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getTeachersId();
    }
    public void setTeachersId(Integer teachersId) {
        this.teachersId = teachersId;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getTeachersDept() {
        return teachersDept;
    }

    public void setTeachersDept(String teachersDept) {
        this.teachersDept = teachersDept;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @XmlTransient
    public List<Teaches> getTeachesList() {
        return teachesList;
    }

    public void setTeachesList(List<Teaches> teachesList) {
        this.teachesList = teachesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teachersId != null ? teachersId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teachers)) {
            return false;
        }
        Teachers other = (Teachers) object;
        if ((this.teachersId == null && other.teachersId != null) || (this.teachersId != null && !this.teachersId.equals(other.teachersId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Teachers[ teachersId=" + teachersId + " ]";
    }
    
}
