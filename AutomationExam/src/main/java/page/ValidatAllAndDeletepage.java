package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatAllAndDeletepage {
	
WebDriver driver;
	
	public ValidatAllAndDeletepage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='on']")WebElement CHECKBOXALL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")WebElement DELETEALL_FIELD_LOCATOR;
	
	
	
	public void AllcheckBox() throws InterruptedException {
		CHECKBOXALL_FIELD.click();
		Thread.sleep(3000);
	}
	
	public void DeleteAllCheckBox() {
		DELETEALL_FIELD_LOCATOR.click();
	}
}
