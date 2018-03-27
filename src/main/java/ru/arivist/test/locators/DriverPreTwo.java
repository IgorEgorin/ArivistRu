package ru.arivist.test.locators;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.AfterClass;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.browser;


/**
 * Created by 1 on 26.03.2018.
 */


public class DriverPreTwo {

    private static String[] browserss;

    @Before
    public void before() {
        String[] browserss = {
                "Chrome",
                "FireFox"};

        for (String x : browserss)

        {
            switch (x) {
                case "Chrome":
                    ChromeDriverManager.getInstance().setup();
                    browser = "Chrome";
                    Selenide.open("https://www.arivist.ru/");
                case "FireFox":
                    FirefoxDriverManager.getInstance().setup();
                    browser = "FireFox";
                    Selenide.open("https://www.arivist.ru/");
                    break;


            }
        }
    }

    @AfterClass
    public static void tearDown() {
        if (browserss.length == 0) {
            Selenide.close();
        }

    }
}