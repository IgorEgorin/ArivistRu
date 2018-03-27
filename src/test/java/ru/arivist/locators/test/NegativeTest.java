package ru.arivist.locators.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.arivist.test.locators.OverAllPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 26.03.2018.
 */
@RunWith(Parameterized.class)
public class NegativeTest extends OverAllPage {

    public String inputLogIn;
    public String inputPassword;

    public NegativeTest(String inputLogIn, String inputPassword) {
        this.inputLogIn = inputLogIn;
        this.inputPassword = inputPassword;
    }

    @Parameterized.Parameters(name = "{index} {0}")
    public static List<NegativeData> data() {
        List<NegativeData> list = new ArrayList<>();
        list.add(new NegativeData("UnvalidLogIn", "1234")); //enter unvalid log in and valid password
        list.add(new NegativeData("1234", "UnvalidPassword")); // enter valid log in and unvalid password
        return list;
    }

    @Test
    public void negativeTest() throws Exception {
        header.enterLogInAndPassword(inputLogIn, inputPassword);
    }

}