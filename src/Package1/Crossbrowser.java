package Package1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Crossbrowser {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser?Gc/IE");
		
		String browser=sc.next();
		 WebDriver drive;
		
		 if (browser.equals("gc"))
				 {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://www.google.com/");
		        String title=driver.getTitle();
		        System.out.println("this is the title "+title);
		        Thread.sleep(5000);
		       
		        driver.close();
				 }
		 else if (browser.equals("IE"))
		 {
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\msedgedriver.exe");
			    WebDriver driver=new EdgeDriver();
			    driver.get("https://www.google.com/");
			    String title=driver.getTitle();
			    System.out.println("this is the title "+title);
			    Thread.sleep(5000);
			    driver.close();
		 }
		 
	}

}
