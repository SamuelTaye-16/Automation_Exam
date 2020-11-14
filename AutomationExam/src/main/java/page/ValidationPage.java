package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidationPage {
	
	
WebDriver driver;
	
	public ValidationPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@value='on']")WebElement CHECKBOX_FIELD;
	
	
	
	
	public void ValidateCheckBox() {
		CHECKBOX_FIELD.click();
	}

}
