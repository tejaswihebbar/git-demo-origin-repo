package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Transaction_Details_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Transaction_ID")
	public static WebElement Transaction_ID;

public void verify_Transaction_ID(String data){
		Assert.assertEquals(Transaction_ID,Transaction_ID);
}

public void enter_Transaction_ID(String data){
		Transaction_ID.sendKeys(data);
}

@FindBy(how= How.ID, using = "Date")
	public static WebElement Date;

public void verify_Date(String data){
		Assert.assertEquals(Date,Date);
}

public void enter_Date(String data){
		Date.sendKeys(data);
}

@FindBy(how= How.ID, using = "Description")
	public static WebElement Description;

public void verify_Description(String data){
		Assert.assertEquals(Description,Description);
}

public void enter_Description(String data){
		Description.sendKeys(data);
}

@FindBy(how= How.ID, using = "Type")
	public static WebElement Type;

public void verify_Type(String data){
		Assert.assertEquals(Type,Type);
}

public void enter_Type(String data){
		Type.sendKeys(data);
}

@FindBy(how= How.ID, using = "Amount")
	public static WebElement Amount;

public void verify_Amount(String data){
		Assert.assertEquals(Amount,Amount);
}

public void enter_Amount(String data){
		Amount.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}