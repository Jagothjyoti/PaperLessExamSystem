package sust.paperlessexm.session;

/**
 * The <code>QuestionsServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IQuestionsService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new questions to the storage.
    *
    * @param model a data object
    * @return Questions a data object with the primary key
    */
   sust.paperlessexm.entity.Questions addQuestions(sust.paperlessexm.entity.Questions model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Questions</code>.
    *
    * @param model the data model to store
    */
   void saveQuestions(sust.paperlessexm.entity.Questions model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a questions.
    *
    * @param id the unique reference for the questions
    */
   void deleteQuestions(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Questions the data object
    */
   sust.paperlessexm.entity.Questions getQuestions(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all questions instances.
    *
    * @return a list of Questions objects.
    */
   java.util.List<sust.paperlessexm.entity.Questions> getQuestionsList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all questions instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questions instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsListSize()</code> = last record),
    * any values greater than or equal to the total number of questions instances will cause
    * the full set to be returned.
    * @return a collection of Questions objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Questions> getQuestionsList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of questions objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getQuestionsListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     *
     * @param questionsId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified totalMarks field.
     *
     * @param totalMarks the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByTotalMarks(java.lang.Integer totalMarks) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified correctAns field.
     *
     * @param correctAns the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByCorrectAns(java.lang.String correctAns) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified isDirectMarking field.
     *
     * @param isDirectMarking the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByIsDirectMarking(java.lang.String isDirectMarking) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified questionNo field.
     *
     * @param questionNo the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByQuestionNo(java.lang.Integer questionNo) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified testId field.
     *
     * @param testId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByTestId(java.lang.Integer testId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified questionsTypeId field.
     *
     * @param questionsTypeId the field
     * @return List of Questions data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Questions> findQuestionsByQuestionsTypeId(java.lang.Integer questionsTypeId) throws sust.paperlessexm.exception.GenericBusinessException;


}
