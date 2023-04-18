package Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class listPractical {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/reg/"; 
		driver.get(url);
		
		// Select  drpodown
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select select = new Select(dropDown);
		
		 List <WebElement> allDropDown =  select.getOptions();

}
}