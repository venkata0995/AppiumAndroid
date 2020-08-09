import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Scrollingdemo extends Base
{
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"))").click();
       driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "Radio Group" + "\").instance(0))")).click();


    }
}
