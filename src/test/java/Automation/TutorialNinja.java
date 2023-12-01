package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		driver.findElement(By.xpath("//a[text() = 'Laptops & Notebooks']")).click();   // helps to locate using text
		driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		driver.findElement(By.xpath("//a[text()='Phones & PDAs (3)']")).click();
		WebElement iphone = driver.findElement(By.xpath("//a[text()='iPhone']/../../../..//span[text()='Add to Cart']"));
		iphone.click();
	    driver.findElement(By.xpath("//div[@id='cart']/button")).click();
	}

}
