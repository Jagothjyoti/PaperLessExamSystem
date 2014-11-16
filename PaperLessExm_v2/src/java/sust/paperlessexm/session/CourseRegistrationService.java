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
 * The <code>CourseRegistrationService</code> session bean, which acts as a
 * facade to the underlying entity beans.
 *
 * @author md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.00 $, $Date: 2014/11/01 12:39:09 $
 *
 */
public class CourseRegistrationService implements ICourseRegistrationService, LocatableService {

    /**
     * The logger object.
     */
    private static Logger log = LogService.getLogger(CourseRegistrationService.class);

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

    /**
     * *****************************************************************************************************************
     * B U S I N E S S M E T H O D S
     ******************************************************************************************************************
     */
    /**
     * *****************************************************************************************************************
     * P E R S I S T E N C E M E T H O D S
     ******************************************************************************************************************
     */
    /**
     * Adds a new courseRegistration to the database.
     *
     * @param model a data object
     * @return CourseRegistration a data object with the primary key
     */
    public sust.paperlessexm.entity.CourseRegistration addCourseRegistration(sust.paperlessexm.entity.CourseRegistration model) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            hibernateTemplate.save(model);
            return getCourseRegistration(model.getPrimaryKey());
        } finally {
            log.debug("finished addCourseRegistration(sust.paperlessexm.entity.CourseRegistration model)");
        }
    }

    /**
     * Stores the <code>CourseRegistration</code> in the database.
     *
     * @param model the data model to store
     */
    public void saveCourseRegistration(sust.paperlessexm.entity.CourseRegistration model) throws GenericBusinessException {
        // We have to create an object:
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            // Now update the data.
            hibernateTemplate.update(model);
        } finally {
            log.debug("finished saveCourseRegistration(sust.paperlessexm.entity.CourseRegistration model)");
        }
    }

    /**
     * Removes a courseRegistration.
     *
     * @param id the unique reference for the courseRegistration
     */
    public void deleteCourseRegistration(java.lang.Integer id) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            // First get the data.
            CourseRegistration bean = (CourseRegistration) hibernateTemplate.get(CourseRegistration.class, id);
            hibernateTemplate.delete(bean);
        } finally {
            log.debug("finished deleteCourseRegistration(java.lang.Integer id)");
        }
    }

    /**
     * Retrieves a data object from the database by its primary key.
     *
     * @param id the unique reference
     * @return CourseRegistration the data object
     */
    public sust.paperlessexm.entity.CourseRegistration getCourseRegistration(java.lang.Integer id) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            CourseRegistration bean = (CourseRegistration) hibernateTemplate.get(CourseRegistration.class, id);
            return bean;
        } finally {
            log.debug("finished getCourseRegistration(java.lang.Integer id)");
        }
    }

    /**
     * Returns a list of all courseRegistration instances.
     *
     * @return a list of CourseRegistration objects.
     */
    public List getCourseRegistrationList() throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {

            String queryString = "from " + CourseRegistration.class.getName() + " e";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            List list = hibernateTemplate.list(query);

            return list;
        } finally {
            log.debug("finished getCourseRegistrationList");
        }
    }

    /**
     * Returns a subset of all courseRegistration instances.
     *
     * @param startIndex the start index within the result set (1 = first
     * record); any zero/negative values are regarded as 1, and any values
     * greater than or equal to the total number of courseRegistration instances
     * will simply return an empty set.
     * @param endIndex the end index within the result set
     * (<code>getCourseRegistrationListSize()</code> = last record), any values
     * greater than or equal to the total number of courseRegistration instances
     * will cause the full set to be returned.
     * @return a list of CourseRegistration objects, of size
     * <code>(endIndex - startIndex)</code>.
     */
    public List getCourseRegistrationList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + CourseRegistration.class.getName() + " e";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            query.setFirstResult(startIndex - 1);
            query.setMaxResults(endIndex - startIndex + 1);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished getCourseRegistrationList(int startIndex, int endIndex)");
        }
    }

    /**
     * Obtains the total number of courseRegistration objects in the database.
     *
     * @return an integer value.
     */
    public int getCourseRegistrationListSize() throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "select count(*) from " + CourseRegistration.class.getName();
            Query query = hibernateTemplate.createQuery(queryString);
            List list = hibernateTemplate.list(query);
            Integer countResult = (Integer) list.get(0);
            return countResult.intValue();
        } finally {
            log.debug("finished getCourseRegistrationListSize()");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified courseRegistrationId
     * field. To use a wildcard search, use a % in the query.
     *
     * @param courseRegistrationId the field
     * @return List of CourseRegistration data objects, empty list in case no
     * results were found.
     */
    public java.util.List findCourseRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + CourseRegistration.class.getName() + " e where e.courseRegistrationId like :courseRegistrationId ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "courseRegistrationId", courseRegistrationId);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findCourseRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId)");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified isApproved field. To
     * use a wildcard search, use a % in the query.
     *
     * @param isApproved the field
     * @return List of CourseRegistration data objects, empty list in case no
     * results were found.
     */
    public java.util.List findCourseRegistrationByIsApproved(java.lang.String isApproved) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + CourseRegistration.class.getName() + " e where e.isApproved like :isApproved ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "isApproved", isApproved);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findCourseRegistrationByIsApproved(java.lang.String isApproved)");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified studentId field. To use
     * a wildcard search, use a % in the query.
     *
     * @param studentId the field
     * @return List of CourseRegistration data objects, empty list in case no
     * results were found.
     */
    public java.util.List findCourseRegistrationByStudentId(java.lang.Integer studentId) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + CourseRegistration.class.getName() + " e where e.studentId like :studentId ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "studentId", studentId);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findCourseRegistrationByStudentId(java.lang.Integer studentId)");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified courseId field. To use
     * a wildcard search, use a % in the query.
     *
     * @param courseId the field
     * @return List of CourseRegistration data objects, empty list in case no
     * results were found.
     */
    public java.util.List findCourseRegistrationByCourseId(java.lang.Integer courseId) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + CourseRegistration.class.getName() + " e where e.courseId like :courseId ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.courseRegistrationId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "courseId", courseId);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findCourseRegistrationByCourseId(java.lang.Integer courseId)");
        }
    }

}
