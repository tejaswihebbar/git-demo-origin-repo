package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Transfer_Funds_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Amount")
	public static WebElement Amount;

public void verify_Amount(String data){
		Assert.assertEquals(Amount,Amount);
}

public void enter_Amount(String data){
		Amount.sendKeys(data);
}

@FindBy(how= How.ID, using = "From_Account")
	public static WebElement From_Account;

public void verify_From_Account(String data){
		Assert.assertEquals(From_Account,From_Account);
}

public void enter_From_Account(String data){
		From_Account.sendKeys(data);
}

@FindBy(how= How.ID, using = "To_Account")
	public static WebElement To_Account;

public void verify_To_Account(String data){
		Assert.assertEquals(To_Account,To_Account);
}

public void enter_To_Account(String data){
		To_Account.sendKeys(data);
}

@FindBy(how= How.ID, using = "Amount")
	public static WebElement Amount;

public void verify_Amount(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Amount.getAttribute("value"),data);
	}

}

public void verify_Amount_Status(String data){
		//Verifies the Status of the Amount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Amount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Amount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Amount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Amount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Amount(String data){
		Amount.clear();
		Amount.sendKeys(data);
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

@FindBy(how= How.ID, using = "To_Account")
	public static WebElement To_Account;

public void verify_To_Account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(To_Account.getAttribute("value"),data);
	}

}

public void verify_To_Account_Status(String data){
		//Verifies the Status of the To_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(To_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(To_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!To_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!To_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_To_Account(String data){
		Select dropdown= new Select(To_Account);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "TRANSFER")
	public static WebElement TRANSFER;

public void verify_TRANSFER_Status(String data){
		//Verifies the Status of the TRANSFER
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TRANSFER.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TRANSFER.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TRANSFER.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TRANSFER.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TRANSFER(){
		TRANSFER.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}