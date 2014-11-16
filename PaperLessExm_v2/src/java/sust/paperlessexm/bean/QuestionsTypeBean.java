package sust.paperlessexm.bean;

import sust.paperlessexm.entity.QuestionsType;

/**
 *
 * @author Sm19
 */
public class QuestionsTypeBean {

    private Integer questionsTypeId;
    private int noOfOptions;
    private String typeName;

    public QuestionsTypeBean() {
    }

    public QuestionsTypeBean(Integer questionsTypeId, int noOfOptions, String typeName) {
        this.questionsTypeId = questionsTypeId;
        this.noOfOptions = noOfOptions;
        this.typeName = typeName;
    }

    public QuestionsTypeBean(QuestionsType questionsType) {
        this.questionsTypeId = questionsType.getQuestionsTypeId();
        this.noOfOptions = questionsType.getNoOfOptions();
        this.typeName = questionsType.getTypeName();
    }
    
    public QuestionsType toEntity(QuestionsTypeBean questionsTypeBean){
      QuestionsType questionsType = new QuestionsType();
      questionsType.setQuestionsTypeId(questionsTypeBean.getQuestionsTypeId());
      questionsType.setTypeName(questionsTypeBean.getTypeName());
      questionsType.setNoOfOptions(questionsTypeBean.getNoOfOptions());
      return questionsType;
    }

    public Integer getQuestionsTypeId() {
        return questionsTypeId;
    }

    public java.lang.Integer getPrimaryKey() {
        return getQuestionsTypeId();
    }

    public void setQuestionsTypeId(Integer questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

    public int getNoOfOptions() {
        return noOfOptions;
    }

    public void setNoOfOptions(int noOfOptions) {
        this.noOfOptions = noOfOptions;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
