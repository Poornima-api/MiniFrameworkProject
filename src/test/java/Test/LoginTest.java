package Test;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.ExcelUtility;

public class LoginTest extends BaseTest {
	Logger log=LogManager.getLogger(LoginTest.class);
@Test
public void loginverification()
{
	String user=ExcelUtility.getData(1, 0);
	String pass=ExcelUtility.getData(1,1);
	log.info("Data fetched from Excel");
	HomePage hm=new HomePage(driver);
	log.info("Home page opened");
	hm.loginlinkClick();
	LoginPage lp=new LoginPage(driver);
	lp.login(user, pass);
	log.info("Login page opened");
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	String expTile="Demo Web Shop. Login";
	Assert.assertEquals(actTitle, expTile);

    log.info("Login validation successful");

    log.info("Test Completed");
	
}
}
