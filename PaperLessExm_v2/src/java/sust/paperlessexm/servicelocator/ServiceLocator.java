package sust.paperlessexm.servicelocator;

import sust.paperlessexm.exception.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import sust.paperlessexm.session.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import com.finalist.util.log.LogService;
import com.finalist.util.log.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * The Service Locator maps an interface to an implementation. See:
 * http://java.sun.com/blueprints/corej2eepatterns/Patterns/ServiceLocator.html
 *
 * @author md afjal hossain Finalist IT Group
 * @version $Revision: 1.3 $, $Date: 2006/01/29 21:26:04 $
 */
public class ServiceLocator {

    /**
     * the logger.
     */
    private static Logger log = LogService.getLogger(ServiceLocator.class);

    /**
     * The DatabaseSessionService name.
     */
    public static final String DATABASE_SESSION_SERVICE = "DATABASE_SESSION_SERVICE";

    /**
     * The CourseServiceService name.
     */
    public static final String COURSESERVICE_SERVICE = "COURSESERVICE_SERVICE";

    /**
     * The CourseRegistrationServiceService name.
     */
    public static final String COURSEREGISTRATIONSERVICE_SERVICE = "COURSEREGISTRATIONSERVICE_SERVICE";

    /**
     * The DepartmentServiceService name.
     */
    public static final String DEPARTMENTSERVICE_SERVICE = "DEPARTMENTSERVICE_SERVICE";

    /**
     * The OptionsStoresServiceService name.
     */
    public static final String OPTIONSSTORESSERVICE_SERVICE = "OPTIONSSTORESSERVICE_SERVICE";

    /**
     * The QuestionsServiceService name.
     */
    public static final String QUESTIONSSERVICE_SERVICE = "QUESTIONSSERVICE_SERVICE";

    /**
     * The QuestionsAnsServiceService name.
     */
    public static final String QUESTIONSANSSERVICE_SERVICE = "QUESTIONSANSSERVICE_SERVICE";

    /**
     * The QuestionsTypeServiceService name.
     */
    public static final String QUESTIONSTYPESERVICE_SERVICE = "QUESTIONSTYPESERVICE_SERVICE";

    /**
     * The StudentServiceService name.
     */
    public static final String STUDENTSERVICE_SERVICE = "STUDENTSERVICE_SERVICE";

    /**
     * The TeachersServiceService name.
     */
    public static final String TEACHERSSERVICE_SERVICE = "TEACHERSSERVICE_SERVICE";

    /**
     * The TeachesServiceService name.
     */
    public static final String TEACHESSERVICE_SERVICE = "TEACHESSERVICE_SERVICE";

    /**
     * The TestServiceService name.
     */
    public static final String TESTSERVICE_SERVICE = "TESTSERVICE_SERVICE";

    /**
     * The TestRegistrationServiceService name.
     */
    public static final String TESTREGISTRATIONSERVICE_SERVICE = "TESTREGISTRATIONSERVICE_SERVICE";

    /**
     * Contains the class constants
     */
    private static HashMap map;

    /**
     * Contains the classname of the implementation class.
     */
    private static Map serviceInfoMap;

    /**
     * Contains the interface name of the service.
     */
    private static Map serviceInterfaceMap;

    /**
     * Contains the instantiated services.
     */
    private static Map serviceMap;

    /**
     * property.
     */
    static Properties props = null;

