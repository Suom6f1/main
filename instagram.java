package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//Load url
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	WebElement emailId=driver.findElement(By.xpath("//input[contains(@aria-label,'Phone')]"));
	emailId.sendKeys("so_z6");
	WebElement password=driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
	password.sendKeys("Oct12&&1");
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.click();

	
}
}