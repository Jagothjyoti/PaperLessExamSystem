package sust.paperlessexm.session;

/**
 * The <code>TeachersServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface ITeachersService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new teachers to the storage.
    *
    * @param model a data object
    * @return Teachers a data object with the primary key
    */
   sust.paperlessexm.entity.Teachers addTeachers(sust.paperlessexm.entity.Teachers model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Teachers</code>.
    *
    * @param model the data model to store
    */
   void saveTeachers(sust.paperlessexm.entity.Teachers model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a teachers.
    *
    * @param id the unique reference for the teachers
    */
   void deleteTeachers(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Teachers the data object
    */
   sust.paperlessexm.entity.Teachers getTeachers(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all teachers instances.
    *
    * @return a list of Teachers objects.
    */
   java.util.List<sust.paperlessexm.entity.Teachers> getTeachersList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all teachers instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of teachers instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTeachersListSize()</code> = last record),
    * any values greater than or equal to the total number of teachers instances will cause
    * the full set to be returned.
    * @return a collection of Teachers objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Teachers> getTeachersList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of teachers objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getTeachersListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified teachersId field.
     *
     * @param teachersId the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByTeachersId(java.lang.Integer teachersId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified teachersName field.
     *
     * @param teachersName the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByTeachersName(java.lang.String teachersName) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified teachersDept field.
     *
     * @param teachersDept the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByTeachersDept(java.lang.String teachersDept) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified emailAddress field.
     *
     * @param emailAddress the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByEmailAddress(java.lang.String emailAddress) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified contactNo field.
     *
     * @param contactNo the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByContactNo(java.lang.String contactNo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified photo field.
     *
     * @param photo the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByPhoto(java.lang.String photo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified password field.
     *
     * @param password the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByPassword(java.lang.String password) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified employeeCode field.
     *
     * @param employeeCode the field
     * @return List of Teachers data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teachers> findTeachersByEmployeeCode(java.lang.String employeeCode) throws sust.paperlessexm.exception.GenericBusinessException;


}
