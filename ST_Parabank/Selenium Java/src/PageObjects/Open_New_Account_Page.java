package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Open_New_Account_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Account_Type")
	public static WebElement Account_Type;

public void verify_Account_Type(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Account_Type.getAttribute("value"),data);
	}

}

public void verify_Account_Type_Status(String data){
		//Verifies the Status of the Account_Type
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Account_Type.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Account_Type.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Account_Type.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Account_Type.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Account_Type(String data){
		Select dropdown= new Select(Account_Type);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Existing_Account")
	public static WebElement Existing_Account;

public void verify_Existing_Account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Existing_Account.getAttribute("value"),data);
	}

}

public void verify_Existing_Account_Status(String data){
		//Verifies the Status of the Existing_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Existing_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Existing_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Existing_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Existing_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Existing_Account(String data){
		Select dropdown= new Select(Existing_Account);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Open_New_Account")
	public static WebElement Open_New_Account;

public void verify_Open_New_Account_Status(String data){
		//Verifies the Status of the Open_New_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Open_New_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Open_New_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Open_New_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Open_New_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Open_New_Account(){
		Open_New_Account.click();
}

@FindBy(how= How.ID, using = "Account_Overview")
	public static WebElement Account_Overview;

public void verify_Account_Overview_Status(String data){
		//Verifies the Status of the Account_Overview
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Account_Overview.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Account_Overview.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Account_Overview.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Account_Overview.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Account_Overview(){
		Account_Overview.click();
}

@FindBy(how= How.ID, using = "Request_Loan")
	public static WebElement Request_Loan;

public void verify_Request_Loan_Status(String data){
		//Verifies the Status of the Request_Loan
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Request_Loan.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Request_Loan.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Request_Loan.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Request_Loan.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Request_Loan(){
		Request_Loan.click();
}

@FindBy(how= How.ID, using = "Existing_Account")
	public static WebElement Existing_Account;

public void verify_Existing_Account_Status(String data){
		//Verifies the Status of the Existing_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Existing_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Existing_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Existing_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Existing_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Existing_Account(){
		Existing_Account.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}