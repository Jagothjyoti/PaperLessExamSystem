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
@Table(name = "teaches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teaches.findAll", query = "SELECT t FROM Teaches t"),
    @NamedQuery(name = "Teaches.findByTeachesId", query = "SELECT t FROM Teaches t WHERE t.teachesId = :teachesId")})
public class Teaches implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "teaches_id")
    private Integer teachesId;
    @JoinColumn(name = "teachers_id", referencedColumnName = "teachers_id")
    @ManyToOne(optional = false)
    private Teachers teachersId;
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course courseId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teachesId")
    private List<Test> testList;

    public Teaches() {
    }

    public Teaches(Integer teachesId) {
        this.teachesId = teachesId;
    }

    public Integer getTeachesId() {
        return teachesId;
    }
    public java.lang.Integer getPrimaryKey() {
        return getTeachesId();
    }

    public void setTeachesId(Integer teachesId) {
        this.teachesId = teachesId;
    }

    public Teachers getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(Teachers teachersId) {
        this.teachersId = teachersId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @XmlTransient
    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teachesId != null ? teachesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teaches)) {
            return false;
        }
        Teaches other = (Teaches) object;
        if ((this.teachesId == null && other.teachesId != null) || (this.teachesId != null && !this.teachesId.equals(other.teachesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Teaches[ teachesId=" + teachesId + " ]";
    }
    
}
