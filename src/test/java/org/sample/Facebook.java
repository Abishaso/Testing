package org.sample;

import java.util.Date;

import org.testng.annotations.*;

public class Facebook extends BaseClass{

	@BeforeClass
	private void beforeClass() {
	chrome();
	}
	
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("Test Start time"+new Date());
	}
	
	
	@Test
	private void test1() throws InterruptedException {
	url("https://www.facebook.com/", 10);
	Login l=new Login();
	sendKeys(l.getUsername(), "shanmugam");
	sendKeys(l.getPassword(), "9876543211");
	click(l.getLoginbtn());
	Thread.sleep(3000);

	}
	
	
	@Test
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
