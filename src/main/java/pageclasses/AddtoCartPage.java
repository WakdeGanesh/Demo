package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
@FindBy(xpath="//a[text()='Add to cart']")
private WebElement AddToCart;
public AddtoCartPage(WebDriver driver) throws InterruptedException {
PageFactory.initElements(driver,this);

}

public void AddToCart(WebDriver driver) throws Throwable {
AddToCart.click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
}

}
