package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {
		//alert is not an element and it doesnt have a property thus cannot be inspected
	    // but can directly switch to alert

// Three types of alert
//1. simple alert	--> just read the alert and click ok
//2.confirmation alert--> there will be two options,
//3. prompt alert  --> enter> click ok/ cancel	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
//	//Wait for the alert to be displayed and store it in a variable
//	//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	
	driver.findElement(By.linkText("See an example alert")).click();
	
	Alert alert = driver.switchTo().alert(); // to switch to alert
	
	System.out.println(alert.getText()); // to get alert text
	Thread.sleep(1000);
	alert.accept(); //click ok button
		
	WebElement SecondLink = driver.findElement(By.linkText("See a sample confirm"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", SecondLink);

	 alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(1000);
	alert.dismiss(); //click cancel button

	WebElement thirdlink = driver.findElement(By.linkText("See a sample prompt"));	
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", thirdlink);
	alert = driver.switchTo().alert();
	
	System.out.println(alert.getText());
	alert.sendKeys("dsadfadf"); // to enter text
	Thread.sleep(1000);
	alert.accept();
	
	}

}
