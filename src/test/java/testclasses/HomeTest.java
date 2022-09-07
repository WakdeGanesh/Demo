package testclasses;

import org.testng.annotations.Test;

public class HomeTest extends BaseClass {
@Test
public void VerifyHomeTab() throws Throwable {
Hp.Home();
Thread.sleep(2000);
Hp.product();
}
}
