package sust.paperlessexm.bean;

import sust.paperlessexm.entity.CourseRegistration;
import sust.paperlessexm.entity.Student;

/**
 *
 * @author Sm19
 */

public class CourseRegistrationBean {
    
    private Integer courseRegistrationId;
    private boolean isApproved;   
    private StudentBean studentId;   
    private CourseBean courseId;

    public CourseRegistrationBean() {
    }

    public CourseRegistrationBean(Integer courseRegistrationId, boolean isApproved, StudentBean studentId, CourseBean courseId) {
        this.courseRegistrationId = courseRegistrationId;
        this.isApproved = isApproved;
        this.studentId = studentId;
        this.courseId = courseId;
    }
    
    
    public CourseRegistrationBean(CourseRegistration courseRegistration) {
        this.courseRegistrationId = courseRegistration.getCourseRegistrationId();
        this.isApproved = courseRegistration.getIsApproved();
        this.studentId = new StudentBean(courseRegistration.getStudentId());
        this.courseId = new CourseBean(courseRegistration.getCourseId());
    }
    
    public CourseRegistration toEntity(CourseRegistrationBean courseRegistrationBean){
         CourseRegistration courseRegistration = new CourseRegistration();
         
         courseRegistration.setCourseRegistrationId(courseRegistrationBean.getCourseRegistrationId());
         courseRegistration.setCourseId(new CourseBean().toEntity(courseRegistrationBean.getCourseId()));
         courseRegistration.setIsApproved(courseRegistrationBean.getIsApproved());
         courseRegistration.setStudentId(new StudentBean().toEntity(courseRegistrationBean.getStudentId()));
         
         return courseRegistration;
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

    public StudentBean getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentBean studentId) {
        this.studentId = studentId;
    }

    public CourseBean getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseBean courseId) {
        this.courseId = courseId;
    }    
    
}


