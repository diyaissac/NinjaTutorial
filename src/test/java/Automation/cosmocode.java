package Automation;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cosmocode {

	public static void main(String[] args) throws InterruptedException   {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		
		driver.get("https://cosmocode.io/automation-practice/");
		WebElement FrstName = driver.findElement(By.id("firstname"));
		FrstName.sendKeys("Dayana");
        WebElement Lastname = driver.findElement(By.xpath("//input[@class='lastname']"));
        Lastname.sendKeys("John");
        driver.findElement( By.xpath("//article[@id=\"post-433\"]//input[5]")).click();   //---- so her (//) it helps to skip tags
       
        WebElement Element = driver.findElement(By.xpath("//input[@name='language_c']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;   // for scrolling till the required element
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();
        
      
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='age']")));
        dropdown.selectByVisibleText("Under 30");
        Thread.sleep(1000); //wait for next step
	    driver.findElement(By.xpath("//input[@id ='submit_htmlform']")).click();
	    
	    driver.findElement(By.xpath("a[@href='https://cosmocode.io/teachmeselenium/automation-practice/']"));
	    driver.findElement(By.linkText("random-text-xyz-i-wont-change-random-digit-123"));
	    driver.findElement(By.partialLinkText("random-text"));// linktext is used to locate the links --> just copy the link and paste it
	}                                                         // In partiallink take partial of linktext

}
