package general;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Setup {

    /**
     * Starts the driver.
     * The properties should be set by the job manager, e.g. Jenkins, when calling the automation.
     */
    public static AppiumDriver<MobileElement> initDriver() {

        String deviceURL = getProperty("device", "url");
        DesiredCapabilities capabilities = getCapabilities();

        AppiumDriver<MobileElement> driver = null;

        try {
            driver = new AppiumDriver<MobileElement>(new URL(deviceURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    /**
     * Gets the value of a property from properties folder of this automation project.
     *
     * @param fileName
     * @param propertyName
     * @return value of property
     */
    private static String getProperty(String fileName, String propertyName) {
        Properties properties = new Properties();
        String value = null;

        try {
            properties.load(new FileInputStream("properties/" + fileName));
            value = properties.getProperty(propertyName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * @return the capabilities of app and device
     */
    private static DesiredCapabilities getCapabilities() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        String appPath = getProperty("app", "path");
        String deviceName = getProperty("device", "name");
        String newCommandTimeout = getProperty("app", "new_command_timeout");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, newCommandTimeout);
        capabilities.setCapability(MobileCapabilityType.APP, new File(appPath).getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

        return capabilities;
    }
}
