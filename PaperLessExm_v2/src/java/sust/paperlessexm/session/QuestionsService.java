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
 * The <code>QuestionsService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class QuestionsService implements IQuestionsService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(QuestionsService.class);


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
    * Adds a new questions to the database.
    *
    * @param model a data object
    * @return Questions a data object with the primary key
    */
   public sust.paperlessexm.entity.Questions addQuestions(sust.paperlessexm.entity.Questions model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getQuestions(model.getPrimaryKey());
      } finally {
         log.debug("finished addQuestions(sust.paperlessexm.entity.Questions model)");
      }
   }

   /**
    * Stores the <code>Questions</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveQuestions(sust.paperlessexm.entity.Questions model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveQuestions(sust.paperlessexm.entity.Questions model)");
      }
   }

   /**
    * Removes a questions.
    *
    * @param id the unique reference for the questions
    */
   public void deleteQuestions(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Questions bean = (Questions) hibernateTemplate.get(Questions.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteQuestions(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Questions the data object
    */
   public sust.paperlessexm.entity.Questions getQuestions(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Questions bean = (Questions) hibernateTemplate.get(Questions.class, id);
      return bean;
      } finally {
         log.debug("finished getQuestions(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all questions instances.
    *
    * @return a list of Questions objects.
    */
   public List getQuestionsList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Questions.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.questionsId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getQuestionsList");
      }
   }

   /**
    * Returns a subset of all questions instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questions instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsListSize()</code> = last record),
    * any values greater than or equal to the total number of questions instances will cause
    * the full set to be returned.
    * @return a list of Questions objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getQuestionsList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getQuestionsList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of questions objects in the database.
    *
    * @return an integer value.
    */
   public int getQuestionsListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Questions.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getQuestionsListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByQuestionsId(java.lang.Integer questionsId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.questionsId like :questionsId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsId", questionsId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByQuestionsId(java.lang.Integer questionsId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified totalMarks field.
     * To use a wildcard search, use a % in the query.
     *
     * @param totalMarks the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByTotalMarks(java.lang.Integer totalMarks) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.totalMarks like :totalMarks ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "totalMarks", totalMarks);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByTotalMarks(java.lang.Integer totalMarks)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified correctAns field.
     * To use a wildcard search, use a % in the query.
     *
     * @param correctAns the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByCorrectAns(java.lang.String correctAns) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.correctAns like :correctAns ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "correctAns", correctAns);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByCorrectAns(java.lang.String correctAns)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified isDirectMarking field.
     * To use a wildcard search, use a % in the query.
     *
     * @param isDirectMarking the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByIsDirectMarking(java.lang.String isDirectMarking) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.isDirectMarking like :isDirectMarking ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "isDirectMarking", isDirectMarking);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByIsDirectMarking(java.lang.String isDirectMarking)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified questionNo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionNo the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByQuestionNo(java.lang.Integer questionNo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.questionNo like :questionNo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionNo", questionNo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByQuestionNo(java.lang.Integer questionNo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByTestId(java.lang.Integer testId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.testId like :testId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testId", testId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByTestId(java.lang.Integer testId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified questionsTypeId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param questionsTypeId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    public java.util.List findQuestionsByQuestionsTypeId(java.lang.Integer questionsTypeId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Questions.class.getName() + " e where e.questionsTypeId like :questionsTypeId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.questionsId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "questionsTypeId", questionsTypeId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findQuestionsByQuestionsTypeId(java.lang.Integer questionsTypeId)");
      }
    }


}
