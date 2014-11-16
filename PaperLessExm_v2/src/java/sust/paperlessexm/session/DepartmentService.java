package sust.paperlessexm.session;

import java.util.*;
import sust.paperlessexm.servicelocator.LocatableService;
import com.finalist.util.log.*;
import sust.paperlessexm.exception.GenericBusinessException;
//import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Query;
import sust.paperlessexm.entity.*;

/**
 * The <code>DepartmentService</code> session bean, which acts as a facade to
 * the underlying entity beans.
 *
 * @author md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.19 $, $Date: 2006/04/29 12:39:09 $
 *
 */
public class DepartmentService implements IDepartmentService, LocatableService {

    /**
     * The logger object.
     */
    private static Logger log = LogService.getLogger(DepartmentService.class);

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
     * Adds a new department to the database.
     *
     * @param model a data object
     * @return Department a data object with the primary key
     */
    
    public sust.paperlessexm.entity.Department addDepartment(sust.paperlessexm.entity.Department model) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            hibernateTemplate.save(model);
            return getDepartment(model.getPrimaryKey());
        } finally {
            log.debug("finished addDepartment(sust.paperlessexm.entity.Department model)");
        }
    }

    /**
     * Stores the <code>Department</code> in the database.
     *
     * @param model the data model to store
     */
    public void saveDepartment(sust.paperlessexm.entity.Department model) throws GenericBusinessException {
        // We have to create an object:
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            // Now update the data.
            hibernateTemplate.update(model);
        } finally {
            log.debug("finished saveDepartment(sust.paperlessexm.entity.Department model)");
        }
    }

    /**
     * Removes a department.
     *
     * @param id the unique reference for the department
     */
    public void deleteDepartment(java.lang.Integer id) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            // First get the data.
            Department bean = (Department) hibernateTemplate.get(Department.class, id);
            hibernateTemplate.delete(bean);
        } finally {
            log.debug("finished deleteDepartment(java.lang.Integer id)");
        }
    }

    /**
     * Retrieves a data object from the database by its primary key.
     *
     * @param id the unique reference
     * @return Department the data object
     */
    public sust.paperlessexm.entity.Department getDepartment(java.lang.Integer id) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            Department bean = (Department) hibernateTemplate.get(Department.class, id);
            return bean;
        } finally {
            log.debug("finished getDepartment(java.lang.Integer id)");
        }
    }

    /**
     * Returns a list of all department instances.
     *
     * @return a list of Department objects.
     */
    public List getDepartmentList() throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {

            String queryString = "from " + Department.class.getName() + " e";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.departmentId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            List list = hibernateTemplate.list(query);

            return list;
        } finally {
            log.debug("finished getDepartmentList");
        }
    }

    /**
     * Returns a subset of all department instances.
     *
     * @param startIndex the start index within the result set (1 = first
     * record); any zero/negative values are regarded as 1, and any values
     * greater than or equal to the total number of department instances will
     * simply return an empty set.
     * @param endIndex the end index within the result set
     * (<code>getDepartmentListSize()</code> = last record), any values greater
     * than or equal to the total number of department instances will cause the
     * full set to be returned.
     * @return a list of Department objects, of size
     * <code>(endIndex - startIndex)</code>.
     */
    public List getDepartmentList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + Department.class.getName() + " e";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.departmentId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            query.setFirstResult(startIndex - 1);
            query.setMaxResults(endIndex - startIndex + 1);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished getDepartmentList(int startIndex, int endIndex)");
        }
    }

    /**
     * Obtains the total number of department objects in the database.
     *
     * @return an integer value.
     */
    public int getDepartmentListSize() throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "select count(*) from " + Department.class.getName();
            Query query = hibernateTemplate.createQuery(queryString);
            List list = hibernateTemplate.list(query);
            Integer countResult = (Integer) list.get(0);
            return countResult.intValue();
        } finally {
            log.debug("finished getDepartmentListSize()");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified departmentId field. To
     * use a wildcard search, use a % in the query.
     *
     * @param departmentId the field
     * @return List of Department data objects, empty list in case no results
     * were found.
     */
    public java.util.List findDepartmentByDepartmentId(java.lang.Integer departmentId) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + Department.class.getName() + " e where e.departmentId like :departmentId ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.departmentId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "departmentId", departmentId);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findDepartmentByDepartmentId(java.lang.Integer departmentId)");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified deptCode field. To use
     * a wildcard search, use a % in the query.
     *
     * @param deptCode the field
     * @return List of Department data objects, empty list in case no results
     * were found.
     */
    public java.util.List findDepartmentByDeptCode(java.lang.String deptCode) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + Department.class.getName() + " e where e.deptCode like :deptCode ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.departmentId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "deptCode", deptCode);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findDepartmentByDeptCode(java.lang.String deptCode)");
        }
    }

    /**
     *
     * Retrieves a list of data object for the specified deptName field. To use
     * a wildcard search, use a % in the query.
     *
     * @param deptName the field
     * @return List of Department data objects, empty list in case no results
     * were found.
     */
    public java.util.List findDepartmentByDeptName(java.lang.String deptName) throws GenericBusinessException {
        sust.paperlessexm.hibernatehelper.HibernateQueryHelper hibernateTemplate = new sust.paperlessexm.hibernatehelper.HibernateQueryHelper();
        try {
            String queryString = "from " + Department.class.getName() + " e where e.deptName like :deptName ";
            // Add a an order by on all primary keys to assure reproducable results.
            String orderByPart = "";
            orderByPart += " order by e.departmentId";
            queryString += orderByPart;
            Query query = hibernateTemplate.createQuery(queryString);
            hibernateTemplate.setQueryParameter(query, "deptName", deptName);
            List list = hibernateTemplate.list(query);
            return list;
        } finally {
            log.debug("finished findDepartmentByDeptName(java.lang.String deptName)");
        }
    }

}
