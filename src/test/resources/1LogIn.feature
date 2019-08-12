Feature: Login

  @Test
  Scenario: Verify that a registered user can log in
    Given I am on the landing page of "http://automationpractice.com/index.php"
    When I click on "Sign in" tab
    And I enter "Username" and "Password"
    And I click on signIn button
    Then I am logged in and a banner "sale 70% of all products" is displayed