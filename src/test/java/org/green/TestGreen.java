package org.green;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestGreen extends BaseClasses {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		maxWindow();
		toPassUrl("http://adactinhotelapp.com/index.php ");	
		waitMethod(5000);
		WebElement textuser = driver.findElement(By.id("username"));
		toInput(textuser,("ranjithrock"));

		WebElement textpass = driver.findElement(By.id("password"));
		toInput(textpass, "Kumar123");
		
	   WebElement logbut = driver.findElement(By.id("login"));
	   logbut.click();
	   waitMethod(3000);
	   JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement loc = driver.findElement(By.xpath("//select [@name='location']"));
        js.executeScript("arguments[0].click()", loc);
	   Select s =new Select(loc);
	   s.selectByIndex(2);
	   s.selectByIndex(4);
	   WebElement hos = driver.findElement(By.xpath("//select[@name='hotels']"));
       js.executeScript("arguments[0].click()", hos);
       Select s1 =new Select(hos);
	   s1.selectByIndex(2);
	   WebElement rm = driver.findElement(By.xpath("//select [@id='room_type']"));
	   js.executeScript("arguments[0].click()", rm);
       Select s2 =new Select(rm);
       s2.selectByIndex(3);
       
       WebElement rmno = driver.findElement(By.xpath("//select[@id='room_nos']"));
	   js.executeScript("arguments[0].click()", rmno);
       Select s3 =new Select(rmno);
       s3.selectByIndex(2);
       
       WebElement rmno1 = driver.findElement(By.xpath("//select[@id='child_room']"));
	   js.executeScript("arguments[0].click()", rmno1);
       Select s4 =new Select(rmno1);
       s4.selectByIndex(2);	      		   
      
       WebElement cl=driver.findElement(By.id("//input[@name='Submit']"));
       js.executeScript("arguments[0].click()", cl);
       cl.click();

	}
}
	   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    
	  