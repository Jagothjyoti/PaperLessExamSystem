/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sust.paperlessexm.api;

import sust.paperlessexm.bean.TeachesBean;

public interface TeachesApi {

    void addTeaches(TeachesBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void saveTeaches(TeachesBean model) throws sust.paperlessexm.exception.GenericBusinessException;

    void deleteTeaches(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    TeachesBean getTeaches(java.lang.Integer id) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachesBean> getTeachesList() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachesBean> getTeachesList(int startIndex, int endIndex) throws sust.paperlessexm.exception.GenericBusinessException;

    int getTeachesListSize() throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachesBean> findTeachesByTeachesId(java.lang.Integer teachesId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachesBean> findTeachesByTeachersId(java.lang.Integer teachersId) throws sust.paperlessexm.exception.GenericBusinessException;

    java.util.List<TeachesBean> findTeachesByCourseId(java.lang.Integer courseId) throws sust.paperlessexm.exception.GenericBusinessException;

}
