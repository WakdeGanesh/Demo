package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
@FindBy(xpath="//button[text()='Place Order']")
private WebElement placeorder;
@FindBy(xpath="//input[@id='name']")
private WebElement Name;
@FindBy(xpath="//input[@id='country']")
private WebElement Country;
@FindBy(xpath="//input[@id='city']")
private WebElement City;
@FindBy(id="card")
private WebElement Credit_card;
@FindBy(id="month")
private WebElement Month;
@FindBy(id="year")
private WebElement Year;
@FindBy(xpath="//button[text()='Purchase']")
private WebElement Purchase;
public PlaceOrderPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement placeorder() throws Throwable {
	placeorder.click();
	Thread.sleep(4000);
return placeorder;
}
public void Name() throws Throwable {
	Name.sendKeys("ganesh");
	Thread.sleep(2000);
}
public void Country() throws Throwable {
	Country.sendKeys("india");
	Thread.sleep(2000);
}
public void City() throws Throwable {
	City.sendKeys("pune");
	Thread.sleep(2000);
}
public void Credit_card() throws Throwable {
	Credit_card.sendKeys("54324366");
	Thread.sleep(2000);
}
public void Month() throws Throwable {
	Month.sendKeys("Aug");
	Thread.sleep(2000);
}
public void Year() throws Throwable {
	Year.sendKeys("Aug");
	Thread.sleep(2000);
}
public void Purchase() throws Throwable {
	Purchase.click();
	Thread.sleep(5000);
}
}
