package week3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//b1
		WebElement b1 = driver.findElement(By.id("j_idt88:name"));
		b1.sendKeys("Suhail");
		//b2
		WebElement b2 = driver.findElement(By.id("j_idt88:j_idt91"));
		b2.sendKeys(",India");
		//b3
		boolean b3 = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(b3);
		if (b3==false) {
			System.out.println("not enabled");	
		}
		//b4
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		//b5
		
		//b6
		WebElement b6 = driver.findElement(By.id("j_idt88:j_idt99"));
		b6.sendKeys("suom6f@gmail.com");
		b6.sendKeys(Keys.TAB +"I am Sheriff");
		//b7 and b8
		driver.findElement(By.xpath("//button[@class='ql-bold']")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Sheriff");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		//b9
		String b9 = driver.findElement(By.className("ui-message-error-detail")).getText();
		System.out.println(b9);
		if (b9.contains("Age is mandatory")) {
			System.out.println("ERROR shown");
		}
		//b10
		WebElement b10= driver.findElement(By.id("j_idt106:j_idt113"));
		
		Point originalLoc = b10.getLocation();
		
		driver.findElement(By.id("j_idt106:float-input")).click();
		
		Point changedLoc = b10.getLocation();
		
		if (!originalLoc.equals(changedLoc)) {
			System.out.println("location changed");
		}
		//b11
		WebElement b11 = driver.findElement(By.id("j_idt106:auto-complete_input"));
		b11.sendKeys("Suhail");
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		//b12
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("02/10/2001");
		String b12 = driver.findElement(By.linkText("02")).getText();
		if ("02/10/2001".contains(b12)) {
			System.out.println("day is the same");
		}
		//b13
		WebElement b13 = driver.findElement(By.id("j_idt106:j_idt118_input"));
		b13.sendKeys("5");
		driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
		String newValue = b13.getText();
		if (!newValue.equals("5")) {
			System.out.println("value has changed");
			
		}
		
		

		//b15
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		boolean keyboard = driver.findElement(By.xpath("//div[contains(@class,'shadow keypad-popup')]")).isDisplayed();
		System.out.println(keyboard);
		if (keyboard==true) {
			System.out.println("keyboard is displayed");
		}
		
	}

}




