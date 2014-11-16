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
 * The <code>TeachesService</code> session bean, which acts as a facade to the
 * underlying entity beans.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class TeachesService implements ITeachesService , LocatableService {
   /**
    * The logger object.
    */
   private static Logger log = LogService.getLogger(TeachesService.class);


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
    * Adds a new teaches to the database.
    *
    * @param model a data object
    * @return Teaches a data object with the primary key
    */
   public sust.paperlessexm.entity.Teaches addTeaches(sust.paperlessexm.entity.Teaches model) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         hibernateTemplate.save(model);
         return getTeaches(model.getPrimaryKey());
      } finally {
         log.debug("finished addTeaches(sust.paperlessexm.entity.Teaches model)");
      }
   }

   /**
    * Stores the <code>Teaches</code> in the database.
    *
    * @param model the data model to store
    */
   public void saveTeaches(sust.paperlessexm.entity.Teaches model) throws GenericBusinessException {
      // We have to create an object:
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // Now update the data.
         hibernateTemplate.update(model);
      } finally {
         log.debug("finished saveTeaches(sust.paperlessexm.entity.Teaches model)");
      }
   }

   /**
    * Removes a teaches.
    *
    * @param id the unique reference for the teaches
    */
   public void deleteTeaches(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         // First get the data.
         Teaches bean = (Teaches) hibernateTemplate.get(Teaches.class, id);
         hibernateTemplate.delete(bean);
      } finally {
         log.debug("finished deleteTeaches(java.lang.Integer id)");
      }
   }

   /**
    * Retrieves a data object from the database by its primary key.
    *
    * @param id the unique reference
    * @return Teaches the data object
    */
   public sust.paperlessexm.entity.Teaches getTeaches(java.lang.Integer id) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
      Teaches bean = (Teaches) hibernateTemplate.get(Teaches.class, id);
      return bean;
      } finally {
         log.debug("finished getTeaches(java.lang.Integer id)");
      }
   }

   /**
    * Returns a list of all teaches instances.
    *
    * @return a list of Teaches objects.
    */
   public List getTeachesList() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {

      String queryString = "from " + Teaches.class.getName() + " e";
      // Add a an order by on all primary keys to assure reproducable results.
      String orderByPart = "";
      orderByPart += " order by e.teachesId";
      queryString += orderByPart;
      Query query = hibernateTemplate.createQuery(queryString);
      List list = hibernateTemplate.list(query);

      return list;
      } finally {
         log.debug("finished getTeachesList");
      }
   }

   /**
    * Returns a subset of all teaches instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of teaches instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTeachesListSize()</code> = last record),
    * any values greater than or equal to the total number of teaches instances will cause
    * the full set to be returned.
    * @return a list of Teaches objects, of size <code>(endIndex - startIndex)</code>.
    */
   public List getTeachesList(int startIndex, int endIndex) throws GenericBusinessException {
      if (startIndex < 1) {
         startIndex = 1;
      }
      if ( (endIndex - startIndex) < 0) {
         // Just return an empty list.
         return new ArrayList();
      }
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teaches.class.getName() + " e";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachesId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         query.setFirstResult(startIndex - 1);
         query.setMaxResults(endIndex - startIndex + 1);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished getTeachesList(int startIndex, int endIndex)");
      }
   }

   /**
    * Obtains the total number of teaches objects in the database.
    *
    * @return an integer value.
    */
   public int getTeachesListSize() throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "select count(*) from " + Teaches.class.getName();
         Query query = hibernateTemplate.createQuery(queryString);
         List list = hibernateTemplate.list(query);
         Integer countResult = (Integer) list.get(0);
         return countResult.intValue();
      } finally {
         log.debug("finished getTeachesListSize()");
      }
   }

    /**
     *
     * Retrieves a list of data object for the specified teachesId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachesId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    public java.util.List findTeachesByTeachesId(java.lang.Integer teachesId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teaches.class.getName() + " e where e.teachesId like :teachesId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachesId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachesId", teachesId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachesByTeachesId(java.lang.Integer teachesId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified teachersId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param teachersId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    public java.util.List findTeachesByTeachersId(java.lang.Integer teachersId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teaches.class.getName() + " e where e.teachersId like :teachersId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachesId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "teachersId", teachersId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachesByTeachersId(java.lang.Integer teachersId)");
      }
    }
    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     * To use a wildcard search, use a % in the query.
     *
     * @param courseId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    public java.util.List findTeachesByCourseId(java.lang.Integer courseId) throws GenericBusinessException {
      sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
      try {
         String queryString = "from " + Teaches.class.getName() + " e where e.courseId like :courseId ";
         // Add a an order by on all primary keys to assure reproducable results.
         String orderByPart = "";
         orderByPart += " order by e.teachesId";
         queryString += orderByPart;
         Query query = hibernateTemplate.createQuery(queryString);
         hibernateTemplate.setQueryParameter(query, "courseId", courseId);
         List list = hibernateTemplate.list(query);
         return list;
      } finally {
         log.debug("finished findTeachesByCourseId(java.lang.Integer courseId)");
      }
    }


}
