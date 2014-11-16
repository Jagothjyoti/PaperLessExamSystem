

package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.QuestionsAnsApi;
import sust.paperlessexm.bean.QuestionsAnsBean;
import sust.paperlessexm.entity.QuestionsAns;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.QuestionsAnsService;


public class QuestionsAnsApiImpl implements QuestionsAnsApi{

    @Override
    public void addQuestionsAns(QuestionsAnsBean model) throws GenericBusinessException {
        QuestionsAns questionsAns = new  QuestionsAnsBean().toEntity(model);
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        questionsAnsService.addQuestionsAns(questionsAns);
    }

    @Override
    public void saveQuestionsAns(QuestionsAnsBean model) throws GenericBusinessException {
        QuestionsAns questionsAns = new  QuestionsAnsBean().toEntity(model);
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        questionsAnsService.saveQuestionsAns(questionsAns);
    }

    @Override
    public void deleteQuestionsAns(Integer id) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        questionsAnsService.deleteQuestionsAns(id);
    }

    @Override
    public QuestionsAnsBean getQuestionsAns(Integer id) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        QuestionsAns questionsAns = questionsAnsService.getQuestionsAns(id);
        return new QuestionsAnsBean(questionsAns);
    }

    @Override
    public List<QuestionsAnsBean> getQuestionsAnsList() throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.getQuestionsAnsList();
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsAnsBean> getQuestionsAnsList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if (endIndex - startIndex < 0) {
            return new ArrayList<>();
        }
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.getQuestionsAnsList(startIndex, endIndex);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public int getQuestionsAnsListSize() throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        return questionsAnsService.getQuestionsAnsListSize();
    }

    @Override
    public List<QuestionsAnsBean> findQuestionsAnsByQuestionsAnsId(Integer questionsAnsId) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.findQuestionsAnsByQuestionsId(questionsAnsId);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsAnsBean> findQuestionsAnsByGivenAns(String givenAns) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.findQuestionsAnsByGivenAns(givenAns);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsAnsBean> findQuestionsAnsByGivenMarks(Integer givenMarks) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.findQuestionsAnsByGivenMarks(givenMarks);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsAnsBean> findQuestionsAnsByQuestionsId(Integer questionsId) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.findQuestionsAnsByQuestionsId(questionsId);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsAnsBean> findQuestionsAnsByTestRegistrationId(Integer testRegistrationId) throws GenericBusinessException {
        QuestionsAnsService questionsAnsService = new QuestionsAnsService();
        List list1 = questionsAnsService.findQuestionsAnsByTestRegistrationId(testRegistrationId);
        List<QuestionsAnsBean>list=new ArrayList<>();
        
        for( int i = 0 ; i < list1.size() ; i++) {
            list.add(new QuestionsAnsBean((QuestionsAns)list1.get(i)));
        }
        return list;
    }
    
}
