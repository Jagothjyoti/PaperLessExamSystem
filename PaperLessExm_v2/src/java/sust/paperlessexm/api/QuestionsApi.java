/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.QuestionsBean;

/**
 *
 * @author Sm19
 */
public interface QuestionsApi {

    void addQuestions(QuestionsBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveQuestions(QuestionsBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteQuestions(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    QuestionsBean getQuestions(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> getQuestionsList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<QuestionsBean> getQuestionsList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getQuestionsListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByTotalMarks(java.lang.Integer totalMarks) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByCorrectAns(java.lang.String correctAns) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByIsDirectMarking(java.lang.String isDirectMarking) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByQuestionNo(java.lang.Integer questionNo) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsBean> findQuestionsByQuestionsTypeId(java.lang.Integer questionsTypeId) throws sust.paperlessexm.exception.GenericBusinessException;

}
