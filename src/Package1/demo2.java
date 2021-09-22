package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	        WebDriver d=new ChromeDriver();
	        d.get("https://www.linkedin.com/login");
	        
	        d.manage().window().maximize();
	        d.findElement(By.id("username")).sendKeys("abc");
	        Thread.sleep(1000);
	        d.findElement(By.id("password")).sendKeys("abc");
	        Thread.sleep(1000);
	        d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	        Thread.sleep(1000);
	        d.findElement(By.linkText("Forgot password?")).click();
	        Thread.sleep(2000);
	        //d.findElement(By.linkText("Sign in")).click();
	        d.findElement(By.partialLinkText("Sign")).click();
	        Thread.sleep(1000);

	        d.close();
	
	}

}
