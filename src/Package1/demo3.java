package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.youtube.com/");
	    String title=driver.getTitle();
	    System.out.println("this is the title "+title);

	    try {
	        Thread.sleep(5000);
	       } 
	    catch (InterruptedException e)
	    {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	}

	}
}
