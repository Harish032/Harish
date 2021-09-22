package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='']")).click();
        //Thread.sleep(2000);
        driver.quit();
	}

}
