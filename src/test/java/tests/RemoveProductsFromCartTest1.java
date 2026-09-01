package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RemoveProductsFromCartPage1;

public class RemoveProductsFromCartTest1 {
    private RemoveProductsFromCartPage1 removeProductsFromCartPage1;

    private RemoveProductsFromCartPage1 cartPage() {
        if (removeProductsFromCartPage1 == null) {
            removeProductsFromCartPage1 = new RemoveProductsFromCartPage1(LoginTest1.driver);
        }
        return removeProductsFromCartPage1;
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

