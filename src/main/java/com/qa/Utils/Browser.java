package com.qa.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser extends BaseClass {

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element,String text){
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String element){
        WebElement element1 = null;
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
             element1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element))));
        }
        catch (Exception e){
            System.out.println("Element was not found");
        }
        return element1;
    }



}
