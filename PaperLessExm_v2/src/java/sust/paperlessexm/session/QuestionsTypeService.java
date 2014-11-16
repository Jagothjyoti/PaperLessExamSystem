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
 * The <code>QuestionsTypeService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class QuestionsTypeService implements IQuestionsTypeService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(QuestionsTypeService.class);


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
    * Adds a new questionsType to the database.
    *
    * @param model a data object
    * @return QuestionsType a data object with the primary key
    */
   public sust.paperlessexm.entity.QuestionsType addQuestionsType(sust.paperlessexm.entity.QuestionsType model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getQuestionsType(model.getPrimaryKey());
      } finally {
         log.debug("finished addQuestionsType(sust.paperlessexm.entity.QuestionsType model)");
      }
   }

   /**
    * Stores the <code>QuestionsType</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveQuestionsType(sust.paperlessexm.entity.QuestionsType model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveQuestionsType(sust.paperlessexm.entity.QuestionsType model)");
      }
   }

   /**
    * Removes a questionsType.
    *
    * @param id the unique reference for the questionsType
    */
   public void deleteQuestionsType(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         QuestionsType bean = (QuestionsType) hibernateTemplate.get(QuestionsType.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteQuestionsType(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return QuestionsType the data object
    */
   public sust.paperlessexm.entity.QuestionsType getQuestionsType(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      QuestionsType bean = (QuestionsType) hibernateTemplate.get(QuestionsType.class, id);
      return bean;
      } finally {
         log.debug("finished getQuestionsType(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all questionsType instances.
    *
    * @return a list of QuestionsType objects.
    */
   public List getQuestionsTypeList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + QuestionsType.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.questionsTypeId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getQuestionsTypeList");
      }
   }

   /**
    * Returns a subset of all questionsType instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questionsType instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsTypeListSize()</code> = last record),
    * any values greater than or equal to the total number of questionsType instances will cause
    * the full set to be returned.
    * @return a list of QuestionsType objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getQuestionsTypeList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsType.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsTypeId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getQuestionsTypeList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of questionsType objects in the database.
    *
    * @return an integer value.
    */
   public int getQuestionsTypeListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + QuestionsType.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getQuestionsTypeListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified questionsTypeId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsTypeId the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsTypeByQuestionsTypeId(java.lang.Integer questionsTypeId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsType.class.getName() + " e where e.questionsTypeId like :questionsTypeId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsTypeId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsTypeId", questionsTypeId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsTypeByQuestionsTypeId(java.lang.Integer questionsTypeId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified noOfOptions field.
     * To use a wildcard search, use a % in the query.
     *
     * @param noOfOptions the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsTypeByNoOfOptions(java.lang.Integer noOfOptions) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsType.class.getName() + " e where e.noOfOptions like :noOfOptions ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsTypeId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "noOfOptions", noOfOptions);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsTypeByNoOfOptions(java.lang.Integer noOfOptions)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified typeName field.
     * To use a wildcard search, use a % in the query.
     *
     * @param typeName the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsTypeByTypeName(java.lang.String typeName) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsType.class.getName() + " e where e.typeName like :typeName ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsTypeId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "typeName", typeName);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsTypeByTypeName(java.lang.String typeName)");
      }
    }


}
