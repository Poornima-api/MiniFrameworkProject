package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
public static String captureScreenshot(WebDriver driver,String testName) {
	String timestamp=new SimpleDateFormat("DDMMYY_HHmmss").format(new Date());
	String screenshotpath=System.getProperty("user.dir")+"/screenshot"+"_"+testName+timestamp+".png";
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	if(driver==null)
	{
		throw new RuntimeException("Driver is null while taking the screenshot");
	}
	try {
		FileUtils.copyFile(src, new File(screenshotpath));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return screenshotpath;
}
		}
