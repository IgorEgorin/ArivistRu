package ru.arivist.locators.test;

import org.junit.Test;
import ru.arivist.test.locators.DriverPreconditions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by 1 on 23.03.2018.
 */
public class PositiveTest extends DriverPreconditions {


    public PositiveTest(String stringList) {
        super(stringList);
    }

    @Test
    public void positiveTest() {
        $("#user-lk").hover();
        sleep(8000);
    }
}
