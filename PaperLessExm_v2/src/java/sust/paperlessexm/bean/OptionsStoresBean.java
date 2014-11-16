package sust.paperlessexm.bean;

import sust.paperlessexm.entity.OptionsStores;

/**
 *
 * @author Sm19
 */
public class OptionsStoresBean {

    private Integer optionsStoresId;
    private String optionsText;
    private QuestionsBean questionsId;

    public OptionsStoresBean() {
    }

    public OptionsStoresBean(Integer optionsStoresId, String optionsText, QuestionsBean questionsId) {
        this.optionsStoresId = optionsStoresId;
        this.optionsText = optionsText;
        this.questionsId = questionsId;
    }

    public OptionsStoresBean(OptionsStores optionsStores) {
        this.optionsStoresId = optionsStores.getOptionsStoresId();
        this.optionsText = optionsStores.getOptionsText();
        this.questionsId = new QuestionsBean(optionsStores.getQuestionsId());
    }
    
    public OptionsStores toEntity(OptionsStoresBean optionsStoresBean){
       OptionsStores optionsStores = new OptionsStores();
       optionsStores.setOptionsStoresId(optionsStoresBean.getOptionsStoresId());
       optionsStores.setOptionsText(optionsStoresBean.getOptionsText());
       optionsStores.setQuestionsId(new QuestionsBean().toEnity(optionsStoresBean.getQuestionsId()));
       return optionsStores;
    }

    public Integer getOptionsStoresId() {
        return optionsStoresId;
    }

    public java.lang.Integer getPrimaryKey() {
        return getOptionsStoresId();
    }

    public void setOptionsStoresId(Integer optionsStoresId) {
        this.optionsStoresId = optionsStoresId;
    }

    public String getOptionsText() {
        return optionsText;
    }

    public void setOptionsText(String optionsText) {
        this.optionsText = optionsText;
    }

    public QuestionsBean getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(QuestionsBean questionsId) {
        this.questionsId = questionsId;
    }
}
