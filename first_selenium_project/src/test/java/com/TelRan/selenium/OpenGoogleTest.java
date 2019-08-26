package com.TelRan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenGoogleTest  extends TestBase {

    @Test
 public void searchJavaTest() throws InterruptedException {
        openSite("https://www.google.com");

        type(By.name("q"),"java"+Keys.ENTER);


    Thread.sleep(5000);

}
@Test
   public void clickImFillingLucky(){


}
}
