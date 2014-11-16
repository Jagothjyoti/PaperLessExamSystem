package sust.paperlessexm.api;

import sust.paperlessexm.bean.StudentBean;

/**
 *
 * @author Sm19
 */
public interface StudentApi {

    void addStudent(StudentBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveStudent(StudentBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteStudent(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    StudentBean getStudent(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> getStudentList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> getStudentList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getStudentListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByStudentId(java.lang.Integer studentId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByRegistrationNo(java.lang.String registrationNo) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByStudentName(java.lang.String studentName) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByPassword(java.lang.String password) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentBySession(java.lang.Integer session) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByEmailAddress(java.lang.String emailAddress) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByContactNo(java.lang.String contactNo) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByPhoto(java.lang.String photo) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<StudentBean> findStudentByDepartmentId(java.lang.Integer departmentId) throws sust.paperlessexm.exception.GenericBusinessException;

}
