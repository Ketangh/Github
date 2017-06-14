package LMS_LOGIN_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 

public class LOGIN_PAGE {
	
	// this will take data from dataprovider which we created
	@Test(dataProvider="testdata")
	public void TestFireFox(String uname,String password) throws InterruptedException{// Open browsre
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver.exe");
		
        ChromeDriver d2=new ChromeDriver();
        
        d2.get("https://lms.iciciprulife.com/LMS");
        

		//WebDriver driver=new FirefoxDriver();
		 
		 
		 
		// Maximize browser
		d2.manage().window().maximize();
		
		
        d2.findElement(By.id("firstname")).clear();
        
        
        d2.findElement(By.id("firstname")).sendKeys(uname);
        
        
        d2.findElement(By.id("lastname")).clear();
        
        
        d2.findElement(By.id("lastname")).sendKeys(password);
        
        
        d2.findElement(By.id("loginBtn")).click();
        
        Thread.sleep(3000);
        
        
        d2.findElement(By.id("logOutId")).click();
        
        
        
        

		 
		 
		// Load application
		//driver.get("http://www.facebook.com");
		 
		 
		 
		// clear email field
		 
		//driver.findElement(By.id("email")).clear();
		 
		 
		 
		// Enter usename
		//driver.findElement(By.id("email")).sendKeys(uname);
		 
		 
		 
		// Clear password field
		//driver.findElement(By.id("pass")).clear();
		 
		 
		 
		// Enter password
		//driver.findElement(By.id("pass")).sendKeys(password);
		}
		// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
		@DataProvider(name="testdata")
		public Object[][] TestDataFeed(){
		 
		 
		 
		// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object [][] logindata=new Object[2][2];
		 
		 
		 
		// Enter data to row 0 column 0
		logindata[0][0]="5017771";
		 
		 
		 
		// Enter data to row 0 column 1
		logindata[0][1]="Ipru@123";
		 
		 
		 
		// Enter data to row 1 column 0
		logindata[1][0]="53489";
		 
		// Enter data to row 1 column 0
		logindata[1][1]="Ipru@123";
		 
		// return arrayobject to testscript
		return logindata;

}
		
}
