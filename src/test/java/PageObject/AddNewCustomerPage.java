package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {

  public WebDriver ldriver;
	
	//constructor
  public AddNewCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement customerMenuuu;
	
	@FindBy(xpath="(//p[contains(text(),'Customers')])[2]")
	WebElement customer;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement addNew;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement newEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement newPassword;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement MaleGender;
		
	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement FeMaleGender;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement IsTaxExempt;
	
	@FindBy(xpath="(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
	WebElement newsLetterss;
	
	@FindBy(xpath="//span[@title='delete']")
	WebElement registered;
	
	@FindBy(xpath="(//div[@role='listbox'])[2]")  //(//div[@class='k-multiselect-wrap k-floatwrap'])[2]
	WebElement dropdowncustomerRoles;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement AdminComment;
	
	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	
	//Actions Methods for web elements
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	public void clickOnCustomerMenuuuuuuuuuuu()
	{
		customerMenuuu.click();
	}
	
	public void clickOncustomer()   //error 
	{
		
		customer.click();
	}
	
	public void clickOnAddNew()
	{
		addNew.click();
	}
	
	public void enterNewEmail(String email)
	{
		newEmail.sendKeys(email);
	}
	
	public void enterNewPassword(String password)
	{
		newPassword.sendKeys(password);
	}
	
	public void enterFirstName(String f_name)
	{
		firstName.sendKeys(f_name);
	}
	
	public void enterLastName(String l_name)
	{
		LastName.sendKeys(l_name);
	}
	
	
	
	public void enterGender(String gender)
	{
		if(gender.equals("Male"))
		{
			MaleGender.click();
		}
		else if(gender.equals("Female"))
		{
			FeMaleGender.click();
		}
		else//default set Male gender
		{
			MaleGender.click();
		}

	}
	
	public void enterDateOfBirth(String date)
	{
		dateOfBirth.sendKeys("11/10/2024");
	}
	
	public void enterCompanyName(String c_name)
	{
		companyName.sendKeys(c_name);
	}
	
	public void enterIsTaxExempt()
	{
		IsTaxExempt.click();
	}
	
	public void selectNewsLetter(String value)
	{
		Select s_letter=new Select(newsLetterss);
		s_letter.selectByVisibleText(value);
	}
	
	public void selectCustomerRoles(String value)
	{
		registered.click();
		
		Select c_Roles=new Select(dropdowncustomerRoles);
		c_Roles.selectByVisibleText(value);
	}
	
	public void enterManagerOfVendor(String value)
	{
		Select drp=new Select(dropdownVendorMgr);
		drp.selectByVisibleText(value);
	}
	
	public void enterAdminComment(String comment)
	{
		AdminComment.sendKeys(comment );
	}
	
	public void clickOnSave()
	{
		save.click();
	}
	
}
