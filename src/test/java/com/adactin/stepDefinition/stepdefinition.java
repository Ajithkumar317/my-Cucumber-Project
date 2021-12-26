package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.PageObjectManager;
import com.adactin.runnerClass.Runner;

import io.cucumber.java.en.*;

public class stepdefinition extends BaseClass {
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom =new PageObjectManager(driver);

	//	LoginPage lp=new LoginPage(driver);
	//	SearchHotel sh=new SearchHotel(driver);
	//	BookItenary bi=new BookItenary(driver);
	//	PasswordChange pc =new PasswordChange(driver);
	//	Logout_Page lg =new Logout_Page(driver);
	
	@Given("User enters the URL")
	public void user_enters_the_url() throws Throwable {
		//		geturl("https://adactinhotelapp.com/");
		String geturl = File_Reader_Manager.getinstance().getinstanceCR().geturl();
		geturl(geturl);
	}
	@When("^user enters the  Valid Username$")
	public void user_enters_the_Valid_Username() throws Throwable {
		sendkeys(pom.getinstacelogin().getUname(), "ajith666");
	}

	@When("^user enters the  Valid Password$")
	public void user_enters_the_Valid_Password() throws Throwable {
		sendkeys(pom.getinstacelogin().getPword(), "@jithkumar1998J");
	}
//	@When("user enters the {string} Valid Username")
//	public void user_enters_the_valid_username(String username) {
//		sendkeys(pom.getinstacelogin().getUname(), username);
//	}
//	@When("user enters the {string} Valid Password")
//	public void user_enters_the_valid_password(String pword) {
//		sendkeys(pom.getinstacelogin().getPword(), pword);
//	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		//		clickelement(lp.getLoginbutton());
		clickelement(pom.getinstacelogin().getLoginbutton());
	}
	@Then("User Succesfully login to the Home page")
	public void user_succesfully_login_to_the_home_page() {
		System.out.println(" User Successfully Login to Home Page ");
	}
	@When("user Selects the location")
	public void user_selects_the_location() {
		//		sendkeys(sh.getLocation(), "London");
		sendkeys(pom.getinstancesearchhotel().getLocation(), "London");
	}
	@When("User Selects the Hotels")
	public void user_selects_the_hotels() {
		//		sendkeys(sh.getHotels(), "Hotel Sunshine");
		sendkeys(pom.getinstancesearchhotel().getHotels(), "Hotel Sunshine");
	}
	@When("User Selects Room type")
	public void user_selects_room_type() {
		//		dropDown(sh.getRoom_type(),"Deluxe");
		sendkeys(pom.getinstancesearchhotel().getRoom_type(), "Deluxe");
	}
	@When("User Selects Number of Rooms")
	public void user_selects_number_of_rooms() {
		//		sendkeys(sh.getRoom_no(), "2");
		sendkeys(pom.getinstancesearchhotel().getRoom_no(), "1");
	}
	@When("User Selects  the Checkin Date")
	public void user_selects_the_checkin_date() {
		//		sendkeys(sh.getCheck_in(), "07/12/2021");
		sendkeys(pom.getinstancesearchhotel().getCheck_in(), "07/12/2021");
	}
	@When("user Selects the Check out Date")
	public void user_selects_the_check_out_date() {
		//		sendkeys(sh.getCheck_out(), "09/12/2021");
		sendkeys(pom.getinstancesearchhotel().getCheck_out(), "09/12/2021");
	}
	@When("User selects the Adults per room")
	public void user_selects_the_adults_per_room() {
		//		sendkeys(sh.getNo_of_adults(), "1");
		sendkeys(pom.getinstancesearchhotel().getNo_of_adults(), "1");
	}
	@When("user selects the Children per room")
	public void user_selects_the_children_per_room() {
		//		sendkeys(sh.getNo_of_child(),"2");
		sendkeys(pom.getinstancesearchhotel().getNo_of_child(), "2");
	}
	@Then("User click on the Search Button")
	public void user_click_on_the_search_button() {
		//		clickelement(sh.getSearch());
		clickelement(pom.getinstancesearchhotel().getSearch());
	}
	@When("User selects the select Rado Button")
	public void user_selects_the_select_rado_button() {
		//		clickelement(bi.getSelect());
		waitClass();
		clickelement(pom.getinstancebookitenary().getSelect());
	}
	@When("User click on the continue button")
	public void user_click_on_the_continue_button() {
		//		clickelement(bi.getContinuebutton());
		clickelement(pom.getinstancebookitenary().getContinuebutton());
	}
	@When("user enters the First Name")
	public void user_enters_the_first_name() {
		//		sendkeys(bi.getFirst_name(), " Ajith ");
		sendkeys(pom.getinstancebookitenary().getFirst_name(), "Ajith");
	}
	@When("User enters the Lasr Name")
	public void user_enters_the_lasr_name() {
		//		sendkeys(bi.getLast_name(), " Kumar ");
		sendkeys(pom.getinstancebookitenary().getLast_name(), "Kumar");
	}
	@When("User enters the Billing Address")
	public void user_enters_the_billing_address() {
		//		sendkeys(bi.getAddress(), "70/37,GKM Colony, CHN-82 ");
		sendkeys(pom.getinstancebookitenary().getAddress(), "70/37,GKM Colony, CHN-82 ");
	}
	@When("User enters the Credit Card number")
	public void user_enters_the_credit_card_number() throws Throwable {
		//		sendkeys(bi.getCardnumber(), " 1234567899874563 ");
		//		sendkeys(pom.getinstancebookitenary().getCardnumber(), "1234567899874563");
		String getcardnumber = File_Reader_Manager.getinstance().getinstanceCR().getcardnumber();
		sendkeys(pom.getinstancebookitenary().getCardnumber(), getcardnumber);

	}
	@When("User selects the Credit card type")
	public void user_selects_the_credit_card_type() {
		//		sendkeys(bi.getCardtype(), " master card");
		sendkeys(pom.getinstancebookitenary().getCardtype(), "master card");
	}
	@When("User Selects the Expmonth")
	public void user_selects_the_expmonth() {
		//		sendkeys(bi.getExpmonth(), " December ");
		sendkeys(pom.getinstancebookitenary().getExpmonth(), "December");
	}
	@When("USer Selects the EXPYear")
	public void u_ser_selects_the_exp_year() {
		//		dropDown(bi.getExpyear(), "2021");
		sendkeys(pom.getinstancebookitenary().getExpyear(), "2021");

	}
	@When("User Enters the CVV Number")
	public void user_enters_the_cvv_number() throws Throwable {
		//		sendkeys(bi.getCvvNumber(), "371");
		//		sendkeys(pom.getinstancebookitenary().getCvvNumber(), "371");
		String getcvv = File_Reader_Manager.getinstance().getinstanceCR().getcvv();
		sendkeys(pom.getinstancebookitenary().getCvvNumber(), getcvv);
	}
	@Then("User click on the Booknow Button")
	public void user_click_on_the_booknow_button() {
		//		clickelement(bi.getBooknow());
		clickelement(pom.getinstancebookitenary().getBooknow());

	}
	@Then("User clickon the Book My itenaryButton")
	public void user_clickon_the_book_my_itenary_button() {
		//		waitforvisibilityofelment(bi.getMy_itinerary());
		//		clickelement(bi.getMy_itinerary());
		waitforvisibilityofelment(pom.getinstancebookitenary().getMy_itinerary());
		clickelement(pom.getinstancebookitenary().getMy_itinerary());
	}
	@When("User Clickson the Password Change Button")
	public void user_clickson_the_password_change_button() {
		//		clickelement(pc.getChangePassword());
		clickelement(pom.getinstancepasswordchange().getChangePassword());
	}
	@When("User enters the Current Password")
	public void user_enters_the_current_password() {
		//		sendkeys(pc.getCurrentPword(), "@jith1998L");
		sendkeys(pom.getinstancepasswordchange().getCurrentPword(), "@jith1998L");
	}
	@When("User enters the New Password")
	public void user_enters_the_new_password() {
		//		sendkeys(pc.getNewpword(), "@jith1998J");
		sendkeys(pom.getinstancepasswordchange().getNewpword(), "@jith1998J");
	}
	@When("User re-enters the New Password")
	public void user_re_enters_the_new_password() {
		//		sendkeys(pc.getConfirmPword(), "@jith1998J");
		sendkeys(pom.getinstancepasswordchange().getConfirmPword(), "@jith1998J");
	}
	@Then("User clicks on the Submit Button")
	public void user_clicks_on_the_submit_button() {
		//		clickelement(pc.getSubmit());
		clickelement(pom.getinstancepasswordchange().getSubmit());
	}
	@When("User Click On the Logout Button")
	public void user_click_on_the_logout_button() {
		//		clickelement(lg.getLogoutButton());
		clickelement(pom.getintancelogoutpage().getLogoutButton());
	}
	@Then("User verifies that Succesfully Logout from the Application")
	public void user_verifies_that_succesfully_logout_from_the_application() {
		//		gettext(lg.getVerification());
		gettext(pom.getintancelogoutpage().getVerification());
		close();
	}

	}












