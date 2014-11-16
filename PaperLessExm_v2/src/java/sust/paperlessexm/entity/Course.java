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
import sust.paperlessexm.bean.CourseBean;

/**
 *
 * @author Sm19
 */
@Entity
@Table(name = "course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findByCourseId", query = "SELECT c FROM Course c WHERE c.courseId = :courseId"),
    @NamedQuery(name = "Course.findByCourseTitle", query = "SELECT c FROM Course c WHERE c.courseTitle = :courseTitle"),
    @NamedQuery(name = "Course.findByCourseCode", query = "SELECT c FROM Course c WHERE c.courseCode = :courseCode"),
    @NamedQuery(name = "Course.findByOfferingDept", query = "SELECT c FROM Course c WHERE c.offeringDept = :offeringDept"),
    @NamedQuery(name = "Course.findByAcceptingDept", query = "SELECT c FROM Course c WHERE c.acceptingDept = :acceptingDept"),
    @NamedQuery(name = "Course.findByCredit", query = "SELECT c FROM Course c WHERE c.credit = :credit"),
    @NamedQuery(name = "Course.findBySemester", query = "SELECT c FROM Course c WHERE c.semester = :semester"),
    @NamedQuery(name = "Course.findBySession", query = "SELECT c FROM Course c WHERE c.session = :session")})
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "course_id")
    private Integer courseId;
    @Basic(optional = false)
    @Column(name = "course_title")
    private String courseTitle;
    @Basic(optional = false)
    @Column(name = "course_code")
    private String courseCode;
    @Basic(optional = false)
    @Column(name = "offering_dept")
    private String offeringDept;
    @Basic(optional = false)
    @Column(name = "accepting_dept")
    private String acceptingDept;
    @Basic(optional = false)
    @Column(name = "credit")
    private double credit;
    @Basic(optional = false)
    @Column(name = "semester")
    private int semester;
    @Basic(optional = false)
    @Column(name = "session")
    private int session;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseId")
    private List<Teaches> teachesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseId")
    private List<Test> testList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseId")
    private List<CourseRegistration> courseRegistrationList;

    public Course() {
    }

    public Course(Integer courseId) {
        this.courseId = courseId;
    }

    public Course(Integer courseId, String courseTitle, String courseCode, String offeringDept, String acceptingDept, double credit, int semester, int session) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.offeringDept = offeringDept;
        this.acceptingDept = acceptingDept;
        this.credit = credit;
        this.semester = semester;
        this.session = session;
    }
    
    public Course(CourseBean course) {
        this.courseId = course.getCourseId();
        this.courseTitle = course.getCourseTitle();
        this.courseCode = course.getCourseCode();
        this.offeringDept = course.getOfferingDept();
        this.acceptingDept = course.getAcceptingDept();
        this.credit = course.getCredit();
        this.semester = course.getSemester();
        this.session = course.getSemester();
    }
    
    public Integer getCourseId() {
        return courseId;
    }

    public java.lang.Integer getPrimaryKey() {
        return getCourseId();
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getOfferingDept() {
        return offeringDept;
    }

    public void setOfferingDept(String offeringDept) {
        this.offeringDept = offeringDept;
    }

    public String getAcceptingDept() {
        return acceptingDept;
    }

    public void setAcceptingDept(String acceptingDept) {
        this.acceptingDept = acceptingDept;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    @XmlTransient
    public List<Teaches> getTeachesList() {
        return teachesList;
    }

    public void setTeachesList(List<Teaches> teachesList) {
        this.teachesList = teachesList;
    }

    @XmlTransient
    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
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
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sust.paperlessexm.entity.Course[ courseId=" + courseId + " ]";
    }

}

