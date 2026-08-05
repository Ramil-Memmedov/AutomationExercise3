package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RemoveProductsFromCartPage;

public class RemoveProductsFromCartTest {
    private RemoveProductsFromCartPage removeProductsFromCartPage;

    private RemoveProductsFromCartPage cartPage() {
        if (removeProductsFromCartPage == null) {
            removeProductsFromCartPage = new RemoveProductsFromCartPage(LoginTest.driver);
        }
        return removeProductsFromCartPage;
    }

    @When("I add product to cart")
    public void iAddProductToCart() {
        cartPage().clickProducts();
        cartPage().addFirstProduct();
        cartPage().continueShopping();
    }

    @And("I open cart")
    public void iOpenCart() {
        cartPage().clickCart();
    }

    @And("I remove product")
    public void iRemoveProduct() {
        cartPage().removeProduct();
    }

    @Then("I should see cart is empty")
    public void iShouldSeeCartIsEmpty() {
        Assert.assertTrue(cartPage().isCartEmpty());
    }
}

