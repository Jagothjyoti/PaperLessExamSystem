/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.QuestionsAnsBean;

public interface QuestionsAnsApi {

    void addQuestionsAns(QuestionsAnsBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveQuestionsAns(QuestionsAnsBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteQuestionsAns(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    QuestionsAnsBean getQuestionsAns(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> getQuestionsAnsList() throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> getQuestionsAnsList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getQuestionsAnsListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> findQuestionsAnsByQuestionsAnsId(java.lang.Integer questionsAnsId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> findQuestionsAnsByGivenAns(java.lang.String givenAns) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> findQuestionsAnsByGivenMarks(java.lang.Integer givenMarks) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> findQuestionsAnsByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsAnsBean> findQuestionsAnsByTestRegistrationId(java.lang.Integer testRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;

}
