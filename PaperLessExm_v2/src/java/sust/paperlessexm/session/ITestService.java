package sust.paperlessexm.session;

/**
 * The <code>TestServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 200/04/29 12:39:09 $
 */
public interface ITestService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new test to the storage.
    *
    * @param model a data object
    * @return Test a data object with the primary key
    */
   sust.paperlessexm.entity.Test addTest(sust.paperlessexm.entity.Test model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Test</code>.
    *
    * @param model the data model to store
    */
   void saveTest(sust.paperlessexm.entity.Test model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a test.
    *
    * @param id the unique reference for the test
    */
   void deleteTest(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Test the data object
    */
   sust.paperlessexm.entity.Test getTest(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all test instances.
    *
    * @return a list of Test objects.
    */
   java.util.List<sust.paperlessexm.entity.Test> getTestList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all test instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of test instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTestListSize()</code> = last record),
    * any values greater than or equal to the total number of test instances will cause
    * the full set to be returned.
    * @return a collection of Test objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Test> getTestList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of test objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getTestListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified testId field.
     *
     * @param testId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified marks field.
     *
     * @param marks the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByMarks(java.lang.Integer marks) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testTitle field.
     *
     * @param testTitle the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTestTitle(java.lang.Integer testTitle) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified createDate field.
     *
     * @param createDate the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByCreateDate(java.sql.Date createDate) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified updateDate field.
     *
     * @param updateDate the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByUpdateDate(java.sql.Date updateDate) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testTime field.
     *
     * @param testTime the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTestTime(java.sql.Timestamp testTime) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testDuration field.
     *
     * @param testDuration the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTestDuration(java.lang.Integer testDuration) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified description field.
     *
     * @param description the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByDescription(java.lang.String description) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testNo field.
     *
     * @param testNo the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTestNo(java.lang.Integer testNo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     *
     * @param courseId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified teachesId field.
     *
     * @param teachesId the field
     * @return List of Test data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Test> findTestByTeachesId(java.lang.Integer teachesId) throws sust.paperlessexm.exception.GenericBusinessException;


}
