package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
		
	public static void main(String[] args) throws InterruptedException {
		//initialise and launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		//username
		driver.findElement(By.name("user_name")).sendKeys("admin");
		//password
		driver.findElement(By.name("user_password")).sendKeys("manager");
		//login
		driver.findElement(By.id("submitButton")).click();
		
		//navigate to organisation
		driver.findElement(By.linkText("Organizations")).click();
		//create organisation
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//enter manditatry field
		driver.findElement(By.name("accountname")).sendKeys("Lochan");
		
		
		
		Thread.sleep(2000);	
	    driver.close();	
	
	}

}
