package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Find_Transactions_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Select_an_account")
	public static WebElement Select_an_account;

public void verify_Select_an_account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Select_an_account.getAttribute("value"),data);
	}

}

public void verify_Select_an_account_Status(String data){
		//Verifies the Status of the Select_an_account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_an_account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_an_account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_an_account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_an_account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Select_an_account(String data){
		Select dropdown= new Select(Select_an_account);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Find_By_Transaction_ID")
	public static WebElement Find_By_Transaction_ID;

public void verify_Find_By_Transaction_ID(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Find_By_Transaction_ID.getAttribute("value"),data);
	}

}

public void verify_Find_By_Transaction_ID_Status(String data){
		//Verifies the Status of the Find_By_Transaction_ID
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Find_By_Transaction_ID.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Find_By_Transaction_ID.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Find_By_Transaction_ID.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Find_By_Transaction_ID.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Find_By_Transaction_ID(String data){
		Find_By_Transaction_ID.clear();
		Find_By_Transaction_ID.sendKeys(data);
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

@FindBy(how= How.ID, using = "Between")
	public static WebElement Between;

public void verify_Between(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Between.getAttribute("value"),data);
	}

}

public void verify_Between_Status(String data){
		//Verifies the Status of the Between
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Between.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Between.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Between.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Between.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Between(String data){
		Between.clear();
		Between.sendKeys(data);
}

@FindBy(how= How.ID, using = "And")
	public static WebElement And;

public void verify_And(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(And.getAttribute("value"),data);
	}

}

public void verify_And_Status(String data){
		//Verifies the Status of the And
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(And.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(And.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!And.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!And.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_And(String data){
		And.clear();
		And.sendKeys(data);
}

@FindBy(how= How.ID, using = "Find_By_Amount")
	public static WebElement Find_By_Amount;

public void verify_Find_By_Amount(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Find_By_Amount.getAttribute("value"),data);
	}

}

public void verify_Find_By_Amount_Status(String data){
		//Verifies the Status of the Find_By_Amount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Find_By_Amount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Find_By_Amount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Find_By_Amount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Find_By_Amount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Find_By_Amount(String data){
		Find_By_Amount.clear();
		Find_By_Amount.sendKeys(data);
}

@FindBy(how= How.ID, using = "Find_By_Date")
	public static WebElement Find_By_Date;

public void verify_Find_By_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Find_By_Date.getAttribute("value"),data);
	}

}

public void verify_Find_By_Date_Status(String data){
		//Verifies the Status of the Find_By_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Find_By_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Find_By_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Find_By_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Find_By_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Find_By_Date(String data){
		Find_By_Date.clear();
		Find_By_Date.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}