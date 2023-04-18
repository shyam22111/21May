package SeleniumAction;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;
import Selenium.iframe.frame;

public class DragAndDrop {
	static Actions action;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String url = JSUtility.ReadValueFromExcel(47, 0);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
       
         WebElement dropeField = driver.findElement(By.xpath("//a[text()='Droppable']"));
         action=new Actions(driver);
         action.moveToElement(dropeField).click().build().perform();
         
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
      
        
        WebElement dragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement DropEle = driver.findElement(By.xpath("//div[@id='droppable']"));
 
        
        action.dragAndDrop(dragEle, DropEle).build().perform();
        
//	    driver.get("https://jqueryui.com/droppable/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Actions action = new Actions(driver);
//		action.dragAndDrop(draggable, dropable).build().perform();
      
       
        
	}

}
