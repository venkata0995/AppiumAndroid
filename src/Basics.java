import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends Base
{
    public static void main(String args[]) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Cancel']")).click();
       driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        //when all attributes are same (xpath)[2]
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("asdfghjk");
        //when two buttons have same name .elements(classname).get(1)
        driver.findElements(By.className("android.widget.Button")).get(1).click();
    }
}
