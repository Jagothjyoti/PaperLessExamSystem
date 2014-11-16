

package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;

import sust.paperlessexm.api.CourseRegistrationApi;
import sust.paperlessexm.bean.CourseRegistrationBean;
import sust.paperlessexm.entity.CourseRegistration;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.CourseRegistrationService;

/**
 *
 * @author Jagothjyoti
 */
public class CourseRegistrationApiImpl implements CourseRegistrationApi{

    @Override
    public void addCourseRegistration(CourseRegistrationBean model) throws GenericBusinessException {
        CourseRegistration courseRegistration = new CourseRegistrationBean().toEntity(model);
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        courseRegistrationService.addCourseRegistration(courseRegistration);
    }

    @Override
    public void saveCourseRegistration(CourseRegistrationBean model) throws GenericBusinessException {
        CourseRegistration courseRegistration = new CourseRegistrationBean().toEntity(model);
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        courseRegistrationService.saveCourseRegistration(courseRegistration);
    }

    @Override
    public void deleteCourseRegistration(Integer id) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        courseRegistrationService.deleteCourseRegistration(id);
    }

    @Override
    public CourseRegistrationBean getCourseRegistration(Integer id) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        CourseRegistration courseRegistration = courseRegistrationService.getCourseRegistration(id);
        return new CourseRegistrationBean(courseRegistration);
    }

    @Override
    public List<CourseRegistrationBean> getCourseRegistrationList() throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.getCourseRegistrationList();
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }

    @Override
    public List<CourseRegistrationBean> getCourseRegistrationList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if (endIndex - startIndex < 0) {
            return new ArrayList<>();
        }
        
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.getCourseRegistrationList(startIndex, endIndex);
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }

    @Override
    public int getCourseRegistrationListSize() throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        return courseRegistrationService.getCourseRegistrationListSize();
    }

    @Override
    public List<CourseRegistrationBean> findCourseRegistrationByCourseRegistrationId(Integer courseRegistrationId) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.findCourseRegistrationByCourseId(courseRegistrationId);
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }

    @Override
    public List<CourseRegistrationBean> findCourseRegistrationByIsApproved(String isApproved) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.findCourseRegistrationByIsApproved(isApproved);
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }

    @Override
    public List<CourseRegistrationBean> findCourseRegistrationByStudentId(Integer studentId) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.findCourseRegistrationByStudentId(studentId);
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }

    @Override
    public List<CourseRegistrationBean> findCourseRegistrationByCourseId(Integer courseId) throws GenericBusinessException {
        CourseRegistrationService courseRegistrationService = new CourseRegistrationService();
        List<CourseRegistrationBean> list = new ArrayList();
        List list1 = courseRegistrationService.findCourseRegistrationByCourseId(courseId);
        for( int i = 0 ; i < list1.size() ; i++ )
        {
            list.add(new CourseRegistrationBean((CourseRegistration) list1.get(i)));
        }
        return list;
    }
   
    
}
