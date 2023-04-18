package SeleniumAction;


import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import Selenium.JavaScriptExicutor.JSUtility;
public class trial {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		JSUtility.Setproperty();
//		WebDriver driver= new ChromeDriver();
//		String value = JSUtility.ReadValueFromExcel(47, 0);
//		driver.get(value);
		
		ArrayList<String> aList = new ArrayList();
		
		String  value1=null;
		for(int i=0;i<10;i++) {
			try { 
				  value1 = JSUtility.ReadWebsiteFromExcel(i, 0);
				  aList.add(value1);		  			
			} catch (Exception e) {
				System.out.println("blank field");
			}	
			//System.out.println(value1);
		}
		String s = aList.get(3);
		System.out.println(s);
	}

}
