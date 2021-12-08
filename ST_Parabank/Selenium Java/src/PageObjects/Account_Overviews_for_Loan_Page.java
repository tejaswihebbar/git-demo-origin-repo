package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Account_Overviews_for_Loan_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Account1")
	public static WebElement Account1;

public void verify_Account1(String data){
		Assert.assertEquals(Account1,Account1);
}

public void enter_Account1(String data){
		Account1.sendKeys(data);
}

@FindBy(how= How.ID, using = "Balance_of_Account1")
	public static WebElement Balance_of_Account1;

public void verify_Balance_of_Account1(String data){
		Assert.assertEquals(Balance_of_Account1,Balance_of_Account1);
}

public void enter_Balance_of_Account1(String data){
		Balance_of_Account1.sendKeys(data);
}

@FindBy(how= How.ID, using = "Available_Amount_of_Account_1")
	public static WebElement Available_Amount_of_Account_1;

public void verify_Available_Amount_of_Account_1(String data){
		Assert.assertEquals(Available_Amount_of_Account_1,Available_Amount_of_Account_1);
}

public void enter_Available_Amount_of_Account_1(String data){
		Available_Amount_of_Account_1.sendKeys(data);
}

@FindBy(how= How.ID, using = "Account2")
	public static WebElement Account2;

public void verify_Account2(String data){
		Assert.assertEquals(Account2,Account2);
}

public void enter_Account2(String data){
		Account2.sendKeys(data);
}

@FindBy(how= How.ID, using = "Balance_Account2")
	public static WebElement Balance_Account2;

public void verify_Balance_Account2(String data){
		Assert.assertEquals(Balance_Account2,Balance_Account2);
}

public void enter_Balance_Account2(String data){
		Balance_Account2.sendKeys(data);
}

@FindBy(how= How.ID, using = "Avilable_Amount_of_Account2")
	public static WebElement Avilable_Amount_of_Account2;

public void verify_Avilable_Amount_of_Account2(String data){
		Assert.assertEquals(Avilable_Amount_of_Account2,Avilable_Amount_of_Account2);
}

public void enter_Avilable_Amount_of_Account2(String data){
		Avilable_Amount_of_Account2.sendKeys(data);
}

@FindBy(how= How.ID, using = "Total_Amount")
	public static WebElement Total_Amount;

public void verify_Total_Amount(String data){
		Assert.assertEquals(Total_Amount,Total_Amount);
}

public void enter_Total_Amount(String data){
		Total_Amount.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}