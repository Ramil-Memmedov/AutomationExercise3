package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutTest1 {

    @When("I click on Logout button")
    public void iClickOnLogoutButton() {

        LoginTest1.loginPage.clickLogout();
    }

    @Then("I should be navigated to login page")
    public void iShouldBeNavigatedToLoginPage() {

        Assert.assertEquals(
                "https://automationexercise.com/login",
                LoginTest1.driver.getCurrentUrl()
        );
    }
}