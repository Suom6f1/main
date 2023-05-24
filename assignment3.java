package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment3 {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		WebElement email= driver.findElement(By.id("email"));
	
		email.sendKeys("kumar.testleaf@gmail.com");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("leaf@12");
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

//		5. Get the title of the page and print
		System.out.println("Title of the page is- " + driver.getTitle());

//		6. Click on Log Out
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
		logOut.click();

//		7. Close the browser (use -driver.close())
		Thread.sleep(5000);
		driver.close();
	}

}
