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
 * The <code>CourseService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.00 $, $Date: 2014/11/01 12:39:09 $
 *
 */
public class CourseService implements ICourseService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(CourseService.class);


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
    * Adds a new course to the database.
    *
    * @param model a data object
    * @return Course a data object with the primary key
    */
   public sust.paperlessexm.entity.Course addCourse(sust.paperlessexm.entity.Course model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getCourse(model.getPrimaryKey());
      } finally {
         log.debug("finished addCourse(sust.paperlessexm.entity.Course model)");
      }
   }

   /**
    * Stores the <code>Course</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveCourse(sust.paperlessexm.entity.Course model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveCourse(sust.paperlessexm.entity.Course model)");
      }
   }

   /**
    * Removes a course.
    *
    * @param id the unique reference for the course
    */
   public void deleteCourse(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Course bean = (Course) hibernateTemplate.get(Course.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteCourse(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Course the data object
    */
   public sust.paperlessexm.entity.Course getCourse(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Course bean = (Course) hibernateTemplate.get(Course.class, id);
      return bean;
      } finally {
         log.debug("finished getCourse(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all course instances.
    *
    * @return a list of Course objects.
    */
   public List getCourseList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Course.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.courseId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getCourseList");
      }
   }

   /**
    * Returns a subset of all course instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of course instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getCourseListSize()</code> = last record),
    * any values greater than or equal to the total number of course instances will cause
    * the full set to be returned.
    * @return a list of Course objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getCourseList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getCourseList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of course objects in the database.
    *
    * @return an integer value.
    */
   public int getCourseListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Course.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getCourseListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseId the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByCourseId(java.lang.Integer courseId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.courseId like :courseId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseId", courseId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByCourseId(java.lang.Integer courseId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified courseTitle field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseTitle the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByCourseTitle(java.lang.String courseTitle) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.courseTitle like :courseTitle ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseTitle", courseTitle);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByCourseTitle(java.lang.String courseTitle)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified courseCode field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseCode the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByCourseCode(java.lang.String courseCode) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.courseCode like :courseCode ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseCode", courseCode);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByCourseCode(java.lang.String courseCode)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified offeringDept field.
     * To use a wildcard search, use a % in the query.
     *
     * @param offeringDept the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByOfferingDept(java.lang.String offeringDept) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.offeringDept like :offeringDept ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "offeringDept", offeringDept);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByOfferingDept(java.lang.String offeringDept)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified acceptingDept field.
     * To use a wildcard search, use a % in the query.
     *
     * @param acceptingDept the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByAcceptingDept(java.lang.String acceptingDept) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.acceptingDept like :acceptingDept ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "acceptingDept", acceptingDept);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByAcceptingDept(java.lang.String acceptingDept)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified credit field.
     * To use a wildcard search, use a % in the query.
     *
     * @param credit the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseByCredit(java.lang.Double credit) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.credit like :credit ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "credit", credit);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseByCredit(java.lang.Double credit)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified semester field.
     * To use a wildcard search, use a % in the query.
     *
     * @param semester the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseBySemester(java.lang.Integer semester) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.semester like :semester ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "semester", semester);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseBySemester(java.lang.Integer semester)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified session field.
     * To use a wildcard search, use a % in the query.
     *
     * @param session the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    public java.util.List findCourseBySession(java.lang.Integer session) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Course.class.getName() + " e where e.session like :session ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.courseId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "session", session);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findCourseBySession(java.lang.Integer session)");
      }
    }


}
