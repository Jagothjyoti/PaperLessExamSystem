package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.bean.StudentBean;
import sust.paperlessexm.api.StudentApi;
import sust.paperlessexm.entity.Student;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.StudentService;

/**
 *
 * @author Sm19
 */

public class StudentApiImpl implements StudentApi {

    @Override
    public void addStudent(StudentBean model) throws GenericBusinessException {
        Student student = new StudentBean().toEntity(model);
        StudentService service = new StudentService();
        service.addStudent(student);
    }

    @Override
    public void saveStudent(StudentBean model) throws GenericBusinessException {
        Student student = new StudentBean().toEntity(model);
        StudentService service = new StudentService();
        service.saveStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) throws GenericBusinessException {

        StudentService service = new StudentService();
        service.deleteStudent(id);
    }

    @Override
    public StudentBean getStudent(Integer id) throws GenericBusinessException {

        StudentService service = new StudentService();
        Student student = service.getStudent(id);
        return new StudentBean(student);
    }

    @Override
    public List<StudentBean> getStudentList() throws GenericBusinessException {

        StudentService service = new StudentService();
        List list = service.getStudentList();
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> getStudentList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }

        StudentService service = new StudentService();
        List list = service.getStudentList(startIndex, endIndex);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public int getStudentListSize() throws GenericBusinessException {
        StudentService service = new StudentService();
        int size = service.getStudentListSize();
        return size;
    }

    @Override
    public List<StudentBean> findStudentByStudentId(Integer studentId) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByStudentId(studentId);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByRegistrationNo(String registrationNo) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByRegistrationNo(registrationNo);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByStudentName(String studentName) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByStudentName(studentName);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByPassword(String password) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByPassword(password);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentBySession(Integer session) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentBySession(session);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByEmailAddress(String emailAddress) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByEmailAddress(emailAddress);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByContactNo(String contactNo) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByContactNo(contactNo);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByPhoto(String photo) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByPhoto(photo);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<StudentBean> findStudentByDepartmentId(Integer departmentId) throws GenericBusinessException {
        StudentService service = new StudentService();
        List list = service.findStudentByDepartmentId(departmentId);
        List<StudentBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new StudentBean((Student) list.get(i)));
        }
        return list1;
    }
}
