package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
   public WebDriver driver;

    @BeforeMethod
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");// Property
        driver = new ChromeDriver();
        driver.manage().window().maximize();// for maximizing the window
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void testCloseSetUp()
    {
        driver.close();
    }
}
