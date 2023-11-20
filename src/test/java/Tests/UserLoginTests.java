package Tests;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import reusableComponents.Screenshots;
import testBase.TestBase;

@Test
public class UserLoginTests extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	Screenshots ssUtils = new Screenshots();
	

	public void UserLoginTest() throws Throwable {
		
		loginPage.login("USER4000", "Reskin01");
		ssUtils.takeEvidences("Login");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel


	}


}
