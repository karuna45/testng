package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
   WebDriver driver;
	
	@FindBy(css = "[id='nav-link-yourAccount']")
	private WebElement signin;
	

	@FindBy(css = "input[id='ap_email']")
	private WebElement textuser;
	
	
	@FindBy(css = "input[id='continue']")
	private WebElement emailcontinue;
	
	
	@FindBy(css = "input[id='ap_password']")
	private WebElement txtpassowrd;
	

	@FindBy(css = "input[id='signInSubmit']")
	private WebElement btnsignin;
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
     
	
	public void login(WebDriver driver, String url, String uname, String pwd) throws InterruptedException{
		    driver.get(url);
		    Thread.sleep(3000);
		    signin.click();
		    Thread.sleep(4000);
		   	textuser.sendKeys(uname);
		   	Thread.sleep(3000);
		   	emailcontinue.click();
		   	Thread.sleep(5000);
		   	txtpassowrd.sendKeys(pwd);
			btnsignin.click();
	}
	
}
