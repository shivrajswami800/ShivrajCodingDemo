package com.crm.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class ReadProperty
{
	public static Properties prop;
	public static WebDriver driver;
	
	public ReadProperty() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Pooja\\Java Program\\ShivrajCodingDemo\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
	}
	
	public static void initalization()
	{
		String browsrname = prop.getProperty("browser");
		System.out.println(prop.getProperty("Browser name is="+"browser"));
		
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
	
	public static WebElement getElement(By locator1)
	{
		return driver.findElement(locator1);
	}
		
	public static void main(String args[])throws IOException
	{
	/*prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\Pooja\\Java Program\\ShivrajCodingDemo\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	prop.load(fis);
	
	System.out.println(prop.getProperty("username"));
	
	System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jar Files\\Driver\\new\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");*/
	
	By user_name = By.xpath("//input[@name=\"txtUserName\"]");
	By password = By.xpath("//input[@name=\"txtPassword\"]");
	By button = By.xpath("//input[@name=\"Submit\"]");
	
	//WebElement user = driver.findElement(user_name);
	//WebElement pass = driver.findElement(password);
	//WebElement pwd = driver.findElement(button);
	
	//user.sendKeys("nareshit");
	//pass.sendKeys("nareshit");
	//pwd.click();
    //return pwd;
     
     
	
	ReadProperty.getElement(user_name).sendKeys("nareshit");
	ReadProperty.getElement(password).sendKeys("nareshit");
	ReadProperty.getElement(button).click();
	
	
	
	//driver.findElement(By.xpath("//input[@name=\"txtUserName\"]")).sendKeys("nareshit");
	//driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("nareshit");
	
	//driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
	
	}
}
