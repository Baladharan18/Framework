package org.example;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
// POJO CLASS FOR FB LOGIN PAGE
public class Loginpage extends LibGlobal {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private List<WebElement> txtUser;
//	private WebElement txtUser;
	
	@FindBy(name="pass")
	private WebElement txtPass;
	
//	@FindBy(xpath="//button[@name='login']")
//	@FindBys({
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[text()='Log In']")		
	})
	private WebElement btnLogin;
	
	public List<WebElement> getTxtUser(){
//	public WebElement gettxtUser() {
		return txtUser;
	}
	public WebElement getTxtpass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
