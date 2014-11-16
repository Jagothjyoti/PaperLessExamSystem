package sust.paperlessexm.servicelocator;

import sust.paperlessexm.exception.*;

/**
 * Services have to implement the LocatebleService interface.
 *
 * @author  md afjal hossain  Finalist IT Group
 * @version $Revision: 1.1 $, $Date: 2005/10/13 21:17:51 $
 */
public interface LocatableService {
    /**
     * init.
     * @throws GenericBusinessException the business exception.
     */
    void init() throws GenericBusinessException;

    /**
     * destroy.
     * @throws GenericBusinessException the business exception.
     */
    void destroy() throws GenericBusinessException;
}
