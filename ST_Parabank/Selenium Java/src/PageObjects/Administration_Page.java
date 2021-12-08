package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Administration_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Loan_Provider")
	public static WebElement Loan_Provider;

public void verify_Loan_Provider(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Loan_Provider.getAttribute("value"),data);
	}

}

public void verify_Loan_Provider_Status(String data){
		//Verifies the Status of the Loan_Provider
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Loan_Provider.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Loan_Provider.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Loan_Provider.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Loan_Provider.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Loan_Provider(String data){
		Select dropdown= new Select(Loan_Provider);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Loan_Processor")
	public static WebElement Loan_Processor;

public void verify_Loan_Processor(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Loan_Processor.getAttribute("value"),data);
	}

}

public void verify_Loan_Processor_Status(String data){
		//Verifies the Status of the Loan_Processor
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Loan_Processor.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Loan_Processor.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Loan_Processor.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Loan_Processor.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Loan_Processor(String data){
		Select dropdown= new Select(Loan_Processor);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Threshold")
	public static WebElement Threshold;

public void verify_Threshold(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Threshold.getAttribute("value"),data);
	}

}

public void verify_Threshold_Status(String data){
		//Verifies the Status of the Threshold
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Threshold.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Threshold.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Threshold.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Threshold.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Threshold(String data){
		Threshold.clear();
		Threshold.sendKeys(data);
}

@FindBy(how= How.ID, using = "Initial_Balance")
	public static WebElement Initial_Balance;

public void verify_Initial_Balance(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Initial_Balance.getAttribute("value"),data);
	}

}

public void verify_Initial_Balance_Status(String data){
		//Verifies the Status of the Initial_Balance
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Initial_Balance.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Initial_Balance.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Initial_Balance.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Initial_Balance.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Initial_Balance(String data){
		Initial_Balance.clear();
		Initial_Balance.sendKeys(data);
}

@FindBy(how= How.ID, using = "Min_Balance")
	public static WebElement Min_Balance;

public void verify_Min_Balance(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Min_Balance.getAttribute("value"),data);
	}

}

public void verify_Min_Balance_Status(String data){
		//Verifies the Status of the Min_Balance
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Min_Balance.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Min_Balance.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Min_Balance.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Min_Balance.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Min_Balance(String data){
		Min_Balance.clear();
		Min_Balance.sendKeys(data);
}

@FindBy(how= How.ID, using = "SUBMIT")
	public static WebElement SUBMIT;

public void verify_SUBMIT_Status(String data){
		//Verifies the Status of the SUBMIT
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SUBMIT.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SUBMIT.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SUBMIT.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SUBMIT.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SUBMIT(){
		SUBMIT.click();
}

@FindBy(how= How.ID, using = "Available_Funds")
	public static WebElement Available_Funds;

public void verify_Available_Funds_Status(String data){
		//Verifies the Status of the Available_Funds
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Available_Funds.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Available_Funds.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Available_Funds.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Available_Funds.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Available_Funds(){
		Available_Funds.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}