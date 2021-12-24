package org.dataprovider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseClass {

	@BeforeClass
	private void beforeClass() {
	chrome();
	
	}
	
	@Test(dataProvider="login")
	private void test(String user, String pass) throws InterruptedException {
	url("https://www.facebook.com/", 10);
	Login l=new Login();
	sendKeys(l.getUsername(), user);
	sendKeys(l.getPassword(), pass);
	click(l.getLoginbtn());
	Thread.sleep(3000);
	}
	
	
	@DataProvider(name="login",indices={1})
	private Object[][] data() {
	Object[][] obj=new Object[][] {
		{"shanmugam","987654"}, //0
		{"shan","765432"}       //1
	};
	return obj;
	}

}

