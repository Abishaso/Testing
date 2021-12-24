package org.parameters;

import java.util.Date;

import org.testng.annotations.*;

public class Parameter extends BaseClass{

	@BeforeClass
	private void beforeClass() {
	chrome();
	}
	
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("Test Start time"+new Date());
	}
	
	@Parameters({"username","password"})
	@Test
	private void test1(@Optional("shanmu")String user,String pass) throws InterruptedException {
	url("https://www.facebook.com/", 10);
	Login l=new Login();
	sendKeys(l.getUsername(), user);
	sendKeys(l.getPassword(), pass);
	click(l.getLoginbtn());
	Thread.sleep(3000);

	}
	
	@Parameters({"firstname","lastname","phno"})
	@Test(priority=1)
	private void test2(String fname,String lname,String phno)  {
	url("https://www.facebook.com/", 10);
	Register r=new Register();
	click(r.getCreatebtn());
	sendKeys(r.getFirstname(), fname);
	sendKeys(r.getLastname(), lname);
	sendKeys(r.getPhno(), phno);
	
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
