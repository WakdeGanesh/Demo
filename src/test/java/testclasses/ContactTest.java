package testclasses;

import org.testng.annotations.Test;

public class ContactTest extends BaseClass{
@Test
public void VerifyContactTab() throws Throwable {
COp.Contact();
COp.Contact_Email();
COp.Contact_name();
COp.Message();
COp.Sendmessage(driver);

}}
