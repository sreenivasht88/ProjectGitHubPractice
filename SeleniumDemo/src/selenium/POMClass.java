package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	
	//Declaration
	@FindBy(name = "username")
	private WebElement usernameEdt;

	@FindBy(name = "password")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	//initialization
	public POMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
//	
//	//business Library
//	public void loginToApp(String username, String password)
//	{
//		usernameEdt.sendKeys(username);
//		passwordEdt.sendKeys(password);
//		loginBtn.click();
//	}
	
	
}
