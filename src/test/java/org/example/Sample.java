package org.example;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample extends LibGlobal {
	Loginpage l;
	//1
	@BeforeClass
	public static void startDate() {
		Date d=new Date();
		System.out.println("Start Date and Time:"+d);
	}
	//5
	@AfterClass
	public static void endDate() {
		Date d=new Date();
		System.out.println("End Date and Time:"+d);
	}
	//2
	@Before
	public void startBrowser() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");
		windowMaximise();
	}
	//4
	@After
	public void endBrowser() {
//        browserQuit();
    }
	//3.1
	@Test
	public void tc1() {
       l=new Loginpage();
      fillTextBox(l.getTxtUser().get(0), "Balaji@gmail.com");
      fillTextBox(l.getTxtpass(), "9790224523");
      btnClick(l.getBtnLogin());
	}
	//3.2
	@Test
	public void tc3() {
		 l=new Loginpage();
	      fillTextBox(l.getTxtUser().get(0), "Parani@gmail.com");
	      fillTextBox(l.getTxtpass(), "9790224587");
	      btnClick(l.getBtnLogin());
	}
	//3.3
	@Test
	public void tc2() {
		 l=new Loginpage();
	      fillTextBox(l.getTxtUser().get(0), "Dharan@gmail.com");
	      fillTextBox(l.getTxtpass(), "9790224522");
	      btnClick(l.getBtnLogin());
		}
	
}
//public class Sample {
//	@BeforeClass
//	public static void startDate() {
//		System.out.println("Before Class");
//	}
//	
//	@AfterClass
//	public static void endDate() {
//		System.out.println("After Class");
//	}
//	
//	@Before
//	public void startBrowser() {
//		System.out.println("Before");
//	}
//	
//	@After
//	public void endBrowser() {
//        System.out.println("After");
//	}
//	
//	@Test
//	public void tc1() {
//      System.out.println("Test 1");
//	}
//	
//	@Test
//	public void tc3() {
//    System.out.println("Test 3");
//	}
//	
//	@Test
//	public void tc2() {
//	    System.out.println("Test 2");
//		}
//	
//}
