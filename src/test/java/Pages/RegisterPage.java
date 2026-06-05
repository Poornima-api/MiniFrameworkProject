package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
WebDriver driver;
public RegisterPage(WebDriver driver)
{
	this.driver=driver;
	
}
By gendermale=By.id("gender-male");
By genderfm=By.id("gender-female");
By fNametxt=By.id("FirstName");
By lastNametxt=By.id("LastName");
By emailtxt=By.id("Email");
By passwordtxt=By.id("Password");
By confirmPasswordtxt=By.id("ConfirmPassword");
By registrbtn=By.id("register-button");
public void registration(String gender,String fn,String ln,String email,String pwd,String conpwd)
{
	if(gender.equalsIgnoreCase("male"))
	{
		driver.findElement(gendermale).click();	
	}
	else
		driver.findElement(genderfm).click();
	driver.findElement(fNametxt).sendKeys(fn);
	driver.findElement(lastNametxt).sendKeys(ln);
	driver.findElement(emailtxt).sendKeys(email);
	driver.findElement(passwordtxt).sendKeys(pwd);
	driver.findElement(confirmPasswordtxt).sendKeys(conpwd);
	driver.findElement(registrbtn).click();;
	
	
}
}
