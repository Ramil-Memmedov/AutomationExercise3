package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RemoveProductsFromCartPage;

public class RemoveProductsFromCartTest {
    RemoveProductsFromCartPage removeProductsFromCartPage =
            new RemoveProductsFromCartPage(LoginTest.driver);

    @When("I add product to cart")
    public void iAddProductToCart() {
        removeProductsFromCartPage.clickProducts();
        removeProductsFromCartPage.addFirstProduct();
        removeProductsFromCartPage.continueShopping();
    }

    @And("I open cart")
    public void iOpenCart() {
        removeProductsFromCartPage.clickCart();
        System.out.println(LoginTest.driver.getCurrentUrl());
    }

    @And("I remove product")
    public void iRemoveProduct() {

    }

    @Then("I should see cart is empty")
    public void iShouldSeeCartIsEmpty() {
        Assert.assertTrue(removeProductsFromCartPage.isCartEmpty());
    }
}

