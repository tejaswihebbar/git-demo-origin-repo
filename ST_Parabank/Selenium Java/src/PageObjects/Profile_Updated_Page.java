package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Profile_Updated_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "message")
	public static WebElement message;

public void verify_message(String data){
		Assert.assertEquals(message,message);
}

public void enter_message(String data){
		message.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}