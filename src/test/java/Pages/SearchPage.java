package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
WebDriver driver;
public SearchPage(WebDriver driver)
{
	this.driver=driver;
	
}
private By srchtxtbx=By.id("small-searchterms");
private By srchbtn=By.xpath("//input[@type='submit']");
public void srchbtnclick(String txt) {
	driver.findElement(srchtxtbx).sendKeys(txt);
	driver.findElement(srchbtn).click();
}
}
