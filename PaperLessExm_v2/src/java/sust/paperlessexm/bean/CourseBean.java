package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Course;

public class CourseBean {
    private Integer courseId;
    private String courseTitle;
    private String courseCode;
    private String offeringDept;
    private String acceptingDept;
    private double credit;
    private int semester;
    private int session;

    public CourseBean() {
    }

    public CourseBean(Integer courseId, String courseTitle, String courseCode, String offeringDept, String acceptingDept, double credit, int semester, int session) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.offeringDept = offeringDept;
        this.acceptingDept = acceptingDept;
        this.credit = credit;
        this.semester = semester;
        this.session = session;
    }
    
    
    public CourseBean(Course course) {
        this.courseId = course.getCourseId();
        this.courseTitle = course.getCourseTitle();
        this.courseCode = course.getCourseCode();
        this.offeringDept = course.getOfferingDept();
        this.acceptingDept = course.getAcceptingDept();
        this.credit = course.getCredit();
        this.semester = course.getSemester();
        this.session = course.getSemester();
    }
    
    public Course toEntity(CourseBean course){
        Course co=new Course();
        
        co.setCourseId(course.getCourseId());
        co.setCourseTitle(course.getCourseTitle());        
        co.setCourseCode(course.getCourseCode());        
        co.setOfferingDept(course.getOfferingDept());        
        co.setAcceptingDept(course.getAcceptingDept());        
        co.setCredit(course.getCredit());        
        co.setSemester( course.getSemester());        
        co.setSession(course.getSemester());
        return co;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getCourseId();
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
}
