package ru.arivist.locators.test;

/**
 * Created by 1 on 26.03.2018.
 */
public class NegativeData {

    public String inputLogIn;
    public String inputPassword;

    public NegativeData(String inputLogIn, String inputPassword) {
        this.inputLogIn = inputLogIn;
        this.inputPassword = inputPassword;
    }

    @Override
    public String toString() {
        return inputLogIn + " " + inputPassword;
    }
}
