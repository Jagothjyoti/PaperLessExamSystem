package sust.paperlessexm.api;

import sust.paperlessexm.bean.TestRegistrationBean;

/**
 *
 * @author Sm19
 */
public interface TestRegistrationApi {

    void addTestRegistration(TestRegistrationBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveTestRegistration(TestRegistrationBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteTestRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    TestRegistrationBean getTestRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> getTestRegistrationList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> getTestRegistrationList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getTestRegistrationListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationByTestRegistrationId(java.lang.Integer testRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationByTestMarks(java.lang.Integer testMarks) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationByStartTime(java.sql.Timestamp startTime) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationBySubmitTime(java.sql.Timestamp submitTime) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TestRegistrationBean> findTestRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;

}
