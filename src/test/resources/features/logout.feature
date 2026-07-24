Feature: Logout functionality

  Scenario: Logout User

    Given I launch the browser
    And I navigate to the Automation Exercise website
    And I verify that the home page is visible
    When I click on Signup Login button
    Then I should see Login to your account
    When I enter correct email and password
    And I click on login button
    Then I should see Logged in as username
    When I click on Logout button
    Then I should be navigated to login page