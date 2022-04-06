package Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaildemo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\drivers\\c2\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://gmail.com/");
	        String title=driver.getTitle();
	        System.out.println("This is the title: "+title);
	        Thread.sleep(5000);
	         driver.findElement(By.linkText("Help")).click();
	        Set<String> ids = driver.getWindowHandles();
	        
	        Iterator<String> it=ids.iterator();
	        String parent=it.next();
	        String child=it.next();
	        driver.switchTo().window(child);
	        Thread.sleep(5000);
	       System.out.println(driver.getTitle());
	       Thread.sleep(5000);
	         driver.quit();
	         
	        
	}

	
}
