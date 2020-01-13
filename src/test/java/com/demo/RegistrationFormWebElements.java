package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationFormWebElements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");// Property
        driver = new ChromeDriver();
        driver.manage().window().maximize();// for maximizing the window
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testForHandlingDropDrownComponents() {
        driver.get("http://www.echoecho.com/htmlforms11.htm");
        Select dropDown = new Select(driver.findElement(By.name("dropdownmenu")));
        dropDown.selectByVisibleText("Cheese");
    }

    @Test
    public void testForHandlingTextField() {
        driver.get("http://www.echoecho.com/htmlforms11.htm");
        driver.findElement(By.name("shorttext")).sendKeys("Laxman");
    }

    @Test
    public void testHandlingPasswordField() {
        driver.get("http://www.echoecho.com/htmlforms06.htm");
        driver.findElement(By.name("shorttext")).sendKeys("Laxman");
//longtext
    }

    @Test
    public void testHandlingTextAreaField() {
        driver.get("http://www.echoecho.com/htmlforms06.htm");
        driver.findElement(By.name("longtext")).sendKeys("Laxman");
    }

    @Test
    public void testHandlingCheckBoxField() {
        driver.get("http://www.echoecho.com/htmlforms09.htm");


    }
}
