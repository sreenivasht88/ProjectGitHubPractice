package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	static{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://home.redbrickhealth.com/");
		
		WebElement sol=driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[@title='Solutions']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(sol).perform();
		
		List<WebElement> sug = driver.findElements(By.xpath("(//ul[@class=' dropdown-menu'])[1]/li"));
		
		int count= sug.size();
		System.out.println(count);
		
		for(WebElement sug1:sug)
		{
			String text=sug1.getText();
			System.out.println(text);
			
			if(text.equals("MARKETS WE SERVE"))
			{
				sug1.click();
			}
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
