package org.demositeqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaPojo extends LibGlobal {
	
	//1. Non parameterized Constructor
	public DemoQaPojo() {
			PageFactory.initElements(driver, this);
			}
	
	//2. Private Webelement
	//submit button
	@FindBy(xpath="//button[@id='submit']")
	private WebElement btnSubmit;
	
	//first name
	@FindBy(id="firstName")
	private WebElement txtFisrtName;
	
	//last name
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
    //email
	@FindBy(id="userEmail")
	private WebElement txtEmail;
	
	//mobile number
	@FindBy(id="userNumber")
	private WebElement txtMobileNumber;
	
	//DoB
	@FindBy(id="dateOfBirthInput")
	private WebElement txtDob;
	
	//Month
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement txtMonth;
	
	//Year
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement txtYear;
	
	//subject
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	private WebElement txtSubject;
		
	//CurrentAddress
	@FindBy(id="currentAddress")
	private WebElement txtAddress;
	
	//3.Getters
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public WebElement getTxtFisrtName() {
		return txtFisrtName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtMobileNumber() {
		return txtMobileNumber;
	}
	public WebElement getTxtDob() {
		return txtDob;
	}
	public WebElement getTxtMonth() {
		return txtMonth;
	}
	public WebElement getTxtYear() {
		return txtYear;
	}
	public WebElement getTxtSubject() {
		return txtSubject;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	
	
	
	
	

}
