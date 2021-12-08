package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class New_Account_Page extends PageObjectBase{
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