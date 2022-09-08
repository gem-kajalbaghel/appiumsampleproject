@calculation
Feature: Check Calculation

  Scenario: Check Addition Calculation
    Given Application launches and user clicks seven button
    When user clicks three and equal button
    Then user should get sum as ten