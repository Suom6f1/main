package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment1 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		//Enter password as DemoSalesManager
		username.sendKeys("DemoSalesManager");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		//Enter password as crmsfa
		password.sendKeys("crmsfa");
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//Click on the create lead 
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		Thread.sleep(1000);
		//Enter companyName as TestLeaf
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		
		Thread.sleep(3000);
		//To close the window
		driver.close();
	}

}
