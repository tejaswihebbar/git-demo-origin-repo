package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Parabank_Welcome_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[@id=\"loginPanel\"]/form/div[2]/input")
	public static WebElement Password;

public void verify_Password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Password.getAttribute("value"),data);
	}

}

public void verify_Password_Status(String data){
		//Verifies the Status of the Password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Password(String data){
		Password.clear();
		Password.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[@id=\"loginPanel\"]/form/div[2]/input")
	public static WebElement Username;

public void verify_Username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Username.getAttribute("value"),data);
	}

}

public void verify_Username_Status(String data){
		//Verifies the Status of the Username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Username(String data){
		Username.clear();
		Username.sendKeys(data);
}

@FindBy(how= How.ID, using = "LOG_IN")
	public static WebElement LOG_IN;

public void verify_LOG_IN_Status(String data){
		//Verifies the Status of the LOG_IN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LOG_IN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LOG_IN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LOG_IN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LOG_IN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LOG_IN(){
		LOG_IN.click();
}

@FindBy(how= How.ID, using = "Register")
	public static WebElement Register;

public void verify_Register_Status(String data){
		//Verifies the Status of the Register
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Register.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Register.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Register.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Register.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Register(){
		Register.click();
}

@FindBy(how= How.ID, using = "Forgot_login_info_")
	public static WebElement Forgot_login_info_;

public void verify_Forgot_login_info__Status(String data){
		//Verifies the Status of the Forgot_login_info_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Forgot_login_info_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Forgot_login_info_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Forgot_login_info_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Forgot_login_info_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Forgot_login_info_(){
		Forgot_login_info_.click();
}

@FindBy(how= How.ID, using = "Admin_Page")
	public static WebElement Admin_Page;

public void verify_Admin_Page_Status(String data){
		//Verifies the Status of the Admin_Page
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Admin_Page.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Admin_Page.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Admin_Page.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Admin_Page.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Admin_Page(){
		Admin_Page.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}