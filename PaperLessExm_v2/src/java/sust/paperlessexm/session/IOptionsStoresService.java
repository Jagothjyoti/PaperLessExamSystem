package sust.paperlessexm.session;

/**
 * The <code>OptionsStoresServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface IOptionsStoresService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new optionsStores to the storage.
    *
    * @param model a data object
    * @return OptionsStores a data object with the primary key
    */
   sust.paperlessexm.entity.OptionsStores addOptionsStores(sust.paperlessexm.entity.OptionsStores model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>OptionsStores</code>.
    *
    * @param model the data model to store
    */
   void saveOptionsStores(sust.paperlessexm.entity.OptionsStores model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a optionsStores.
    *
    * @param id the unique reference for the optionsStores
    */
   void deleteOptionsStores(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return OptionsStores the data object
    */
   sust.paperlessexm.entity.OptionsStores getOptionsStores(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all optionsStores instances.
    *
    * @return a list of OptionsStores objects.
    */
   java.util.List<sust.paperlessexm.entity.OptionsStores> getOptionsStoresList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all optionsStores instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of optionsStores instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getOptionsStoresListSize()</code> = last record),
    * any values greater than or equal to the total number of optionsStores instances will cause
    * the full set to be returned.
    * @return a collection of OptionsStores objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.OptionsStores> getOptionsStoresList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of optionsStores objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getOptionsStoresListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified optionsStoresId field.
     *
     * @param optionsStoresId the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.OptionsStores> findOptionsStoresByOptionsStoresId(java.lang.Integer optionsStoresId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified optionsText field.
     *
     * @param optionsText the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.OptionsStores> findOptionsStoresByOptionsText(java.lang.String optionsText) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified questionsId field.
     *
     * @param questionsId the field
     * @return List of OptionsStores data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.OptionsStores> findOptionsStoresByQuestionsId(java.lang.Integer questionsId) throws sust.paperlessexm.exception.GenericBusinessException;


}
