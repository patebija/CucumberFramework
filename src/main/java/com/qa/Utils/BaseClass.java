package com.qa.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    private static Properties properties;

     public static void setup(){
       properties = PropertiesUtil.loadApplicationProperties();
       String url = properties.getProperty("application.url");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void close(){
        driver.quit();
    }
}
