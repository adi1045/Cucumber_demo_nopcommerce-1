package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver lDriver;
	
	//constructor
	
	public LoginPage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
    WebElement Login;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement LogOut;
	
	public void enterEmail(String emailId)
	{
		email.clear();
		email.sendKeys(emailId);
	}
	
	
	public void enterPassword(String pwd)
	{
		Password.clear();
		Password.sendKeys(pwd);
	}
	
	public void clickOnLoginIn()
	{
		Login.click();
	}
	public void clickOnLogOut()
	{
		LogOut.click();
	}
	

}
