package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
@FindBy(xpath="//a[text()='Contact']")	
private WebElement Contact;
@FindBy(id="recipient-email")
private WebElement Contact_Email;
@FindBy(id="recipient-name")
private WebElement Contact_name;
@FindBy(id="message-text")
private WebElement Message;
@FindBy(xpath="//button[text()='Send message']")
private WebElement Sendmessage;

public ContactPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
public WebElement Contact() throws Throwable {
Contact.click();
Thread.sleep(2000);
return Contact;
}
public void Contact_Email() throws Throwable {
Contact_Email.sendKeys("ganeshwakde456@gmail.com");	
Thread.sleep(2000);
}
public void Contact_name() throws Throwable {
Contact_name.sendKeys("ganesh wakde");	
Thread.sleep(2000);
}
public void Message() throws Throwable {
Message.sendKeys("pls send my parcel on given date");	
Thread.sleep(2000);
}
public void Sendmessage(WebDriver driver) throws Throwable {
Sendmessage.click();
Thread.sleep(4000);
driver.switchTo().alert().accept();
}
}


