package ZWhtasPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class whatappMass {

	


	    public static void main(String[] args) throws InterruptedException {
	        // Set the path of ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver3\\chromedriver.exe");
	      

	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Navigate to WhatsApp Web
	        driver.get("https://web.whatsapp.com/");

	        // Wait for user to scan QR code and login
	        // Here, we are waiting for the title of the page to change to "WhatsApp"
	        // You can customize the wait condition as per your needs
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(ExpectedConditions.titleIs("WhatsApp"));
	        
	        driver.manage().window().maximize();

	        // Locate the chat input field and enter the name of the chat
	        WebElement chatInputField = driver.findElement(By.xpath("//div[@role='textbox']"));
	        chatInputField.sendKeys("zPinky");

	        // Wait for the chat to load
	        Thread.sleep(5000);

	        // Locate the message input field and enter the message
	        WebElement messageInputField = driver.findElement(By.xpath("//div[@contenteditable='true'][@data-tab='6']"));
	        messageInputField.sendKeys(" ..");

	        // Locate the send button and click it
	        WebElement sendButton = driver.findElement(By.xpath("//span[@data-icon='send']"));
	        sendButton.click();

	        // Close the browser
	        driver.quit();
	    
	}

	
	
	
	
	
	
	
	
}
