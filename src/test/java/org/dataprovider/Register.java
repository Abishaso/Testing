package org.dataprovider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClass{

	public Register() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createbtn;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="reg_email__")
	private WebElement phno;
	
	public WebElement getCreatebtn() {
		return createbtn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPhno() {
		return phno;
	}
	
	
	
	
	
	
	
	
	
	
}
