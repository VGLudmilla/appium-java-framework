@Automation @MainScreen @CalculationOfAmounts
Feature: Calculate tip and total amounts
  Calculate amounts in the main screen based on bill amount

  Scenario Outline: Valid bill amount
    Given the tip percentage is "<percentage>"
    When I set "<bill_amount>" in Bill Amount
    Then I should see tip amount equals "<tip_amount>"
    And the total amount should be "<total_amount>"

    Examples:
      | percentage | bill_amount | tip_amount | total_amount |
      | 0.001      | 9999        | $0.10      | $9999.10     |