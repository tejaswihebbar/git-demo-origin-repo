package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Update_Profile_Page extends PageObjectBase{
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

@FindBy(how= How.ID, using = "UPDATE_PROFILE")
	public static WebElement UPDATE_PROFILE;

public void verify_UPDATE_PROFILE_Status(String data){
		//Verifies the Status of the UPDATE_PROFILE
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UPDATE_PROFILE.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UPDATE_PROFILE.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UPDATE_PROFILE.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UPDATE_PROFILE.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_UPDATE_PROFILE(){
		UPDATE_PROFILE.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}