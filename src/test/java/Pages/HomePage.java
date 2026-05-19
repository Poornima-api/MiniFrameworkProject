package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
}
private By loginLink=By.xpath("//a[text()='Log in']");
public void loginlinkClick()
{
	driver.findElement(loginLink).click();
}


}
