package tip_settings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Step;
import main_screen.MainPageObject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TipSettingsSteps extends Step {

    private MainPageObject mainPageObject;
    private TipSettingsPageObjects tipSettingsPageObjects;

    @Given("I accessed the tip settings page")
    public void iAccessedTheTipSettingsPage() {
        mainPageObject = new MainPageObject(getDriver());
        tipSettingsPageObjects = mainPageObject.clickSettings();
    }

    @When("I set {string} in Tip Percentage")
    public void iSetInTipPercentage(String percentage) {
        mainPageObject = tipSettingsPageObjects.setTipPercentage(percentage);
    }

    @Then("I should see the tip percentage {string} in the Main Page")
    public void iShouldSeeTheTipPercentage(String percentage) {
        assertThat(mainPageObject.getTipPercentageText(), is(percentage));
    }

}
