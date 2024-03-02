package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginpg;
	public  AddNewCustomerPage addnewCustomerPage;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		loginpg=new LoginPage(driver);
		addnewCustomerPage=new AddNewCustomerPage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {

		loginpg.enterEmail(email);
		loginpg.enterPassword(password);

	}

	@When("click on login")
	public void click_on_login() {

		loginpg.clickOnLoginIn();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		String actualTitle=	driver.getTitle();

		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);		
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click on Log Out Link")
	public void user_click_on_log_out_link() 
	{
		loginpg.clickOnLogOut();
	}

	@Then("Close browser")
	public void close_browser() {

		//driver.close();
		//driver.quit();
	}

	///////////////   add New Customer   //////////////

	@Then("User Can View Dashboad")
	public void user_can_view_dashboad() {

		String expectedTitle="Dashboard / nopCommerce administration";

		if(addnewCustomerPage.getPageTitle().equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click On Customer Menu")
	public void user_click_on_customer_menu() {

		addnewCustomerPage.clickOnCustomerMenuuuuuuuuuuu();;
	}

	@When("Click On Customer Menu Item")
	public void click_on_customer_menu_item() {

		addnewCustomerPage.clickOncustomer();
	}

	@When("Click On Add New Item")
	public void click_on_add_new_item() {

		addnewCustomerPage.clickOnAddNew();
	}

	@Then("User Can View Add New Customer Page")
	public void user_can_view_add_new_customer_page() {

		String expectedTitle="Add a new customer / nopCommerce administration";

		if(addnewCustomerPage.getPageTitle().equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User Enter Customer Info")
	public void user_enter_customer_info() {

		addnewCustomerPage.enterNewEmail("b@gmail.com");
		addnewCustomerPage.enterNewPassword("bbbb");
		addnewCustomerPage.enterFirstName("adi");
		addnewCustomerPage.enterLastName("nikam");
		addnewCustomerPage.enterGender("Male");
		addnewCustomerPage.enterDateOfBirth("01/02/1998");
		addnewCustomerPage.enterCompanyName("Infosys");
		addnewCustomerPage.enterIsTaxExempt();
//		addnewCustomerPage.selectNewsLetter("Your store name");
//		addnewCustomerPage.selectCustomerRoles("Administrators");
		addnewCustomerPage.enterManagerOfVendor("Vendor 1");
		addnewCustomerPage.enterAdminComment("first comment");

	}

	@When("Click On Save button")
	public void click_on_save_button() {

		addnewCustomerPage.clickOnSave();
	}

	@Then("User Can View Confirmation Message {string}")
	public void user_can_view_confirmation_message(String expectedOutput) {

		String bodyText=driver.findElement(By.tagName("Body")).getText();

		if(bodyText.contains(expectedOutput))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
