package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.AboutusPage;
import pageclasses.AddtoCartPage;
import pageclasses.Alert;
import pageclasses.CartPage;
import pageclasses.ContactPage;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.PlaceOrderPage;
import pageclasses.ThankYouPage;

public class BaseClass {
static WebDriver driver;
public LoginPage Ip;
public HomePage Hp;
public AddtoCartPage ACp;
public CartPage Cp;
public PlaceOrderPage POp;
public ThankYouPage TYp;
public ContactPage COp;
public AboutusPage Ap;
@BeforeSuite
public void launchurl()
{
//System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");	
WebDriverManager.chromedriver().setup();
ChromeOptions options =new ChromeOptions();
options.addArguments("---start-maximized");
options.addArguments("--disable-notifications");		
driver=new ChromeDriver();
driver.get("https://www.demoblaze.com");
}
@BeforeClass
public void objectCreations() throws Throwable {
	Ip=new LoginPage(driver);
   Hp=new HomePage(driver);
   ACp=new AddtoCartPage(driver);
   Cp=new CartPage(driver);
   POp=new PlaceOrderPage(driver);
   TYp=new ThankYouPage(driver);
 COp=new ContactPage(driver);
Ap=new AboutusPage(driver);
}
}
