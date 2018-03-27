package ru.arivist.test.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 26.03.2018.
 */
public class Header {

    private SelenideElement linkLogInPopUp;
    private SelenideElement inputPopUpLogInField;
    private SelenideElement inputPopUpPasswordField;
    private SelenideElement buttonSubmitPopUp;

    public Header() {
        this.linkLogInPopUp = $("#user-lk");
        this.inputPopUpLogInField = $("#login");
        this.inputPopUpPasswordField = $("#password");
        this.buttonSubmitPopUp = $("[class=\"btn btn-arivist anim\"]");
    }

    public SelenideElement getLinkLogInPopUp() {
        return linkLogInPopUp;
    }

    public SelenideElement getInputPopUpLogInField() {
        return inputPopUpLogInField;
    }

    public SelenideElement getInputPopUpPasswordField() {
        return inputPopUpPasswordField;
    }

    public SelenideElement getButtonSubmitPopUp() {
        return buttonSubmitPopUp;
    }

    public void enterLogInAndPassword(String logIn, String password) {
        linkLogInPopUp.hover();
        inputPopUpLogInField.setValue(logIn);
        inputPopUpPasswordField.setValue(password);
        buttonSubmitPopUp.click();
    }

}
