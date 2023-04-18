package Selenium.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		main1();
		
	}
	
	public static void main1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		String url = "http://automationpractice.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//CaptureScreen();
		DynamicScreenShot();
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		DynamicScreenShot();
		driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		DynamicScreenShot();
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		DynamicScreenShot();
		driver.close();
		
	}
	  public static void CaptureScreen() throws IOException {
		File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // screen shot taken by dr and saved in src temporary veriable
		File destination = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\ScrCaptured.png");
		FileUtils.copyFile(Scr, destination);
		  
	}
        public static void DynamicScreenShot() throws IOException {
        File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        System.out.println(date);
        
        String filename = date.toString().replace(" ","-").replace(":", "_")+".png";
        File destination = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\AutomationWebsite\\"+filename);
		FileUtils.copyFile(Scr, destination);
   
		}
        
}
