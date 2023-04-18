package Selenium.ApachePoi.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFromExcel {
	static FileInputStream file;
	static String value;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// read data from excel
	    file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\WebSite.xlsx");
		value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
//		int lr = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	
		ArrayList<String> al= new ArrayList<String>();
		
		for(int i = 0;i<10;i++) {
			    file= new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\WebSite.xlsx"); // you can take any path
			    value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//			    System.out.println(value);
			    al.add(value);
		}
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		
		
		for(int j=0;j<al.size();j++) {
		    driver.get(al.get(j));
			String title = driver.getTitle();
			System.out.println(al.get(j)+"==> "+title);
		}
		
		
		
		
	}

}
