package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
@FindBy(xpath="//a[text()='Cart']")
private WebElement cart;
public CartPage(WebDriver driver) {
PageFactory.initElements(driver,this);	
}
public WebElement cart() throws Throwable {
cart.click();
Thread.sleep(2000);
return cart;
}
}
