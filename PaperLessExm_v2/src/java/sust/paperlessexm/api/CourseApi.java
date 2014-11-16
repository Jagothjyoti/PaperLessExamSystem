package sust.paperlessexm.api;

import sust.paperlessexm.bean.CourseBean;

/**
 *
 * @author Sm19
 */
public interface CourseApi {

    void addCourse(CourseBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveCourse(CourseBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteCourse(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    CourseBean getCourse(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> getCourseList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> getCourseList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getCourseListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByCourseTitle(java.lang.String courseTitle) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByCourseCode(java.lang.String courseCode) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByOfferingDept(java.lang.String offeringDept) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByAcceptingDept(java.lang.String acceptingDept) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseByCredit(java.lang.Double credit) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseBySemester(java.lang.Integer semester) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<CourseBean> findCourseBySession(java.lang.Integer session) throws sust.paperlessexm.exception.GenericBusinessException;
}
