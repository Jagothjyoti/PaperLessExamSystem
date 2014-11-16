package sust.paperlessexm.session;

/**
 * The <code>TeachesServiceService</code> bean exposes the business methods in the interface.
 *
 * @author  md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface ITeachesService {

   /*******************************************************************************************************************
    *                                  B U S I N E S S   M E T H O D S
    *******************************************************************************************************************/


   /*******************************************************************************************************************
    *                                  P E R S I S T E N C E    M E T H O D S
    *******************************************************************************************************************/

   /**
    * Adds a new teaches to the storage.
    *
    * @param model a data object
    * @return Teaches a data object with the primary key
    */
   sust.paperlessexm.entity.Teaches addTeaches(sust.paperlessexm.entity.Teaches model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Stores the <code>Teaches</code>.
    *
    * @param model the data model to store
    */
   void saveTeaches(sust.paperlessexm.entity.Teaches model) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Removes a teaches.
    *
    * @param id the unique reference for the teaches
    */
   void deleteTeaches(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Retrieves a data object from the storage by its primary key.
    *
    * @param id the unique reference
    * @return Teaches the data object
    */
   sust.paperlessexm.entity.Teaches getTeaches(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a list of all teaches instances.
    *
    * @return a list of Teaches objects.
    */
   java.util.List<sust.paperlessexm.entity.Teaches> getTeachesList() throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Returns a subset of all teaches instances.
    *
    * @param startIndex the start index within the result set (1 = first record);
    * any zero/negative values are regarded as 1, and any values greater than or equal to
    * the total number of teaches instances will simply return an empty set.
    * @param endIndex the end index within the result set (<code>getTeachesListSize()</code> = last record),
    * any values greater than or equal to the total number of teaches instances will cause
    * the full set to be returned.
    * @return a collection of Teaches objects, of size <code>(endIndex - startIndex)</code>.
    * throws GenericBusinessException if the chosen underlying data-retrieval mechanism does not support returning partial result sets.
    */
   java.util.List<sust.paperlessexm.entity.Teaches> getTeachesList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

   /**
    * Obtains the total number of teaches objects in the storage.
    * <b>NOTE:</b>If this session fa�ade is configured <b>not</b> to use the FastLaneReader,
    * this call will be very computationally wasteful as it will first have to retrieve all entities from
    * the entity bean's <code>findAll</code> method.
    *
    * @return an integer value.
    */
   int getTeachesListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    /**
     *
     * Retrieves a list of data object for the specified teachesId field.
     *
     * @param teachesId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teaches> findTeachesByTeachesId(java.lang.Integer teachesId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified teachersId field.
     *
     * @param teachersId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teaches> findTeachesByTeachersId(java.lang.Integer teachersId) throws sust.paperlessexm.exception.GenericBusinessException;
    /**
     *
     * Retrieves a list of data object for the specified courseId field.
     *
     * @param courseId the field
     * @return List of Teaches data objects, empty list in case no results were found.
     */
    java.util.List<sust.paperlessexm.entity.Teaches> findTeachesByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;


}
