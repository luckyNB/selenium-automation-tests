package com.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CaptureScreenshot_ActiTIMEPage extends BaseTestClass {
    @Test
    public void TakeScreenShotsUsingSelenium() throws IOException {

        driver.get("https://www.facebook.com/");
        //Creating an object of Date class
        Date d = new Date();
        //Printing the actual date
        String date1 = d.toString();
        System.out.println(date1);
        //replacing the colon present in the date timestamp format to "_" using replaceAll()
        //method of String class
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        //Typecasting the driver object to TakesScreenshot interface type.
        TakesScreenshot ts = (TakesScreenshot) driver;
        //getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
		/*Created a folder called "screenshot" in the project directory
		Created another file by concatenating the date value which has "_" in it
		(Underscore is the accepted character while creating a file in the project )*/
        File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");
		/*copyFile() method is a static method present in FileUtils class of JAVA
		storing the screenshot in the destination location*/
        FileUtils.copyFile(srcFile, new File("/home/user/workspace/Demo_Selenium/src/test/resources/Screenshots/shot.jpg"));
        //closing the browser
        driver.close();
    }
}
