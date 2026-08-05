package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RemoveProductsFromCartPage1 extends BasePage1{

    public RemoveProductsFromCartPage1(WebDriver driver) {
        super(driver);
    }
    private By productsButton=By.xpath("//a[contains(text(),'Products')]");
    private By firstAddToCartButton=By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    private By continueShoppingButton =By.xpath("//button[contains(text(),'Continue Shopping')]");
    private By cartButton =By.xpath("//a[contains(text(),'Cart')]");
    private By deleteButton =By.className("cart_quantity_delete");
    private By emptyCartMessage =By.xpath("//*[contains(text(),'Cart is empty')]");

    public void clickProducts() {
        clickElement(productsButton);
    }
    public void addFirstProduct() {
        clickElementWithJS(firstAddToCartButton);
    }
    public void continueShopping() {
        clickElementWithJS(continueShoppingButton);
    }
    public void clickCart() {
        clickElementWithJS(cartButton);
    }
    public void removeProduct() {
        clickElementWithJS(deleteButton);
    }
    public boolean isCartEmpty() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage))
                .isDisplayed();
    }
}




