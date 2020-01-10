package com.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorExample  extends BaseTestClass{
    @Test
    public void facebookLoginExample_For_LocatorExample() throws InterruptedException {

        driver.get("http://www.facebook.com/");
//*[@id="u_0_m"] html#facebook.tinyViewport.tinyHeight body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.gecko.x1.Locale_en_GB.cores-lt4.hasAXNavMenubar._19_u div#u_0_e._li div#pagelet_bluebar div#blueBarDOMInspector div._53jh div.loggedout_menubar_container div.clearfix.loggedout_menubar div.menu_login_container.rfloat._ohf form#login_form table tbody tr td input#email.inputtext.login_form_input_box
// Used “id” locator to find USERNAME text box
        WebElement webElement = driver.findElement(By.id("email"));
//Clear the existing value present in the text box
        webElement.clear();
// Enter value into the USERNAME text box
        webElement.sendKeys("laxmanbhosale7374@gmail.com");
// Used “name” locator to find Password text box
        WebElement passTB = driver.findElement(By.id("pass"));
        // Enter value into the Password text box
        passTB.sendKeys("seleniumPassword");
//Clear the existing value present in the text box
//Halt the program execution for 2 seconds
        Thread.sleep(2000);
// Enter value into the Password text boxpassTB.sendKeys("Qspiders123");
// Find the address of ActiTIME Link and click
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(2000);

    }
}
