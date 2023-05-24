package week3;

import javax.swing.ListSelectionModel;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class day1 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
WebElement username =driver.findElement(By.id("username")); 																							

username.sendKeys("DemoSalesManager"
		);
//Enter password as DemoSalesManager
		//username.sendKeys("DemoSalesManager");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		//Enter password as crmsfa
		password.sendKeys("crmsfa");
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		//Get title of the welcome page
		String welcomePageTitle = driver.getTitle();
		System.out.println("welcomePageTitle : " + welcomePageTitle);
		// Click on the crmsfa link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		// Get title of the MyHome page
		String HomePageTitle = driver.getTitle();
		System.out.println("HomePageTitle : " + HomePageTitle);
		// Click on the leads tab
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//Click on the create lead 
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		//Enter companyName as TestLeaf
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Suhail");
		//To close the window
		//driver.close();
		WebElement sourceDD= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select	sourcedd =new Select(sourceDD);
  sourcedd.selectByIndex(7);
  
  WebElement ownershipDD= driver.findElement(By.id("createLeadForm_industryEnumId"));
  Select ownershipdd= new Select(ownershipDD);
  ownershipdd.selectByVisibleText("Computer Software");
  
  WebElement marketingS = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
  Select marketings = new Select(marketingS);
  marketings.selectByValue("CATRQ_CARNDRIVER");
   
	}



// firstOpenButton = driver.findElement(By.xpat())
	
		
		//Thread.sleep();
		//driver.close();
	}


