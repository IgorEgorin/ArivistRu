package ru.arivist.locators.test;

import org.junit.Test;
import ru.arivist.test.locators.OverAllPage;

/**
 * Created by 1 on 23.03.2018.
 */
public class PositiveTest extends OverAllPage {

    @Test
    public void positiveTest() {
        header.enterLogInAndPassword("test", "ValidPassword");
    }
}
