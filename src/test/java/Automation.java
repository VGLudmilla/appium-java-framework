import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/", plugin = {"json", "html:target/cucumber-html-report", "json:target/cucumber-html-report.json"},
        /*Defines which test cases will run - the job manager, e.g. Jenkins, sets this parameter*/
        tags = {"@Automation"}
        )

public class Automation {

    public Automation() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
