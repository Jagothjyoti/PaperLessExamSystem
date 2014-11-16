package sust.paperlessexm.api;

import sust.paperlessexm.entity.OptionsStores;
import sust.paperlessexm.entity.Questions;

/**
 *
 * @author Sm19
 */
public class OptionsStoresApi {

    private Integer optionsStoresId;
    private String optionsText;
    private Questions questionsId;

    public OptionsStoresApi(Integer optionsStoresId, String optionsText, Questions questionsId) {
        this.optionsStoresId = optionsStoresId;
        this.optionsText = optionsText;
        this.questionsId = questionsId;
    }

    public OptionsStoresApi(OptionsStores optionsStores) {
        this.optionsStoresId = optionsStores.getOptionsStoresId();
        this.optionsText = optionsStores.getOptionsText();
        this.questionsId = optionsStores.getQuestionsId();
    }

    public Integer getOptionsStoresId() {
        return optionsStoresId;
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

    public Questions getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(Questions questionsId) {
        this.questionsId = questionsId;
    }
}
