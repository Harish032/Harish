package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demoedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.google.com/");
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
