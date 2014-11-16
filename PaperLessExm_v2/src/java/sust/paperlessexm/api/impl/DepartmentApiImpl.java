package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.DepartmentApi;
import sust.paperlessexm.bean.DepartmentBean;
import sust.paperlessexm.entity.Department;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.DepartmentService;

/**
 *
 * @author Sm19
 */
public class DepartmentApiImpl implements DepartmentApi {

    @Override
    public void addDepartment(DepartmentBean model) throws GenericBusinessException {

        Department dep = new DepartmentBean().toEntity(model);
        DepartmentService departmentService = new DepartmentService();
        departmentService.addDepartment(dep);
    }

    @Override
    public void saveDepartment(DepartmentBean model) throws GenericBusinessException {

        Department dep = new DepartmentBean().toEntity(model);
        DepartmentService departmentService = new DepartmentService();
        departmentService.saveDepartment(dep);
    }

    @Override
    public void deleteDepartment(Integer id) throws GenericBusinessException {

        DepartmentService departmentService = new DepartmentService();
        departmentService.deleteDepartment(id);
    }

    @Override
    public DepartmentBean getDepartment(Integer id) throws GenericBusinessException {

        DepartmentService departmentService = new DepartmentService();
        Department department = departmentService.getDepartment(id);
        return new DepartmentBean(department);
    }

    @Override
    public List<DepartmentBean> getDepartmentList() throws GenericBusinessException {

        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentService.getDepartmentList();
        List<DepartmentBean> list = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {

            Department a = (Department) departments.get(i);
            list.add(new DepartmentBean(a));
        }
        return list;
    }

    @Override
    public List<DepartmentBean> getDepartmentList(int startIndex, int endIndex) throws GenericBusinessException {
        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }
        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentService.getDepartmentList();
        List<DepartmentBean> list = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {

            Department a = (Department) departments.get(i);
            list.add(new DepartmentBean(a));
        }
        return list;
    }

    @Override
    public int getDepartmentListSize() throws GenericBusinessException {
        DepartmentService departmentService = new DepartmentService();
        int size = departmentService.getDepartmentListSize();
        return size;
    }

    @Override
    public List<DepartmentBean> findDepartmentByDepartmentId(Integer departmentId) throws GenericBusinessException {
        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentService.findDepartmentByDepartmentId(departmentId);
        List<DepartmentBean> list = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {

            Department a = (Department) departments.get(i);
            list.add(new DepartmentBean(a));
        }
        return list;
    }

    @Override
    public List<DepartmentBean> findDepartmentByDeptCode(String deptCode) throws GenericBusinessException {
        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentService.findDepartmentByDeptCode(deptCode);
        List<DepartmentBean> list = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {

            Department a = (Department) departments.get(i);
            list.add(new DepartmentBean(a));
        }
        return list;
    }

    @Override
    public List<DepartmentBean> findDepartmentByDeptName(String deptName) throws GenericBusinessException {
        DepartmentService departmentService = new DepartmentService();
        List<Department> departments = departmentService.findDepartmentByDeptName(deptName);
        List<DepartmentBean> list = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {

            Department a = (Department) departments.get(i);
            list.add(new DepartmentBean(a));
        }
        return list;
    }
}
