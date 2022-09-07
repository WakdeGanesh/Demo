package testclasses;

import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseClass {
@Test
public void PlaceOrder() throws Throwable {
POp.placeorder();
POp.Name();
POp.Country();
POp.City();
POp.Credit_card();
POp.Month();
POp.Year();
POp.Purchase();
}
}
