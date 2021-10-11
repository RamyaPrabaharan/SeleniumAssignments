package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		//To setup a driver
				WebDriverManager.chromedriver().setup();
				
				//To  open a browser
				ChromeDriver driver=new ChromeDriver();
				
				//To load the application URL
				driver.get("http://www.leaftaps.com/opentaps");
				
				// To maximize the window
				driver.manage().window().maximize();
				
				//For Username
				 WebElement UsernameEle = driver.findElement(By.id("username"));
		          UsernameEle.sendKeys("Demosalesmanager");
		          
		       // For Password
		  		WebElement PasswordEle = driver.findElement(By.id("password"));
		  		PasswordEle.sendKeys("crmsfa");
		  		
		  		//To click Login
		  		driver.findElement(By.className("decorativeSubmit")).click();
		  		
		  		Thread.sleep(2000);
		  		
		  		//To click Link
		  		driver.findElement(By.linkText("CRM/SFA")).click();
		  		driver.findElement(By.linkText("Leads")).click();
		  		driver.findElement(By.linkText("Create Lead")).click();
		  		
		  		Thread.sleep(2000);
		  		
		  		//Enter a field value : Company Name,FirstName,LastName
		  		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		  		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		  		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabaharan");
		  		
		  		Thread.sleep(2000);
		  		
		  		//Click  Create Lead
		  		driver.findElement(By.className("smallSubmit")).click();
		  		
		  		Thread.sleep(2000);
		  		
		  		//To close the window
		  		//driver.close();
		
	}

}
