package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidationAndDeletionPage;
import util.BrowserFactory;

public class ValidationAndDeletionTest {
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbelToClickCheckBoxAndDelete() throws InterruptedException {
		driver =BrowserFactory.init();
		
		ValidationAndDeletionPage vad = PageFactory.initElements(driver, ValidationAndDeletionPage.class);
		vad.clickOnCheckBox();
		vad.clickOnDelete();
	}

}
