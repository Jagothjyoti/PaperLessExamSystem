/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.CourseRegistrationBean;

/**
 *
 * @author Sm19
 */
public interface CourseRegistrationApi {

    void addCourseRegistration(CourseRegistrationBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveCourseRegistration(CourseRegistrationBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteCourseRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    CourseRegistrationBean getCourseRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> getCourseRegistrationList() throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> getCourseRegistrationList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getCourseRegistrationListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> findCourseRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> findCourseRegistrationByIsApproved(java.lang.String isApproved) throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> findCourseRegistrationByStudentId(java.lang.Integer studentId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<CourseRegistrationBean> findCourseRegistrationByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;

}
