package sust.paperlessexm.session;

/**
 * The <code>CourseServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface ICourseService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new course to the storage.
    *
    * @param model a data object
    * @return Course a data object with the primary key
    */
   sust.paperlessexm.entity.Course addCourse(sust.paperlessexm.entity.Course model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Course</code>.
    *
    * @param model the data model to store
    */
   void saveCourse(sust.paperlessexm.entity.Course model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a course.
    *
    * @param id the unique reference for the course
    */
   void deleteCourse(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Course the data object
    */
   sust.paperlessexm.entity.Course getCourse(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all course instances.
    *
    * @return a list of Course objects.
    */
   java.util.List<sust.paperlessexm.entity.Course> getCourseList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all course instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of course instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getCourseListSize()</code> = last record),
    * any values greater than or equal to the total number of course instances will cause
    * the full set to be returned.
    * @return a collection of Course objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Course> getCourseList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of course objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getCourseListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     *
     * @param courseId the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseTitle field.
     *
     * @param courseTitle the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByCourseTitle(java.lang.String courseTitle) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseCode field.
     *
     * @param courseCode the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByCourseCode(java.lang.String courseCode) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified offeringDept field.
     *
     * @param offeringDept the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByOfferingDept(java.lang.String offeringDept) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified acceptingDept field.
     *
     * @param acceptingDept the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByAcceptingDept(java.lang.String acceptingDept) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified credit field.
     *
     * @param credit the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseByCredit(java.lang.Double credit) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified semester field.
     *
     * @param semester the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseBySemester(java.lang.Integer semester) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified session field.
     *
     * @param session the field
     * @return List of Course data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Course> findCourseBySession(java.lang.Integer session) throws sust.paperlessexm.exception.GenericBusinessException;


}
