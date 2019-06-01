@Automation @TipSettings @TipSettingsUpdate
Feature: Update tip settings
  Replace data in tip settings

  Scenario Outline: Valid data in tip settings
    Given I accessed the tip settings page
    When I set "<percentage>" in Tip Percentage
    Then I should see the tip percentage "<percentage>%" in the Main Page

    Examples:
      | percentage |
      | 10.0001    |