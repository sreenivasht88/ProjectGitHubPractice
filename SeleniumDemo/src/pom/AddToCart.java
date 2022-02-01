package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement CartClk;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
     public void Cart(WebDriver driver)
     {
    	 
    	 CartClk.click();
     }
}

