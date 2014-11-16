package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.CourseApi;
import sust.paperlessexm.bean.CourseBean;
import sust.paperlessexm.entity.Course;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.CourseService;

/**
 *
 * @author Sm19
 */
public class CourseApiImpl implements CourseApi {

    @Override
    public void addCourse(CourseBean model) throws GenericBusinessException {

        Course course = new CourseBean().toEntity(model);
        CourseService courseService = new CourseService();
        courseService.addCourse(course);
    }

    @Override
    public void saveCourse(CourseBean model) throws GenericBusinessException {

        Course course = new CourseBean().toEntity(model);
        CourseService courseService = new CourseService();
        courseService.saveCourse(course);
    }

    @Override
    public void deleteCourse(Integer id) throws GenericBusinessException {

        CourseService courseService = new CourseService();
        courseService.deleteCourse(id);
    }

    @Override
    public CourseBean getCourse(Integer id) throws GenericBusinessException {

        CourseService courseService = new CourseService();
        Course newCourse = courseService.getCourse(id);
        return new CourseBean(newCourse);
    }

    @Override
    public List<CourseBean> getCourseList() throws GenericBusinessException {

        CourseService courseService = new CourseService();
        List list = courseService.getCourseList();
        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> getCourseList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }
        CourseService courseService = new CourseService();
        List list = courseService.getCourseList(startIndex, endIndex);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            list1.add(new CourseBean((Course) list.get(i)));
        }

        return list1;
    }

    @Override
    public int getCourseListSize() throws GenericBusinessException {

        CourseService courseService = new CourseService();
        int courseSize = courseService.getCourseListSize();
        return courseSize;
    }

    @Override
    public List<CourseBean> findCourseByCourseId(Integer courseId) throws GenericBusinessException {

        CourseService courseService = new CourseService();
        List list = courseService.findCourseByCourseId(courseId);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseByCourseTitle(String courseTitle) throws GenericBusinessException {
        CourseService courseService = new CourseService();
        List list = courseService.findCourseByCourseTitle(courseTitle);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseByCourseCode(String courseCode) throws GenericBusinessException {
        CourseService courseService = new CourseService();
        List list = courseService.findCourseByCourseCode(courseCode);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseByOfferingDept(String offeringDept) throws GenericBusinessException {

        CourseService courseService = new CourseService();
        List list = courseService.findCourseByOfferingDept(offeringDept);
        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseByAcceptingDept(String acceptingDept) throws GenericBusinessException {

        CourseService courseService = new CourseService();
        List list = courseService.findCourseByAcceptingDept(acceptingDept);
        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseByCredit(Double credit) throws GenericBusinessException {
        CourseService courseService = new CourseService();
        List list = courseService.findCourseByCredit(credit);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;

    }

    @Override
    public List<CourseBean> findCourseBySemester(Integer semester) throws GenericBusinessException {
        CourseService courseService = new CourseService();
        List list = courseService.findCourseBySemester(semester);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<CourseBean> findCourseBySession(Integer session) throws GenericBusinessException {
        CourseService courseService = new CourseService();
        List list = courseService.findCourseBySession(session);

        List<CourseBean> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(new CourseBean((Course) list.get(i)));
        }
        return list1;
    }
}
