package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutusPage {
@FindBy(xpath="//a[text()='About us']")
private WebElement Aboutus;
@FindBy(xpath="//*[@id='videoModal']/div/div/div[3]/button")
private WebElement Close;

public AboutusPage(WebDriver driver) {
PageFactory.initElements(driver,this);	
}

public WebElement Aboutus() throws InterruptedException {
	Aboutus.click();
	Thread.sleep(2000);
	return Aboutus;
}
public WebElement Close() throws InterruptedException {
Close.click();
Thread.sleep(2000);
return Close;
}

}
