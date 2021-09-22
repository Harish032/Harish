package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youcandeal {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	       
	        Thread.sleep(5000);
	       driver.findElement(By.id("food")).sendKeys("500");
	       driver.findElement(By.id("clothing")).sendKeys("1000");
	       driver.findElement(By.id("shelter")).sendKeys("2000");
	       driver.findElement(By.id("monthlyPay")).sendKeys("10000");
	       Thread.sleep(5000);
	     String i= driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	     String j= driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	     System.out.println("value of i:"+i);
	     System.out.println("value of j:"+j);
	     driver.close();
	    float x=parseFloat("i");
	     
	     if (Integer.parseInt("i")>Integer.parseInt("j"))
	       {
	    	   System.out.println("Income is Greater");
	       }
	       else 
	       {
	    	   System.out.println("Expense is Greater");
	       }
	  System.out.println("Test Ended");
	}
	
}
