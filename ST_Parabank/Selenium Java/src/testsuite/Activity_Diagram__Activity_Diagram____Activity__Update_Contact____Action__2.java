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
	Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2
*/
public class Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2 extends PageObjectBase
{

	public Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_url_FIELD,final String Step_2_Password_TEXTBOX_Status,final String Step_2_Password_TEXTBOX_Verification,final String Step_2_Username_TEXTBOX_Status,final String Step_2_Username_TEXTBOX_Verification,final String Step_2_LOG_IN_BUTTON_Status,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Forgot_login_info__HYPERLINK_Status,final String Step_2_Admin_Page_HYPERLINK_Status,final String Step_3_Password_TEXTBOX,final String Step_3_Username_TEXTBOX,final String Step_5_Open_New_Account_HYPERLINK_Status,final String Step_5_Account_Overview_HYPERLINK_Status,final String Step_5_Transfer_Funds_HYPERLINK_Status,final String Step_5_Bill_Pay_HYPERLINK_Status,final String Step_5_Find_Transactions_HYPERLINK_Status,final String Step_5_Update_Contact_Info_HYPERLINK_Status,final String Step_5_Request_Loan_HYPERLINK_Status,final String Step_5_Log_Out_HYPERLINK_Status,final String Step_6_Account_FIELD,final String Step_6_Balance_FIELD,final String Step_6_Available_Amount_FIELD,final String Step_8_First_Name_TEXTBOX_Status,final String Step_8_First_Name_TEXTBOX_Verification,final String Step_8_Last_Name_TEXTBOX_Status,final String Step_8_Last_Name_TEXTBOX_Verification,final String Step_8_Address_TEXTBOX_Status,final String Step_8_Address_TEXTBOX_Verification,final String Step_8_City_TEXTBOX_Status,final String Step_8_City_TEXTBOX_Verification,final String Step_8_State_TEXTBOX_Status,final String Step_8_State_TEXTBOX_Verification,final String Step_8_Zip_Code_TEXTBOX_Status,final String Step_8_Zip_Code_TEXTBOX_Verification,final String Step_8_Phone_TEXTBOX_Status,final String Step_8_Phone_TEXTBOX_Verification,final String Step_8_UPDATE_PROFILE_BUTTON_Status,final String Step_9_First_Name_TEXTBOX,final String Step_9_Last_Name_TEXTBOX,final String Step_9_Address_TEXTBOX,final String Step_9_City_TEXTBOX,final String Step_9_State_TEXTBOX,final String Step_9_Zip_Code_TEXTBOX,final String Step_9_Phone_TEXTBOX,final String Step_11_message_FIELD,final String Step_13_Password_TEXTBOX_Status,final String Step_13_Password_TEXTBOX_Verification,final String Step_13_Username_TEXTBOX_Status,final String Step_13_Username_TEXTBOX_Verification,final String Step_13_LOG_IN_BUTTON_Status,final String Step_13_Register_HYPERLINK_Status,final String Step_13_Forgot_login_info__HYPERLINK_Status,final String Step_13_Admin_Page_HYPERLINK_Status) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2", "TC_Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_2");

	Reporter.log("Step - 3- Fill Customer Login form Parabank Welcome screen");

	testReport.fillTableStep("Step 3", "Fill Customer Login form Parabank Welcome screen");

	parabank_welcome_page_init.set_Password(Step_3_Password_TEXTBOX);
	parabank_welcome_page_init.set_Username(Step_3_Username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_3");

	Reporter.log("Step - 4- click LOG IN button Parabank Welcome screen Customer Login form");

	testReport.fillTableStep("Step 4", "click LOG IN button Parabank Welcome screen Customer Login form");

	parabank_welcome_page_init.click_LOG_IN();
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_4");

	Reporter.log("Step - 5- verify Account Services screen");

	testReport.fillTableStep("Step 5", "verify Account Services screen");

	account_services_page_init.verify_Open_New_Account_Status(Step_5_Open_New_Account_HYPERLINK_Status);

	account_services_page_init.verify_Account_Overview_Status(Step_5_Account_Overview_HYPERLINK_Status);

	account_services_page_init.verify_Transfer_Funds_Status(Step_5_Transfer_Funds_HYPERLINK_Status);

	account_services_page_init.verify_Bill_Pay_Status(Step_5_Bill_Pay_HYPERLINK_Status);

	account_services_page_init.verify_Find_Transactions_Status(Step_5_Find_Transactions_HYPERLINK_Status);

	account_services_page_init.verify_Update_Contact_Info_Status(Step_5_Update_Contact_Info_HYPERLINK_Status);

	account_services_page_init.verify_Request_Loan_Status(Step_5_Request_Loan_HYPERLINK_Status);

	account_services_page_init.verify_Log_Out_Status(Step_5_Log_Out_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_5");

	Reporter.log("Step - 6- Verify Accounts Overview Action");

	testReport.fillTableStep("Step 6", "Verify Accounts Overview Action");

	accounts_overview_page_init.enter_Account(Step_6_Account_FIELD);

	accounts_overview_page_init.enter_Balance(Step_6_Balance_FIELD);

	accounts_overview_page_init.enter_Available_Amount(Step_6_Available_Amount_FIELD);


	Reporter.log("Step - 7- click Update Contact Info hyperlink Account Services screen");

	testReport.fillTableStep("Step 7", "click Update Contact Info hyperlink Account Services screen");

	account_services_page_init.click_Update_Contact_Info();
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_7");

	Reporter.log("Step - 8- verify Update Profile screen");

	testReport.fillTableStep("Step 8", "verify Update Profile screen");

	update_profile_page_init.verify_First_Name_Status(Step_8_First_Name_TEXTBOX_Status);

	update_profile_page_init.verify_First_Name(Step_8_First_Name_TEXTBOX_Verification);
	update_profile_page_init.verify_Last_Name_Status(Step_8_Last_Name_TEXTBOX_Status);

	update_profile_page_init.verify_Last_Name(Step_8_Last_Name_TEXTBOX_Verification);
	update_profile_page_init.verify_Address_Status(Step_8_Address_TEXTBOX_Status);

	update_profile_page_init.verify_Address(Step_8_Address_TEXTBOX_Verification);
	update_profile_page_init.verify_City_Status(Step_8_City_TEXTBOX_Status);

	update_profile_page_init.verify_City(Step_8_City_TEXTBOX_Verification);
	update_profile_page_init.verify_State_Status(Step_8_State_TEXTBOX_Status);

	update_profile_page_init.verify_State(Step_8_State_TEXTBOX_Verification);
	update_profile_page_init.verify_Zip_Code_Status(Step_8_Zip_Code_TEXTBOX_Status);

	update_profile_page_init.verify_Zip_Code(Step_8_Zip_Code_TEXTBOX_Verification);
	update_profile_page_init.verify_Phone_Status(Step_8_Phone_TEXTBOX_Status);

	update_profile_page_init.verify_Phone(Step_8_Phone_TEXTBOX_Verification);
	update_profile_page_init.verify_UPDATE_PROFILE_Status(Step_8_UPDATE_PROFILE_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_8");

	Reporter.log("Step - 9- Fill Profile form Update Profile screen");

	testReport.fillTableStep("Step 9", "Fill Profile form Update Profile screen");

	update_profile_page_init.set_First_Name(Step_9_First_Name_TEXTBOX);
	update_profile_page_init.set_Last_Name(Step_9_Last_Name_TEXTBOX);
	update_profile_page_init.set_Address(Step_9_Address_TEXTBOX);
	update_profile_page_init.set_City(Step_9_City_TEXTBOX);
	update_profile_page_init.set_State(Step_9_State_TEXTBOX);
	update_profile_page_init.set_Zip_Code(Step_9_Zip_Code_TEXTBOX);
	update_profile_page_init.set_Phone(Step_9_Phone_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_9");

	Reporter.log("Step - 10- click UPDATE PROFILE button Update Profile screen");

	testReport.fillTableStep("Step 10", "click UPDATE PROFILE button Update Profile screen");

	update_profile_page_init.click_UPDATE_PROFILE();
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_10");

	Reporter.log("Step - 11- Verify Profile Updated Action");

	testReport.fillTableStep("Step 11", "Verify Profile Updated Action");

	profile_updated_page_init.enter_message(Step_11_message_FIELD);


	Reporter.log("Step - 12- click Log Out hyperlink Account Services screen");

	testReport.fillTableStep("Step 12", "click Log Out hyperlink Account Services screen");

	account_services_page_init.click_Log_Out();
	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_12");

	Reporter.log("Step - 13- verify Parabank Welcome screen");

	testReport.fillTableStep("Step 13", "verify Parabank Welcome screen");

	parabank_welcome_page_init.verify_Password_Status(Step_13_Password_TEXTBOX_Status);

	parabank_welcome_page_init.verify_Password(Step_13_Password_TEXTBOX_Verification);
	parabank_welcome_page_init.verify_Username_Status(Step_13_Username_TEXTBOX_Status);

	parabank_welcome_page_init.verify_Username(Step_13_Username_TEXTBOX_Verification);
	parabank_welcome_page_init.verify_LOG_IN_Status(Step_13_LOG_IN_BUTTON_Status);

	parabank_welcome_page_init.verify_Register_Status(Step_13_Register_HYPERLINK_Status);

	parabank_welcome_page_init.verify_Forgot_login_info__Status(Step_13_Forgot_login_info__HYPERLINK_Status);

	parabank_welcome_page_init.verify_Admin_Page_Status(Step_13_Admin_Page_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2","Step_13");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_18");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Activity_Diagram__Activity_Diagram____Activity__Update_Contact____Action__2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
