package sust.paperlessexm.session;

/**
 * The <code>CourseRegistrationServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface ICourseRegistrationService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new courseRegistration to the storage.
    *
    * @param model a data object
    * @return CourseRegistration a data object with the primary key
    */
   sust.paperlessexm.entity.CourseRegistration addCourseRegistration(sust.paperlessexm.entity.CourseRegistration model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>CourseRegistration</code>.
    *
    * @param model the data model to store
    */
   void saveCourseRegistration(sust.paperlessexm.entity.CourseRegistration model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a courseRegistration.
    *
    * @param id the unique reference for the courseRegistration
    */
   void deleteCourseRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return CourseRegistration the data object
    */
   sust.paperlessexm.entity.CourseRegistration getCourseRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all courseRegistration instances.
    *
    * @return a list of CourseRegistration objects.
    */
   java.util.List<sust.paperlessexm.entity.CourseRegistration> getCourseRegistrationList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all courseRegistration instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of courseRegistration instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getCourseRegistrationListSize()</code> = last record),
    * any values greater than or equal to the total number of courseRegistration instances will cause
    * the full set to be returned.
    * @return a collection of CourseRegistration objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.CourseRegistration> getCourseRegistrationList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of courseRegistration objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getCourseRegistrationListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified courseRegistrationId field.
     *
     * @param courseRegistrationId the field
     * @return List of CourseRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.CourseRegistration> findCourseRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified isApproved field.
     *
     * @param isApproved the field
     * @return List of CourseRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.CourseRegistration> findCourseRegistrationByIsApproved(java.lang.String isApproved) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified studentId field.
     *
     * @param studentId the field
     * @return List of CourseRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.CourseRegistration> findCourseRegistrationByStudentId(java.lang.Integer studentId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     *
     * @param courseId the field
     * @return List of CourseRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.CourseRegistration> findCourseRegistrationByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;


}
