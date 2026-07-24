Feature: Login functionality

  Scenario: Login User with correct email and password

    Given I launch the browser
    And I navigate to the Automation Exercise website
    And I verify that the home page is visible
    When I click on Signup Login button
    Then I should see Login to your account
    When I enter correct email and password
    And I click on login button
    Then I should see Logged in as username

  Scenario: Login User with incorrect email and password

    Given I launch the browser
    And I navigate to the Automation Exercise website
    And I verify that the home page is visible
    When I click on Signup Login button
    Then I should see Login to your account
    When I enter incorrect email and password
    And I click on login button
    Then I should see error Your email or password is incorrect