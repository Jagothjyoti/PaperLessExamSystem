package sust.paperlessexm.api;

import java.util.List;
import sust.paperlessexm.bean.OptionsStoresBean;
import sust.paperlessexm.entity.OptionsStores;
import sust.paperlessexm.entity.Questions;


public interface OptionsStoresApi {
    void addOptionsStores(OptionsStoresBean model) throws sust.paperlessexm.exception.GenericBusinessException;

  
   void saveOptionsStores(OptionsStoresBean model) throws sust.paperlessexm.exception.GenericBusinessException;

   void deleteOptionsStores(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   OptionsStoresBean getOptionsStores(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   List<OptionsStoresBean> getOptionsStoresList() throws sust.paperlessexm.exception.GenericBusinessException;

   
   List<OptionsStoresBean> getOptionsStoresList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   int getOptionsStoresListSize() throws sust.paperlessexm.exception.GenericBusinessException;

   
   List<OptionsStoresBean> findOptionsStoresByOptionsStoresId(java.lang.Integer optionsStoresId) throws sust.paperlessexm.exception.GenericBusinessException;
 
   List<OptionsStoresBean> findOptionsStoresByOptionsText(java.lang.String optionsText) throws sust.paperlessexm.exception.GenericBusinessException;
    
   List<OptionsStoresBean> findOptionsStoresByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;

}
