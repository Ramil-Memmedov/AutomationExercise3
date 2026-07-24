package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutTest {

    @When("I click on Logout button")
    public void iClickOnLogoutButton() {

        LoginTest.loginPage.clickLogout();
    }

    @Then("I should be navigated to login page")
    public void iShouldBeNavigatedToLoginPage() {

        Assert.assertEquals(
                "https://automationexercise.com/login",
                LoginTest.driver.getCurrentUrl()
        );
    }
}