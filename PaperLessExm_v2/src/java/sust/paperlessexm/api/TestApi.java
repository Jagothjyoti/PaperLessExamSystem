/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.TestBean;

/**
 *
 * @author Jagothjyoti
 */
public interface TestApi {

    void addTest(TestBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveTest(TestBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteTest(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    TestBean getTest(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> getTestList() throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> getTestList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getTestListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByMarks(java.lang.Integer marks) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTestTitle(java.lang.Integer testTitle) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByCreateDate(java.sql.Date createDate) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByUpdateDate(java.sql.Date updateDate) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTestTime(java.sql.Timestamp testTime) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTestDuration(java.lang.Integer testDuration) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByDescription(java.lang.String description) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTestNo(java.lang.Integer testNo) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<TestBean> findTestByTeachesId(java.lang.Integer teachesId) throws sust.paperlessexm.exception.GenericBusinessException;
    
}
