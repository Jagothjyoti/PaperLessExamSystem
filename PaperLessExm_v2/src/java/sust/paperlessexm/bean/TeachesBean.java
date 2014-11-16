package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Course;

import sust.paperlessexm.entity.Teaches;

/**
 *
 * @author Sm19
 */
public class TeachesBean {

    private Integer teachesId;
    private TeachersBean teachersId;
    private CourseBean courseId;

    public TeachesBean() {
    }

    public TeachesBean(Integer teachesId, TeachersBean teachersId, CourseBean courseId) {
        this.teachesId = teachesId;
        this.teachersId = teachersId;
        this.courseId = courseId;
    }

    public TeachesBean(Teaches teaches) {
        this.teachesId = teaches.getTeachesId();
        this.teachersId = new TeachersBean(teaches.getTeachersId());
        this.courseId = new CourseBean(teaches.getCourseId());
    }

    public Teaches toEntity(TeachesBean teachesBean) {
        Teaches teaches = new Teaches();
        
        teaches.setTeachesId(teachesBean.getTeachesId());
        teaches.setCourseId(new CourseBean().toEntity(teachesBean.getCourseId()));
        teaches.setTeachersId(new TeachersBean().toEntity(teachesBean.getTeachersId()));
        return teaches;
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

    public TeachersBean getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(TeachersBean teachersId) {
        this.teachersId = teachersId;
    }

    public CourseBean getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseBean courseId) {
        this.courseId = courseId;
    }
}
