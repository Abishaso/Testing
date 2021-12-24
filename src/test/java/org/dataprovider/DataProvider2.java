package org.dataprovider;

import java.util.Date;


import org.testng.annotations.*;

public class DataProvider2 extends BaseClass{

	@BeforeClass
	private void beforeClass() {
	chrome();
	}
	
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("Test Start time"+new Date());
	}
	
	
	@Test(dataProvider="login",dataProviderClass=DataProviders.class)
	private void test1(String user,String pass) throws InterruptedException {
	url("https://www.facebook.com/", 10);
	Login l=new Login();
	sendKeys(l.getUsername(), user);
	sendKeys(l.getPassword(), pass);
	click(l.getLoginbtn());
	Thread.sleep(3000);

	}
	
	
	@Test(enabled=false)
	private void test2()  {
	url("https://www.facebook.com/", 10);
	Register r=new Register();
	click(r.getCreatebtn());
	sendKeys(r.getFirstname(), "shanmugam");
	sendKeys(r.getLastname(), "t");
	sendKeys(r.getPhno(), "8765432190");
	
	}
	
	@AfterMethod
	private void afterMethod() {
	System.out.println("Test End"+new Date());
	}
	
	@AfterClass
	private void afterClass() {
	System.out.println("Done");

	}
	
}
