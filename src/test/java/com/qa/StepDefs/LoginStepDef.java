package com.qa.StepDefs;

import com.qa.PageObjects.LoginPage;
import com.qa.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class LoginStepDef {

    Properties properties = PropertiesUtil.loadApplicationProperties();
    String username = properties.getProperty("username");
    String password = properties.getProperty("password");

    @Given("user enters username")
    public void userEntersUsername() {
        LoginPage.enterUsername(username);
    }

    @When("user enters password")
    public void userEntersPassword() {
        LoginPage.enterPassword(password);
    }

    @And("user clicks Login button")
    public void userClicksLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("user is logged into the application")
    public void userIsLoggedIntoTheApplication() {
        LoginPage.validateLogin();
    }
}
