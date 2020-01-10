package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class HandleWindowPopups extends BaseTestClass{
    @Test
    public void testHandlingWindowPopups() throws InterruptedException {
        driver.get("http://www.popuptest.com/");

        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();
        String parentWindow = it.next();

        System.out.println("Parent Window::" + parentWindow);

        String childWidow = it.next();

        System.out.println("Parent Window::" + childWidow);
        driver.switchTo().window(childWidow);
        Thread.sleep(2000);

        driver.quit();
    }
}
