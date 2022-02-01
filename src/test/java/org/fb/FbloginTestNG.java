package org.fb;

import java.util.Date;

import org.base.LibGlobal;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FbloginTestNG extends LibGlobal{
	FbPojoClass f;
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
		loadUrl("https://www.facebook.com/");
		windowMaximise();
	}	
    @AfterMethod
	private void endBrowser() {
		browserQuit();
	}	
    @Test(priority = -21)
	private void tc() {
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "baladharan18@gmail.com");
		String text = enteredText(f.getTxtUser());
		Assert.assertEquals("baladharan18@gmail.com", text);
		fillTextBox(f.getTxtPass(), "9790224521");
		String password = enteredText(f.getTxtPass());
		Assert.assertTrue(password.equals("9790224521"));
		btnClick(f.getBtnLogin());
	}
    @Test(invocationCount = 2)
    private void tc3() {
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "bala18@gmail.com");
		fillTextBox(f.getTxtPass(), "9790224523");
		btnClick(f.getBtnLogin());
   }
    @Test(enabled=false,priority = 33)
    private void tc2() {
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "dharan18@gmail.com");
		fillTextBox(f.getTxtPass(), "979022");
		btnClick(f.getBtnLogin());
		}
}