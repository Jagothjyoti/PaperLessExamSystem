package sust.paperlessexm.api;

import sust.paperlessexm.bean.DepartmentBean;

/**
 * @author md afjal hossain SUST-CSE-2010
 * @version $Revision: 1.11 $, $Date: 2006/04/29 12:39:09 $
 */
public interface DepartmentApi {

    void addDepartment(DepartmentBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveDepartment(DepartmentBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteDepartment(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    DepartmentBean getDepartment(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<DepartmentBean> getDepartmentList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<DepartmentBean> getDepartmentList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getDepartmentListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<DepartmentBean> findDepartmentByDepartmentId(java.lang.Integer departmentId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<DepartmentBean> findDepartmentByDeptCode(java.lang.String deptCode) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<DepartmentBean> findDepartmentByDeptName(java.lang.String deptName) throws sust.paperlessexm.exception.GenericBusinessException;
}
