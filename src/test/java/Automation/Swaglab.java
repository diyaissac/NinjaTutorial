package Automation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
    	WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
        driver.findElement(By.id("about_sidebar_link")).click(); 
        driver.findElement(By.xpath("//div[@class='MuiStack-root css-chbenk']//button[text() = 'Try it free']")).click();
        
        
        
       // to add to cart directly from page
       // driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/../../..//button[text()='ADD TO CART']")).click();
        
       // add to cart after clicking the product
//      driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
//      Thread.sleep(3000);
//      driver.findElement(By.className("inventory_details_back_button")).click();
	}

}
