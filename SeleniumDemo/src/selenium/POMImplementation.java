package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMImplementation {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		//Step 1: launch the browser
		WebDriver driver = new ChromeDriver();
		
		//load the application
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
//		//login to app
//		driver.findElement(By.name("username")).sendKeys("PUNIV00475");
//		driver.findElement(By.name("password")).sendKeys("password");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Login thru pom
		POMClass pc = new POMClass(driver);
		//pc.loginToApp("PUNIV", "12344R");
		pc.getUsernameEdt().sendKeys("qwer");
		pc.getPasswordEdt().sendKeys("");
	}

}
