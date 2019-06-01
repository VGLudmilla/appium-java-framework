package main_screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.PageFactory;
import tip_settings.TipSettingsPageObjects;

import java.time.temporal.ChronoUnit;

public class MainPageObject {

    @AndroidFindBy(id = "org.traeg.fastip:id/menu_settings")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement settings;

    @AndroidFindBy(id = "org.traeg.fastip:id/billAmtEditText")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement billAmount;

    @AndroidFindBy(id = "org.traeg.fastip:id/tipPctTextView")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tipPercentage;

    @AndroidFindBy(id = "org.traeg.fastip:id/calcTipButton")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement calculateTip;

    @AndroidFindBy(id = "org.traeg.fastip:id/tipAmtTextView")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tipAmount;

    @AndroidFindBy(id = "org.traeg.fastip:id/totalAmtTextView")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement totalAmount;

    private final AppiumDriver<MobileElement> driver;

    public MainPageObject(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public TipSettingsPageObjects clickSettings() {
        settings.click();
        return new TipSettingsPageObjects(driver);
    }

    public String getTipPercentageText() {
        return tipPercentage.getText();
    }

    public String getTipAmountText() {
        return tipAmount.getText();
    }

    public String getTotalAmountText() {
        return totalAmount.getText();
    }

    public MainPageObject addBillAmount(String billAmount) {
        this.billAmount.sendKeys(billAmount);
        return this;
    }

    public MainPageObject calculateTip() {
        this.calculateTip.click();
        return this;
    }
}
