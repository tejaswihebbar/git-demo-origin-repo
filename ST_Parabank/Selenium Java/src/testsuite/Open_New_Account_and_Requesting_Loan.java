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
	Open_New_Account_and_Requesting_Loan
*/
public class Open_New_Account_and_Requesting_Loan extends PageObjectBase
{

	public Open_New_Account_and_Requesting_Loan()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_url_FIELD,final String Step_2_Password_TEXTBOX_Status,final String Step_2_Password_TEXTBOX_Verification,final String Step_2_Username_TEXTBOX_Status,final String Step_2_Username_TEXTBOX_Verification,final String Step_2_LOG_IN_BUTTON_Status,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Forgot_login_info__HYPERLINK_Status,final String Step_2_Admin_Page_HYPERLINK_Status,final String Step_3_Password_TEXTBOX,final String Step_3_Username_TEXTBOX,final String Step_5_Open_New_Account_HYPERLINK_Status,final String Step_5_Account_Overview_HYPERLINK_Status,final String Step_5_Transfer_Funds_HYPERLINK_Status,final String Step_5_Bill_Pay_HYPERLINK_Status,final String Step_5_Find_Transactions_HYPERLINK_Status,final String Step_5_Update_Contact_Info_HYPERLINK_Status,final String Step_5_Request_Loan_HYPERLINK_Status,final String Step_5_Log_Out_HYPERLINK_Status,final String Step_6_Account_FIELD,final String Step_6_Balance_FIELD,final String Step_6_Available_Amount_FIELD,final String Step_8_Account_Type_DROPDOWN_Status,final String Step_8_Account_Type_DROPDOWN_Verification,final String Step_8_Existing_Account_DROPDOWN_Status,final String Step_8_Existing_Account_DROPDOWN_Verification,final String Step_8_Open_New_Account_BUTTON_Status,final String Step_8_Account_Overview_HYPERLINK_Status,final String Step_8_Request_Loan_HYPERLINK_Status,final String Step_9_Account_Type_DROPDOWN,final String Step_9_Existing_Account_DROPDOWN,final String Step_11_message_FIELD,final String Step_11_Account_Number_FIELD,final String Step_13_Account1_FIELD,final String Step_13_Balance_of_Account1_FIELD,final String Step_13_Available_Amount_of_Account_1_FIELD,final String Step_13_Account2_FIELD,final String Step_13_Balance_Account2_FIELD,final String Step_13_Avilable_Amount_of_Account2_FIELD,final String Step_13_Total_Amount_FIELD,final String Step_15_Loan_Amount_TEXTBOX_Status,final String Step_15_Loan_Amount_TEXTBOX_Verification,final String Step_15_Down_Payment_TEXTBOX_Status,final String Step_15_Down_Payment_TEXTBOX_Verification,final String Step_15_From_Account_DROPDOWN_Status,final String Step_15_From_Account_DROPDOWN_Verification,final String Step_15_Apply_Now_BUTTON_Status,final String Step_15_Account_Overview_HYPERLINK_Status,final String Step_16_Loan_Amount_TEXTBOX,final String Step_16_Down_Payment_TEXTBOX,final String Step_16_From_Account_DROPDOWN,final String Step_18_Loan_Provider_FIELD,final String Step_18_Date_FIELD,final String Step_18_Status_FIELD,final String Step_18_message_FIELD,final String Step_18_Account_Number_FIELD,final String Step_20_Account1_FIELD,final String Step_20_Balance_of_Account1_FIELD,final String Step_20_Available_Amount_of_Account_1_FIELD,final String Step_20_Account2_FIELD,final String Step_20_Balance_Account2_FIELD,final String Step_20_Avilable_Amount_of_Account2_FIELD,final String Step_20_Total_Amount_FIELD) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Open_New_Account_and_Requesting_Loan", "TC_Open_New_Account_and_Requesting_Loan", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_2");

	Reporter.log("Step - 3- Fill Customer Login form Parabank Welcome screen");

	testReport.fillTableStep("Step 3", "Fill Customer Login form Parabank Welcome screen");

	parabank_welcome_page_init.set_Password(Step_3_Password_TEXTBOX);
	parabank_welcome_page_init.set_Username(Step_3_Username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_3");

	Reporter.log("Step - 4- click LOG IN button Parabank Welcome screen Customer Login form");

	testReport.fillTableStep("Step 4", "click LOG IN button Parabank Welcome screen Customer Login form");

	parabank_welcome_page_init.click_LOG_IN();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_4");

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

	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_5");

	Reporter.log("Step - 6- Verify Accounts Overview Action");

	testReport.fillTableStep("Step 6", "Verify Accounts Overview Action");

	accounts_overview_page_init.enter_Account(Step_6_Account_FIELD);

	accounts_overview_page_init.enter_Balance(Step_6_Balance_FIELD);

	accounts_overview_page_init.enter_Available_Amount(Step_6_Available_Amount_FIELD);


	Reporter.log("Step - 7- click Open New Account hyperlink Account Services screen");

	testReport.fillTableStep("Step 7", "click Open New Account hyperlink Account Services screen");

	account_services_page_init.click_Open_New_Account();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_7");

	Reporter.log("Step - 8- verify Open New Account screen");

	testReport.fillTableStep("Step 8", "verify Open New Account screen");

	open_new_account_page_init.verify_Account_Type_Status(Step_8_Account_Type_DROPDOWN_Status);

	open_new_account_page_init.verify_Account_Type(Step_8_Account_Type_DROPDOWN_Verification);
	open_new_account_page_init.verify_Existing_Account_Status(Step_8_Existing_Account_DROPDOWN_Status);

	open_new_account_page_init.verify_Existing_Account(Step_8_Existing_Account_DROPDOWN_Verification);
	open_new_account_page_init.verify_Open_New_Account_Status(Step_8_Open_New_Account_BUTTON_Status);

	open_new_account_page_init.verify_Account_Overview_Status(Step_8_Account_Overview_HYPERLINK_Status);

	open_new_account_page_init.verify_Request_Loan_Status(Step_8_Request_Loan_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_8");

	Reporter.log("Step - 9- Fill New Account form Open New Account screen");

	testReport.fillTableStep("Step 9", "Fill New Account form Open New Account screen");

	open_new_account_page_init.select_Account_Type(Step_9_Account_Type_DROPDOWN);
	open_new_account_page_init.select_Existing_Account(Step_9_Existing_Account_DROPDOWN);
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_9");

	Reporter.log("Step - 10- click Open New Account button Open New Account screen");

	testReport.fillTableStep("Step 10", "click Open New Account button Open New Account screen");

	open_new_account_page_init.click_Open_New_Account();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_10");

	Reporter.log("Step - 11- Verify New Account Action");

	testReport.fillTableStep("Step 11", "Verify New Account Action");

	new_account_page_init.enter_message(Step_11_message_FIELD);

	new_account_page_init.enter_Account_Number(Step_11_Account_Number_FIELD);


	Reporter.log("Step - 12- click Account Overview hyperlink Open New Account screen");

	testReport.fillTableStep("Step 12", "click Account Overview hyperlink Open New Account screen");

	open_new_account_page_init.click_Account_Overview();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_12");

	Reporter.log("Step - 13- Verify Account Overviews Action");

	testReport.fillTableStep("Step 13", "Verify Account Overviews Action");

	account_overviews_page_init.enter_Account1(Step_13_Account1_FIELD);

	account_overviews_page_init.enter_Balance_of_Account1(Step_13_Balance_of_Account1_FIELD);

	account_overviews_page_init.enter_Available_Amount_of_Account_1(Step_13_Available_Amount_of_Account_1_FIELD);

	account_overviews_page_init.enter_Account2(Step_13_Account2_FIELD);

	account_overviews_page_init.enter_Balance_Account2(Step_13_Balance_Account2_FIELD);

	account_overviews_page_init.enter_Avilable_Amount_of_Account2(Step_13_Avilable_Amount_of_Account2_FIELD);

	account_overviews_page_init.enter_Total_Amount(Step_13_Total_Amount_FIELD);


	Reporter.log("Step - 14- click Request Loan hyperlink Account Services screen");

	testReport.fillTableStep("Step 14", "click Request Loan hyperlink Account Services screen");

	account_services_page_init.click_Request_Loan();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_14");

	Reporter.log("Step - 15- verify Apply for a Loan screen");

	testReport.fillTableStep("Step 15", "verify Apply for a Loan screen");

	apply_for_a_loan_page_init.verify_Loan_Amount_Status(Step_15_Loan_Amount_TEXTBOX_Status);

	apply_for_a_loan_page_init.verify_Loan_Amount(Step_15_Loan_Amount_TEXTBOX_Verification);
	apply_for_a_loan_page_init.verify_Down_Payment_Status(Step_15_Down_Payment_TEXTBOX_Status);

	apply_for_a_loan_page_init.verify_Down_Payment(Step_15_Down_Payment_TEXTBOX_Verification);
	apply_for_a_loan_page_init.verify_From_Account_Status(Step_15_From_Account_DROPDOWN_Status);

	apply_for_a_loan_page_init.verify_From_Account(Step_15_From_Account_DROPDOWN_Verification);
	apply_for_a_loan_page_init.verify_Apply_Now_Status(Step_15_Apply_Now_BUTTON_Status);

	apply_for_a_loan_page_init.verify_Account_Overview_Status(Step_15_Account_Overview_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_15");

	Reporter.log("Step - 16- Fill Loan form Apply for a Loan screen");

	testReport.fillTableStep("Step 16", "Fill Loan form Apply for a Loan screen");

	apply_for_a_loan_page_init.set_Loan_Amount(Step_16_Loan_Amount_TEXTBOX);
	apply_for_a_loan_page_init.set_Down_Payment(Step_16_Down_Payment_TEXTBOX);
	apply_for_a_loan_page_init.select_From_Account(Step_16_From_Account_DROPDOWN);
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_16");

	Reporter.log("Step - 17- click Apply Now button Apply for a Loan screen");

	testReport.fillTableStep("Step 17", "click Apply Now button Apply for a Loan screen");

	apply_for_a_loan_page_init.click_Apply_Now();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_17");

	Reporter.log("Step - 18- Verify Loan Request Processed Action");

	testReport.fillTableStep("Step 18", "Verify Loan Request Processed Action");

	loan_request_processed_page_init.enter_Loan_Provider(Step_18_Loan_Provider_FIELD);

	loan_request_processed_page_init.enter_Date(Step_18_Date_FIELD);

	loan_request_processed_page_init.enter_Status(Step_18_Status_FIELD);

	loan_request_processed_page_init.enter_message(Step_18_message_FIELD);

	loan_request_processed_page_init.enter_Account_Number(Step_18_Account_Number_FIELD);


	Reporter.log("Step - 19- click Account Overview hyperlink Apply for a Loan screen");

	testReport.fillTableStep("Step 19", "click Account Overview hyperlink Apply for a Loan screen");

	apply_for_a_loan_page_init.click_Account_Overview();
	getScreenshot(driver,Configurations.screenshotLocation , "Open_New_Account_and_Requesting_Loan","Step_19");

	Reporter.log("Step - 20- Verify Account Overviews for Loan Action");

	testReport.fillTableStep("Step 20", "Verify Account Overviews for Loan Action");

	account_overviews_for_loan_page_init.enter_Account1(Step_20_Account1_FIELD);

	account_overviews_for_loan_page_init.enter_Balance_of_Account1(Step_20_Balance_of_Account1_FIELD);

	account_overviews_for_loan_page_init.enter_Available_Amount_of_Account_1(Step_20_Available_Amount_of_Account_1_FIELD);

	account_overviews_for_loan_page_init.enter_Account2(Step_20_Account2_FIELD);

	account_overviews_for_loan_page_init.enter_Balance_Account2(Step_20_Balance_Account2_FIELD);

	account_overviews_for_loan_page_init.enter_Avilable_Amount_of_Account2(Step_20_Avilable_Amount_of_Account2_FIELD);

	account_overviews_for_loan_page_init.enter_Total_Amount(Step_20_Total_Amount_FIELD);

	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_24");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Open_New_Account_and_Requesting_Loan");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
