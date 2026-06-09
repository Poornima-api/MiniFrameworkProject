package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.ExcelUtility;
import Utilities.JavaUtility;

public class RegistrationTest extends BaseTest {
	@Test
	public void registrationVerification()
	{
	    String email =
	        JavaUtility.generateEmail();

	    String password = "Test@123";

	    HomePage hp = new HomePage(driver);

	    hp.registerlinkClick();

	    RegisterPage rp =new RegisterPage(driver);

	    rp.registration( "Male", "Sharath", "HS",email, password, password);
	    int row =ExcelUtility.getNextRowNumber();


	    ExcelUtility.writeData(row,0,email);

	    ExcelUtility.writeData(row,1,password);

	    System.out.println(
	            "Saved Email : " + email);
	}
}
