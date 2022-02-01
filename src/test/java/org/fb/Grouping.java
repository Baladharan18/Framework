package org.fb;

import java.util.Date;

import org.base.LibGlobal;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Grouping extends LibGlobal{
	//Hard Assert , Soft Assert and Grouping Concept
	
//	@BeforeClass
//	private void startDate() {
//		Date d=new Date();
//		System.out.println("Start Date and Time:"+d);
//	}
//	@AfterClass
//	private void endDate() {
//       Date d=new Date();
//       System.out.println("End Date and Time:"+d);
//	}
//	@BeforeMethod
//	private void startBrowser() {
//        browserlaunch();
//        loadUrl("https://www.facebook.com/");
//        String url = currentUrl();
//        System.out.println(currentUrl());
//        //Hard Assert--assertTrue
//        Assert.assertTrue(url.contains("facebook"), "To verify the url of the webpage");
//        String title = title();
//        System.out.println(title());
//        //Soft Assert--assertEquals
//        SoftAssert s= new SoftAssert();
//        s.assertEquals("Facebook",title,"To verify the title of the webpage");
//        
//        windowMaximise();
//	}
//	@AfterMethod
//	private void endBrowser() {
//       browserQuit();
//	}
	@Test(groups="@smoke")
	private void tc1() {
		browserlaunch();
	    loadUrl("https://www.facebook.com/");
		FbPojoClass f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "Balaji");
		String txt = enteredText(f.getTxtUser());
		//Hard Assert--assertEquals
		Assert.assertEquals("Balaji", txt,"To verfiy the user name");
		fillTextBox(f.getTxtPass(), "1991");
		String pass = enteredText(f.getTxtPass());
		//Soft Assert--assertTrue
		SoftAssert s= new SoftAssert();
		s.assertTrue(pass.contains("1991"), "To verify the password");
		btnClick(f.getBtnLogin());
		s.assertAll();
	}
	@Test(groups="@sanity")
	private void tc4() {
		browserlaunch();
	    loadUrl("https://www.facebook.com/");
		FbPojoClass f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "parani18@gmail.com");
		fillTextBox(f.getTxtPass(), "224521");
		btnClick(f.getBtnLogin());
	}
	@Test(groups="@smoke")
	private void tc5() {
		browserlaunch();
	    loadUrl("https://www.facebook.com/");
		FbPojoClass f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "dharan18@gmail.com");
		fillTextBox(f.getTxtPass(), "224521");
		btnClick(f.getBtnLogin());
	}
}
