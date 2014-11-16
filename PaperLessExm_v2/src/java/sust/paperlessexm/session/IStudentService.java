package sust.paperlessexm.session;

/**
 * The <code>StudentServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IStudentService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new student to the storage.
    *
    * @param model a data object
    * @return Student a data object with the primary key
    */
   sust.paperlessexm.entity.Student addStudent(sust.paperlessexm.entity.Student model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Student</code>.
    *
    * @param model the data model to store
    */
   void saveStudent(sust.paperlessexm.entity.Student model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a student.
    *
    * @param id the unique reference for the student
    */
   void deleteStudent(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Student the data object
    */
   sust.paperlessexm.entity.Student getStudent(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all student instances.
    *
    * @return a list of Student objects.
    */
   java.util.List<sust.paperlessexm.entity.Student> getStudentList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all student instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of student instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getStudentListSize()</code> = last record),
    * any values greater than or equal to the total number of student instances will cause
    * the full set to be returned.
    * @return a collection of Student objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Student> getStudentList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of student objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getStudentListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified studentId field.
     *
     * @param studentId the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByStudentId(java.lang.Integer studentId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified registrationNo field.
     *
     * @param registrationNo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByRegistrationNo(java.lang.String registrationNo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified studentName field.
     *
     * @param studentName the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByStudentName(java.lang.String studentName) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified password field.
     *
     * @param password the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByPassword(java.lang.String password) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified session field.
     *
     * @param session the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentBySession(java.lang.Integer session) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified emailAddress field.
     *
     * @param emailAddress the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByEmailAddress(java.lang.String emailAddress) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified contactNo field.
     *
     * @param contactNo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByContactNo(java.lang.String contactNo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified photo field.
     *
     * @param photo the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByPhoto(java.lang.String photo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified departmentId field.
     *
     * @param departmentId the field
     * @return List of Student data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Student> findStudentByDepartmentId(java.lang.Integer departmentId) throws sust.paperlessexm.exception.GenericBusinessException;


}
