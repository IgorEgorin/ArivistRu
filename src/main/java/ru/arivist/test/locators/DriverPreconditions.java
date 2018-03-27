package ru.arivist.test.locators;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.ArrayList;
import java.util.List;

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
    public static List<String> dataPrecond() {
        List<String> stringList = new ArrayList<>();
        stringList.add(new String("Chrome"));
//        stringList.add(new String("FireFox"));
//        stringList.add(new String("Opera"));
//        stringList.add(new String("IE"));
        return stringList;
    }


    @Before
    public void before() {
        switch (stringList) {
            case "Chrome":
                ChromeDriverManager.getInstance().setup();
                Configuration.browser = "Chrome";
                break;
            case "FireFox":
                FirefoxDriverManager.getInstance().setup();
                Configuration.browser = "FireFox";
                break;
            case "Opera":
//                C:\Program F2\IntelliJ IDEA Community Edition 2016.2.1\ArivistRu\src\main\resources
                System.setProperty("webdriver.opera.driver", "src\\main\\resources\\operadriver.exe");
                WebDriver driver = new OperaDriver();
                driver.get("https://www.arivist.ru/");
                break;
            case "IE":
                InternetExplorerDriverManager.getInstance().setup();
                Configuration.browser = "Internet Explorer";

                break;
        }

        Configuration.timeout = 7000;
        Selenide.open("https://www.arivist.ru/");

    }


    @After
    public void after() {
//        if (driver != null) {
//            driver.quit();
//        }
        Selenide.close();
    }


}
