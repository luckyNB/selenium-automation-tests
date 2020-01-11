package com.handling_popups;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * class description
 */

public class DemoWebAlert extends BaseTestClass {


    @Test
    public void testWebAlert() throws InterruptedException {
        // Alert Message handling

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
    }

    @Test()
    public void testFacebookLoginAndLogoutProcess() throws InterruptedException {


        //Create a map to store  preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

//Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

// set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("8855844149");
        driver.findElement(By.id("pass")).sendKeys("avi123");
        driver.findElement(By.id("loginbutton")).click();

        Thread.sleep(7000);
        Select option = new Select(driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")));
        option.selectByVisibleText("Log Out");

    }

    @Test
    public void testingTheFirefoxBrowserLauncher() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("8855844149");
        driver.findElement(By.id("pass")).sendKeys("avi123");
        driver.findElement(By.id("loginbutton")).click();


        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(6000);
        Select select=new Select(driver.findElement(By.xpath("userNavigationLabel")));
        select.selectByVisibleText("Log Out");
        Thread.sleep(2000);
    }

    @Test
    public void testAutomatingFacebookLoginAndLogout() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver =new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_4"));
        username.sendKeys("7030493048");
        password.sendKeys("lucky143");
        Login.click();
        Thread.sleep(5000);

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement navigationclick = driver.findElement(By.id("userNavigationLabel"));
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//input[@class='fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh gecko x1 Locale_en_GB cores-lt4 _19_u hasAXNavMenubar']"));
        navigationclick.click();
        if(logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        }
        else {
            System.out.println("Element not found");
        }

    }

    @Test
    public void testTwitterLoginDemo() {
        driver.get("https://twitter.com/login/");
        driver.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']")).sendKeys("20150773@dbatu.ac.in");
        driver.findElement(By.xpath("//input[@class='js-password-field']")).sendKeys("Laxman@2020");
        driver.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
    }
}
