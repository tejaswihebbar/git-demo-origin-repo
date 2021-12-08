package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Bill_Payment_Service_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Payee_Name")
	public static WebElement Payee_Name;

public void verify_Payee_Name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Payee_Name.getAttribute("value"),data);
	}

}

public void verify_Payee_Name_Status(String data){
		//Verifies the Status of the Payee_Name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Payee_Name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Payee_Name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Payee_Name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Payee_Name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Payee_Name(String data){
		Payee_Name.clear();
		Payee_Name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Address")
	public static WebElement Address;

public void verify_Address(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Address.getAttribute("value"),data);
	}

}

public void verify_Address_Status(String data){
		//Verifies the Status of the Address
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Address.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Address.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Address.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Address.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Address(String data){
		Address.clear();
		Address.sendKeys(data);
}

@FindBy(how= How.ID, using = "City")
	public static WebElement City;

public void verify_City(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(City.getAttribute("value"),data);
	}

}

public void verify_City_Status(String data){
		//Verifies the Status of the City
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(City.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(City.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!City.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!City.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_City(String data){
		City.clear();
		City.sendKeys(data);
}

@FindBy(how= How.ID, using = "State")
	public static WebElement State;

public void verify_State(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(State.getAttribute("value"),data);
	}

}

public void verify_State_Status(String data){
		//Verifies the Status of the State
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(State.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(State.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!State.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!State.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_State(String data){
		State.clear();
		State.sendKeys(data);
}

@FindBy(how= How.ID, using = "Zip_Code")
	public static WebElement Zip_Code;

public void verify_Zip_Code(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Zip_Code.getAttribute("value"),data);
	}

}

public void verify_Zip_Code_Status(String data){
		//Verifies the Status of the Zip_Code
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Zip_Code.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Zip_Code.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Zip_Code.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Zip_Code.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Zip_Code(String data){
		Zip_Code.clear();
		Zip_Code.sendKeys(data);
}

@FindBy(how= How.ID, using = "Phone")
	public static WebElement Phone;

public void verify_Phone(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Phone.getAttribute("value"),data);
	}

}

public void verify_Phone_Status(String data){
		//Verifies the Status of the Phone
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Phone.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Phone.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Phone.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Phone.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Phone(String data){
		Phone.clear();
		Phone.sendKeys(data);
}

@FindBy(how= How.ID, using = "Account")
	public static WebElement Account;

public void verify_Account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Account.getAttribute("value"),data);
	}

}

public void verify_Account_Status(String data){
		//Verifies the Status of the Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Account(String data){
		Account.clear();
		Account.sendKeys(data);
}

@FindBy(how= How.ID, using = "Verify_Account")
	public static WebElement Verify_Account;

public void verify_Verify_Account(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Verify_Account.getAttribute("value"),data);
	}

}

public void verify_Verify_Account_Status(String data){
		//Verifies the Status of the Verify_Account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Verify_Account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Verify_Account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Verify_Account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Verify_Account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Verify_Account(String data){
		Verify_Account.clear();
		Verify_Account.sendKeys(data);
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

@FindBy(how= How.ID, using = "SEND_PAYMENT")
	public static WebElement SEND_PAYMENT;

public void verify_SEND_PAYMENT_Status(String data){
		//Verifies the Status of the SEND_PAYMENT
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SEND_PAYMENT.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SEND_PAYMENT.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SEND_PAYMENT.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SEND_PAYMENT.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SEND_PAYMENT(){
		SEND_PAYMENT.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}