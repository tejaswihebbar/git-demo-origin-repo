package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Register_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "First_Name")
	public static WebElement First_Name;

public void verify_First_Name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(First_Name.getAttribute("value"),data);
	}

}

public void verify_First_Name_Status(String data){
		//Verifies the Status of the First_Name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(First_Name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(First_Name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!First_Name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!First_Name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_First_Name(String data){
		First_Name.clear();
		First_Name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Last_Name")
	public static WebElement Last_Name;

public void verify_Last_Name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Last_Name.getAttribute("value"),data);
	}

}

public void verify_Last_Name_Status(String data){
		//Verifies the Status of the Last_Name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Last_Name(String data){
		Last_Name.clear();
		Last_Name.sendKeys(data);
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

@FindBy(how= How.ID, using = "SSN")
	public static WebElement SSN;

public void verify_SSN(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SSN.getAttribute("value"),data);
	}

}

public void verify_SSN_Status(String data){
		//Verifies the Status of the SSN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SSN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SSN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SSN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SSN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_SSN(String data){
		SSN.clear();
		SSN.sendKeys(data);
}

@FindBy(how= How.ID, using = "Username")
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

@FindBy(how= How.ID, using = "Password")
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

@FindBy(how= How.ID, using = "Confirm")
	public static WebElement Confirm;

public void verify_Confirm(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Confirm.getAttribute("value"),data);
	}

}

public void verify_Confirm_Status(String data){
		//Verifies the Status of the Confirm
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Confirm.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Confirm.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Confirm.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Confirm.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Confirm(String data){
		Confirm.clear();
		Confirm.sendKeys(data);
}

@FindBy(how= How.ID, using = "RIGISTER")
	public static WebElement RIGISTER;

public void verify_RIGISTER_Status(String data){
		//Verifies the Status of the RIGISTER
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(RIGISTER.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(RIGISTER.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!RIGISTER.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!RIGISTER.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_RIGISTER(){
		RIGISTER.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}