package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementDemo extends BaseTestClass {
    @Test
    public void testingTheWebElementMethods() {
        driver.get("https://www.google.com");
       driver.findElement(By.xpath("//input[@class='vdLsw gsfi ']")).sendKeys("Indian Navy");
    }

    @Test
    public void testDynamicXpathCreationUsingDifferentLocators() {
        driver.get("https://www.ebay.com/");

    }
}
