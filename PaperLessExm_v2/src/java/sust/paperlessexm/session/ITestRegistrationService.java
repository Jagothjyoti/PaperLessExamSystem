package sust.paperlessexm.session;

/**
 * The <code>TestRegistrationServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface ITestRegistrationService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new testRegistration to the storage.
    *
    * @param model a data object
    * @return TestRegistration a data object with the primary key
    */
   sust.paperlessexm.entity.TestRegistration addTestRegistration(sust.paperlessexm.entity.TestRegistration model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>TestRegistration</code>.
    *
    * @param model the data model to store
    */
   void saveTestRegistration(sust.paperlessexm.entity.TestRegistration model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a testRegistration.
    *
    * @param id the unique reference for the testRegistration
    */
   void deleteTestRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return TestRegistration the data object
    */
   sust.paperlessexm.entity.TestRegistration getTestRegistration(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all testRegistration instances.
    *
    * @return a list of TestRegistration objects.
    */
   java.util.List<sust.paperlessexm.entity.TestRegistration> getTestRegistrationList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all testRegistration instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of testRegistration instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTestRegistrationListSize()</code> = last record),
    * any values greater than or equal to the total number of testRegistration instances will cause
    * the full set to be returned.
    * @return a collection of TestRegistration objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.TestRegistration> getTestRegistrationList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of testRegistration objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getTestRegistrationListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified testRegistrationId field.
     *
     * @param testRegistrationId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationByTestRegistrationId(java.lang.Integer testRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testMarks field.
     *
     * @param testMarks the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationByTestMarks(java.lang.Integer testMarks) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified startTime field.
     *
     * @param startTime the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationByStartTime(java.sql.Timestamp startTime) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified submitTime field.
     *
     * @param submitTime the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationBySubmitTime(java.sql.Timestamp submitTime) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testId field.
     *
     * @param testId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseRegistrationId field.
     *
     * @param courseRegistrationId the field
     * @return List of TestRegistration data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.TestRegistration> findTestRegistrationByCourseRegistrationId(java.lang.Integer courseRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;


}
