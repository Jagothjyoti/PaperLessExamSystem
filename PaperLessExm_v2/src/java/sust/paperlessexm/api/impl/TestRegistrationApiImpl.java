package sust.paperlessexm.api.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import sust.paperlessexm.api.TestRegistrationApi;
import sust.paperlessexm.bean.TestRegistrationBean;
import sust.paperlessexm.entity.TestRegistration;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.TestRegistrationService;

//1215827
//1220628

/**
 *
 * @author Sm19
 */

public class TestRegistrationApiImpl implements TestRegistrationApi {

    @Override
    public void addTestRegistration(TestRegistrationBean model) throws GenericBusinessException {

        TestRegistration registration = new TestRegistrationBean().toEntity(model);
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        testRegistrationService.addTestRegistration(registration);
    }

    @Override
    public void saveTestRegistration(TestRegistrationBean model) throws GenericBusinessException {
        TestRegistration registration = new TestRegistrationBean().toEntity(model);
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        testRegistrationService.saveTestRegistration(registration);
    }

    @Override
    public void deleteTestRegistration(Integer id) throws GenericBusinessException {

        TestRegistrationService testRegistrationService = new TestRegistrationService();
        testRegistrationService.deleteTestRegistration(id);
    }

    @Override
    public TestRegistrationBean getTestRegistration(Integer id) throws GenericBusinessException {

        TestRegistrationService testRegistrationService = new TestRegistrationService();
        TestRegistration registration = testRegistrationService.getTestRegistration(id);
        return new TestRegistrationBean(registration);
    }

    @Override
    public List<TestRegistrationBean> getTestRegistrationList() throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.getTestRegistrationList();
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TestRegistrationBean> getTestRegistrationList(int startIndex, int endIndex) throws GenericBusinessException {

        if (startIndex < 1) {
            startIndex = 1;
        }
        if (endIndex - startIndex < 0) {
            return new ArrayList<>();
        }

        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.getTestRegistrationList(startIndex, endIndex);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public int getTestRegistrationListSize() throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        int size = testRegistrationService.getTestRegistrationListSize();
        return size;
    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationByTestRegistrationId(Integer testRegistrationId) throws GenericBusinessException {

        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationByTestRegistrationId(testRegistrationId);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;

    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationByTestMarks(Integer testMarks) throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationByTestMarks(testMarks);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationByStartTime(Timestamp startTime) throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationByStartTime(startTime);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationBySubmitTime(Timestamp submitTime) throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationBySubmitTime(submitTime);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationByTestId(Integer testId) throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationByTestId(testId);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }

    @Override
    public List<TestRegistrationBean> findTestRegistrationByCourseRegistrationId(Integer courseRegistrationId) throws GenericBusinessException {
        TestRegistrationService testRegistrationService = new TestRegistrationService();
        List list = testRegistrationService.findTestRegistrationByCourseRegistrationId(courseRegistrationId);
        List<TestRegistrationBean> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(new TestRegistrationBean((TestRegistration) list.get(i)));
        }
        return list1;
    }
}

