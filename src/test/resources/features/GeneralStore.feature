Feature: General Store Testing - 1

  @product
  Scenario: Purchase a product
    Given Login to the app
    When Add item to the cart
    And click on cart button
    And click on visit website to purchase
    Then search for "GeminiSolutions"
    And navigate to back
    And navigate to forward
    And click on first link
    And navigate to url
    And refresh the current page
    And click mobile back button
