package com.demo;


import org.testng.annotations.Test;

public class BrowserNavigationExample extends BaseTestClass {
    @Test
    public void browserNavigateTestExample() throws InterruptedException {
        driver.get("https://www.google.com/");
        //Enter the url
        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
