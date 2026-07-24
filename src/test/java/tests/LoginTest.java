package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    public static WebDriver driver;
    public static LoginPage loginPage;

    @Given("I launch the browser")
    public void iLaunchTheBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    @Given("I navigate to the Automation Exercise website")
    public void iNavigateToTheAutomationExerciseWebsite() {

        driver.get("https://automationexercise.com/");
    }

    @Given("I verify that the home page is visible")
    public void iVerifyThatTheHomePageIsVisible() {

        Assert.assertTrue(
                driver.getTitle().contains("Automation Exercise")
        );
    }

    @When("I click on Signup Login button")
    public void iClickOnSignupLoginButton() {

        loginPage.clickSignupLogin();
    }

    @Then("I should see Login to your account")
    public void iShouldSeeLoginToYourAccount() {

        Assert.assertTrue(
                loginPage.isLoginTitleVisible()
        );
    }

    @When("I enter correct email and password")
    public void iEnterCorrectEmailAndPassword() {

        loginPage.enterEmail("Memmedovramil780@gmail.com");
        loginPage.enterPassword("Ramil.123");
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {

        loginPage.clickLogin();
    }

    @Then("I should see Logged in as username")
    public void iShouldSeeLoggedInAsUsername() {

        Assert.assertTrue(
                loginPage.isLoggedInAsVisible()
        );
    }

    @When("I enter incorrect email and password")
    public void iEnterIncorrectEmailAndPassword() {

        loginPage.enterEmail("wrong@email.com");
        loginPage.enterPassword("wrongPassword");
    }

    @Then("I should see error Your email or password is incorrect")
    public void iShouldSeeErrorYourEmailOrPasswordIsIncorrect() {

        Assert.assertTrue(
                loginPage.isLoginErrorVisible()
        );
    }
}