import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

public class Swipedemo extends Base {
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();
        TouchAction t=new TouchAction(driver);
        //if class name have special characters can't use it as tag name
        WebElement first= driver.findElement(By.xpath("//*[@content-desc='15']"));
WebElement second= driver.findElement(By.xpath("//*[@content-desc='45']"));
        t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();


    }
}