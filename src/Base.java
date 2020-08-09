import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base
{
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        File appDir = new File("src");
        //File app = new File(appDir, "original.apk");//Demo app
        File app = new File(appDir, "original2.apk");//Ecommerce app
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Venkata");//Ecommerce app
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Venkata2");//Demo app
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
       // capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
        //capabilities.setCapability("appPackage","");
        //capabilities.setCapability("appActivity","");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
return driver;
    }

}
