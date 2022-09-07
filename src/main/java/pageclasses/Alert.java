package pageclasses;

import org.openqa.selenium.WebDriver;

public class Alert {
	public void Alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
}
