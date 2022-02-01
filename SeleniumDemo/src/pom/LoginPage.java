package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	@FindBy(id="search_query_top")
	private WebElement SearchEdt;
	
	@FindBy(name="submit_search")
	private WebElement SearchBtn;
	
	// Initialization-use constructor class with public
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization-create method using public-(user defined method)

	public void search(String name)
	{
		SearchEdt.sendKeys(name);
		SearchBtn.click();
	
	}

}
