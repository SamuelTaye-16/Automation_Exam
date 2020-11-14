package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidationAndDeletionPage {
	
WebDriver driver;
	
	public ValidationAndDeletionPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='todo[2]']")WebElement SINGL_CHECKBOX_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")WebElement DELETE_FIELD_LOCATOR;
	
	
	
	
	public void clickOnCheckBox() throws InterruptedException {
		SINGL_CHECKBOX_LOCATOR.click();
		Thread.sleep(3000);
	}
	public void clickOnDelete() {
		DELETE_FIELD_LOCATOR.click();
	}


}
