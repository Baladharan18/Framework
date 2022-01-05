package org.flipkart;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojoClass extends LibGlobal{
	//1.Non Parameterized Constructor
	public FlipkartPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	//2.Private Webelement
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtEmail;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement btnLogin;
	
	
	//3.Getters
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	}
