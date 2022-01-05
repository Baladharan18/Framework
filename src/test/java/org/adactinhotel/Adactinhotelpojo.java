package org.adactinhotel;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinhotelpojo extends LibGlobal{
	
	//1. Non Parameterized constructor
	
	public Adactinhotelpojo() {
		PageFactory.initElements(driver, this);
	}
	//2. Private Webelement
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement btnRegister;
	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="re_password")
	private WebElement txtConfirmPass;
	@FindBy(id="full_name")
	private WebElement txtName;
	@FindBy(id="email_add")
	private WebElement txtEmail;
	@FindBy(id="tnc_box")
	private WebElement btnAgree;
	@FindBy(id="username")
	private WebElement txtUserId;
	@FindBy(id="password")
	private WebElement txtPassWord;
	@FindBy(id="login")
	private WebElement btnLogin;
	@FindBy(id="location")	
	private WebElement drDownLocation;
	@FindBy(id="hotels")
	private WebElement drDownHotels;
	@FindBy(id="room_type")
	private WebElement drDownRoomType;
	@FindBy(id="room_nos")
	private WebElement drDownNoOfRooms;
	@FindBy(id="datepick_in")
	private WebElement txtDateIn;
	@FindBy(id="datepick_out")
	private WebElement txtDateOut;
	@FindBy(id="adult_room")
	private WebElement txtAdult;
	@FindBy(id="child_room")
	private WebElement txtChild;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	@FindBy(id="continue")
	private WebElement btnContinue;
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCard;
	@FindBy(id="cc_type")
	private WebElement drDownCardType;
	@FindBy(id="cc_exp_month")
	private WebElement txtCardMonth;
	@FindBy(id="cc_exp_year")
	private WebElement txtCardYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement txtOrderNumber;
	
	//3.Getters
	
	public WebElement getBtnRegister() {
		return btnRegister;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}	
	public WebElement getTxtPass() {
		return txtPass;
	}	
	public WebElement getTxtConfirmPass() {
		return txtConfirmPass;
	}	
	public WebElement getTxtName() {
		return txtName;
	}	
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getBtnAgree() {
		return btnAgree;
	}
	public WebElement getTxtUserId() {
		return txtUserId;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getDrDownLocation() {
		return drDownLocation;
	}
	public WebElement getDrDownHotels() {
		return drDownHotels;
	}
	public WebElement getDrDownRoomType() {
		return drDownRoomType;
	}
	public WebElement getDrDownNoOfRooms() {
		return drDownNoOfRooms;
	}
	public WebElement getTxtDateIn() {
		return txtDateIn;
	}
	public WebElement getTxtDateOut() {
		return txtDateOut;
	}
	public WebElement getTxtAdult() {
		return txtAdult;
	}
	public WebElement getTxtChild() {
		return txtChild;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCard() {
		return txtCard;
	}
	public WebElement getDrDownCardType() {
		return drDownCardType;
	}
	public WebElement getTxtCardMonth() {
		return txtCardMonth;
	}
	public WebElement getTxtCardYear() {
		return txtCardYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTxtOrderNumber() {
		return txtOrderNumber;
	}
	
	
	
	
	
	
	
	
	

}
