import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Ecommerce2 extends Base {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String toastmsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.out.println(toastmsg);



    }
}