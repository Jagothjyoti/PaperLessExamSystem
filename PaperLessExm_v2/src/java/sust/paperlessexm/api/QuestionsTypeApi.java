/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.QuestionsTypeBean;

/**
 *
 * @author Jagothjyoti
 */
public interface QuestionsTypeApi {

    void addQuestionsType(QuestionsTypeBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveQuestionsType(QuestionsTypeBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteQuestionsType(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    QuestionsTypeBean getQuestionsType(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsTypeBean> getQuestionsTypeList() throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsTypeBean> getQuestionsTypeList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getQuestionsTypeListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsTypeBean> findQuestionsTypeByQuestionsTypeId(java.lang.Integer questionsTypeId) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsTypeBean> findQuestionsTypeByNoOfOptions(java.lang.Integer noOfOptions) throws sust.paperlessexm.exception.GenericBusinessException;

    List<QuestionsTypeBean> findQuestionsTypeByTypeName(java.lang.String typeName) throws sust.paperlessexm.exception.GenericBusinessException;

}
