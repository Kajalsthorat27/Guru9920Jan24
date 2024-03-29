package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PersonalInfo extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="userName")
	private WebElement userName;
	
	@FindBy(name="address1")
	private WebElement add1;
	
	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="postalCode")
	private WebElement zipcode;
	
	@FindBy(name="country")
	private WebElement count;
	
	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="password")
	private WebElement pass;

	@FindBy(name="confirmPassword")
	private WebElement confpass;

    @FindBy(name="submit")
	private WebElement submit;
    
    @FindBy(xpath="//a[text()=' sign-in ']")
    private WebElement signin;
    
    

	
	
	
	public PersonalInfo()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PersonalInfoFunctionality(String FirstName , String LastName , String MObNo, String UserName)
	{
		Wait.sendKeys(firstName, FirstName);
		Wait.sendKeys(lastName, LastName);
		Wait.sendKeys(phone, MObNo);
		Wait.sendKeys(userName, UserName);
		
	}
      public void mailinginformation(String Add1,String city,String state,String ZipCode)
      {
    	 Wait.sendKeys(add1, Add1);
    	 Wait.sendKeys(City, city);
    	 Wait.sendKeys(State, state);
    	 Wait.sendKeys(zipcode, ZipCode);
    	 
    	  
      }
      public void Countrydropdown(String country)
      {
    	Wait.countrydropdown(count, country);
    	  
     }
      
      public void userInfor(String Email){
    Wait.sendKeys(email, Email);
    
    	    
      }
      public void validatePass(String password, String ConfPass ){
    	  Wait.sendKeys(pass, password);
    	  Wait.sendKeys(confpass, ConfPass);
    	  Wait.click(submit);
    	  
      }
      public void signIn () {
    	  Wait.click(signin);
    	  
      }
      
      public void getURL() {
    	  String url=driver.getCurrentUrl();
    	  System.out.println(url);
      }

}
