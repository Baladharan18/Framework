package org.flipkart;

import java.util.Date;

import org.base.LibGlobal;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FlipkartLoginTestng extends LibGlobal {
	FlipkartPojoClass f;
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
		loadUrl("https://www.flipkart.com/account/login");
		windowMaximise();
	}	
	@AfterMethod
	private void endBrowser() {
		browserQuit();
	}
	@Test
	public void tc() {
		f=new FlipkartPojoClass();
		fillTextBox(f.getTxtEmail(), "baladharan@gmail.com");
		String email = enteredText(f.getTxtEmail());
		Assert.assertEquals("baladharan@gmail.com", email);
		fillTextBox(f.getTxtPassword(), "9790224556");
		String pass = enteredText(f.getTxtPassword());
		Assert.assertEquals("9790224556", pass);
		btnClick(f.getBtnLogin());


	}

}
