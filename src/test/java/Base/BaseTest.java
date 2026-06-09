package Base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
public static ExtentReports extent;
public ExtentTest test;
@BeforeMethod
public void setup(Method method)
{
	extent=ExtentManager.getReport();
	test=extent.createTest(method.getName());
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();

	//options.addArguments("--headless=new");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");

	driver = new ChromeDriver(options);
	//driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
@AfterMethod
public void teardown()
{
	if(driver!=null)
	{
	driver.quit();
	}
}
}
