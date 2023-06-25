package cpm.crm.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.*;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

import cpm.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage login;

	protected LoginPageTest() throws IOException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void setup() throws IOException
	{
		initalization();
		login = new LoginPage();
				
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = login.validateLoginPageTitle();
		System.out.println(title);
		//assert.assertEquals(false, false);
		//assert.assertEquals(title,"OrangeHRM - New Level of HR Management");
	}	
	
	
	@Test(priority=2)
	public void loginTest()
	{
		login.validateLogin(prop.getProperty("username"),prop.getProperty("password"));		
		
	}	
	
	

}
