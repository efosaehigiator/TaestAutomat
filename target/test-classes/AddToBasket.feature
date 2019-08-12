Feature: Add to basket

  @Test
  Scenario: Verify that I can add an item to Basket
    Given I click on T-Shirts
    When I click on Add to cart
    And I click on Proceed to check out
    Then the item is added to cart