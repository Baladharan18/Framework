package org.example;

import java.util.Date;

import org.base.LibGlobal;
import org.fb.FbLogin;
import org.fb.FbPojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbLoginTestng extends LibGlobal{
	//Parameterization, @Optional & Data Provider Concept
	@BeforeClass
	private void startDate() {
		Date d=new Date();
		System.out.println("Start Date and Time:"+d);
	}
	@AfterClass
	private void endDate() {
       Date d=new Date();
       System.out.println("End Date and Time:"+d);
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
	@Test
	private void tc1() {
		FbPojoClass f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "Balaji");
		fillTextBox(f.getTxtPass(), "1991");
		btnClick(f.getBtnLogin());
	}
	@Parameters({ "Username", "Password"})
	@Test
	private void tc2(String user,String pass) {
	FbPojoClass	f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), user);
		fillTextBox(f.getTxtPass(), pass);
		btnClick(f.getBtnLogin());
	}
//	@Parameters({ "Username", "Password"})
//	@Test
//	private void tc2(@Optional("balapd") String user,@Optional("1990") String pass) {
//	FbPojoClass	f=new FbPojoClass();
//		fillTextBox(f.getTxtUser(), user);
//		fillTextBox(f.getTxtPass(), pass);
//		btnClick(f.getBtnLogin());
//	}
//	@DataProvider(name="credentials")
//	private Object[][] allDatas() {
//		return new Object[][]{
//				{"balajip","979"},{"parani","224523"},{"dharan","4523"}
//		};
//	}
//	@Test(dataProvider = "credentials",dataProviderClass = Sample.class)
//	private void tc3(String user,String pass) {
//		FbPojoClass f=new FbPojoClass();
//		fillTextBox(f.getTxtUser(), user);
//		fillTextBox(f.getTxtPass(), pass);
//		btnClick(f.getBtnLogin());
//
//	}


	
	

}
