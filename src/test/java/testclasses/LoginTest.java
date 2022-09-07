package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
@Test
public void verifyLoginTab() throws Throwable {
Ip.login();
Thread.sleep(2000);
Ip.userName();
Thread.sleep(2000);
Ip.passWord();
Thread.sleep(2000);
Ip.loginButton();
Thread.sleep(5000);
//Assert.assertEquals(Ip.asert(),"Welcome group4");
}
}
