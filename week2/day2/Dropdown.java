package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Dropdown {

	public static void main(String[] args) {
		       //To setup a driver
				WebDriverManager.chromedriver().setup();
				
				//To  open a browser
				ChromeDriver driver=new ChromeDriver();
				
				//To load the application URL
				driver.get("http://www.leaftaps.com/opentaps");
				
				// store a value in a web element variable
				WebElement UsernameEle = driver.findElement(By.id("username"));
				UsernameEle.sendKeys("Demosalesmanager");
				
				// For Password
				WebElement PasswordEle = driver.findElement(By.id("password"));
				PasswordEle.sendKeys("crmsfa");
				
				//To click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Select the Health Care from Industry using selectByIndex
				WebElement DropdownEle = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select dropdown = new Select(DropdownEle);
				dropdown.selectByIndex(7);
				
				//Select Affiliated Sites using sendKeys from Marketing Campaign
				WebElement DropdownEle1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				DropdownEle1.sendKeys("Affiliate Sites");
				
				//Select the Partnership from Ownership using selectByValue
				WebElement DropdownEle2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select dropdown1 = new Select(DropdownEle2);
				dropdown1.selectByValue("OWN_PARTNERSHIP");
				
				 //Select the Direct Mail from Source using selectByVisibleText
				WebElement DropdownEle3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dropdown2 = new Select(DropdownEle3);
				dropdown2.selectByVisibleText("Direct Mail");
	}

}
