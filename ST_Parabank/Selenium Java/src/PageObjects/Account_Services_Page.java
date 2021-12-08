package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Account_Services_Page extends PageObjectBase{
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

@FindBy(how= How.ID, using = "Transfer_Funds")
	public static WebElement Transfer_Funds;

public void verify_Transfer_Funds_Status(String data){
		//Verifies the Status of the Transfer_Funds
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Transfer_Funds.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Transfer_Funds.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Transfer_Funds.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Transfer_Funds.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Transfer_Funds(){
		Transfer_Funds.click();
}

@FindBy(how= How.ID, using = "Bill_Pay")
	public static WebElement Bill_Pay;

public void verify_Bill_Pay_Status(String data){
		//Verifies the Status of the Bill_Pay
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Bill_Pay.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Bill_Pay.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Bill_Pay.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Bill_Pay.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Bill_Pay(){
		Bill_Pay.click();
}

@FindBy(how= How.ID, using = "Find_Transactions")
	public static WebElement Find_Transactions;

public void verify_Find_Transactions_Status(String data){
		//Verifies the Status of the Find_Transactions
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Find_Transactions.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Find_Transactions.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Find_Transactions.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Find_Transactions.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Find_Transactions(){
		Find_Transactions.click();
}

@FindBy(how= How.ID, using = "Update_Contact_Info")
	public static WebElement Update_Contact_Info;

public void verify_Update_Contact_Info_Status(String data){
		//Verifies the Status of the Update_Contact_Info
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_Contact_Info.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_Contact_Info.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_Contact_Info.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_Contact_Info.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_Contact_Info(){
		Update_Contact_Info.click();
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

@FindBy(how= How.ID, using = "Log_Out")
	public static WebElement Log_Out;

public void verify_Log_Out_Status(String data){
		//Verifies the Status of the Log_Out
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Log_Out.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Log_Out.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Log_Out.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Log_Out.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Log_Out(){
		Log_Out.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}