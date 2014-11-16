/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.QuestionsTypeApi;
import sust.paperlessexm.bean.QuestionsTypeBean;
import sust.paperlessexm.entity.QuestionsType;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.QuestionsTypeService;



public class QuestionsTypeApiImpl  implements QuestionsTypeApi {

    @Override
    public void addQuestionsType(QuestionsTypeBean model) throws GenericBusinessException {
        QuestionsType questionType = new QuestionsTypeBean().toEntity(model);
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        questionsTypeService.addQuestionsType(questionType);
        
    }

    @Override
    public void saveQuestionsType(QuestionsTypeBean model) throws GenericBusinessException {
        QuestionsType questionType = new QuestionsTypeBean().toEntity(model);
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        questionsTypeService.addQuestionsType(questionType);
    }

    @Override
    public void deleteQuestionsType(Integer id) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        questionsTypeService.deleteQuestionsType(id);
    }

    @Override
    public QuestionsTypeBean getQuestionsType(Integer id) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        QuestionsType questionsType = questionsTypeService.getQuestionsType(id);
        return new QuestionsTypeBean(questionsType);
    }

    @Override
    public List<QuestionsTypeBean> getQuestionsTypeList() throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        List list1 = questionsTypeService.getQuestionsTypeList();
        List<QuestionsTypeBean>list = new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new QuestionsTypeBean((QuestionsType)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsTypeBean> getQuestionsTypeList(int startIndex, int endIndex) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        List list1 = questionsTypeService.getQuestionsTypeList(startIndex, endIndex);
        List<QuestionsTypeBean>list = new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new QuestionsTypeBean((QuestionsType)list1.get(i)));
        }
        return list;
    }

    @Override
    public int getQuestionsTypeListSize() throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        return questionsTypeService.getQuestionsTypeListSize();
    }

    @Override
    public List<QuestionsTypeBean> findQuestionsTypeByQuestionsTypeId(Integer questionsTypeId) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        List list1 = questionsTypeService.findQuestionsTypeByQuestionsTypeId(questionsTypeId);
        List<QuestionsTypeBean>list = new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new QuestionsTypeBean((QuestionsType)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsTypeBean> findQuestionsTypeByNoOfOptions(Integer noOfOptions) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        List list1 = questionsTypeService.findQuestionsTypeByNoOfOptions(noOfOptions);
        List<QuestionsTypeBean>list = new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new QuestionsTypeBean((QuestionsType)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<QuestionsTypeBean> findQuestionsTypeByTypeName(String typeName) throws GenericBusinessException {
        QuestionsTypeService questionsTypeService = new QuestionsTypeService();
        List list1 = questionsTypeService.findQuestionsTypeByTypeName(typeName);
        List<QuestionsTypeBean>list = new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new QuestionsTypeBean((QuestionsType)list1.get(i)));
        }
        return list;
    }
    
}
