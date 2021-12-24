package org.data.provider;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

//@Listeners(FailedScreenshot.class)
public class Screenshot extends BaseClass {

	@BeforeClass
	private void beforeClass() {
		chrome();
	}
//	@AfterMethod
//	private void afterMethod(ITestResult r) throws IOException {
//		String name = r.getName();
//	takeScreenshot("facebook"+name);
//
//	}
	@Test
	private void test() throws InterruptedException {
		url("https://www.facebook.com/", 10);
		Login l=new Login();
		sendKeys(l.getUsername(), "shanmugam");
		sendKeys(l.getPassword(), "987654321");
		click(l.getLoginbtn());
		Assert.assertTrue(false);
//		Thread.sleep(3000);
    }
	
	
	
}
