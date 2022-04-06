package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mine {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com/");
	        driver.findElement(By.xpath(("//input[@class='gLFyf gsfi']"))).sendKeys("bookmyshow");
	        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	       
	     
	        String title=driver.getTitle();
	        System.out.println("This is the title: "+title);
	        Thread.sleep(4000);
	        driver.close();
	}
	
}
