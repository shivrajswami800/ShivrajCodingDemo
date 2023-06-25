package cpm.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	By title = By.xpath("//title[text()=\"OrangeHRM - New Level of HR Management\"]");
	WebElement Page_Title = driver.findElement(title);
	
	By uid = By.xpath("//input[@name=\"txtUserName\"]");
	WebElement User_Name = driver.findElement(uid);
	
	By pwd = By.xpath("//input[@name=\"txtPassword\"]");
	WebElement Password = driver.findElement(pwd);
	
	
	By Lbtn = By.xpath("//input[@name=\"Submit\"]");
	WebElement Login_Button = driver.findElement(Lbtn);
	
	
	
	
	// Step 2 : By creating the constructor and using the Pagefactory class initelement method we can init the elements.
		public LoginPage() throws IOException 
		{
			super();
			
		}
		
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
		public void validateLogin(String uname, String pwd)
		{
			User_Name.sendKeys(uname);
			Password.sendKeys(pwd);
			Login_Button.click();			
			
		}
		
		

}
