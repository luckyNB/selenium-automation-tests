package com.demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcastingToWebDriver_LaunchBrowser {
    @Test
    public void testSample() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
