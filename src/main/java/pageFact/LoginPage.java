package pageFact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepack.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//*[@id='submit']")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	@FindBy(name = "q")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

}
