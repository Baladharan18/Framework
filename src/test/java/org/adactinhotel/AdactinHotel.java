package org.adactinhotel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinHotel extends LibGlobal {
	//Using POM and JUNIT and Data Driven
		Adactinhotelpojo a;
		@BeforeClass
		public static void startDate() {
			Date d=new Date();
			System.out.println("Start Date and Time:"+d);
		}
		@AfterClass
		public static void endDate() {
			Date d=new Date();
			System.out.println("End date and Time:"+d);
		}	
		@Before
		public void startBrowser() {
			browserlaunch();
			loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
			windowMaximise();
		}
		@After
		public void endBrowser() {
			browserQuit();
		}	
		@Test
		public void tc() throws AWTException, IOException {
			a=new Adactinhotelpojo();
			excelSheet("ADACTIN", 1, 0, a.getTxtUserId());
			excelSheet("ADACTIN", 1, 1, a.getTxtPassWord());
			btnClick(a.getBtnLogin());
			toWaitimplicit();
			excelSheet("ADACTIN", 1, 2, a.getDrDownLocation());
			excelSheet("ADACTIN", 1, 3, a.getDrDownHotels());
			excelSheet("ADACTIN", 1, 4, a.getDrDownRoomType());
			excelSheet("ADACTIN", 1, 5, a.getDrDownNoOfRooms());
//			tabButton();
			excelSheet("ADACTIN", 1, 6, a.getTxtDateIn());
//			tabButton();
			excelSheet("ADACTIN", 1, 7, a.getTxtDateOut());
			excelSheet("ADACTIN", 1, 8, a.getTxtAdult());
			excelSheet("ADACTIN", 1, 9, a.getTxtChild());
			btnClick(a.getBtnSearch());
			btnClick(a.getBtnRadio());
			btnClick(a.getBtnContinue());
			excelSheet("ADACTIN", 1, 10, a.getTxtFirstName());
			excelSheet("ADACTIN", 1, 11, a.getTxtLastName());
			excelSheet("ADACTIN", 1, 12, a.getTxtAddress());
			excelSheet("ADACTIN", 1, 13, a.getTxtCard());
			excelSheet("ADACTIN", 1, 14, a.getDrDownCardType());
			excelSheet("ADACTIN", 1, 15, a.getTxtCardMonth());
			excelSheet("ADACTIN", 1, 16, a.getTxtCardYear());
			excelSheet("ADACTIN", 1, 17, a.getTxtCvv());	
			btnClick(a.getBtnBookNow());
			toWaitimplicit();
			scrollDown(a.getTxtOrderNumber());
			toTakeSnap("AdactinHotelPojoDataDriven");
			WebElement order = xpath("//input[@name='order_no']");
			String attribute = order.getAttribute("value");
			System.out.println(attribute);	
			excelToWrite("Order Number-2", 0, 1, attribute);
			

		}
	//Using POM and JUNIT
//	Adactinhotelpojo a;
//	@BeforeClass
//	public static void startDate() {
//		Date d=new Date();
//		System.out.println("Start Date and Time:"+d);
//	}
//	@AfterClass
//	public static void endDate() {
//		Date d=new Date();
//		System.out.println("End date and Time:"+d);
//	}	
//	@Before
//	public void startBrowser() {
//		browserlaunch();
//		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
//		windowMaximise();
//	}
//	@After
//	public void endBrowser() {
//		browserQuit();
//	}	
//	@Test
//	public void tc() throws AWTException, IOException {
//		a=new Adactinhotelpojo();
//		fillTextBox(a.getTxtUserId(), "Annal123");
//		fillTextBox(a.getTxtPassWord(), "3DdMxuNMa@wArC8");
//		btnClick(a.getBtnLogin());
//		toWaitimplicit();
//		fillTextBox(a.getDrDownLocation(), "Melbourne");
//		fillTextBox(a.getDrDownHotels(), "Hotel Creek");
//		fillTextBox(a.getDrDownRoomType(), "Double");
//		fillTextBox(a.getDrDownNoOfRooms(), "2 - Two");
//		tabButton();
//		fillTextBox(a.getTxtDateIn(), "05/01/2022");
//		tabButton();
//		fillTextBox(a.getTxtDateOut(), "07/01/2022");
//		fillTextBox(a.getTxtAdult(), "2 - Two");
//		fillTextBox(a.getTxtChild(), "2 - Two");
//		btnClick(a.getBtnSearch());
//		btnClick(a.getBtnRadio());
//		btnClick(a.getBtnContinue());
//		fillTextBox(a.getTxtFirstName(), "Balaji");
//		fillTextBox(a.getTxtLastName(), "Paranidharan");
//		fillTextBox(a.getTxtAddress(), "168, DABEER KULAM ROAD, EAST GATE,THANJAVUR-613001");
//		fillTextBox(a.getTxtCard(), "1234567894564568");
//		fillTextBox(a.getDrDownCardType(), "VISA");
//		fillTextBox(a.getTxtCardMonth(), "April");
//		fillTextBox(a.getTxtCardYear(), "2018");
//		fillTextBox(a.getTxtCvv(), "659");
//		btnClick(a.getBtnBookNow());
//		toWaitimplicit();
//		scrollDown(a.getTxtOrderNumber());
//		toTakeSnap("AdactinHotelPojo");
//		WebElement order = xpath("//input[@name='order_no']");
//		String attribute = order.getAttribute("value");
//		System.out.println(attribute);	
//		
//
//	}
	
	
//	public static void main(String[] args) throws AWTException, IOException {
		
		//Using POM and Data driven
//		Adactinhotelpojo a;
//		browserlaunch();
//		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
//		windowMaximise();
//		a=new Adactinhotelpojo();
//		excelSheet("ADACTIN", 1, 0, a.getTxtUserId());
//		excelSheet("ADACTIN", 1, 1, a.getTxtPassWord());
//		btnClick(a.getBtnLogin());
//		toWaitimplicit();
//		excelSheet("ADACTIN", 1, 2, a.getDrDownLocation());
//		excelSheet("ADACTIN", 1, 3, a.getDrDownHotels());
//		excelSheet("ADACTIN", 1, 4, a.getDrDownRoomType());
//		excelSheet("ADACTIN", 1, 5, a.getDrDownNoOfRooms());
////		tabButton();
//		excelSheet("ADACTIN", 1, 6, a.getTxtDateIn());
////		tabButton();
//		excelSheet("ADACTIN", 1, 7, a.getTxtDateOut());
//		excelSheet("ADACTIN", 1, 8, a.getTxtAdult());
//		excelSheet("ADACTIN", 1, 9, a.getTxtChild());
//		btnClick(a.getBtnSearch());
//		btnClick(a.getBtnRadio());
//		btnClick(a.getBtnContinue());
//		excelSheet("ADACTIN", 1, 10, a.getTxtFirstName());
//		excelSheet("ADACTIN", 1, 11, a.getTxtLastName());
//		excelSheet("ADACTIN", 1, 12, a.getTxtAddress());
//		excelSheet("ADACTIN", 1, 13, a.getTxtCard());
//		excelSheet("ADACTIN", 1, 14, a.getDrDownCardType());
//		excelSheet("ADACTIN", 1, 15, a.getTxtCardMonth());
//		excelSheet("ADACTIN", 1, 16, a.getTxtCardYear());
//		excelSheet("ADACTIN", 1, 17, a.getTxtCvv());	
//		btnClick(a.getBtnBookNow());
//		toWaitimplicit();
//		scrollDown(a.getTxtOrderNumber());
//		toTakeSnap("AdactinHotelPojoDataDriven");
//		WebElement order = xpath("//input[@name='order_no']");
//		String attribute = order.getAttribute("value");
//		System.out.println(attribute);	
//		excelToWrite("Order Number", 0, 1, attribute);
		
		
		//using POM
//		Adactinhotelpojo a;
//		browserlaunch();
//		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
//		windowMaximise();
//		a=new Adactinhotelpojo();
//		fillTextBox(a.getTxtUserId(), "Annal123");
//		fillTextBox(a.getTxtPassWord(), "3DdMxuNMa@wArC8");
//		btnClick(a.getBtnLogin());
//		toWaitimplicit();
//		fillTextBox(a.getDrDownLocation(), "Melbourne");
//		fillTextBox(a.getDrDownHotels(), "Hotel Creek");
//		fillTextBox(a.getDrDownRoomType(), "Double");
//		fillTextBox(a.getDrDownNoOfRooms(), "2 - Two");
//		tabButton();
//		fillTextBox(a.getTxtDateIn(), "04/01/2022");
//		tabButton();
//		fillTextBox(a.getTxtDateOut(), "05/01/2022");
//		fillTextBox(a.getTxtAdult(), "2 - Two");
//		fillTextBox(a.getTxtChild(), "2 - Two");
//		btnClick(a.getBtnSearch());
//		btnClick(a.getBtnRadio());
//		btnClick(a.getBtnContinue());
//		fillTextBox(a.getTxtFirstName(), "Balaji");
//		fillTextBox(a.getTxtLastName(), "Paranidharan");
//		fillTextBox(a.getTxtAddress(), "152, DABEER KULAM ROAD, EAST GATE,THANJAVUR-613001");
//		fillTextBox(a.getTxtCard(), "1234567891234568");
//		fillTextBox(a.getDrDownCardType(), "VISA");
//		fillTextBox(a.getTxtCardMonth(), "April");
//		fillTextBox(a.getTxtCardYear(), "2020");
//		fillTextBox(a.getTxtCvv(), "456");
//		btnClick(a.getBtnBookNow());
//		toWaitimplicit();
//		scrollDown(a.getTxtOrderNumber());
//		toTakeSnap("AdactinHotelPojo");
//		WebElement order = xpath("//input[@name='order_no']");
//		String attribute = order.getAttribute("value");
//		System.out.println(attribute);			
//		
		//user register in adactin
		
//		browserlaunch();
//		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
//		windowMaximise();
//		WebElement reg = xpath("//a[text()='New User Register Here']");
//		btnClick(reg);
//		WebElement user = byId("username");
//		fillTextBox(user, "balajipd");
//		WebElement pass = byId("password");
//		fillTextBox(pass, "Balaji@07");
//		WebElement confPass = byId("re_password");
//		fillTextBox(confPass, "Balaji@07");
//		WebElement name = byId("full_name");
//		fillTextBox(name, "Balajiparanidharan");
//		WebElement email = byId("email_add");
//		fillTextBox(email, "baladharan18@gmail.com");
//		WebElement btnAgree = byId("tnc_box");
//		btnClick(btnAgree);
//		Adactinhotelpojo a=new Adactinhotelpojo();
//		btnClick(a.getBtnRegister());
//		toWaitimplicit();
//		fillTextBox(a.getTxtUser(), "balaji");
//		fillTextBox(a.getTxtPass(), "Balaji@07");
//		fillTextBox(a.getTxtConfirmPass(), "Balaji@07");
//		fillTextBox(a.getTxtName(), "Balajiparanidharan");
//		fillTextBox(a.getTxtEmail(), "baladharan18@gmail.com");
//		btnClick(a.getBtnAgree());		
	}

//}
