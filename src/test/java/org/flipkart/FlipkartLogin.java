package org.flipkart;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class FlipkartLogin extends LibGlobal{
	FlipkartPojoClass f;
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
		loadUrl("https://www.flipkart.com/account/login");
		windowMaximise();
	}
	@After
	public void endBrowser() {
		browserQuit();
	}	
	@Test
	public void tc() {
		f=new FlipkartPojoClass();
		fillTextBox(f.getTxtEmail(), "baladharan@gmail.com");
		String email = enteredText(f.getTxtEmail());
		Assert.assertEquals("To verify Email","baladharan@gmail.com", email);
		fillTextBox(f.getTxtPassword(), "9790224556");
		String pass = enteredText(f.getTxtPassword());
		Assert.assertTrue("To verify Password", pass.equals("9790224556"));
		btnClick(f.getBtnLogin());

	}
	

}
