package org.demositeqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class DemoQa extends DemoQaPojo{
	//POM and JNUIT and DATA DRIVEN
	DemoQaPojo dd;
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
		loadUrl("https://demoqa.com/automation-practice-form");
		windowMaximise();
	}
	@After
	public void endBrowser() {
		browserQuit();
	}	
	@Test
	public void tc() throws IOException, AWTException {
		dd =new DemoQaPojo();
		excelSheet("demo", 2, 0, dd.getTxtFisrtName());
		String firstName = enteredText(dd.getTxtFisrtName());
		Assert.assertEquals("Entered First Name","THIRU", firstName);
		excelSheet("demo", 2, 1, dd.getTxtLastName());
		excelSheet("demo", 2, 2, dd.getTxtEmail());
		WebElement btnRadio = xpath("//label[text()='Male']");
		btnClick(btnRadio);
		excelSheet("demo", 2, 4, dd.getTxtMobileNumber());
		String mobile = enteredText(dd.getTxtMobileNumber());
		Assert.assertTrue("To Verify Mobile Number", mobile.equals("9790224523"));
		btnClick(dd.getTxtDob());
		toSelectByIndex(dd.getTxtMonth(), 9);
		toSelectByValue(dd.getTxtYear(), "1990");
		WebElement date = xpath("//div[text()='6']");
		btnClick(date);
//		excelSheet("demo", 2, 6, dd.getTxtSubject());
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
		toTakeSnap("DemoQaPractiseFormJunit");
		

	}
	
	// POM and JUNIT
//	DemoQaPojo dd;
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
//		loadUrl("https://demoqa.com/automation-practice-form");
//		windowMaximise();
//	}
//	@After
//	public void endBrowser() {
//		browserQuit();
//	}	
//	@Test
//	public void tc() throws IOException, AWTException {
//		dd =new DemoQaPojo();
//		fillTextBox(dd.getTxtFisrtName(), "Balaji");
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
////		fillTextBox(dd.getTxtSubject(), "Tamil");
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
//		toTakeSnap("DemoQaPractiseFormJunit");
//		
//
//	}
	
//	public static void main(String[] args) throws AWTException, IOException {
//		DemoQaPojo dd;
//		browserlaunch();
//		loadUrl("https://demoqa.com/automation-practice-form");
//		windowMaximise();
//		WebElement txtFname = byId("firstName");
//		excelSheet("demo", 1, 0, txtFname);
//		WebElement txtLname = byId("lastName");
//		excelSheet("demo", 1, 1, txtLname);
//		WebElement txtMail = byId("userEmail");
//		excelSheet("demo", 1, 2, txtMail);
//		WebElement btnRadio = xpath("//label[text()='Male']");
//		btnClick(btnRadio);
//		WebElement txtMobile = byId("userNumber");
//		excelSheet("demo", 1, 4, txtMobile);
//		WebElement btnDob = byId("dateOfBirthInput");
//		btnClick(btnDob);
//		WebElement month = xpath("//select[@class='react-datepicker__month-select']");
//		toSelectByIndex(month, 9);
//		WebElement year = xpath("//select[@class='react-datepicker__year-select']");
//		toSelectByValue(year, "1990");
//		WebElement date = xpath("//div[text()='6']");
//		btnClick(date);
////		excelSheet("demo", 1, 5, btnDob);
////		WebElement sub = xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
////		excelSheet("demo", 1, 6, sub);
//		WebElement hobby = xpath("//label[text()='Sports']");
//		btnClick(hobby);
//		WebElement address = byId("currentAddress");
//		excelSheet("demo", 1, 8, address);
//		tabButton();
//		downButton();
//		downButton();
//		downButton();
//		downButton();
//		enterButton();
//		tabButton();
//		downButton();
//		enterButton();
//		WebElement btnSubmit = xpath("//button[@id='submit']");
//		btnClick(btnSubmit);
//		toWaitimplicit();
//		toTakeSnap("DemoQaPractiseForm data driven 1");
		
//		WebElement state = xpath("//*[@id=\"state\"]/div/div[1]/div[1]");
//		excelSheet("demo", 1, 9, state);
//		WebElement city = xpath("//*[@id=\"city\"]/div/div[1]/div[1]");
//		excelSheet("demo", 1, 10, city);
		
				
//		Robot r=new Robot();
//		browserlaunch();
//		loadUrl("https://demoqa.com/automation-practice-form");
//		windowMaximise();
//		WebElement txtFname = byId("firstName");
//		fillTextBox(txtFname, "balaji");
//		WebElement txtLname = byId("lastName");
//		fillTextBox(txtLname, "Paranidharan");
//		WebElement txtMail = byId("userEmail");
//		fillTextBox(txtMail, "Bala@gmail.com");
//		WebElement btnRadio = xpath("//label[text()='Male']");
//		btnClick(btnRadio);
//		WebElement txtMobile = byId("userNumber");
//		fillTextBox(txtMobile,"97790224523");
//		WebElement btnDob = byId("dateOfBirthInput");
//		btnClick(btnDob);
//		WebElement month = xpath("//select[@class='react-datepicker__month-select']");
//		toSelectByIndex(month, 9);
//		WebElement year = xpath("//select[@class='react-datepicker__year-select']");
//		toSelectByValue(year, "1990");
//		WebElement date = xpath("//div[text()='6']");
//		btnClick(date);		
////		WebElement subject = xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");
////		fillTextBox(subject, "English");
//		WebElement hobby = xpath("//label[text()='Sports']");
//		btnClick(hobby);
//		WebElement address = byId("currentAddress");
//		fillTextBox(address,"15242 Dabeer Kulam Road, East gate, Pudukottai-673567");
//		tabButton();
//		downButton();
//		downButton();
//		enterButton();
//		tabButton();
//		downButton();
//		downButton();
//		downButton();
//		enterButton();
//		WebElement btnSubmit = xpath("//button[@id='submit']");
//		btnClick(btnSubmit);
//		toWaitimplicit();
//		toTakeSnap("DemoQaPractiseForm 1");
		
//		WebElement subject = xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
//		fillTextBox(subject, "English");
//		tabButton();
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_G);
//		r.keyRelease(KeyEvent.VK_G);
//		r.keyPress(KeyEvent.VK_L);
//		r.keyRelease(KeyEvent.VK_L);
//		r.keyPress(KeyEvent.VK_I);
//		r.keyRelease(KeyEvent.VK_I);
//		r.keyPress(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_S);
//		r.keyPress(KeyEvent.VK_H);
//		r.keyRelease(KeyEvent.VK_H);
//		enterButton();
		
		
		// Pojo Class for DemoQA Practise form
		
//		browserlaunch();
//		loadUrl("https://demoqa.com/automation-practice-form");
//		windowMaximise();
//		 dd =new DemoQaPojo();
////		scrollDown(dd.getBtnSubmit());
//		fillTextBox(dd.getTxtFisrtName(), "Balaji");
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
////		fillTextBox(dd.getTxtSubject(), "Tamil");
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
//		toTakeSnap("DemoQaPractiseForm 3");

		
		
		
	}

//}
