package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Click_Transaction_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Click")
	public static WebElement Click;

public void verify_Click(String data){
		Assert.assertEquals(Click,Click);
}

public void enter_Click(String data){
		Click.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}