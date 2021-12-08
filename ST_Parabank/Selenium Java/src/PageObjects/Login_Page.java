package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Login_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "username")
	public static WebElement username;

public void verify_username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(username.getAttribute("value"),data);
	}

}

public void verify_username_Status(String data){
		//Verifies the Status of the username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_username(String data){
		Select dropdown= new Select(username);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "password")
	public static WebElement password;

public void verify_password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(password.getAttribute("value"),data);
	}

}

public void verify_password_Status(String data){
		//Verifies the Status of the password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_password(String data){
		password.clear();
		password.sendKeys(data);
}

@FindBy(how= How.ID, using = "username")
	public static WebElement username;

public void verify_username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(username.getAttribute("value"),data);
	}

}

public void verify_username_Status(String data){
		//Verifies the Status of the username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_username(String data){
		username.clear();
		username.sendKeys(data);
}

@FindBy(how= How.ID, using = "Login")
	public static WebElement Login;

public void verify_Login_Status(String data){
		//Verifies the Status of the Login
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Login.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Login.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Login.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Login.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Login(){
		Login.click();
}

@FindBy(how= How.ID, using = "forgot_user_id")
	public static WebElement forgot_user_id;

public void verify_forgot_user_id_Status(String data){
		//Verifies the Status of the forgot_user_id
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(forgot_user_id.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(forgot_user_id.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!forgot_user_id.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!forgot_user_id.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_forgot_user_id(){
		forgot_user_id.click();
}

@FindBy(how= How.ID, using = "register")
	public static WebElement register;

public void verify_register_Status(String data){
		//Verifies the Status of the register
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(register.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(register.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!register.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!register.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_register(){
		register.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}