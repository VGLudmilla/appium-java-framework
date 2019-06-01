$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/main_screen/test_cases/AmountsCalculation.feature");
formatter.feature({
  "name": "Calculate tip and total amounts",
  "description": "  Calculate amounts in the main screen based on bill amount",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@MainScreen"
    },
    {
      "name": "@CalculationOfAmounts"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Valid bill amount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the tip percentage is \"\u003cpercentage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I set \"\u003cbill_amount\u003e\" in Bill Amount",
  "keyword": "When "
});
formatter.step({
  "name": "I should see tip amount equals \"\u003ctip_amount\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the total amount should be \"\u003ctotal_amount\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "percentage",
        "bill_amount",
        "tip_amount",
        "total_amount"
      ]
    },
    {
      "cells": [
        "0.001",
        "9999",
        "$0.10",
        "$9999.10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid bill amount",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@MainScreen"
    },
    {
      "name": "@CalculationOfAmounts"
    }
  ]
});
formatter.step({
  "name": "the tip percentage is \"0.001\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MainScreenSteps.theTipPercentageIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set \"9999\" in Bill Amount",
  "keyword": "When "
});
formatter.match({
  "location": "MainScreenSteps.iSetInBillAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see tip amount equals \"$0.10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainScreenSteps.iShouldSeeTipAmountEquals(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the total amount should be \"$9999.10\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainScreenSteps.andTotalAmountShouldBe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/tip_settings/test_cases/TipSettingsUpdate.feature");
formatter.feature({
  "name": "Update tip settings",
  "description": "  Replace data in tip settings",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@TipSettings"
    },
    {
      "name": "@TipSettingsUpdate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Valid data in tip settings",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I accessed the tip settings page",
  "keyword": "Given "
});
formatter.step({
  "name": "I set \"\u003cpercentage\u003e\" in Tip Percentage",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the tip percentage \"\u003cpercentage\u003e%\" in the Main Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "percentage"
      ]
    },
    {
      "cells": [
        "10.0001"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid data in tip settings",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@TipSettings"
    },
    {
      "name": "@TipSettingsUpdate"
    }
  ]
});
formatter.step({
  "name": "I accessed the tip settings page",
  "keyword": "Given "
});
formatter.match({
  "location": "TipSettingsSteps.iAccessedTheTipSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set \"10.0001\" in Tip Percentage",
  "keyword": "When "
});
formatter.match({
  "location": "TipSettingsSteps.iSetInTipPercentage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the tip percentage \"10.0001%\" in the Main Page",
  "keyword": "Then "
});
formatter.match({
  "location": "TipSettingsSteps.iShouldSeeTheTipPercentage(String)"
});
formatter.result({
  "status": "passed"
});
});