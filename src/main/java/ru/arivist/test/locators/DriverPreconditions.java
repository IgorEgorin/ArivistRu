package ru.arivist.test.locators;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Configuration.browser;

/**
 * Created by 1 on 23.03.2018.
 */
@RunWith(Parameterized.class)
public class DriverPreconditions {


    private String stringList;

    public DriverPreconditions(String stringList) {
        this.stringList = stringList;
    }

    @Parameterized.Parameters(name = "{index} {0}")
    public static List<String> data() {
        List<String> stringList = new ArrayList<>();
        stringList.add(new String("Chrome"));
        stringList.add(new String("FireFox"));
        return stringList;
    }




    @Before
    public void before() {
            switch (stringList) {
                case "Chrome":
                    ChromeDriverManager.getInstance().setup();
                    browser = "Chrome";

                    break;
                case "FireFox":
                    FirefoxDriverManager.getInstance().setup();
                    browser = "FireFox";
                    break;
            }
            Configuration.timeout = 7000;
            Selenide.open("https://www.arivist.ru/");


        }


    @After
    public void after() {
        Selenide.close();
    }


}
