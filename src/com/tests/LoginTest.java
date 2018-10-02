package com.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;


public class LoginTest extends BaseClass {
	
@Test	
public void login() throws InterruptedException, IOException
{
		LoginPage login=new LoginPage(driver);
		
		login.login(driver, getObject("amazonurl"), getObject("uname"), getObject("pwd"));
		Thread.sleep(5000);	
	  
	}
}
