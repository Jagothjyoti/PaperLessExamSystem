
package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Teachers;

/**
 *
 * @author Sm19
 */
public class TeachersBean {

    private Integer teachersId;
    private String teachersName;
    private String teachersDept;
    private String emailAddress;
    private String contactNo;
    private String photo;
    private String password;
    private String employeeCode;

    public TeachersBean() {
    }

    public TeachersBean(Integer teachersId, String teachersName, String teachersDept, String emailAddress, String contactNo, String photo, String password, String employeeCode) {
        this.teachersId = teachersId;
        this.teachersName = teachersName;
        this.teachersDept = teachersDept;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
        this.photo = photo;
        this.password = password;
        this.employeeCode = employeeCode;
    }

    public TeachersBean(Teachers teachers) {
        this.teachersId = teachers.getTeachersId();
        this.teachersName = teachers.getTeachersName();
        this.teachersDept = teachers.getTeachersDept();
        this.emailAddress = teachers.getEmailAddress();
        this.contactNo = teachers.getContactNo();
        this.photo = teachers.getPhoto();
        this.password = teachers.getPassword();
        this.employeeCode = teachers.getEmployeeCode();
    }
    
    public Teachers toEntity(TeachersBean teachers) {
        Teachers tec=new Teachers();
        
        tec.setContactNo(teachers.getContactNo());
        tec.setEmailAddress(teachers.getEmailAddress());
        tec.setEmployeeCode(teachers.getEmployeeCode());
        tec.setPassword(teachers.getEmployeeCode());
        tec.setPhoto(teachers.getPhoto());
        tec.setTeachersDept(teachers.getTeachersDept());
        tec.setTeachersId(teachers.getTeachersId());
        tec.setTeachersName(teachers.getTeachersName());
        return tec;
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
}
