package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage1;
import pages.RegisterPage1;

public class RegisterTest1 {

    RegisterPage1 registerPage1 = new RegisterPage1(LoginTest1.driver);
    LoginPage1 loginPage = new LoginPage1(LoginTest1.driver);

    @Then("I should see New User Signup!")
    public void iShouldSeeNewUserSignup() {
        Assert.assertTrue(registerPage1.isSignupTitleVisible());
    }

    @When("I enter name and email address")
    public void iEnterNameAndEmailAddress() {
        String randomEmail = "testuser" + System.currentTimeMillis() + "@gmail.com";
        registerPage1.enterNameAndEmail("Shahla Aslanova", randomEmail);
    }

    @When("I click on Signup button")
    public void iClickOnSignupButton() {
        registerPage1.clickSignup();
    }

    @Then("I should see ENTER ACCOUNT INFORMATION")
    public void iShouldSeeENTERACCOUNTINFORMATION() {
        Assert.assertTrue(registerPage1.isAccountInfoTitleVisible());
    }

    @When("I fill details Title, Name, Password, Date of birth")
    public void iFillDetailsTitleNamePasswordDateOfBirth() {
        registerPage1.fillAccountInformation("Shahla.123", "17", "8", "1999");
    }

    @When("I select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        registerPage1.selectNewsletter();
    }

    @When("I select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        registerPage1.selectSpecialOffers();
    }

    @When("I fill details First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void iFillDetailsAddressInformation() {
        registerPage1.fillAddressInformation(
                "Shahla", "Aslanova", "Kapital Bank",
                "Ahmadli, Street 1", "Apt 12", "Canada",
                "Baku", "Baku", "AZ1000", "+994501234567"
        );
    }

    @When("I click Create Account button")
    public void iClickCreateAccountButton() {
        registerPage1.clickCreateAccount();
    }

    @Then("I should see ACCOUNT CREATED!")
    public void iShouldSeeACCOUNTCREATED() {
        Assert.assertTrue(registerPage1.isAccountCreatedVisible());
    }

    @When("I click Continue button")
    public void iClickContinueButton() {
        registerPage1.clickContinue();
    }

    @When("I click Delete Account button")
    public void iClickDeleteAccountButton() {
        loginPage.clickDeleteAccount();
    }

    @Then("I should see ACCOUNT DELETED! and click Continue button")
    public void iShouldSeeACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue("ACCOUNT DELETED! yazısı görünmədi", registerPage1.isAccountDeletedVisible());

        registerPage1.clickContinue();
    }
    }