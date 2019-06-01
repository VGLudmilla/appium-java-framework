package general;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Step {

    private static AppiumDriver<MobileElement> driver;

    public Step() {
        driver = Setup.initDriver();
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

}
