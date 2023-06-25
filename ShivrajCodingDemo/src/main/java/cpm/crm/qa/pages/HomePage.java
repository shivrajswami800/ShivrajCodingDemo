package cpm.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase
{

	protected HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//li[contains(text(),\"Welcome nareshit\")]")
	WebElement userName;

}
