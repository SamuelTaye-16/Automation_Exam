package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidationPage;
import util.BrowserFactory;

public class ValidationTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbelToValidateCheckBox() throws InterruptedException {
		driver =BrowserFactory.init();
		
		ValidationPage vl = PageFactory.initElements(driver, ValidationPage.class);
		vl.ValidateCheckBox();
		Thread.sleep(3000);
		
		
		BrowserFactory br = PageFactory.initElements(driver, BrowserFactory.class);
		br.tearDown();
	}
	
	

}
