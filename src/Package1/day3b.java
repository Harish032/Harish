package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day3b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\geckodriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(5000);
	    driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.id("droppable")).getText());
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions Act= new Actions(driver);
		Act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("draggable")).getText());
		
	}

}
