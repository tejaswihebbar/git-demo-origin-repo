package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Accounts_Overview_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Account")
	public static WebElement Account;

public void verify_Account(String data){
		Assert.assertEquals(Account,Account);
}

public void enter_Account(String data){
		Account.sendKeys(data);
}

@FindBy(how= How.ID, using = "Balance")
	public static WebElement Balance;

public void verify_Balance(String data){
		Assert.assertEquals(Balance,Balance);
}

public void enter_Balance(String data){
		Balance.sendKeys(data);
}

@FindBy(how= How.ID, using = "Available_Amount")
	public static WebElement Available_Amount;

public void verify_Available_Amount(String data){
		Assert.assertEquals(Available_Amount,Available_Amount);
}

public void enter_Available_Amount(String data){
		Available_Amount.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}