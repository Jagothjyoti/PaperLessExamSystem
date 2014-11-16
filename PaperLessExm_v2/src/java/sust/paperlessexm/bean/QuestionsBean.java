package sust.paperlessexm.bean;

import sust.paperlessexm.entity.Questions;
import sust.paperlessexm.entity.QuestionsType;
import sust.paperlessexm.entity.Test;

/**
 *
 * @author Sm19
 */
public class QuestionsBean {

    private Integer questionsId;
    private int totalMarks;
    private String correctAns;
    private boolean isDirectMarking;
    private int questionNo;
    private TestBean testId;
    private QuestionsTypeBean questionsTypeId;

    public QuestionsBean() {
    }

    public QuestionsBean(Integer questionsId, int totalMarks, String correctAns, boolean isDirectMarking, int questionNo, TestBean testId, QuestionsTypeBean questionsTypeId) {
        this.questionsId = questionsId;
        this.totalMarks = totalMarks;
        this.correctAns = correctAns;
        this.isDirectMarking = isDirectMarking;
        this.questionNo = questionNo;
        this.testId = testId;
        this.questionsTypeId = questionsTypeId;
    }

    public QuestionsBean(Questions questions) {
        this.questionsId = questions.getQuestionsId();
        this.totalMarks = questions.getTotalMarks();
        this.correctAns = questions.getCorrectAns();
        this.isDirectMarking = questions.getIsDirectMarking();
        this.questionNo = questions.getQuestionNo();
        this.testId = new TestBean(questions.getTestId());
        this.questionsTypeId = new QuestionsTypeBean(questions.getQuestionsTypeId());
    }
    
    public Questions toEnity(QuestionsBean questionsBean){
       Questions questions = new Questions();
       questions.setQuestionsId(questionsBean.getQuestionsId());
       questions.setTotalMarks(questionsBean.getTotalMarks());
       questions.setCorrectAns(questionsBean.getCorrectAns());
       questions.setIsDirectMarking(questionsBean.getIsDirectMarking());
       questions.setQuestionsTypeId(new QuestionsTypeBean().toEntity(questionsBean.getQuestionsTypeId()));
       questions.setTestId(new TestBean().toEntity(questionsBean.getTestId()));
       return questions;
    }

    public Integer getQuestionsId() {
        return questionsId;
    }

    public java.lang.Integer getPrimaryKey() {
        return getQuestionsId();
    }

    public void setQuestionsId(Integer questionsId) {
        this.questionsId = questionsId;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public boolean getIsDirectMarking() {
        return isDirectMarking;
    }

    public void setIsDirectMarking(boolean isDirectMarking) {
        this.isDirectMarking = isDirectMarking;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public TestBean getTestId() {
        return testId;
    }

    public void setTestId(TestBean testId) {
        this.testId = testId;
    }

    public QuestionsTypeBean getQuestionsTypeId() {
        return questionsTypeId;
    }

    public void setQuestionsTypeId(QuestionsTypeBean questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

}
