package com.TelRan.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod

public void setUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


}

    @Test
      //public void clickImFillingLucky(){

         //   new Actions(driver).moveToElement(driver.findElement(By.name("btnI"))).click().perform();

         //   driver.findElement(By.name("btnI")).click();
    //}

    @AfterMethod
        public void tearDown(){

        driver.quit();

    }
}
