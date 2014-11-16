package sust.paperlessexm.bean;

import java.util.Date;
import sust.paperlessexm.entity.Test;
import sust.paperlessexm.entity.TestRegistration;

/**
 *
 * @author Sm19
 */
public class TestRegistrationBean {

    private Integer testRegistrationId;
    private Integer testMarks;
    private Date startTime;
    private Date submitTime;
    private TestBean testId;
    private CourseRegistrationBean courseRegistrationId;

    public TestRegistrationBean() {
    }

    public TestRegistrationBean(Integer testRegistrationId, Integer testMarks, Date startTime, Date submitTime, TestBean testId, CourseRegistrationBean courseRegistrationId) {
        this.testRegistrationId = testRegistrationId;
        this.testMarks = testMarks;
        this.startTime = startTime;
        this.submitTime = submitTime;
        this.testId = testId;
        this.courseRegistrationId = courseRegistrationId;
    }

    public TestRegistrationBean(TestRegistration testRegistration) {
        this.testRegistrationId = testRegistration.getTestRegistrationId();
        this.testMarks = testRegistration.getTestMarks();
        this.startTime = testRegistration.getStartTime();
        this.submitTime = testRegistration.getSubmitTime();
        this.testId = new TestBean(testRegistration.getTestId());
        this.courseRegistrationId = new CourseRegistrationBean(testRegistration.getCourseRegistrationId());
    }
    
    public TestRegistration toEntity(TestRegistrationBean testRegistrationBean){
       TestRegistration testRegistration = new TestRegistration();
       testRegistration.setTestRegistrationId(testRegistrationBean.getTestRegistrationId());
       testRegistration.setTestId(new TestBean().toEntity(testRegistrationBean.getTestId()));
       testRegistration.setTestMarks(testRegistrationBean.getTestMarks());
       testRegistration.setStartTime(testRegistrationBean.getStartTime());
       testRegistration.setSubmitTime(testRegistrationBean.getSubmitTime());
       testRegistration.setCourseRegistrationId(new CourseRegistrationBean().toEntity(testRegistrationBean.getCourseRegistrationId()));
       
       return testRegistration;
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

    public TestBean getTestId() {
        return testId;
    }

    public void setTestId(TestBean testId) {
        this.testId = testId;
    }

    public CourseRegistrationBean getCourseRegistrationId() {
        return courseRegistrationId;
    }

    public void setCourseRegistrationId(CourseRegistrationBean courseRegistrationId) {
        this.courseRegistrationId = courseRegistrationId;
    }
}
