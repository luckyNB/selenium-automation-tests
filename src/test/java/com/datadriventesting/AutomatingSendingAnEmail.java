package com.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class AutomatingSendingAnEmail {
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
    public void testSendingAnEmailThroughAutomation() throws InterruptedException, AWTException {
        Robot robot = new Robot();

        driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
        driver.findElement(By.id("identifierId")).sendKeys("laxmanbhosale7374@gmail.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password'][@class='whsOnd zHQkBf']")).sendKeys("Laxman@2021");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id=':pi']")).sendKeys("20150773@dbatu.ac.in");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.name("subjectbox")).sendKeys("Regarding to the my friends life interference");

        driver.findElement(By.xpath("//div[@id=':q5']")).sendKeys("My dear Friend,How are You?");

        driver.findElement(By.xpath("//div[@id=':oq']")).click();


    }
}