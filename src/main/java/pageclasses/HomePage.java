package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[@href='index.html'and@class='nav-link']")	
private WebElement Home;
@FindBy(xpath="//a[text()='Samsung galaxy s6']")
private WebElement product;

public HomePage(WebDriver driver) {
PageFactory.initElements(driver, this);	
}

public WebElement Home() throws InterruptedException{
Home.click();
Thread.sleep(2000);
return Home;
}
public WebElement product() throws InterruptedException {
	product.click();
Thread.sleep(2000);	
  return product;
}

}
