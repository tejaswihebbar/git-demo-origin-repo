package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Forgot_Password
*/
public class Forgot_Password extends PageObjectBase
{

	public Forgot_Password()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_url_FIELD,final String Step_2_Password_TEXTBOX_Status,final String Step_2_Password_TEXTBOX_Verification,final String Step_2_Username_TEXTBOX_Status,final String Step_2_Username_TEXTBOX_Verification,final String Step_2_LOG_IN_BUTTON_Status,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Forgot_login_info__HYPERLINK_Status,final String Step_2_Admin_Page_HYPERLINK_Status,final String Step_4_First_Name_TEXTBOX_Status,final String Step_4_First_Name_TEXTBOX_Verification,final String Step_4_Last_Name_TEXTBOX_Status,final String Step_4_Last_Name_TEXTBOX_Verification,final String Step_4_Address_TEXTBOX_Status,final String Step_4_Address_TEXTBOX_Verification,final String Step_4_City_TEXTBOX_Status,final String Step_4_City_TEXTBOX_Verification,final String Step_4_State_TEXTBOX_Status,final String Step_4_State_TEXTBOX_Verification,final String Step_4_Zip_Code_TEXTBOX_Status,final String Step_4_Zip_Code_TEXTBOX_Verification,final String Step_4_SSN_TEXTBOX_Status,final String Step_4_SSN_TEXTBOX_Verification,final String Step_4_FIND_MY_LOGIN_INFO_BUTTON_Status,final String Step_5_First_Name_TEXTBOX,final String Step_5_Last_Name_TEXTBOX,final String Step_5_Address_TEXTBOX,final String Step_5_City_TEXTBOX,final String Step_5_State_TEXTBOX,final String Step_5_Zip_Code_TEXTBOX,final String Step_5_SSN_TEXTBOX,final String Step_7_Error_FIELD,final String Step_8_Open_New_Account_HYPERLINK_Status,final String Step_8_Account_Overview_HYPERLINK_Status,final String Step_8_Transfer_Funds_HYPERLINK_Status,final String Step_8_Bill_Pay_HYPERLINK_Status,final String Step_8_Find_Transactions_HYPERLINK_Status,final String Step_8_Update_Contact_Info_HYPERLINK_Status,final String Step_8_Request_Loan_HYPERLINK_Status,final String Step_8_Log_Out_HYPERLINK_Status) throws Exception

	{

	Parabank_Welcome_Page parabank_welcome_page_init=PageFactory.initElements(driver, Parabank_Welcome_Page.class);

	enter_URL_Page enter_url_page_init=PageFactory.initElements(driver, enter_URL_Page.class);

	Register_Page register_page_init=PageFactory.initElements(driver, Register_Page.class);

	Forgot_Login_info_Page forgot_login_info_page_init=PageFactory.initElements(driver, Forgot_Login_info_Page.class);

	Account_Created_Page account_created_page_init=PageFactory.initElements(driver, Account_Created_Page.class);

	Invalid_Credentials_Page invalid_credentials_page_init=PageFactory.initElements(driver, Invalid_Credentials_Page.class);

	Administration_Page administration_page_init=PageFactory.initElements(driver, Administration_Page.class);

	Accounts_Overview_Page accounts_overview_page_init=PageFactory.initElements(driver, Accounts_Overview_Page.class);

	Invalid_Register_Page invalid_register_page_init=PageFactory.initElements(driver, Invalid_Register_Page.class);

	Reject_Register_Page reject_register_page_init=PageFactory.initElements(driver, Reject_Register_Page.class);

	Open_New_Account_Page open_new_account_page_init=PageFactory.initElements(driver, Open_New_Account_Page.class);

	Transfer_Funds_Page transfer_funds_page_init=PageFactory.initElements(driver, Transfer_Funds_Page.class);

	Bill_Payment_Service_Page bill_payment_service_page_init=PageFactory.initElements(driver, Bill_Payment_Service_Page.class);

	Update_Profile_Page update_profile_page_init=PageFactory.initElements(driver, Update_Profile_Page.class);

	Find_Transactions_Page find_transactions_page_init=PageFactory.initElements(driver, Find_Transactions_Page.class);

	Apply_for_a_Loan_Page apply_for_a_loan_page_init=PageFactory.initElements(driver, Apply_for_a_Loan_Page.class);

	Account_Services_Page account_services_page_init=PageFactory.initElements(driver, Account_Services_Page.class);

	Bill_Payment_Complete_Page bill_payment_complete_page_init=PageFactory.initElements(driver, Bill_Payment_Complete_Page.class);

	New_Account_Page new_account_page_init=PageFactory.initElements(driver, New_Account_Page.class);

	Account_Overviews_Page account_overviews_page_init=PageFactory.initElements(driver, Account_Overviews_Page.class);

	Profile_Updated_Page profile_updated_page_init=PageFactory.initElements(driver, Profile_Updated_Page.class);

	Loan_Request_Processed_Page loan_request_processed_page_init=PageFactory.initElements(driver, Loan_Request_Processed_Page.class);

	Account_Overviews_for_Loan_Page account_overviews_for_loan_page_init=PageFactory.initElements(driver, Account_Overviews_for_Loan_Page.class);

	Transaction_Result_Page transaction_result_page_init=PageFactory.initElements(driver, Transaction_Result_Page.class);

	Click_Transaction_Page click_transaction_page_init=PageFactory.initElements(driver, Click_Transaction_Page.class);

	Transaction_Details_Page transaction_details_page_init=PageFactory.initElements(driver, Transaction_Details_Page.class);

	Transaction_Error_Page transaction_error_page_init=PageFactory.initElements(driver, Transaction_Error_Page.class);

	Login_Page login_page_init=PageFactory.initElements(driver, Login_Page.class);

	launch_url_Page launch_url_page_init=PageFactory.initElements(driver, launch_url_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Forgot_Password", "TC_Forgot_Password", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform enter URL Action");

	testReport.fillTableStep("Step 1", "Perform enter URL Action");

	enter_url_page_init.enter_url(Step_1_url_FIELD);


	Reporter.log("Step - 2- verify Parabank Welcome screen");

	testReport.fillTableStep("Step 2", "verify Parabank Welcome screen");

	parabank_welcome_page_init.verify_Password_Status(Step_2_Password_TEXTBOX_Status);

	parabank_welcome_page_init.verify_Password(Step_2_Password_TEXTBOX_Verification);
	parabank_welcome_page_init.verify_Username_Status(Step_2_Username_TEXTBOX_Status);

	parabank_welcome_page_init.verify_Username(Step_2_Username_TEXTBOX_Verification);
	parabank_welcome_page_init.verify_LOG_IN_Status(Step_2_LOG_IN_BUTTON_Status);

	parabank_welcome_page_init.verify_Register_Status(Step_2_Register_HYPERLINK_Status);

	parabank_welcome_page_init.verify_Forgot_login_info__Status(Step_2_Forgot_login_info__HYPERLINK_Status);

	parabank_welcome_page_init.verify_Admin_Page_Status(Step_2_Admin_Page_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_2");

	Reporter.log("Step - 3- click Forgot login info  hyperlink Parabank Welcome screen Customer Login form");

	testReport.fillTableStep("Step 3", "click Forgot login info  hyperlink Parabank Welcome screen Customer Login form");

	parabank_welcome_page_init.click_Forgot_login_info_();
	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_3");

	Reporter.log("Step - 4- verify Forgot Login info screen");

	testReport.fillTableStep("Step 4", "verify Forgot Login info screen");

	forgot_login_info_page_init.verify_First_Name_Status(Step_4_First_Name_TEXTBOX_Status);

	forgot_login_info_page_init.verify_First_Name(Step_4_First_Name_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_Last_Name_Status(Step_4_Last_Name_TEXTBOX_Status);

	forgot_login_info_page_init.verify_Last_Name(Step_4_Last_Name_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_Address_Status(Step_4_Address_TEXTBOX_Status);

	forgot_login_info_page_init.verify_Address(Step_4_Address_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_City_Status(Step_4_City_TEXTBOX_Status);

	forgot_login_info_page_init.verify_City(Step_4_City_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_State_Status(Step_4_State_TEXTBOX_Status);

	forgot_login_info_page_init.verify_State(Step_4_State_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_Zip_Code_Status(Step_4_Zip_Code_TEXTBOX_Status);

	forgot_login_info_page_init.verify_Zip_Code(Step_4_Zip_Code_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_SSN_Status(Step_4_SSN_TEXTBOX_Status);

	forgot_login_info_page_init.verify_SSN(Step_4_SSN_TEXTBOX_Verification);
	forgot_login_info_page_init.verify_FIND_MY_LOGIN_INFO_Status(Step_4_FIND_MY_LOGIN_INFO_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_4");

	Reporter.log("Step - 5- Fill Forgot Login info form Forgot Login info screen");

	testReport.fillTableStep("Step 5", "Fill Forgot Login info form Forgot Login info screen");

	forgot_login_info_page_init.set_First_Name(Step_5_First_Name_TEXTBOX);
	forgot_login_info_page_init.set_Last_Name(Step_5_Last_Name_TEXTBOX);
	forgot_login_info_page_init.set_Address(Step_5_Address_TEXTBOX);
	forgot_login_info_page_init.set_City(Step_5_City_TEXTBOX);
	forgot_login_info_page_init.set_State(Step_5_State_TEXTBOX);
	forgot_login_info_page_init.set_Zip_Code(Step_5_Zip_Code_TEXTBOX);
	forgot_login_info_page_init.set_SSN(Step_5_SSN_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_5");

	Reporter.log("Step - 6- click FIND MY LOGIN INFO button Forgot Login info screen Forgot Login info form");

	testReport.fillTableStep("Step 6", "click FIND MY LOGIN INFO button Forgot Login info screen Forgot Login info form");

	forgot_login_info_page_init.click_FIND_MY_LOGIN_INFO();
	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_6");

	Reporter.log("Step - 7- Verify Transaction Error  Action");

	testReport.fillTableStep("Step 7", "Verify Transaction Error  Action");

	transaction_error__page_init.enter_Error(Step_7_Error_FIELD);


	Reporter.log("Step - 8- verify Account Services screen");

	testReport.fillTableStep("Step 8", "verify Account Services screen");

	account_services_page_init.verify_Open_New_Account_Status(Step_8_Open_New_Account_HYPERLINK_Status);

	account_services_page_init.verify_Account_Overview_Status(Step_8_Account_Overview_HYPERLINK_Status);

	account_services_page_init.verify_Transfer_Funds_Status(Step_8_Transfer_Funds_HYPERLINK_Status);

	account_services_page_init.verify_Bill_Pay_Status(Step_8_Bill_Pay_HYPERLINK_Status);

	account_services_page_init.verify_Find_Transactions_Status(Step_8_Find_Transactions_HYPERLINK_Status);

	account_services_page_init.verify_Update_Contact_Info_Status(Step_8_Update_Contact_Info_HYPERLINK_Status);

	account_services_page_init.verify_Request_Loan_Status(Step_8_Request_Loan_HYPERLINK_Status);

	account_services_page_init.verify_Log_Out_Status(Step_8_Log_Out_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Forgot_Password","Step_8");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_7");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Forgot_Password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
