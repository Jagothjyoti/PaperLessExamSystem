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
 * The <code>StudentService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class StudentService implements IStudentService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(StudentService.class);


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
    * Adds a new student to the database.
    *
    * @param model a data object
    * @return Student a data object with the primary key
    */
   public sust.paperlessexm.entity.Student addStudent(sust.paperlessexm.entity.Student model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getStudent(model.getPrimaryKey());
      } finally {
         log.debug("finished addStudent(sust.paperlessexm.entity.Student model)");
      }
   }

   /**
    * Stores the <code>Student</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveStudent(sust.paperlessexm.entity.Student model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveStudent(sust.paperlessexm.entity.Student model)");
      }
   }

   /**
    * Removes a student.
    *
    * @param id the unique reference for the student
    */
   public void deleteStudent(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Student bean = (Student) hibernateTemplate.get(Student.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteStudent(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Student the data object
    */
   public sust.paperlessexm.entity.Student getStudent(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Student bean = (Student) hibernateTemplate.get(Student.class, id);
      return bean;
      } finally {
         log.debug("finished getStudent(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all student instances.
    *
    * @return a list of Student objects.
    */
   public List getStudentList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Student.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.studentId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getStudentList");
      }
   }

   /**
    * Returns a subset of all student instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of student instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getStudentListSize()</code> = last record),
    * any values greater than or equal to the total number of student instances will cause
    * the full set to be returned.
    * @return a list of Student objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getStudentList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getStudentList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of student objects in the database.
    *
    * @return an integer value.
    */
   public int getStudentListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Student.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getStudentListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified studentId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param studentId the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByStudentId(java.lang.Integer studentId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.studentId like :studentId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "studentId", studentId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByStudentId(java.lang.Integer studentId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified registrationNo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param registrationNo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByRegistrationNo(java.lang.String registrationNo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.registrationNo like :registrationNo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "registrationNo", registrationNo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByRegistrationNo(java.lang.String registrationNo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified studentName field.
     * To use a wildcard search, use a % in the query.
     *
     * @param studentName the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByStudentName(java.lang.String studentName) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.studentName like :studentName ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "studentName", studentName);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByStudentName(java.lang.String studentName)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified password field.
     * To use a wildcard search, use a % in the query.
     *
     * @param password the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByPassword(java.lang.String password) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.password like :password ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "password", password);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByPassword(java.lang.String password)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified session field.
     * To use a wildcard search, use a % in the query.
     *
     * @param session the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentBySession(java.lang.Integer session) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.session like :session ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "session", session);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentBySession(java.lang.Integer session)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified emailAddress field.
     * To use a wildcard search, use a % in the query.
     *
     * @param emailAddress the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByEmailAddress(java.lang.String emailAddress) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.emailAddress like :emailAddress ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "emailAddress", emailAddress);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByEmailAddress(java.lang.String emailAddress)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified contactNo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param contactNo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByContactNo(java.lang.String contactNo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.contactNo like :contactNo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "contactNo", contactNo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByContactNo(java.lang.String contactNo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified photo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param photo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByPhoto(java.lang.String photo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.photo like :photo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "photo", photo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByPhoto(java.lang.String photo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified departmentId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param departmentId the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    public java.util.List findStudentByDepartmentId(java.lang.Integer departmentId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Student.class.getName() + " e where e.departmentId like :departmentId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.studentId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "departmentId", departmentId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findStudentByDepartmentId(java.lang.Integer departmentId)");
      }
    }


}
