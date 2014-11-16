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
 * The <code>TestService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class TestService implements ITestService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(TestService.class);


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
    * Adds a new test to the database.
    *
    * @param model a data object
    * @return Test a data object with the primary key
    */
   public sust.paperlessexm.entity.Test addTest(sust.paperlessexm.entity.Test model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getTest(model.getPrimaryKey());
      } finally {
         log.debug("finished addTest(sust.paperlessexm.entity.Test model)");
      }
   }

   /**
    * Stores the <code>Test</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveTest(sust.paperlessexm.entity.Test model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveTest(sust.paperlessexm.entity.Test model)");
      }
   }

   /**
    * Removes a test.
    *
    * @param id the unique reference for the test
    */
   public void deleteTest(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Test bean = (Test) hibernateTemplate.get(Test.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteTest(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Test the data object
    */
   public sust.paperlessexm.entity.Test getTest(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Test bean = (Test) hibernateTemplate.get(Test.class, id);
      return bean;
      } finally {
         log.debug("finished getTest(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all test instances.
    *
    * @return a list of Test objects.
    */
   public List getTestList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Test.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.testId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getTestList");
      }
   }

   /**
    * Returns a subset of all test instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of test instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTestListSize()</code> = last record),
    * any values greater than or equal to the total number of test instances will cause
    * the full set to be returned.
    * @return a list of Test objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getTestList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getTestList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of test objects in the database.
    *
    * @return an integer value.
    */
   public int getTestListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Test.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getTestListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified testId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTestId(java.lang.Integer testId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.testId like :testId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testId", testId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTestId(java.lang.Integer testId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified marks field.
     * To use a wildcard search, use a % in the query.
     *
     * @param marks the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByMarks(java.lang.Integer marks) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.marks like :marks ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "marks", marks);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByMarks(java.lang.Integer marks)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testTitle field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testTitle the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTestTitle(java.lang.Integer testTitle) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.testTitle like :testTitle ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testTitle", testTitle);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTestTitle(java.lang.Integer testTitle)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified createDate field.
     * To use a wildcard search, use a % in the query.
     *
     * @param createDate the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByCreateDate(java.sql.Date createDate) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.createDate like :createDate ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "createDate", createDate);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByCreateDate(java.sql.Date createDate)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified updateDate field.
     * To use a wildcard search, use a % in the query.
     *
     * @param updateDate the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByUpdateDate(java.sql.Date updateDate) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.updateDate like :updateDate ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "updateDate", updateDate);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByUpdateDate(java.sql.Date updateDate)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testTime field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testTime the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTestTime(java.sql.Timestamp testTime) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.testTime like :testTime ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testTime", testTime);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTestTime(java.sql.Timestamp testTime)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testDuration field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testDuration the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTestDuration(java.lang.Integer testDuration) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.testDuration like :testDuration ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testDuration", testDuration);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTestDuration(java.lang.Integer testDuration)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified description field.
     * To use a wildcard search, use a % in the query.
     *
     * @param description the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByDescription(java.lang.String description) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.description like :description ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "description", description);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByDescription(java.lang.String description)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified testNo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param testNo the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTestNo(java.lang.Integer testNo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.testNo like :testNo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "testNo", testNo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTestNo(java.lang.Integer testNo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByCourseId(java.lang.Integer courseId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.courseId like :courseId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseId", courseId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByCourseId(java.lang.Integer courseId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified teachesId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachesId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    public java.util.List findTestByTeachesId(java.lang.Integer teachesId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Test.class.getName() + " e where e.teachesId like :teachesId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.testId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachesId", teachesId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTestByTeachesId(java.lang.Integer teachesId)");
      }
    }


}
