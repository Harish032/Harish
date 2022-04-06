package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazondemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	        WebDriver myD=new ChromeDriver(); 
	        myD.get("https://www.amazon.in/");
	        myD.manage().window().maximize(); 
	        Thread.sleep(500);
	        myD.findElement(By.linkText("Today's Deals")).click();
	        Thread.sleep(200);
	        myD.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung zfold3"); 

	}
}
