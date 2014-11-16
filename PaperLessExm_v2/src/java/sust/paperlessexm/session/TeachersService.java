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
 * The <code>TeachersService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class TeachersService implements ITeachersService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(TeachersService.class);


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
    * Adds a new teachers to the database.
    *
    * @param model a data object
    * @return Teachers a data object with the primary key
    */
   public sust.paperlessexm.entity.Teachers addTeachers(sust.paperlessexm.entity.Teachers model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getTeachers(model.getPrimaryKey());
      } finally {
         log.debug("finished addTeachers(sust.paperlessexm.entity.Teachers model)");
      }
   }

   /**
    * Stores the <code>Teachers</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveTeachers(sust.paperlessexm.entity.Teachers model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveTeachers(sust.paperlessexm.entity.Teachers model)");
      }
   }

   /**
    * Removes a teachers.
    *
    * @param id the unique reference for the teachers
    */
   public void deleteTeachers(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Teachers bean = (Teachers) hibernateTemplate.get(Teachers.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteTeachers(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Teachers the data object
    */
   public sust.paperlessexm.entity.Teachers getTeachers(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Teachers bean = (Teachers) hibernateTemplate.get(Teachers.class, id);
      return bean;
      } finally {
         log.debug("finished getTeachers(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all teachers instances.
    *
    * @return a list of Teachers objects.
    */
   public List getTeachersList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Teachers.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.teachersId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getTeachersList");
      }
   }

   /**
    * Returns a subset of all teachers instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of teachers instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTeachersListSize()</code> = last record),
    * any values greater than or equal to the total number of teachers instances will cause
    * the full set to be returned.
    * @return a list of Teachers objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getTeachersList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getTeachersList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of teachers objects in the database.
    *
    * @return an integer value.
    */
   public int getTeachersListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Teachers.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getTeachersListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified teachersId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachersId the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByTeachersId(java.lang.Integer teachersId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.teachersId like :teachersId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachersId", teachersId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByTeachersId(java.lang.Integer teachersId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified teachersName field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachersName the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByTeachersName(java.lang.String teachersName) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.teachersName like :teachersName ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachersName", teachersName);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByTeachersName(java.lang.String teachersName)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified teachersDept field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachersDept the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByTeachersDept(java.lang.String teachersDept) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.teachersDept like :teachersDept ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachersDept", teachersDept);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByTeachersDept(java.lang.String teachersDept)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified emailAddress field.
     * To use a wildcard search, use a % in the query.
     *
     * @param emailAddress the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByEmailAddress(java.lang.String emailAddress) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.emailAddress like :emailAddress ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "emailAddress", emailAddress);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByEmailAddress(java.lang.String emailAddress)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified contactNo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param contactNo the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByContactNo(java.lang.String contactNo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.contactNo like :contactNo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "contactNo", contactNo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByContactNo(java.lang.String contactNo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified photo field.
     * To use a wildcard search, use a % in the query.
     *
     * @param photo the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByPhoto(java.lang.String photo) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.photo like :photo ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "photo", photo);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByPhoto(java.lang.String photo)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified password field.
     * To use a wildcard search, use a % in the query.
     *
     * @param password the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByPassword(java.lang.String password) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.password like :password ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "password", password);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByPassword(java.lang.String password)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified employeeCode field.
     * To use a wildcard search, use a % in the query.
     *
     * @param employeeCode the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    public java.util.List findTeachersByEmployeeCode(java.lang.String employeeCode) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teachers.class.getName() + " e where e.employeeCode like :employeeCode ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachersId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "employeeCode", employeeCode);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachersByEmployeeCode(java.lang.String employeeCode)");
      }
    }


}
