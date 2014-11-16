/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.QuestionsApi;
import sust.paperlessexm.bean.QuestionsBean;
import sust.paperlessexm.entity.Questions;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.QuestionsService;

/**
 *
 * @author Jagothjyoti
 */
public class QustionsApiImpl implements QuestionsApi{

    @Override
    public void addQuestions(QuestionsBean model) throws GenericBusinessException {
        Questions questions = new QuestionsBean().toEnity(model);
        QuestionsService questionsService = new QuestionsService();
        questionsService.addQuestions(questions);
    }

    @Override
    public void saveQuestions(QuestionsBean model) throws GenericBusinessException {
        Questions questions = new QuestionsBean().toEnity(model);
        QuestionsService questionsService = new QuestionsService();
        questionsService.saveQuestions(questions);
    }

    @Override
    public void deleteQuestions(Integer id) throws GenericBusinessException {
        QuestionsService questionsService =new QuestionsService();
        questionsService.deleteQuestions(id);
    }

    @Override
    public QuestionsBean getQuestions(Integer id) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        Questions questions = questionsService.getQuestions(id);
        return new QuestionsBean(questions);
    }

    @Override
    public List<QuestionsBean> getQuestionsList() throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.getQuestionsList();
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> getQuestionsList(int startIndex, int endIndex) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.getQuestionsList(startIndex, endIndex);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public int getQuestionsListSize() throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        return questionsService.getQuestionsListSize();
    }

    @Override
    public List<QuestionsBean> findQuestionsByQuestionsId(Integer questionsId) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByQuestionsId(questionsId);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByTotalMarks(Integer totalMarks) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByTotalMarks(totalMarks);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByCorrectAns(String correctAns) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByCorrectAns(correctAns);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByIsDirectMarking(String isDirectMarking) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByIsDirectMarking(isDirectMarking);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByQuestionNo(Integer questionNo) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByQuestionNo(questionNo);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByTestId(Integer testId) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByTestId(testId);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsBean> findQuestionsByQuestionsTypeId(Integer questionsTypeId) throws GenericBusinessException {
        QuestionsService questionsService = new QuestionsService();
        List list1 = questionsService.findQuestionsByQuestionsTypeId(questionsTypeId);
        List<QuestionsBean>list = new ArrayList();
        for( int i = 0 ; i < list1.size() ; i++ ){
           list.add(new QuestionsBean((Questions)list1.get(i)));
        }
        return list;
    }
    
}
