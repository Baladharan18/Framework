package org.fb;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import junit.framework.Assert;

public class FbLogin extends LibGlobal{
	
	FbPojoClass f;	
	@BeforeClass
	public static void startDate() {
		Date d=new Date();
		System.out.println("Start date and Time:"+d);
	}	
	@AfterClass
	public static void endDate() {
		Date d=new Date();
		System.out.println("End date and Time:"+d);
	}	
	@Before
	public void startBrowser() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");
		windowMaximise();
	}	
	@After
	public void endBrowser() {
		browserQuit();
	}
	
	@Test
	public void tc() {
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "baladharan18@gmail.com");
		String user = enteredText(f.getTxtUser());
		Assert.assertEquals("To Verify Usename","baladharan18@gmail.com", user);
		fillTextBox(f.getTxtPass(), "9790224521");
		String pass = enteredText(f.getTxtPass());
		Assert.assertTrue("To verify Password",pass.equals("9790224521"));
		btnClick(f.getBtnLogin());

	}
		
		
		
		
	}


