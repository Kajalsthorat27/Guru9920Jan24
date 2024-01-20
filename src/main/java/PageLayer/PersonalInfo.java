package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class PersonalInfo extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="userName")
	private WebElement userName;
	
	
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

}
