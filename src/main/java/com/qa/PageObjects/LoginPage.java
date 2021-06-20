package com.qa.PageObjects;

import com.qa.Utils.BaseClass;
import com.qa.Utils.Browser;
import com.qa.Utils.PropertiesUtil;
import org.openqa.selenium.By;

import java.util.Properties;

public class LoginPage extends BaseClass {

    private static String txtUsername = "//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";

    public static void enterUsername(String strUsername) {
        Browser.enterText(txtUsername,strUsername);
    }

    public static void enterPassword(String strPassword) {
        Browser.enterText(txtPassword,strPassword);
    }

    public static void clickLogin() {
       Browser.clickElement(btnLogin);
    }

    public static void validateLogin() {
    }
}
