Feature: Remove Products From Cart

  Scenario: Remove product from cart

    Given I launch the browser
    And I navigate to the Automation Exercise website
    And I verify that the home page is visible
    When I add product to cart
    And I open cart
    And I remove product
    Then I should see cart is empty