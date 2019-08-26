package com.TelRan.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void logInTest(String url) {



        //init login
        initLogin();
        //fill login form
        fillLoginForm("rgrretytrtyt", "4374587657");

        clickloginButton();


    }


}