    /**
     * Read the service properties.
     */
    static {
        props = ServicePropertyReader.getProperties();
        serviceInfoMap = new HashMap();
        serviceMap = new HashMap();
        serviceInterfaceMap = new HashMap();

        serviceInfoMap.put(DATABASE_SESSION_SERVICE,
                props.getProperty(DATABASE_SESSION_SERVICE));
        serviceInfoMap.put(COURSESERVICE_SERVICE,
                props.getProperty(COURSESERVICE_SERVICE));

        serviceInfoMap.put(COURSEREGISTRATIONSERVICE_SERVICE,
                props.getProperty(COURSEREGISTRATIONSERVICE_SERVICE));

        serviceInfoMap.put(DEPARTMENTSERVICE_SERVICE,
                props.getProperty(DEPARTMENTSERVICE_SERVICE));

        serviceInfoMap.put(OPTIONSSTORESSERVICE_SERVICE,
                props.getProperty(OPTIONSSTORESSERVICE_SERVICE));

        serviceInfoMap.put(QUESTIONSSERVICE_SERVICE,
                props.getProperty(QUESTIONSSERVICE_SERVICE));

        serviceInfoMap.put(QUESTIONSANSSERVICE_SERVICE,
                props.getProperty(QUESTIONSANSSERVICE_SERVICE));

        serviceInfoMap.put(QUESTIONSTYPESERVICE_SERVICE,
                props.getProperty(QUESTIONSTYPESERVICE_SERVICE));

        serviceInfoMap.put(STUDENTSERVICE_SERVICE,
                props.getProperty(STUDENTSERVICE_SERVICE));

        serviceInfoMap.put(TEACHERSSERVICE_SERVICE,
                props.getProperty(TEACHERSSERVICE_SERVICE));

        serviceInfoMap.put(TEACHESSERVICE_SERVICE,
                props.getProperty(TEACHESSERVICE_SERVICE));

        serviceInfoMap.put(TESTSERVICE_SERVICE,
                props.getProperty(TESTSERVICE_SERVICE));

        serviceInfoMap.put(TESTREGISTRATIONSERVICE_SERVICE,
                props.getProperty(TESTREGISTRATIONSERVICE_SERVICE));

        serviceInterfaceMap.put(DATABASE_SESSION_SERVICE,
                "sust.paperlessexm.DatabaseSessionService");

        serviceInterfaceMap.put(COURSESERVICE_SERVICE,
                "sust.paperlessexm.session.ICourseService");
        serviceInterfaceMap.put(COURSEREGISTRATIONSERVICE_SERVICE,
                "sust.paperlessexm.session.ICourseRegistrationService");
        serviceInterfaceMap.put(DEPARTMENTSERVICE_SERVICE,
                "sust.paperlessexm.session.IDepartmentService");
        serviceInterfaceMap.put(OPTIONSSTORESSERVICE_SERVICE,
                "sust.paperlessexm.session.IOptionsStoresService");
        serviceInterfaceMap.put(QUESTIONSSERVICE_SERVICE,
                "sust.paperlessexm.session.IQuestionsService");
        serviceInterfaceMap.put(QUESTIONSANSSERVICE_SERVICE,
                "sust.paperlessexm.session.IQuestionsAnsService");
        serviceInterfaceMap.put(QUESTIONSTYPESERVICE_SERVICE,
                "sust.paperlessexm.session.IQuestionsTypeService");
        serviceInterfaceMap.put(STUDENTSERVICE_SERVICE,
                "sust.paperlessexm.session.IStudentService");
        serviceInterfaceMap.put(TEACHERSSERVICE_SERVICE,
                "sust.paperlessexm.session.ITeachersService");
        serviceInterfaceMap.put(TEACHESSERVICE_SERVICE,
                "sust.paperlessexm.session.ITeachesService");
        serviceInterfaceMap.put(TESTSERVICE_SERVICE,
                "sust.paperlessexm.session.ITestService");
        serviceInterfaceMap.put(TESTREGISTRATIONSERVICE_SERVICE,
                "sust.paperlessexm.session.ITestRegistrationService");

    }

    /**
     * Locate a Service implementation by passing the Name of the service. The
     * getService() method will initalize an implementation of the service.
     *
     * @param serviceName de naam van de service
     * @return Een Implementatie van de gespecificeerde service.
     * @throws UnknownServiceException de exceptie
     * @throws ServiceInstantiationException de exceptie
     */
    public static LocatableService getService(String serviceName)
            throws UnknownServiceException,
            ServiceInstantiationException {
        log.debug("Locating service for " + serviceName);

        //see if there is a initialized
        LocatableService service = (LocatableService) serviceMap.get(serviceName);

        if (service != null) {
            return service;
        } else {
            //get service for the first time
            String className = (String) serviceInfoMap.get(serviceName);
            log.debug("Found service " + className);
            String interfaceName = (String) serviceInterfaceMap.get(serviceName);
            log.debug("Found service " + interfaceName);

            if (className != null) {
                try {
                    log.debug("Use classloader to find class: " + interfaceName);
                    Class theServiceInterface = Class.forName(interfaceName);
                    log.debug("Use classloader to find class: " + className);
                    Class theDelegateClass = Class.forName(className);
                    log.debug("Create a new instance of the loaded class.");
                    try {
                        log.debug("Create a new instance of the loaded class.");
                        service = (LocatableService) theDelegateClass.newInstance();
                    } catch (Exception e) {
                        log.debug("Create a dynamic proxy for the loaded class.");
                        service = (LocatableService) Proxy.newProxyInstance(theServiceInterface.getClassLoader(), new Class[]{theServiceInterface, LocatableService.class}, (InvocationHandler) theDelegateClass.newInstance());
                    }
                    service.init();
                    log.debug("The service was initialized");
                    serviceMap.put(serviceName, service);
                    log.debug("The service was put in the map");

                    return service;
                } catch (Exception e) {
                    log.error("Error instantiating the service", e);
                    throw new ServiceInstantiationException(e);
                }
            }

            throw new UnknownServiceException("Service not found:" + serviceName);
        }
    }

    /**
     * Determines a list of all constants using reflection and put them in a
     * hashmap.
     *
     * @return HashMap with the names of all constants and their String values.
     */
    public synchronized static HashMap getConstants() {
        if (map != null) {
            return map;
        }
        map = new HashMap();
        Field fields[] = null;

        try {
            fields = ServiceLocator.class.getDeclaredFields();
        } catch (SecurityException e) {
            e.printStackTrace();
            return new HashMap();
        }
        if (fields != null) {
            if (fields.length != 0) {
                for (int i = 0; i < fields.length; i++) {
                    if (Modifier.isPublic(fields[i].getModifiers())
                            && Modifier.isFinal(fields[i].getModifiers())
                            && Modifier.isStatic(fields[i].getModifiers())) {
                        // It's a constant!
                        try {
                            map.put(fields[i].getName(), fields[i].get(null));
                        } catch (Exception e) {
                            e.printStackTrace();
                            return new HashMap();
                        }
                    }
                }
            }
        }
        return map;
    }
}
