package com.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {


	public WebDriver driver;
	static Properties properities;

	public static void loadData() throws IOException {
		properities = new Properties();
		File f = new File(System.getProperty("user.dir") + "./Configuration/Test1.properities");
		FileReader obj = new FileReader(f);
		properities.load(obj);
	}

	public static String getObject(String Data) throws IOException {
		loadData();
		String data = properities.getProperty(Data);
		return data;
	}
	

	
	@BeforeMethod
	public void launchapplication(){
                 
		    System.out.println("opening browser");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();

	}

	
	@AfterMethod
	public void closebrowser() {

		driver.close();
		driver.quit();
	}

}
