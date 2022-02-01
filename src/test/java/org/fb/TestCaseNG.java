package org.fb;

import org.base.LibGlobal;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseNG extends LibGlobal {
	FbPojoClass f;
//	@BeforeMethod
//	private void startBrowser() {
//		browserlaunch();
//		loadUrl("https://www.facebook.com/");
//		windowMaximise();
//	}	
//    @AfterMethod
//	private void endBrowser() {
//		browserQuit();
//	}
    @Test(groups="@sanity",priority = -10,invocationCount = 3)
	public void tc7() {
    	browserlaunch();
		loadUrl("https://www.facebook.com/");
		windowMaximise();
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "baladharan18@gmail.com");
		fillTextBox(f.getTxtPass(), "224521");
		btnClick(f.getBtnLogin());
	}
	@Test(groups="@sanity",priority = 3)
	public void tc8() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");
		windowMaximise();
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "dharan18@gmail.com");
		fillTextBox(f.getTxtPass(), "224521");
		btnClick(f.getBtnLogin());
	}
//	@Test(priority = -10,invocationCount = 3)
//	public void tc4() {
//		f=new FbPojoClass();
//		fillTextBox(f.getTxtUser(), "baladharan18@gmail.com");
//		fillTextBox(f.getTxtPass(), "224521");
//		btnClick(f.getBtnLogin());
//	}
//	@Test(priority = 3)
//	public void tc5() {
//		f=new FbPojoClass();
//		fillTextBox(f.getTxtUser(), "dharan18@gmail.com");
//		fillTextBox(f.getTxtPass(), "224521");
//		btnClick(f.getBtnLogin());
//	}

}
