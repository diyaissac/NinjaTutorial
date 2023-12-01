package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageObjectmodel {
	public static WebDriver driver = new ChromeDriver();
	String URL = "https://juice-shop.herokuapp.com/#/register  ";
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By emailID =By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-7']");
	
	public static void main(String[] args) {
		
		
		driver.findElement(dismissBtn).click();
		driver.findElement(emailID).sendkeys("anjuthomas@gmail.com");

	}

}
