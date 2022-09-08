Feature: General Store Testing - 2

  @product_outline
  Scenario Outline: Scroll and Purchase a product
    Given Login to the app with "<name>"
    When Add "<item>" to the cart
    And click on cart button
    And click on visit website to purchase
    Then search for "<searchText>"
    And click mobile back button

    Examples:
      | name   | item                | searchText    |
      | user_1 | Air Jordan 1 Mid SE | geeksforgeeks |
      | user_2 | Converse All Star   | hackerrank    |
