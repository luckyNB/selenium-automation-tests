package com.handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
   public WebDriver driver;

    @BeforeMethod(description = "setting the driver ")
    public void testSetUp() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");// Property
        driver = new FirefoxDriver();
        driver.manage().window().maximize();// for maximizing the window
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void testCloseSetUp()
    {
        driver.close();
    }
}
