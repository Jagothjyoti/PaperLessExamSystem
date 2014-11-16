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
 * The <code>QuestionsAnsService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class QuestionsAnsService implements IQuestionsAnsService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(QuestionsAnsService.class);


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
    * Adds a new questionsAns to the database.
    *
    * @param model a data object
    * @return QuestionsAns a data object with the primary key
    */
   public sust.paperlessexm.entity.QuestionsAns addQuestionsAns(sust.paperlessexm.entity.QuestionsAns model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getQuestionsAns(model.getPrimaryKey());
      } finally {
         log.debug("finished addQuestionsAns(sust.paperlessexm.entity.QuestionsAns model)");
      }
   }

   /**
    * Stores the <code>QuestionsAns</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveQuestionsAns(sust.paperlessexm.entity.QuestionsAns model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveQuestionsAns(sust.paperlessexm.entity.QuestionsAns model)");
      }
   }

   /**
    * Removes a questionsAns.
    *
    * @param id the unique reference for the questionsAns
    */
   public void deleteQuestionsAns(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         QuestionsAns bean = (QuestionsAns) hibernateTemplate.get(QuestionsAns.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteQuestionsAns(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return QuestionsAns the data object
    */
   public sust.paperlessexm.entity.QuestionsAns getQuestionsAns(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      QuestionsAns bean = (QuestionsAns) hibernateTemplate.get(QuestionsAns.class, id);
      return bean;
      } finally {
         log.debug("finished getQuestionsAns(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all questionsAns instances.
    *
    * @return a list of QuestionsAns objects.
    */
   public List getQuestionsAnsList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + QuestionsAns.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.questionsAnsId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getQuestionsAnsList");
      }
   }

   /**
    * Returns a subset of all questionsAns instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questionsAns instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsAnsListSize()</code> = last record),
    * any values greater than or equal to the total number of questionsAns instances will cause
    * the full set to be returned.
    * @return a list of QuestionsAns objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getQuestionsAnsList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getQuestionsAnsList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of questionsAns objects in the database.
    *
    * @return an integer value.
    */
   public int getQuestionsAnsListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + QuestionsAns.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getQuestionsAnsListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified questionsAnsId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsAnsId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsAnsByQuestionsAnsId(java.lang.Integer questionsAnsId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e where e.questionsAnsId like :questionsAnsId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsAnsId", questionsAnsId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsAnsByQuestionsAnsId(java.lang.Integer questionsAnsId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified givenAns field.
     * To use a wildcard search, use a % in the query.
     *
     * @param givenAns the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsAnsByGivenAns(java.lang.String givenAns) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e where e.givenAns like :givenAns ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "givenAns", givenAns);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsAnsByGivenAns(java.lang.String givenAns)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified givenMarks field.
     * To use a wildcard search, use a % in the query.
     *
     * @param givenMarks the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsAnsByGivenMarks(java.lang.Integer givenMarks) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e where e.givenMarks like :givenMarks ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "givenMarks", givenMarks);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsAnsByGivenMarks(java.lang.Integer givenMarks)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsAnsByQuestionsId(java.lang.Integer questionsId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e where e.questionsId like :questionsId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsId", questionsId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsAnsByQuestionsId(java.lang.Integer questionsId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testRegistrationId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testRegistrationId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsAnsByTestRegistrationId(java.lang.Integer testRegistrationId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + QuestionsAns.class.getName() + " e where e.testRegistrationId like :testRegistrationId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsAnsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testRegistrationId", testRegistrationId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsAnsByTestRegistrationId(java.lang.Integer testRegistrationId)");
      }
    }


}
