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
	@FindBy(id="src")
	private WebElement txtFrom;
	
	@FindBy(id="dest")
	private WebElement txtTo;
	
	@FindBy(id="onward_cal")
	private WebElement txtDate;
	
	@FindBy(xpath="//button[@id='search_btn']")
	private WebElement btnSearch;
	
	@FindBy(id="i-icon-profile")
	private WebElement btnPic;
	
	@FindBy(id="signInLink")
	private WebElement btnSign;
	
	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement frame;
	
	@FindBy(id="mobileNoInp")
	private WebElement txtMobile;
	
	@FindBy(xpath="/html/body/iframe")
	private WebElement fFrame;
	
	//Getters
	
	public WebElement getTxtFrom() {
		return txtFrom;
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
	public WebElement getfFrame() {
		return fFrame;
	}

}
