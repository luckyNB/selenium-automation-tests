package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalenderSpiceJetExample extends BaseTestClass{
    @Test
    public void testCalenderSpiceJetExample() {

        driver.get(
                "https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetbrandexact&gclid=Cj0KCQjwl8XtBRDAARIsAKfwtxDdEV9YnX8e9V4oTNBS_WX2ln6jvygyLwKRmSwtm7X_hMmi90mjMxkaApCGEALw_wcB");

        WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        String dateVal = "20-11-2019";
        selectDateByJs(date, driver, dateVal);

    }

    public static void selectDateByJs(WebElement element, WebDriver driver, String dateVal) {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);

        executor.executeScript("arguments[0].setAttribute(value,'" + dateVal + "')", element);
    }
    }

