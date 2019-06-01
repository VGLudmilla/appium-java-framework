package main_screen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Step;
import tip_settings.TipSettingsPageObjects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainScreenSteps extends Step {

    private MainPageObject mainPageObject;
    private TipSettingsPageObjects tipSettingsPageObjects;

    @Given("the tip percentage is {string}")
    public void theTipPercentageIs(String percentage) {
        mainPageObject = new MainPageObject(getDriver());
        mainPageObject.clickSettings()
                .setTipPercentage(percentage);
    }

    @When("I set {string} in Bill Amount")
    public void iSetInBillAmount(String billAmount) {
        mainPageObject.addBillAmount(billAmount)
                .calculateTip();
    }

    @Then("I should see tip amount equals {string}")
    public void iShouldSeeTipAmountEquals(String tipAmount) {
        assertThat(mainPageObject.getTipAmountText(), is(tipAmount));
    }

    @And("the total amount should be {string}")
    public void andTotalAmountShouldBe(String totalAmount) {
        assertThat(mainPageObject.getTotalAmountText(), is(totalAmount));
    }
}
