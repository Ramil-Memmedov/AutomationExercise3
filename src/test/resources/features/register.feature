Feature: Register User Functionality
  Scenario: Register User with complete details and delete account
    Given I launch the browser
    And I navigate to the Automation Exercise website
    And I verify that the home page is visible
    When I click on Signup Login button
    Then I should see New User Signup!
    When I enter valid name and email address
    And I click on Signup button
    Then I should see ENTER ACCOUNT INFORMATION
    When I fill details Title, Name, Password, Date of birth
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I fill details First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I click Create Account button
    Then I should see ACCOUNT CREATED!
    When I click Continue button
    Then I should see Logged in as username
    When I click Delete Account button
    Then I should see ACCOUNT DELETED! and click Continue button