package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Apply_for_a_Loan_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Loan_Amount")
	public static WebElement Loan_Amount;

public void verify_Loan_Amount(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Loan_Amount.getAttribute("value"),data);
	}

}

public void verify_Loan_Amount_Status(String data){
		//Verifies the Status of the Loan_Amount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Loan_Amount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Loan_Amount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Loan_Amount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Loan_Amount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Loan_Amount(String data){
		Loan_Amount.clear();
		Loan_Amount.sendKeys(data);
}

@FindBy(how= How.ID, using = "Down_Payment")
	public static WebElement Down_Payment;

public void verify_Down_Payment(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Down_Payment.getAttribute("value"),data);
	}

}

public void verify_Down_Payment_Status(String data){
		//Verifies the Status of the Down_Payment
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Down_Payment.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Down_Payment.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Down_Payment.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Down_Payment.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Down_Payment(String data){
		Down_Payment.clear();
		Down_Payment.sendKeys(data);
}

@FindBy(how= How.ID, using = "From_Account")
	public static WebElement From_Account;

public void verify_From_Account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(From_Account.getAttribute("value"),data);
	}

}

public void verify_From_Account_Status(String data){
		//Verifies the Status of the From_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(From_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(From_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!From_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!From_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_From_Account(String data){
		Select dropdown= new Select(From_Account);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Apply_Now")
	public static WebElement Apply_Now;

public void verify_Apply_Now_Status(String data){
		//Verifies the Status of the Apply_Now
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Apply_Now.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Apply_Now.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Apply_Now.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Apply_Now.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Apply_Now(){
		Apply_Now.click();
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

@FindBy(how= How.ID, using = "Existing_Accounts")
	public static WebElement Existing_Accounts;

public void verify_Existing_Accounts_Status(String data){
		//Verifies the Status of the Existing_Accounts
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Existing_Accounts.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Existing_Accounts.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Existing_Accounts.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Existing_Accounts.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Existing_Accounts(){
		Existing_Accounts.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}