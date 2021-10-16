package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment {

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
  		
  		driver.findElement(By.name("birthDate")).sendKeys("05/19/1997");
  		
  		//Contact Information
  		
  		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
  		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636003");
  		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
  		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
  		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anu");
  		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6788232");
  		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("abc");
  		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.test.com");
  		
  		//Primary Address
  		
  		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Adthi");
  		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ABC Colony");
  		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("street 1");
  		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("salem");
  		Select sel=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		sel.selectByVisibleText("Arizona");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636003");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("001");
		
		//Thread.sleep(10000);
		//Click  Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		//Thread.sleep(10000);
		//view lead
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		System.out.println("Verified Name in view Lead screen is "+text);
		
		System.out.println("Title of screen "+driver.getTitle());

		driver.findElement(By.linkText("Logout")).click();
  		
  		Thread.sleep(2000);
  		

  		//To close the window
  	     driver.quit();
  	
	}

}
