package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Loan_Request_Processed_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Loan_Provider")
	public static WebElement Loan_Provider;

public void verify_Loan_Provider(String data){
		Assert.assertEquals(Loan_Provider,Loan_Provider);
}

public void enter_Loan_Provider(String data){
		Loan_Provider.sendKeys(data);
}

@FindBy(how= How.ID, using = "Date")
	public static WebElement Date;

public void verify_Date(String data){
		Assert.assertEquals(Date,Date);
}

public void enter_Date(String data){
		Date.sendKeys(data);
}

@FindBy(how= How.ID, using = "Status")
	public static WebElement Status;

public void verify_Status(String data){
		Assert.assertEquals(Status,Status);
}

public void enter_Status(String data){
		Status.sendKeys(data);
}

@FindBy(how= How.ID, using = "message")
	public static WebElement message;

public void verify_message(String data){
		Assert.assertEquals(message,message);
}

public void enter_message(String data){
		message.sendKeys(data);
}

@FindBy(how= How.ID, using = "Account_Number")
	public static WebElement Account_Number;

public void verify_Account_Number(String data){
		Assert.assertEquals(Account_Number,Account_Number);
}

public void enter_Account_Number(String data){
		Account_Number.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}