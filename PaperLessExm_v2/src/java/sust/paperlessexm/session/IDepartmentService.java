package sust.paperlessexm.session;

/**
 * The <code>DepartmentServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IDepartmentService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new department to the storage.
    *
    * @param model a data object
    * @return Department a data object with the primary key
    */
   sust.paperlessexm.entity.Department addDepartment(sust.paperlessexm.entity.Department model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Department</code>.
    *
    * @param model the data model to store
    */
   void saveDepartment(sust.paperlessexm.entity.Department model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a department.
    *
    * @param id the unique reference for the department
    */
   void deleteDepartment(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Department the data object
    */
   sust.paperlessexm.entity.Department getDepartment(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all department instances.
    *
    * @return a list of Department objects.
    */
   java.util.List<sust.paperlessexm.entity.Department> getDepartmentList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all department instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of department instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getDepartmentListSize()</code> = last record),
    * any values greater than or equal to the total number of department instances will cause
    * the full set to be returned.
    * @return a collection of Department objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Department> getDepartmentList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of department objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getDepartmentListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified departmentId field.
     *
     * @param departmentId the field
     * @return List of Department data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Department> findDepartmentByDepartmentId(java.lang.Integer departmentId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified deptCode field.
     *
     * @param deptCode the field
     * @return List of Department data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Department> findDepartmentByDeptCode(java.lang.String deptCode) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified deptName field.
     *
     * @param deptName the field
     * @return List of Department data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Department> findDepartmentByDeptName(java.lang.String deptName) throws sust.paperlessexm.exception.GenericBusinessException;


}
