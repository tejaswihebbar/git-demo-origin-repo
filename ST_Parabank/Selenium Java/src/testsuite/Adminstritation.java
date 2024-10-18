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
	Adminstritation
*/
public class Adminstritation extends PageObjectBase
{

	public Adminstritation()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_url_FIELD,final String Step_2_Password_TEXTBOX_Status,final String Step_2_Password_TEXTBOX_Verification,final String Step_2_Username_TEXTBOX_Status,final String Step_2_Username_TEXTBOX_Verification,final String Step_2_LOG_IN_BUTTON_Status,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Forgot_login_info__HYPERLINK_Status,final String Step_2_Admin_Page_HYPERLINK_Status,final String Step_4_Loan_Provider_DROPDOWN_Status,final String Step_4_Loan_Provider_DROPDOWN_Verification,final String Step_4_Loan_Processor_DROPDOWN_Status,final String Step_4_Loan_Processor_DROPDOWN_Verification,final String Step_4_Threshold_TEXTBOX_Status,final String Step_4_Threshold_TEXTBOX_Verification,final String Step_4_Initial_Balance_TEXTBOX_Status,final String Step_4_Initial_Balance_TEXTBOX_Verification,final String Step_4_Min_Balance_TEXTBOX_Status,final String Step_4_Min_Balance_TEXTBOX_Verification,final String Step_4_SUBMIT_BUTTON_Status,final String Step_5_Loan_Provider_DROPDOWN,final String Step_5_Loan_Processor_DROPDOWN,final String Step_5_Threshold_TEXTBOX,final String Step_5_Initial_Balance_TEXTBOX,final String Step_5_Min_Balance_TEXTBOX,final String Step_7_Error_FIELD) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Adminstritation", "TC_Adminstritation", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Adminstritation","Step_2");

	Reporter.log("Step - 3- click Admin Page hyperlink Parabank Welcome screen");

	testReport.fillTableStep("Step 3", "click Admin Page hyperlink Parabank Welcome screen");

	parabank_welcome_page_init.click_Admin_Page();
	getScreenshot(driver,Configurations.screenshotLocation , "Adminstritation","Step_3");

	Reporter.log("Step - 4- verify Administration screen");

	testReport.fillTableStep("Step 4", "verify Administration screen");

	administration_page_init.verify_Loan_Provider_Status(Step_4_Loan_Provider_DROPDOWN_Status);

	administration_page_init.verify_Loan_Provider(Step_4_Loan_Provider_DROPDOWN_Verification);
	administration_page_init.verify_Loan_Processor_Status(Step_4_Loan_Processor_DROPDOWN_Status);

	administration_page_init.verify_Loan_Processor(Step_4_Loan_Processor_DROPDOWN_Verification);
	administration_page_init.verify_Threshold_Status(Step_4_Threshold_TEXTBOX_Status);

	administration_page_init.verify_Threshold(Step_4_Threshold_TEXTBOX_Verification);
	administration_page_init.verify_Initial_Balance_Status(Step_4_Initial_Balance_TEXTBOX_Status);

	administration_page_init.verify_Initial_Balance(Step_4_Initial_Balance_TEXTBOX_Verification);
	administration_page_init.verify_Min_Balance_Status(Step_4_Min_Balance_TEXTBOX_Status);

	administration_page_init.verify_Min_Balance(Step_4_Min_Balance_TEXTBOX_Verification);
	administration_page_init.verify_SUBMIT_Status(Step_4_SUBMIT_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Adminstritation","Step_4");

	Reporter.log("Step - 5- Fill Application Setting form Administration screen");

	testReport.fillTableStep("Step 5", "Fill Application Setting form Administration screen");

	administration_page_init.select_Loan_Provider(Step_5_Loan_Provider_DROPDOWN);
	administration_page_init.select_Loan_Processor(Step_5_Loan_Processor_DROPDOWN);
	administration_page_init.set_Threshold(Step_5_Threshold_TEXTBOX);
	administration_page_init.set_Initial_Balance(Step_5_Initial_Balance_TEXTBOX);
	administration_page_init.set_Min_Balance(Step_5_Min_Balance_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Adminstritation","Step_5");

	Reporter.log("Step - 6- click SUBMIT button Administration screen");

	testReport.fillTableStep("Step 6", "click SUBMIT button Administration screen");

	administration_page_init.click_SUBMIT();
	getScreenshot(driver,Configurations.screenshotLocation , "Adminstritation","Step_6");

	Reporter.log("Step - 7- Verify Transaction Error  Action");

	testReport.fillTableStep("Step 7", "Verify Transaction Error  Action");

	transaction_error__page_init.enter_Error(Step_7_Error_FIELD);

	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_2");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Adminstritation");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
