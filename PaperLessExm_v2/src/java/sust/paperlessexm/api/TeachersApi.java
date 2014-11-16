package sust.paperlessexm.api;

import sust.paperlessexm.bean.TeachersBean;

/**
 *
 * @author Sm19
 */
public interface TeachersApi {

    void addTeachers(TeachersBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveTeachers(TeachersBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteTeachers(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    TeachersBean getTeachers(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> getTeachersList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> getTeachersList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getTeachersListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByTeachersId(java.lang.Integer teachersId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByTeachersName(java.lang.String teachersName) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByTeachersDept(java.lang.String teachersDept) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByEmailAddress(java.lang.String emailAddress) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByContactNo(java.lang.String contactNo) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByPhoto(java.lang.String photo) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByPassword(java.lang.String password) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachersBean> findTeachersByEmployeeCode(java.lang.String employeeCode) throws sust.paperlessexm.exception.GenericBusinessException;
}

