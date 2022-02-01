package org.adactinhotel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelTestng extends LibGlobal{
	// POM and TESTNG
	Adactinhotelpojo a;
	@BeforeClass
	private void startDateAndTime() {
	Date d=new Date();
	System.out.println("Start Date and Time is:"+d);
	}
	@AfterClass
	private void endDateAndTime() {
		Date d=new Date();
	    System.out.println("End Date and Time is:"+d);
	}
	@BeforeMethod
	private void startBrowser() {
		browserlaunch();
		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		windowMaximise();
	}	
	@AfterMethod
	private void endBrowser() {
		browserQuit();
	}
	@Test
	public void tc() throws IOException, AWTException {
		a=new Adactinhotelpojo();
		fillTextBox(a.getTxtUserId(), "Annal123");
		fillTextBox(a.getTxtPassWord(), "3DdMxuNMa@wArC8");
		btnClick(a.getBtnLogin());
		toWaitimplicit();
		fillTextBox(a.getDrDownLocation(), "Melbourne");
		fillTextBox(a.getDrDownHotels(), "Hotel Creek");
		fillTextBox(a.getDrDownRoomType(), "Double");
		fillTextBox(a.getDrDownNoOfRooms(), "2 - Two");
		tabButton();
		fillTextBox(a.getTxtDateIn(), "11/01/2022");
		tabButton();
		fillTextBox(a.getTxtDateOut(), "12/01/2022");
		fillTextBox(a.getTxtAdult(), "2 - Two");
		fillTextBox(a.getTxtChild(), "2 - Two");
		btnClick(a.getBtnSearch());
		btnClick(a.getBtnRadio());
		btnClick(a.getBtnContinue());
		fillTextBox(a.getTxtFirstName(), "Balaji");
		String firstname = enteredText(a.getTxtFirstName());
		Assert.assertEquals("Balaji", firstname);
		fillTextBox(a.getTxtLastName(), "Paranidharan");
		fillTextBox(a.getTxtAddress(), "168, DABEER KULAM ROAD, EAST GATE,THANJAVUR-613001");
		fillTextBox(a.getTxtCard(), "1234567894564568");
		fillTextBox(a.getDrDownCardType(), "VISA");
		fillTextBox(a.getTxtCardMonth(), "April");
		fillTextBox(a.getTxtCardYear(), "2018");
		fillTextBox(a.getTxtCvv(), "659");
		btnClick(a.getBtnBookNow());
		toWaitimplicit();
		scrollDown(a.getTxtOrderNumber());
		toTakeSnap("AdactinHotelPojoTestNG");
		WebElement order = xpath("//input[@name='order_no']");
		String attribute = order.getAttribute("value");
		System.out.println(attribute);	

	}

}
