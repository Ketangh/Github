package LMS_APPOINTMENT;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class APPOINTMENT_AUTOMATION {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver.exe");
        ChromeDriver d2=new ChromeDriver();
        d2.get("https://lms.iciciprulife.com/LMS_OLD");
        
        WebElement AgentCode=d2.findElement(By.id("firstname"));
        
        AgentCode.sendKeys("5027677");
        
        WebElement Password=d2.findElement(By.id("lastname"));
        
        Password.sendKeys("Ipru@123");
        
        WebElement submit=d2.findElement(By.id("loginBtn"));
        
        submit.click();
        
		WebDriverWait wait = new WebDriverWait(d2, 60);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactTab")));
        
        d2.manage().window().maximize();
        
        WebElement Appointment=d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[1]/div/a"));
        
        Appointment.click();
        
        Thread.sleep(4000);
        
        WebDriverWait wait1 = new WebDriverWait(d2, 60);
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='participant_name']")));
        
        d2.findElement(By.xpath(".//*[@id='participant_name']")).sendKeys("Nisha A");
        
        //Thread.sleep(2000);

        //List<WebElement> optionsToSelect = d2.findElements(By.xpath("html/body/ul[2]/li[1]/a"));

        //for(WebElement option : optionsToSelect){
            //System.out.println(option);
            //if(option.getText().equals(optionsToSelect)) {
                //System.out.println("Trying to select: "+optionsToSelect);
               // option.click();
               // break;
           // }
        
        //}
        
       WebElement Appointment_subject=d2.findElement(By.id("title"));
        
        Appointment_subject.sendKeys("meet");
        

        //WebElement selectDate = d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[11]/input"));

        //selectDate.click();
        //select time
        
        d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[12]/div[1]/div/div[2]/div/span/i")).click();
        
        d2.findElement(By.xpath("html/body/div[3]/table/tbody/tr[1]/td[1]/a/i")).click();
        
        //select address
        
        d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[16]/div[3]/textarea")).sendKeys("ADD");
        
        //select landmark
        
        d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[17]/div[3]/input")).sendKeys("LANDMARK");
        
        //select meeting notes
        
        d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[20]/textarea")).sendKeys("Meeting");
        
        //clicking on save button
        
        
        d2.findElement(By.xpath("html/body/div[2]/div/div/div/div[7]/div[1]/div[3]/div/div/div/div/div[1]/div/div[22]/div/input[1]")).click();
        
        
        
        
        
        
        
        

	}
}


	


