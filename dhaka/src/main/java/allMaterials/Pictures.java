package allMaterials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


public class Pictures {
	
	WebDriver driver;
	@SuppressWarnings("hiding")
	public <ITestResult> void getPicture(ITestResult arg0) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile( file,new File("C:\\Users\\asmat\\eclipse-workspace\\dhaka\\src\\test\\resources\\seleniumPic\\"+arg0+"pic.png"));
		
	}

}
