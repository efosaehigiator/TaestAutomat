Feature: Sign Up

  #@Test
  Scenario: Verify that I can create a new account
    Given I navigate to the url "http://automationpractice.com/index.php"
    When I click on "Sign in now"
    And I enter "email address"
    And I click on the "create account"

   # @Test
  Scenario: Enter personal details on registration form
      Given I check the title radio button as "Mr"
      When I enter my "FirstName" and "LastName"
      And I enter 5 character minimum "password"
      And I select my "dateOfBirth" from the select boxes

   # @Test
  Scenario: Enter userAddress details
        Given I enter my "Address details"
        When I click on "Register" button
        Then the homepage is displayed and title is "Your Logo"


