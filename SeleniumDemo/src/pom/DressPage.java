package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	
	//Declaration
	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
	private WebElement ImageClk;
	
    //initialize-create constructor
	
	public DressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization-public
	
	public void dressclick()
	{
		ImageClk.click();
	}
}
