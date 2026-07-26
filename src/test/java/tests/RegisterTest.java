package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest {

    RegisterPage registerPage = new RegisterPage(LoginTest.driver);
    LoginPage loginPage = new LoginPage(LoginTest.driver);

    @Then("I should see New User Signup!")
    public void iShouldSeeNewUserSignup() {
        Assert.assertTrue(registerPage.isSignupTitleVisible());
    }

    @When("I enter name and email address")
    public void iEnterNameAndEmailAddress() {
        String randomEmail = "testuser" + System.currentTimeMillis() + "@gmail.com";
        registerPage.enterNameAndEmail("Shahla Aslanova", randomEmail);
    }

    @When("I click on Signup button")
    public void iClickOnSignupButton() {
        registerPage.clickSignup();
    }

    @Then("I should see ENTER ACCOUNT INFORMATION")
    public void iShouldSeeENTERACCOUNTINFORMATION() {
        Assert.assertTrue(registerPage.isAccountInfoTitleVisible());
    }

    @When("I fill details Title, Name, Password, Date of birth")
    public void iFillDetailsTitleNamePasswordDateOfBirth() {
        registerPage.fillAccountInformation("Shahla.123", "17", "8", "1999");
    }

    @When("I select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        registerPage.selectNewsletter();
    }

    @When("I select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        registerPage.selectSpecialOffers();
    }

    @When("I fill details First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void iFillDetailsAddressInformation() {
        registerPage.fillAddressInformation(
                "Shahla", "Aslanova", "Kapital Bank",
                "Ahmadli, Street 1", "Apt 12", "Canada",
                "Baku", "Baku", "AZ1000", "+994501234567"
        );
    }

    @When("I click Create Account button")
    public void iClickCreateAccountButton() {
        registerPage.clickCreateAccount();
    }

    @Then("I should see ACCOUNT CREATED!")
    public void iShouldSeeACCOUNTCREATED() {
        Assert.assertTrue(registerPage.isAccountCreatedVisible());
    }

    @When("I click Continue button")
    public void iClickContinueButton() {
        registerPage.clickContinue();
    }

    @When("I click Delete Account button")
    public void iClickDeleteAccountButton() {
        loginPage.clickDeleteAccount();
    }

    @Then("I should see ACCOUNT DELETED! and click Continue button")
    public void iShouldSeeACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue("ACCOUNT DELETED! yazısı görünmədi", registerPage.isAccountDeletedVisible());

        registerPage.clickContinue();
    }
    }