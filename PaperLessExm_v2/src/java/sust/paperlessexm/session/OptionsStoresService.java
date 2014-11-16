package sust.paperlessexm.session;

import java.util.*;
import sust.paperlessexm.*;
import sust.paperlessexm.servicelocator.LocatableService;
import com.finalist.util.log.*;
import sust.paperlessexm.exception.GenericBusinessException;
//import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.finalist.util.log.*;
import sust.paperlessexm.entity.*;

/**
 * The <code>OptionsStoresService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class OptionsStoresService implements IOptionsStoresService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(OptionsStoresService.class);


   /**
    * Default implementation for the Locatable Service interface.
    */
    public void init() {
    }

   /**
    * Default implementation for the Locatable Service interface.
    */
    public void destroy() {
    }

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/



   /**
    * Adds a new optionsStores to the database.
    *
    * @param model a data object
    * @return OptionsStores a data object with the primary key
    */
   public sust.paperlessexm.entity.OptionsStores addOptionsStores(sust.paperlessexm.entity.OptionsStores model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getOptionsStores(model.getPrimaryKey());
      } finally {
         log.debug("finished addOptionsStores(sust.paperlessexm.entity.OptionsStores model)");
      }
   }

   /**
    * Stores the <code>OptionsStores</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveOptionsStores(sust.paperlessexm.entity.OptionsStores model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveOptionsStores(sust.paperlessexm.entity.OptionsStores model)");
      }
   }

   /**
    * Removes a optionsStores.
    *
    * @param id the unique reference for the optionsStores
    */
   public void deleteOptionsStores(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         OptionsStores bean = (OptionsStores) hibernateTemplate.get(OptionsStores.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteOptionsStores(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return OptionsStores the data object
    */
   public sust.paperlessexm.entity.OptionsStores getOptionsStores(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      OptionsStores bean = (OptionsStores) hibernateTemplate.get(OptionsStores.class, id);
      return bean;
      } finally {
         log.debug("finished getOptionsStores(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all optionsStores instances.
    *
    * @return a list of OptionsStores objects.
    */
   public List getOptionsStoresList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + OptionsStores.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.optionsStoresId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getOptionsStoresList");
      }
   }

   /**
    * Returns a subset of all optionsStores instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of optionsStores instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getOptionsStoresListSize()</code> = last record),
    * any values greater than or equal to the total number of optionsStores instances will cause
    * the full set to be returned.
    * @return a list of OptionsStores objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getOptionsStoresList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + OptionsStores.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.optionsStoresId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getOptionsStoresList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of optionsStores objects in the database.
    *
    * @return an integer value.
    */
   public int getOptionsStoresListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + OptionsStores.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getOptionsStoresListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified optionsStoresId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param optionsStoresId the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    public java.util.List findOptionsStoresByOptionsStoresId(java.lang.Integer optionsStoresId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + OptionsStores.class.getName() + " e where e.optionsStoresId like :optionsStoresId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.optionsStoresId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "optionsStoresId", optionsStoresId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findOptionsStoresByOptionsStoresId(java.lang.Integer optionsStoresId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified optionsText field.
     * To use a wildcard search, use a % in the query.
     *
     * @param optionsText the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    public java.util.List findOptionsStoresByOptionsText(java.lang.String optionsText) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + OptionsStores.class.getName() + " e where e.optionsText like :optionsText ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.optionsStoresId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "optionsText", optionsText);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findOptionsStoresByOptionsText(java.lang.String optionsText)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsId the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    public java.util.List findOptionsStoresByQuestionsId(java.lang.Integer questionsId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + OptionsStores.class.getName() + " e where e.questionsId like :questionsId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.optionsStoresId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsId", questionsId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findOptionsStoresByQuestionsId(java.lang.Integer questionsId)");
      }
    }


}
