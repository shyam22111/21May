package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fakeAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://automationpractice.com/";
		driver.get(url);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		
        WebElement EmailText = driver.findElement(By.xpath("//input[@name='email_create']"));
        EmailText.sendKeys("AutomationPractice1996@gmail.com");
        
        WebElement SubmitButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        SubmitButton.click();
        
        
        WebElement title = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        if(title.isSelected()) {
        	System.out.println("title is already selected");
        }
        else { title.click();
			
		}
        
        WebElement FirstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        if(FirstName.isEnabled()) {
        	FirstName.clear(); FirstName.sendKeys("Automation");
        } else {
			System.out.println("First Name is not enabled");
		}
        
        WebElement LastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        if(LastName.isEnabled()) {
        	LastName.clear();LastName.sendKeys("Practice");
        } else {
			System.out.println("Last name is not enebled");
		}
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='passwd']"));
        if(Password.isEnabled()) {
        	Password.clear();Password.sendKeys("Shyam@123");
        }else {
			System.out.println("PassWord field is not enabled");
		}       
        
        WebElement DayOfBirth = driver.findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(DayOfBirth);
        select.selectByValue("22");
        
        List<WebElement> AllDayOfBirth = driver.findElements(By.xpath("//select[@id='days']//option"));
        System.out.println("Size Of All days Of Birth= "+AllDayOfBirth.size());
        for(int i=0;i<AllDayOfBirth.size();i++) {
        	WebElement FirstDay = AllDayOfBirth.get(i);
        	String Firstext = FirstDay.getText();
        	System.out.print(Firstext);
        }
        
        WebElement BirthOfMonth = driver.findElement(By.xpath("//select[@name='months']"));
        Select select2 = new Select(BirthOfMonth);
        select2.selectByVisibleText("April ");
        
        List<WebElement> AllMonthOfBirth = driver.findElements(By.xpath("//select[@id='months']//option"));
        for(WebElement AllElement : AllMonthOfBirth) {
        String MonthTest=AllElement.getText();
        System.out.println("All months of birth= "+MonthTest);
        }
        
        WebElement YearOfBirth = driver.findElement(By.xpath("//select[@id='years']"));
        Select selet3 = new Select(YearOfBirth);
        selet3.selectByValue("1995");
        
       List<WebElement> AllYearsOfBirth = driver.findElements(By.xpath("//select[@id='years']//option"));
       
       Iterator<WebElement> itr = AllYearsOfBirth.iterator();
       
       while (itr.hasNext()) {
		WebElement webElement = (WebElement) itr.next();
		String allyear = webElement.getText();
		System.out.println(allyear);
	    }
       WebElement OfferPartner = driver.findElement(By.xpath("//input[@id='optin']"));
       if(OfferPartner.isSelected()) {
    	   System.out.println("offer partner alredy selected");
       } else {
    	   OfferPartner.click();
	          }
       
       WebElement AddressFname = driver.findElement(By.xpath("//input[@id='firstname']"));
       if(AddressFname.isEnabled()) {
    	   AddressFname.sendKeys("Automation");
       } else 
         {
		   System.out.println("First name in address is not enabled");
	      }
       
       WebElement AddressLname = driver.findElement(By.xpath("//input[@id='lastname']"));
       if(AddressLname.isEnabled()) {
    	   AddressLname.sendKeys("Practice");
       } else {
		   System.out.println("Last name in address is not enabled");
	   }
       
       WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
       if(company.isEnabled()) {
    	   company.sendKeys("Unknown");
       } else {
		   System.out.println("company in address is not enabled");
	   }
       
       WebElement Address = driver.findElement(By.xpath("//input[@id='address1']"));
       if(Address.isEnabled()) {
    	   Address.sendKeys(" Pune");
       } else {
		   System.out.println("Address in address is not enabled");
	   }
       WebElement Address2 = driver.findElement(By.xpath("//input[@id='address2']"));
       if(Address2.isEnabled()) {
    	   Address2.sendKeys("Maharastra");
       } else {
		   System.out.println("Address2 in address is not enabled");
	   }
       
       WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
       if(City.isEnabled()) {
    	   City.sendKeys("Pune");
       } else {
		   System.out.println("City in address is not enabled");
	   }
       
       
       WebElement StateAll = driver.findElement(By.xpath("//select[@id='id_state']"));
       Select select4= new Select(StateAll);
       select4.selectByVisibleText("California");
       
      List<WebElement> AllState = driver.findElements(By.xpath("//select[@id='id_state']//option"));
       
       Iterator<WebElement> itr1 = AllState.iterator();
       
       while (itr1.hasNext()) {
		WebElement webElement1 = (WebElement) itr1.next();
		String allstate = webElement1.getText();
		System.out.println(allstate);
     	}
       
       WebElement ZipCode = driver.findElement(By.xpath("//input[@id='postcode']"));
       ZipCode.sendKeys("12634");
       
      
//       WebElement Country = driver.findElement(By.xpath("//select[@id='id_state']"));
//       Select select5= new Select(Country);
//       select5.selectByVisibleText("United States");
       
       WebElement AdditionalInfo = driver.findElement(By.xpath("//textarea[@id='other']"));
       AdditionalInfo.sendKeys("Automation Software Tester");
       
       WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
       if(phone.isEnabled()) {
    	   phone.sendKeys("9876543211");
       } else {
		System.out.println("phone number field is not enabled");
	  }
       
       WebElement Mobilephone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
       if(Mobilephone.isEnabled()) {
    	   Mobilephone.sendKeys("998876622");
       } else {
		System.out.println("Mobilephone number field is not enabled");
	  }
       
       Thread.sleep(3000);
       
      WebElement FutureAdd = driver.findElement(By.xpath("//input[@id='alias']"));
      if(FutureAdd.isEnabled()) {
    	  FutureAdd.clear();
    	  FutureAdd.sendKeys("USA");
      } else {
		System.out.println("FutureAdd field is not enabled");
	  }
      
      WebElement RegisterBut = driver.findElement(By.xpath("//button[@id]"));
      RegisterBut.click();
//      driver.close();
      
      
      
	}

}

