package tip_settings;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.PageFactory;
import main_screen.MainPageObject;

import java.time.temporal.ChronoUnit;

public class TipSettingsPageObjects {

    @AndroidFindBy(id = "org.traeg.fastip:id/tipPercentageEditText")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tipPercentage;

    @AndroidFindBy(id = "org.traeg.fastip:id/saveSettingsButton")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement saveSettings;

    private final AppiumDriver<MobileElement> driver;

    public TipSettingsPageObjects(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public MainPageObject setTipPercentage(String percentage) {
        tipPercentage.clear();
        tipPercentage.sendKeys(percentage);
        saveSettings.click();
        return new MainPageObject(driver);
    }
}
