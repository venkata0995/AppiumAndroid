import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Dragdropdemo extends Base {
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
        WebElement source=driver.findElements(By.className("android.view.View")).get(0);
        WebElement destination=driver.findElements(By.className("android.view.View")).get(1);
        TouchAction t=new TouchAction(driver);
        t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
    }
}