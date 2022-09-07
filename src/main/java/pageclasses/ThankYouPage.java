package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
@FindBy(xpath="//button[text()='OK']")	
private WebElement ok;
public ThankYouPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
public void Ok() {
ok.click();
}
}
