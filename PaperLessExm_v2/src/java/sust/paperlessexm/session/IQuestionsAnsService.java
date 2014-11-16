package sust.paperlessexm.session;

/**
 * The <code>QuestionsAnsServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IQuestionsAnsService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new questionsAns to the storage.
    *
    * @param model a data object
    * @return QuestionsAns a data object with the primary key
    */
   sust.paperlessexm.entity.QuestionsAns addQuestionsAns(sust.paperlessexm.entity.QuestionsAns model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>QuestionsAns</code>.
    *
    * @param model the data model to store
    */
   void saveQuestionsAns(sust.paperlessexm.entity.QuestionsAns model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a questionsAns.
    *
    * @param id the unique reference for the questionsAns
    */
   void deleteQuestionsAns(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return QuestionsAns the data object
    */
   sust.paperlessexm.entity.QuestionsAns getQuestionsAns(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all questionsAns instances.
    *
    * @return a list of QuestionsAns objects.
    */
   java.util.List<sust.paperlessexm.entity.QuestionsAns> getQuestionsAnsList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all questionsAns instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questionsAns instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsAnsListSize()</code> = last record),
    * any values greater than or equal to the total number of questionsAns instances will cause
    * the full set to be returned.
    * @return a collection of QuestionsAns objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.QuestionsAns> getQuestionsAnsList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of questionsAns objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getQuestionsAnsListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified questionsAnsId field.
     *
     * @param questionsAnsId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsAns> findQuestionsAnsByQuestionsAnsId(java.lang.Integer questionsAnsId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified givenAns field.
     *
     * @param givenAns the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsAns> findQuestionsAnsByGivenAns(java.lang.String givenAns) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified givenMarks field.
     *
     * @param givenMarks the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsAns> findQuestionsAnsByGivenMarks(java.lang.Integer givenMarks) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     *
     * @param questionsId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsAns> findQuestionsAnsByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testRegistrationId field.
     *
     * @param testRegistrationId the field
     * @return List of QuestionsAns data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsAns> findQuestionsAnsByTestRegistrationId(java.lang.Integer testRegistrationId) throws sust.paperlessexm.exception.GenericBusinessException;


}
