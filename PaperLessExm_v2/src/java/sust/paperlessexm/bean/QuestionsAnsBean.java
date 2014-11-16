package sust.paperlessexm.bean;

import sust.paperlessexm.entity.QuestionsAns;

/**
 *
 * @author Sm19
 */
public class QuestionsAnsBean {

    private Integer questionsAnsId;
    private String givenAns;
    private Integer givenMarks;
    private QuestionsBean questionsId;
    private TestRegistrationBean testRegistrationId;

    public QuestionsAnsBean() {
    }

    public QuestionsAnsBean(Integer questionsAnsId, String givenAns, Integer givenMarks, QuestionsBean questionsId, TestRegistrationBean testRegistrationId) {
        this.questionsAnsId = questionsAnsId;
        this.givenAns = givenAns;
        this.givenMarks = givenMarks;
        this.questionsId = questionsId;
        this.testRegistrationId = testRegistrationId;
    }

    public QuestionsAnsBean(QuestionsAns questionsAns) {
        this.questionsAnsId = questionsAns.getQuestionsAnsId();
        this.givenAns = questionsAns.getGivenAns();
        this.givenMarks = questionsAns.getGivenMarks();
        this.questionsId = new QuestionsBean(questionsAns.getQuestionsId());
        this.testRegistrationId = new TestRegistrationBean(questionsAns.getTestRegistrationId());
    }
    
    public QuestionsAns toEntity(QuestionsAnsBean questionsAnsBean){
       QuestionsAns questionsAns = new QuestionsAns();
       questionsAns.setQuestionsAnsId(questionsAnsBean.getQuestionsAnsId());
       questionsAns.setGivenAns(questionsAnsBean.getGivenAns());
       questionsAns.setGivenMarks(questionsAnsBean.getGivenMarks());
       questionsAns.setQuestionsId( new QuestionsBean().toEnity(questionsAnsBean.getQuestionsId()));
       questionsAns.setTestRegistrationId(new TestRegistrationBean().toEntity(questionsAnsBean.getTestRegistrationId()));
       
       return questionsAns;
    }

    public Integer getQuestionsAnsId() {
        return questionsAnsId;
    }
    
    public java.lang.Integer getPrimaryKey() {
        return getQuestionsAnsId();
    }
    public void setQuestionsAnsId(Integer questionsAnsId) {
        this.questionsAnsId = questionsAnsId;
    }

    public String getGivenAns() {
        return givenAns;
    }

    public void setGivenAns(String givenAns) {
        this.givenAns = givenAns;
    }

    public Integer getGivenMarks() {
        return givenMarks;
    }

    public void setGivenMarks(Integer givenMarks) {
        this.givenMarks = givenMarks;
    }

    public QuestionsBean getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(QuestionsBean questionsId) {
        this.questionsId = questionsId;
    }

    public TestRegistrationBean getTestRegistrationId() {
        return testRegistrationId;
    }

    public void setTestRegistrationId(TestRegistrationBean testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }
}
