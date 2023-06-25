package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class Base 
{
	public static Properties prop;
	public static WebDriver driver;
	
	protected Base() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Pooja\\Java Program\\ShivrajCodingDemo\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
	}
	
	public static void initalization()
	{
		String browsrname = prop.getProperty("browser");
		//System.out.println(prop.getProperty("browser"));
		
		if(browsrname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jar Files\\Driver\\new\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		String inputurl = prop.getProperty("url");
	}
	
	public void main(String args[])
	{
		Base.initalization();
	}

}
