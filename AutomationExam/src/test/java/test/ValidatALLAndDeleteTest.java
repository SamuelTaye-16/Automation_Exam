package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidatAllAndDeletepage;
import util.BrowserFactory;

public class ValidatALLAndDeleteTest {
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToClickOnCheckBoxAndDelete() throws InterruptedException {
		driver =BrowserFactory.init();
		
		ValidatAllAndDeletepage vadl = PageFactory.initElements(driver, ValidatAllAndDeletepage.class);
		vadl.AllcheckBox();
		vadl.DeleteAllCheckBox();
	}

}
