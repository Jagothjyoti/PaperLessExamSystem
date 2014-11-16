package sust.paperlessexm.session;

/**
 * The <code>QuestionsTypeServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IQuestionsTypeService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new questionsType to the storage.
    *
    * @param model a data object
    * @return QuestionsType a data object with the primary key
    */
   sust.paperlessexm.entity.QuestionsType addQuestionsType(sust.paperlessexm.entity.QuestionsType model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>QuestionsType</code>.
    *
    * @param model the data model to store
    */
   void saveQuestionsType(sust.paperlessexm.entity.QuestionsType model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a questionsType.
    *
    * @param id the unique reference for the questionsType
    */
   void deleteQuestionsType(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return QuestionsType the data object
    */
   sust.paperlessexm.entity.QuestionsType getQuestionsType(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all questionsType instances.
    *
    * @return a list of QuestionsType objects.
    */
   java.util.List<sust.paperlessexm.entity.QuestionsType> getQuestionsTypeList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all questionsType instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of questionsType instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getQuestionsTypeListSize()</code> = last record),
    * any values greater than or equal to the total number of questionsType instances will cause
    * the full set to be returned.
    * @return a collection of QuestionsType objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.QuestionsType> getQuestionsTypeList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of questionsType objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getQuestionsTypeListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified questionsTypeId field.
     *
     * @param questionsTypeId the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsType> findQuestionsTypeByQuestionsTypeId(java.lang.Integer questionsTypeId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified noOfOptions field.
     *
     * @param noOfOptions the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsType> findQuestionsTypeByNoOfOptions(java.lang.Integer noOfOptions) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified typeName field.
     *
     * @param typeName the field
     * @return List of QuestionsType data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.QuestionsType> findQuestionsTypeByTypeName(java.lang.String typeName) throws sust.paperlessexm.exception.GenericBusinessException;


}
