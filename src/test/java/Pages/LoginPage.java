package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
By emailId=By.id("Email");
By password=By.id("Password");
By loginbtn=By.xpath("//input[@value='Log in']");
public void login(String user,String pass)
{
	driver.findElement(emailId).sendKeys(user);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginbtn).click();
}
}

