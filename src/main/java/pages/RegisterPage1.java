package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage1 extends BasePage1 {

    private By signupTitle = By.xpath("//div[@class='signup-form']/h2");
    private By nameInput = By.xpath("//input[@data-qa='signup-name']");
    private By emailInput = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[@data-qa='signup-button']");
    private By accountInfoTitle = By.xpath("//b[contains(text(),'Enter Account Information')]");

    private By genderMrs = By.id("id_gender2");
    private By passwordInput = By.id("password");
    private By daysDropdown = By.id("days");
    private By monthsDropdown = By.id("months");
    private By yearsDropdown = By.id("years");

    private By newsletterCheckbox = By.id("newsletter");
    private By optinCheckbox = By.id("optin");

    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By countryDropdown = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");

    private By createAccountButton = By.xpath("//button[@data-qa='create-account']");
    private By accountCreatedTitle = By.xpath("//b[contains(text(),'Account Created!')]");
    private By continueButton = By.xpath("//a[@data-qa='continue-button']");
    private By accountDeletedTitle = By.xpath("//b[contains(text(),'Account Deleted!') or contains(text(),'ACCOUNT DELETED!') or @data-qa='account-deleted']");

    public RegisterPage1(WebDriver driver) {
        super(driver);
    }

    public boolean isSignupTitleVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(signupTitle)).isDisplayed();
    }

    public void enterNameAndEmail(String name, String email) {
        sendKeysToElement(nameInput, name);
        sendKeysToElement(emailInput, email);
    }

    public void clickSignup() {
        clickElementWithJS(signupButton);
    }

    public boolean isAccountInfoTitleVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountInfoTitle)).isDisplayed();
    }

    public void fillAccountInformation(String password, String day, String month, String year) {
        clickElementWithJS(genderMrs); // Mrs. seçildi
        sendKeysToElement(passwordInput, password);

        new Select(driver.findElement(daysDropdown)).selectByValue(day);
        new Select(driver.findElement(monthsDropdown)).selectByValue(month);
        new Select(driver.findElement(yearsDropdown)).selectByValue(year);
    }

    public void selectNewsletter() {
        clickElementWithJS(newsletterCheckbox);
    }

    public void selectSpecialOffers() {
        clickElementWithJS(optinCheckbox);
    }

    public void fillAddressInformation(String fName, String lName, String comp, String addr1, String addr2, String country, String st, String ct, String zip, String mobile) {
        sendKeysToElement(firstName, fName);
        sendKeysToElement(lastName, lName);
        sendKeysToElement(company, comp);
        sendKeysToElement(address1, addr1);
        sendKeysToElement(address2, addr2);

        new Select(driver.findElement(countryDropdown)).selectByVisibleText(country);

        sendKeysToElement(state, st);
        sendKeysToElement(city, ct);
        sendKeysToElement(zipcode, zip);
        sendKeysToElement(mobileNumber, mobile);
    }

    public void clickCreateAccount() {
        clickElementWithJS(createAccountButton);
    }

    public boolean isAccountCreatedVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedTitle)).isDisplayed();
    }

    public void clickContinue() {
        clickElementWithJS(continueButton);
    }
    public boolean isAccountDeletedVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeletedTitle)).isDisplayed();
    }
}