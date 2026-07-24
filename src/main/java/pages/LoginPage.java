package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By signupLoginButton =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    private By loginTitle =
            By.xpath("//h2[text()='Login to your account']");

    private By emailInput =
            By.xpath("//input[@data-qa='login-email']");

    private By passwordInput =
            By.xpath("//input[@data-qa='login-password']");

    private By loginButton =
            By.xpath("//button[@data-qa='login-button']");

    private By loggedInAs =
            By.xpath("//a[contains(., 'Logged in as')\n]");
    private By deleteAccountButton =
            By.xpath("//a[contains(text(),'Delete Account')]");

    private By accountDeletedMessage =
            By.xpath("//b[text()='Account Deleted!']");
    private By loginError =
            By.xpath("//p[text()='Your email or password is incorrect!']");
    private By logoutButton =
            By.xpath("//a[contains(text(),'Logout')]");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }

    public boolean isLoginTitleVisible() {
        return driver.findElement(loginTitle).isDisplayed();
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        clickElementWithJS(loginButton);
    }

    public boolean isLoggedInAsVisible() {
        return driver.findElement(loggedInAs).isDisplayed();
    }

    public void clickDeleteAccount() {
        driver.findElement(deleteAccountButton).click();
    }

    public boolean isAccountDeletedVisible() {
        return driver.findElement(accountDeletedMessage).isDisplayed();
    }
    public boolean isLoginErrorVisible() {
        return driver.findElement(loginError).isDisplayed();
    }
    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}