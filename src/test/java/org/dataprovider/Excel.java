package org.dataprovider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Excel extends BaseClass {
	
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
}
