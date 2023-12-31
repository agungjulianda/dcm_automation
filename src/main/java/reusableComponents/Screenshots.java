package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testBase.DriverFactory;

public class Screenshots {
	
	public void takeEvidences (String name) {
	
	File src = ((TakesScreenshot)DriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
	Date date = new Date();
	String actualDate = format.format(date);
	
	String screenshotPath = System.getProperty("user.dir")+
			"/Reports/Screenshots/"+name+"-"+actualDate+".jpeg";
	File dest = new File(screenshotPath);
	
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
