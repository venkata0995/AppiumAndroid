import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Gestures extends Base
{
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        TouchAction t=new TouchAction(driver);
        WebElement expandlist= driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        t.tap(tapOptions().withElement(element(expandlist))).perform();
        driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
        WebElement PeopleNames=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        //Longpress of any option
        t.longPress(longPressOptions().withElement(element(PeopleNames)).withDuration(ofSeconds(2))).release().perform();
        System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());



    }
}
