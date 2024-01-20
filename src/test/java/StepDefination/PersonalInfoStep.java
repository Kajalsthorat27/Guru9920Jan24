package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PersonalInfo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PersonalInfoStep extends BaseClass{
	
protected static PersonalInfo personalinfo ;
	
	@Given("User is on guru {int} page")
	public void user_is_on_guru_page(Integer int1) {
		BaseClass.intilazation();
	}
	@When("User Enter FirstName, LastName , Phone and Email")
	public void user_enter_first_name_last_name_phone_and_email() {
		personalinfo = new PersonalInfo();
		personalinfo.PersonalInfoFunctionality("Kajal", "Thorat", "987654356", "Kajal@gmail.com");
		
	}
	
	@When("User enter Address ,city ,state, zip code")
	public void user_enter_address_city_state_zip_code() {
	   
		personalinfo.mailinginformation("F.S.road", "Mumbai", "MH", "400056");
	}
	@When("click on country dropdown")
	public void click_on_country_dropdown() {
		personalinfo.Countrydropdown("INDIA");
	}
}
