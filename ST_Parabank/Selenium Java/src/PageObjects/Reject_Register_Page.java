package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Reject_Register_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "First_Name")
	public static WebElement First_Name;

public void verify_First_Name(String data){
		Assert.assertEquals(First_Name,First_Name);
}

public void enter_First_Name(String data){
		First_Name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Last_Name")
	public static WebElement Last_Name;

public void verify_Last_Name(String data){
		Assert.assertEquals(Last_Name,Last_Name);
}

public void enter_Last_Name(String data){
		Last_Name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Adress")
	public static WebElement Adress;

public void verify_Adress(String data){
		Assert.assertEquals(Adress,Adress);
}

public void enter_Adress(String data){
		Adress.sendKeys(data);
}

@FindBy(how= How.ID, using = "City")
	public static WebElement City;

public void verify_City(String data){
		Assert.assertEquals(City,City);
}

public void enter_City(String data){
		City.sendKeys(data);
}

@FindBy(how= How.ID, using = "State")
	public static WebElement State;

public void verify_State(String data){
		Assert.assertEquals(State,State);
}

public void enter_State(String data){
		State.sendKeys(data);
}

@FindBy(how= How.ID, using = "Zip_Code")
	public static WebElement Zip_Code;

public void verify_Zip_Code(String data){
		Assert.assertEquals(Zip_Code,Zip_Code);
}

public void enter_Zip_Code(String data){
		Zip_Code.sendKeys(data);
}

@FindBy(how= How.ID, using = "Phone")
	public static WebElement Phone;

public void verify_Phone(String data){
		Assert.assertEquals(Phone,Phone);
}

public void enter_Phone(String data){
		Phone.sendKeys(data);
}

@FindBy(how= How.ID, using = "SSN")
	public static WebElement SSN;

public void verify_SSN(String data){
		Assert.assertEquals(SSN,SSN);
}

public void enter_SSN(String data){
		SSN.sendKeys(data);
}

@FindBy(how= How.ID, using = "UserName")
	public static WebElement UserName;

public void verify_UserName(String data){
		Assert.assertEquals(UserName,UserName);
}

public void enter_UserName(String data){
		UserName.sendKeys(data);
}

@FindBy(how= How.ID, using = "Password")
	public static WebElement Password;

public void verify_Password(String data){
		Assert.assertEquals(Password,Password);
}

public void enter_Password(String data){
		Password.sendKeys(data);
}

@FindBy(how= How.ID, using = "Confirm")
	public static WebElement Confirm;

public void verify_Confirm(String data){
		Assert.assertEquals(Confirm,Confirm);
}

public void enter_Confirm(String data){
		Confirm.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}