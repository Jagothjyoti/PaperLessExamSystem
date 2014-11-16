package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Department;

/**
 *
 * @author Sm19
 */
public class DepartmentBean {

    private Integer departmentId;
    private String deptCode;
    private String deptName;

    public DepartmentBean() {
    }

    public DepartmentBean(Integer departmentId, String deptCode, String deptName) {
        this.departmentId = departmentId;
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    public DepartmentBean(Department department) {
        this.departmentId = department.getDepartmentId();
        this.deptCode = department.getDeptCode();
        this.deptName = department.getDeptName();
    }

    public Department toEntity(DepartmentBean departBean) {
        Department department = new Department();
        
        department.setDepartmentId(departBean.getDepartmentId());
        department.setDeptCode(departBean.getDeptCode());
        department.setDeptName(departBean.getDeptName());

        return department;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public java.lang.Integer getPrimaryKey() {
        return getDepartmentId();
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
