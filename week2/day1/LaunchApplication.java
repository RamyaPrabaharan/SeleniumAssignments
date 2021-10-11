package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchApplication {

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
		//Two ways to write the below code
		
		      // store a value in a web element variable
		           WebElement UsernameEle = driver.findElement(By.id("username"));
		          UsernameEle.sendKeys("Demosalesmanager");
		
		         // Without specifying the variable name.
	                    //driver.findElement(By.id("user name")).sendKeys("Demosalesmanager");
		
		//By using a tag name we can also write a code for username
		     //driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");
		
		// For Password
		WebElement PasswordEle = driver.findElement(By.id("password"));
		PasswordEle.sendKeys("crmsfa");
		
		//To click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a field value : Company Name,FirstName,LastName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabaharan");
		
		//Click  Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//TO close the browser
		   //Thread.sleep(2000);
		    //driver.close();
		   
		

	}

}
