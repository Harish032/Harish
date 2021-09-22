package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class onhover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser?1/2");
		String browser=sc.next();
		 WebDriver drive;
		
		 if (browser.equals("1"))
				 {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://www.youcandealwithit.com/");
		        Thread.sleep(5000);
		        Actions m= new Actions(driver);
		       m.moveToElement(driver.findElement(By.linkText("BRROWERS"))).build().perform();
		        Thread.sleep(5000);
		        driver.findElement(By.linkText("calculators-and-resources")).click();
		        driver.close();
				 }
		 else if (browser.equals("2"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://www.amazon.in/");
		        Thread.sleep(5000);
		        Actions m= new Actions(driver);
		      
		     m.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		     driver.close();
		        driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("Your account"));
		        driver.close();
		 }
		 
	}
	}


