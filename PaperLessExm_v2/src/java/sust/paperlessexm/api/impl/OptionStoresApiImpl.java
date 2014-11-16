package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.OptionsStoresApi;
import sust.paperlessexm.bean.OptionsStoresBean;
import sust.paperlessexm.entity.OptionsStores;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.OptionsStoresService;

public class OptionStoresApiImpl implements OptionsStoresApi {

    @Override
    public void addOptionsStores(OptionsStoresBean model) throws GenericBusinessException {
        OptionsStores optionsStores = new OptionsStoresBean().toEntity(model);
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        optionsStoresService.addOptionsStores(optionsStores);
    }

    @Override
    public void saveOptionsStores(OptionsStoresBean model) throws GenericBusinessException {
        OptionsStores optionsStores = new OptionsStoresBean().toEntity(model);
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        optionsStoresService.saveOptionsStores(optionsStores);
    }

    @Override
    public void deleteOptionsStores(Integer id) throws GenericBusinessException {

        OptionsStoresService optionsStoresService = new OptionsStoresService();
        optionsStoresService.deleteOptionsStores(id);
    }

    @Override
    public OptionsStoresBean getOptionsStores(Integer id) throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        OptionsStores optionsStores = optionsStoresService.getOptionsStores(id);
        return new OptionsStoresBean(optionsStores);
    }

    @Override
    public List<OptionsStoresBean> getOptionsStoresList() throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        List list1 = optionsStoresService.getOptionsStoresList();
        List<OptionsStoresBean>list=new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new OptionsStoresBean((OptionsStores)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<OptionsStoresBean> getOptionsStoresList(int startIndex, int endIndex) throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        List list1 = optionsStoresService.getOptionsStoresList(startIndex, endIndex);
        List<OptionsStoresBean>list=new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new OptionsStoresBean((OptionsStores)list1.get(i)));
        }
        return list;
    }

    @Override
    public int getOptionsStoresListSize() throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        return optionsStoresService.getOptionsStoresListSize();
    }

    @Override
    public List<OptionsStoresBean> findOptionsStoresByOptionsStoresId(Integer optionsStoresId) throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        List list1 = optionsStoresService.findOptionsStoresByOptionsStoresId(optionsStoresId);
        List<OptionsStoresBean>list=new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new OptionsStoresBean((OptionsStores)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<OptionsStoresBean> findOptionsStoresByOptionsText(String optionsText) throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        List list1 = optionsStoresService.findOptionsStoresByOptionsText(optionsText);
        List<OptionsStoresBean>list=new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new OptionsStoresBean((OptionsStores)list1.get(i)));
        }
        return list;
    }

    @Override
    public List<OptionsStoresBean> findOptionsStoresByQuestionsId(Integer questionsId) throws GenericBusinessException {
        OptionsStoresService optionsStoresService = new OptionsStoresService();
        List list1 = optionsStoresService.findOptionsStoresByQuestionsId(questionsId);
        List<OptionsStoresBean>list=new ArrayList<>();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new OptionsStoresBean((OptionsStores)list1.get(i)));
        }
        return list;
    }

}
