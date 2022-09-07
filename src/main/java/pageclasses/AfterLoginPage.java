package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterLoginPage {
	private WebElement Actual;
public AfterLoginPage(WebDriver driver)
{
Actual=driver.findElement(By.xpath("//a[text()='Welcome group4']"));
}
public String asert() {
String abc = Actual.getText();	
System.out.println(abc);
return abc;
}

}
