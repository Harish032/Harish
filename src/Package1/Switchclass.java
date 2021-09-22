package Package1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Switchclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int Browser=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser"+Browser);
		 char c = sc.next().charAt(0);
		WebDriver drive;
		 for (Browser=0;Browser<2;Browser++)
		 {
			 
		switch (Browser)
		{
		case 1 :System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.get("https://www.google.com/");
						String title=driver.getTitle();
						System.out.println("this is the title in chrome"+title);
						Thread.sleep(5000);
						driver.close();
						
		case 2: System.setProperty("webdriver.edge.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\msedgedriver.exe");
	    			WebDriver driver1=new EdgeDriver();
	    			driver1.get("https://www.google.com/");
	    			String title1=driver1.getTitle();
	    			System.out.println("this is the title in edge" +title1);
	    			Thread.sleep(5000);
	    			driver1.close();		
	    			}
		}		 
 }	
}


