package org.redbus;

import java.awt.AWTException;
import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class RedbusSearch extends LibGlobal{
			// Redubus POJO and JUNIT
		
		RedbusPojo r;
		@BeforeClass
		public static void startDate() {
			Date d=new Date();
			System.out.println("Start Date and Time:"+d);
		}
		@AfterClass
		public static void endDate() {
			Date d=new Date();
			System.out.println("End Date and Time:"+d);
		}
		@Before
		public void startBrowser() {
			browserlaunch();
			loadUrl("https://www.redbus.in/");
			windowMaximise();
		}
		@After
		public void endBrowser() {
//			browserQuit();
		}
		@Test
		public void tc() {
			r=new RedbusPojo();
			btnClick(r.getBtnPic());
			btnClick(r.getBtnSign());
			toWaitimplicit();
			frameWebelement(r.getFrame());
			fillTextBox(r.getTxtMobile(), "9790224523");
			String mob = enteredText(r.getTxtMobile());
			Assert.assertEquals("Entered Mobile Number","9790224523",mob);
			
		}	
		
//		frameWebelement(r.getfFrame());
//		fillTextBox(r.getTxtSearch(), "Chennai");
//		fillTextBox(r.getTxtTo(), "Thanjavur");
//		btnClick(r.getTxtDate());
//		WebElement date = xpath("//td[text()='13']");
//		btnClick(date);
//		btnClick(r.getBtnSearch());
//		
//		
//		
//	}
}

	//JUNIT and POJO trip search

//	RedbusPojo r;
//	
//	@BeforeClass
//	public static void startDate() {
//		Date d=new Date();
//		System.out.println("Start Date and Time:"+d);
//	}
//	@AfterClass
//	public static void endDate() {
//		Date d=new Date();
//		System.out.println("End Date and Time:"+d);
//	}
//	@Before
//	public void startBrowser() {
//		browserlaunch();
//		loadUrl("https://www.redbus.in/");
//		windowMaximise();
//	}
//	@After
//	public void endBrowser() {
////		browserQuit();
//	}
//	@Test
//	public void tc() {
//		r=new RedbusPojo();
//		fillTextBox(r.getTxtSearch(), "Chennai");
//		fillTextBox(r.getTxtTo(), "Thanjavur");
//		btnClick(r.getTxtDate());
//		WebElement date = xpath("//td[text()='13']");
//		btnClick(date);
//		btnClick(r.getBtnSearch());
//	}
//}
