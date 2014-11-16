package sust.paperlessexm.bean;

import java.util.Date;
import sust.paperlessexm.entity.Test;

/**
 *
 * @author Sm19
 */
public class TestBean {

    private Integer testId;
    private int marks;
    private Integer testTitle;
    private Date createDate;
    private Date updateDate;
    private Date testTime;
    private int testDuration;
    private String description;
    private int testNo;
    private TeachesBean teachesId;
    private CourseBean courseId;

    public TestBean() {
    }

    public TestBean(Integer testId, int marks, Integer testTitle, Date createDate, Date updateDate, Date testTime, int testDuration, String description, int testNo, TeachesBean teachesId, CourseBean courseId) {
        this.testId = testId;
        this.marks = marks;
        this.testTitle = testTitle;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.testTime = testTime;
        this.testDuration = testDuration;
        this.description = description;
        this.testNo = testNo;
        this.teachesId = teachesId;
        this.courseId = courseId;
    }

    public TestBean(Test test) {
        this.testId = test.getTestId();
        this.marks = test.getMarks();
        this.testTitle = test.getTestTitle();
        this.createDate = test.getCreateDate();
        this.updateDate = test.getUpdateDate();
        this.testTime = test.getTestTime();
        this.testDuration = test.getTestDuration();
        this.description = test.getDescription();
        this.testNo = test.getTestNo();
        this.teachesId = new TeachesBean(test.getTeachesId());
        this.courseId = new CourseBean(test.getCourseId());
    }
    
    public Test toEntity(TestBean testBean){
        Test test =  new Test();
        test.setTestId(testBean.getTestId());
        test.setMarks(testBean.getMarks());
        test.setCourseId(new CourseBean().toEntity(testBean.getCourseId()));
        test.setTestTitle(testBean.getTestTitle());
        test.setCreateDate(testBean.getCreateDate());
        test.setUpdateDate(testBean.getUpdateDate());
        test.setTestTime(testBean.getTestTime());
        test.setTestDuration(testBean.getTestDuration());
        test.setDescription(testBean.getDescription());
        test.setTeachesId(new TeachesBean().toEntity(testBean.getTeachesId()));
        return test;
    }

    public Integer getTestId() {
        return testId;
    }

    public java.lang.Integer getPrimaryKey() {
        return  getTestId();
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

    public TeachesBean getTeachesId() {
        return teachesId;
    }

    public void setTeachesId(TeachesBean teachesId) {
        this.teachesId = teachesId;
    }

    public CourseBean getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseBean courseId) {
        this.courseId = courseId;
    }

}
