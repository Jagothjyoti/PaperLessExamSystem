package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Student;

/**
 *
 * @author Sm19
 */
public class StudentBean {

    private Integer studentId;
    private String registrationNo;
    private String studentName;
    private String password;
    private int session;
    private String emailAddress;
    private String contactNo;
    private String photo;
    private DepartmentBean departmentId;

    public StudentBean() {
    }

    public StudentBean(Integer studentId, String registrationNo, String studentName, String password, int session, String emailAddress, String contactNo, String photo, DepartmentBean departmentId) {
        this.studentId = studentId;
        this.registrationNo = registrationNo;
        this.studentName = studentName;
        this.password = password;
        this.session = session;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
        this.photo = photo;
        this.departmentId = departmentId;
    }

    public StudentBean(Student student) {
        this.studentId = student.getStudentId();
        this.registrationNo = student.getRegistrationNo();
        this.studentName = student.getStudentName();
        this.password = student.getPassword();
        this.session = student.getSession();
        this.emailAddress = student.getEmailAddress();
        this.contactNo = student.getContactNo();
        this.photo = student.getPhoto();
        this.departmentId = new DepartmentBean(student.getDepartmentId());
    }
    
    public Student toEntity(StudentBean studentBean) {
        Student student=new Student();
        
        student.setContactNo(studentBean.getContactNo());
        student.setRegistrationNo(studentBean.getRegistrationNo());
        student.setStudentId(studentBean.getStudentId());
        student.setStudentName(studentBean.getStudentName());
        student.setPassword(studentBean.getPassword());
        student.setSession(studentBean.getSession());
        student.setEmailAddress(studentBean.getEmailAddress());
        student.setPhoto(studentBean.getPhoto());
        student.setDepartmentId(new DepartmentBean().toEntity(studentBean.getDepartmentId()));
        
        return student;
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

    public DepartmentBean getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(DepartmentBean departmentId) {
        this.departmentId = departmentId;
    }

}
