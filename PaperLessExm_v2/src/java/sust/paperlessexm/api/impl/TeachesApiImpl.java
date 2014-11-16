package sust.paperlessexm.api.impl;

import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.TeachesApi;
import sust.paperlessexm.bean.TeachesBean;
import sust.paperlessexm.entity.Teaches;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.TeachesService;

public class TeachesApiImpl implements TeachesApi {

    public void addTeaches(TeachesBean model) throws GenericBusinessException {
        Teaches teaches = new TeachesBean().toEntity(model);
        TeachesService service = new TeachesService();
        service.addTeaches(teaches);
    }

    @Override
    public void saveTeaches(TeachesBean model) throws GenericBusinessException {
        Teaches teaches = new TeachesBean().toEntity(model);
        TeachesService service = new TeachesService();
        service.saveTeaches(teaches);
    }

    @Override
    public void deleteTeaches(Integer id) throws GenericBusinessException {

        TeachesService service = new TeachesService();
        service.deleteTeaches(id);
    }

    @Override
    public TeachesBean getTeaches(Integer id) throws GenericBusinessException {

        TeachesService service = new TeachesService();
        Teaches teaches = service.getTeaches(id);
        return new TeachesBean(teaches);
    }

    @Override
    public List<TeachesBean> getTeachesList() throws GenericBusinessException {

        TeachesService service = new TeachesService();
        List list = service.getTeachesList();
        List<TeachesBean> list1;
        list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachesBean((Teaches) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachesBean> getTeachesList(int startIndex, int endIndex) throws GenericBusinessException {

        if (startIndex < 1) {
            startIndex = 1;
        }
        if ((endIndex - startIndex) < 0) {
            // Just return an empty list.
            return new ArrayList();
        }

        TeachesService service = new TeachesService();
        List list = service.getTeachesList(startIndex, endIndex);
        List<TeachesBean> list1;
        list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachesBean((Teaches) list.get(i)));
        }
        return list1;
    }

    @Override
    public int getTeachesListSize() throws GenericBusinessException {
        TeachesService service = new TeachesService();
        int size = service.getTeachesListSize();
        return size;
    }

    @Override
    public List<TeachesBean> findTeachesByTeachesId(Integer teachesId) throws GenericBusinessException {
        TeachesService service = new TeachesService();
        List list = service.findTeachesByTeachesId(teachesId);
        List<TeachesBean> list1;
        list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachesBean((Teaches) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachesBean> findTeachesByTeachersId(Integer teachersId) throws GenericBusinessException {
        TeachesService service = new TeachesService();
        List list = service.findTeachesByTeachersId(teachersId);
        List<TeachesBean> list1;
        list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachesBean((Teaches) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TeachesBean> findTeachesByCourseId(Integer courseId) throws GenericBusinessException {
        TeachesService service = new TeachesService();
        List list = service.findTeachesByCourseId(courseId);
        List<TeachesBean> list1;
        list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TeachesBean((Teaches) list.get(i)));
        }
        return list1;
    }
}
