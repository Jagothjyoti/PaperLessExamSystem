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
 * The <code>TestRegistrationService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class TestRegistrationService implements ITestRegistrationService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(TestRegistrationService.class);


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
    * Adds a new testRegistration to the database.
    *
    * @param model a data object
    * @return TestRegistration a data object with the primary key
    */
   public sust.paperlessexm.entity.TestRegistration addTestRegistration(sust.paperlessexm.entity.TestRegistration model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getTestRegistration(model.getPrimaryKey());
      } finally {
         log.debug("finished addTestRegistration(sust.paperlessexm.entity.TestRegistration model)");
      }
   }

   /**
    * Stores the <code>TestRegistration</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveTestRegistration(sust.paperlessexm.entity.TestRegistration model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveTestRegistration(sust.paperlessexm.entity.TestRegistration model)");
      }
   }

   /**
    * Removes a testRegistration.
    *
    * @param id the unique reference for the testRegistration
    */
   public void deleteTestRegistration(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         TestRegistration bean = (TestRegistration) hibernateTemplate.get(TestRegistration.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteTestRegistration(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return TestRegistration the data object
    */
   public sust.paperlessexm.entity.TestRegistration getTestRegistration(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      TestRegistration bean = (TestRegistration) hibernateTemplate.get(TestRegistration.class, id);
      return bean;
      } finally {
         log.debug("finished getTestRegistration(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all testRegistration instances.
    *
    * @return a list of TestRegistration objects.
    */
   public List getTestRegistrationList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + TestRegistration.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.testRegistrationId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getTestRegistrationList");
      }
   }

   /**
    * Returns a subset of all testRegistration instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of testRegistration instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTestRegistrationListSize()</code> = last record),
    * any values greater than or equal to the total number of testRegistration instances will cause
    * the full set to be returned.
    * @return a list of TestRegistration objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getTestRegistrationList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getTestRegistrationList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of testRegistration objects in the database.
    *
    * @return an integer value.
    */
   public int getTestRegistrationListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + TestRegistration.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getTestRegistrationListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified testRegistrationId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testRegistrationId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationByTestRegistrationId(java.lang.Integer testRegistrationId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.testRegistrationId like :testRegistrationId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testRegistrationId", testRegistrationId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationByTestRegistrationId(java.lang.Integer testRegistrationId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testMarks field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testMarks the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationByTestMarks(java.lang.Integer testMarks) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.testMarks like :testMarks ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testMarks", testMarks);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationByTestMarks(java.lang.Integer testMarks)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified startTime field.
     * To use a wildcard search, use a % in the query.
     *
     * @param startTime the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationByStartTime(java.sql.Timestamp startTime) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.startTime like :startTime ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "startTime", startTime);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationByStartTime(java.sql.Timestamp startTime)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified submitTime field.
     * To use a wildcard search, use a % in the query.
     *
     * @param submitTime the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationBySubmitTime(java.sql.Timestamp submitTime) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.submitTime like :submitTime ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "submitTime", submitTime);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationBySubmitTime(java.sql.Timestamp submitTime)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationByTestId(java.lang.Integer testId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.testId like :testId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testId", testId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationByTestId(java.lang.Integer testId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified courseRegistrationId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseRegistrationId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    public java.util.List findTestRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + TestRegistration.class.getName() + " e where e.courseRegistrationId like :courseRegistrationId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testRegistrationId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseRegistrationId", courseRegistrationId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId)");
      }
    }


}
