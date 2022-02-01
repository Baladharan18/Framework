package org.demositeqa;

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

public class DemoQaTestng extends LibGlobal{
	//POM ADN TESTNG
		DemoQaPojo dd;
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
			loadUrl("https://demoqa.com/automation-practice-form");
			windowMaximise();
		}	
		@AfterMethod
		private void endBrowser() {
			browserQuit();
		}
		@Test
		public void tc1() throws AWTException, IOException {
			dd =new DemoQaPojo();
			excelSheet("demo", 2, 0, dd.getTxtFisrtName());
			String firstName = enteredText(dd.getTxtFisrtName());
			Assert.assertEquals("THIRU", firstName);
			excelSheet("demo", 2, 1, dd.getTxtLastName());
			excelSheet("demo", 2, 2, dd.getTxtEmail());
			WebElement btnRadio = xpath("//label[text()='Male']");
			btnClick(btnRadio);
			excelSheet("demo", 2, 4, dd.getTxtMobileNumber());
			String mobile = enteredText(dd.getTxtMobileNumber());
			Assert.assertEquals("9790224523", mobile);
			btnClick(dd.getTxtDob());
			toSelectByIndex(dd.getTxtMonth(), 9);
			toSelectByValue(dd.getTxtYear(), "1990");
			WebElement date = xpath("//div[text()='6']");
			btnClick(date);
//			excelSheet("demo", 2, 6, dd.getTxtSubject());
			WebElement hobby = xpath("//label[text()='Sports']");
			btnClick(hobby);
			excelSheet("demo", 2, 8, dd.getTxtAddress());
			tabButton();
			downButton();
			downButton();
			enterButton();
			tabButton();
			downButton();
			downButton();
			downButton();
			enterButton();
			btnClick(dd.getBtnSubmit());
			toWaitimplicit();
			toTakeSnap("DemoQaPractiseFormtTESTNG DATADRIVEN");
			
			
			

		}
	//POM ADN TESTNG
//	DemoQaPojo dd;
//	@BeforeClass
//	private void startDateAndTime() {
//	Date d=new Date();
//	System.out.println("Start Date and Time is:"+d);
//	}
//	@AfterClass
//	private void endDateAndTime() {
//		Date d=new Date();
//	    System.out.println("End Date and Time is:"+d);
//	}
//	@BeforeMethod
//	private void startBrowser() {
//		browserlaunch();
//		loadUrl("https://demoqa.com/automation-practice-form");
//		windowMaximise();
//	}	
//	@AfterMethod
//	private void endBrowser() {
//		browserQuit();
//	}
//	@Test
//	public void tc1() throws AWTException, IOException {
//		dd =new DemoQaPojo();
//		fillTextBox(dd.getTxtFisrtName(), "Balaji");
//		String firstname = enteredText(dd.getTxtFisrtName());
//		Assert.assertEquals("Balaji", firstname);
//		fillTextBox(dd.getTxtLastName(), "Paranidharan");
//		fillTextBox(dd.getTxtEmail(), "Baladharan@gmail.com");
//		WebElement btnRadio = xpath("//label[text()='Male']");
//		btnClick(btnRadio);
//		fillTextBox(dd.getTxtMobileNumber(), "9790224523");
//		btnClick(dd.getTxtDob());
//		toSelectByIndex(dd.getTxtMonth(), 9);
//		toSelectByValue(dd.getTxtYear(), "1990");
//		WebElement date = xpath("//div[text()='6']");
//		btnClick(date);
////    	fillTextBox(dd.getTxtSubject(), "Tamil");
//		WebElement hobby = xpath("//label[text()='Sports']");
//		btnClick(hobby);
//		fillTextBox(dd.getTxtAddress(), "15242 Dabeer Kulam Road, East gate, Pudukottai-673567");
//		tabButton();
//		downButton();
//		downButton();
//		enterButton();
//		tabButton();
//		downButton();
//		downButton();
//		downButton();
//		enterButton();
//		btnClick(dd.getBtnSubmit());
//		toWaitimplicit();
//		toTakeSnap("DemoQaPractiseFormTestNGPOM");
//		
//
//	}
	

}
