package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
		
		public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		
	LoginPage lp=new LoginPage(driver);
	lp.search("dress");
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.scrollTo(0,500)");
	
	DressPage dp=new DressPage(driver);
	dp.dressclick();
	
	
	AddToCart ac = new AddToCart(driver);
	ac.Cart(driver);
	

		}
}
