package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.bean.TeachersBean;
import sust.paperlessexm.api.TeachersApi;
import sust.paperlessexm.entity.Teachers;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.TeachersService;

/**
 *
 * @author Sm19
 */
public class TeachersApiImpl implements TeachersApi {

    @Override
    public void addTeachers(TeachersBean model) throws GenericBusinessException {
        Teachers teachers = new TeachersBean().toEntity(model);
        TeachersService teachersService = new TeachersService();
        teachersService.addTeachers(teachers);
    }

    @Override
    public void saveTeachers(TeachersBean model) throws GenericBusinessException {
        Teachers teachers = new TeachersBean().toEntity(model);
        TeachersService teachersService = new TeachersService();
        teachersService.saveTeachers(teachers);
    }

    @Override
    public void deleteTeachers(Integer id) throws GenericBusinessException {

        TeachersService teachersService = new TeachersService();
        teachersService.deleteTeachers(id);
    }

    @Override
    public TeachersBean getTeachers(Integer id) throws GenericBusinessException {

        TeachersService teachersService = new TeachersService();
        Teachers teachers = teachersService.getTeachers(id);
        return new TeachersBean(teachers);
    }

    @Override
    public List<TeachersBean> getTeachersList() throws GenericBusinessException {

        TeachersService teachersService = new TeachersService();
        List list = teachersService.getTeachersList();
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> getTeachersList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }

        TeachersService teachersService = new TeachersService();
        List list = teachersService.getTeachersList(startIndex, endIndex);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public int getTeachersListSize() throws GenericBusinessException {

        TeachersService teachersService = new TeachersService();
        int size = teachersService.getTeachersListSize();
        return size;
    }

    @Override
    public List<TeachersBean> findTeachersByTeachersId(Integer teachersId) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByTeachersId(teachersId);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByTeachersName(String teachersName) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByTeachersName(teachersName);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByTeachersDept(String teachersDept) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByTeachersDept(teachersDept);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByEmailAddress(String emailAddress) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByEmailAddress(emailAddress);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByContactNo(String contactNo) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByContactNo(contactNo);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByPhoto(String photo) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByPhoto(photo);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByPassword(String password) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByPassword(password);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachersBean> findTeachersByEmployeeCode(String employeeCode) throws GenericBusinessException {
        TeachersService teachersService = new TeachersService();
        List list = teachersService.findTeachersByEmployeeCode(employeeCode);
        List<TeachersBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachersBean((Teachers) list.get(i)));
        }
        return list1;
    }
}
