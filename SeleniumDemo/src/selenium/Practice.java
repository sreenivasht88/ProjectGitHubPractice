package selenium;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Practice {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
    
	public static void main(String[] args) throws Throwable {
	
     
	
		WebDriver driver = new ChromeDriver();
		System.out.println("hi");
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("E:\\SeleniumProjects\\SeleniumDemo\\screenshot\\sree.png");
			Files.copy(src, dst);
			
		}
		
	}

