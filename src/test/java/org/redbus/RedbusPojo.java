package org.redbus;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPojo extends LibGlobal{
	
	public RedbusPojo() {
		PageFactory.initElements(driver, this);
	}
	//Private Webelement
//	@FindBy(xpath="//label[text()='FROM']")
	@FindBy(xpath="//*[@id=\"search\"]/div/div[1]/div/label")
	private WebElement txtSearch;
	
	@FindBy(xpath="//label[text()='TO']")
	private WebElement txtTo;
	
	@FindBy(xpath="//label[text()='Date']")
	private WebElement txtDate;
	
	@FindBy(xpath="//button[text()='Search Buses']")
	private WebElement btnSearch;
	
	@FindBy(id="i-icon-profile")
	private WebElement btnPic;
	
	@FindBy(id="signInLink")
	private WebElement btnSign;
	
	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement frame;
	
	@FindBy(id="mobileNoInp")
	private WebElement txtMobile;
	
	//Getters
	
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	
	public WebElement getTxtTo() {
		return txtTo;
	}
	public WebElement getTxtDate() {
		return txtDate;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getBtnPic() {
		return btnPic;
	}
	public WebElement getBtnSign() {
		return btnSign;
	}
	public WebElement getFrame() {
		return frame;
	}
	public WebElement getTxtMobile() {
		return txtMobile;
	}

}
