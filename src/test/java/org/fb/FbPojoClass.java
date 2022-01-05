package org.fb;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojoClass extends LibGlobal {

	//1.Non parameterized Constructor
	public FbPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	//2.Private webelement
	
	@FindBy(id="email")	
	private WebElement txtUser;
	
	@FindBy(name="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	//3.Getters
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	
	public WebElement getTxtPass() {
		return txtPass;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
